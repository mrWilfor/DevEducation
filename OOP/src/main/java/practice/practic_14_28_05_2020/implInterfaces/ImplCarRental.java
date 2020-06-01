package practice.practic_14_28_05_2020.implInterfaces;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_14_28_05_2020.interfaces.CarRental;

import java.util.HashMap;
import java.util.LinkedList;

public class ImplCarRental implements CarRental {
    private HashMap<String, ImplUser> listOfUsers;
    private HashMap<String, ImplUser> listOfBlockedUsers;
    private LinkedList<ImplManager> listOfManager;
    private HashMap<String, String> listOfLoginAndPassword;
    private LinkedList<ImplCar> listOfCar;
    private LinkedList<ImplOrder> listOfOrder;
    private HashMap<ImplCar, ImplOrder> accessListOfOrder;
    private ImplAdministrator administrator;

    {
        listOfUsers = new HashMap<>();
        listOfBlockedUsers = new HashMap<>();
        listOfManager = new LinkedList<>();
        listOfLoginAndPassword = new HashMap<>();
        listOfCar = new LinkedList<>();
        administrator = new ImplAdministrator("Nick", UIDGeneration.getUID(), this);
    }

    @Override
    public void addManager(ImplManager manager) {
        listOfManager.add(manager);
    }

    @Override
    public ImplManager getManager(int index) {
        return listOfManager.get(index);
    }

    @Override
    public void deleteManager(ImplManager manager) {
        listOfManager.remove(manager);
    }

    @Override
    public HashMap<String, ImplUser> getListOfUsers() {
        return listOfUsers;
    }

    @Override
    public HashMap<String, ImplUser> getListOfBlockedUsers() {
        return listOfBlockedUsers;
    }

    @Override
    public void registration(String nameLogin, String password) {
        ImplUser user = new ImplUser(nameLogin, false, this);

        listOfUsers.put(nameLogin, user);
        listOfLoginAndPassword.put(nameLogin, password);
    }

    @Override
    public void addCar(ImplCar car) {
        listOfCar.add(car);
    }

    @Override
    public ImplCar getCar(ImplOrder order) {
        if (order.getStatusOfOrder()) {
            return order.getCar();
        }
        return null;
    }

    @Override
    public void deleteCar(ImplCar car){
        listOfCar.remove(car);
    }

    public LinkedList<ImplCar> getListOfCar() {
        return listOfCar;
    }

    @Override
    public boolean authorisation(String login, String password) {
        if (listOfLoginAndPassword.get(login) != null) {
            if (listOfLoginAndPassword.get(login).equals(password)) {
                listOfUsers.get(login).setStatus(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public String checkAuto() {
        return null;
    }

    @Override
    public void addOrder(ImplOrder order) {
        listOfOrder.add(order);
    }

    @Override
    public void orderAuto(ImplCar car, String name, long id, boolean withOrWithOutDriver, int termRental) {
        ImplOrder order = new ImplOrder(car, name, id, withOrWithOutDriver, termRental);
        addOrder(order);
    }

    @Override
    public void OutOfCarRental(ImplUser user) {
        user.setStatus(false);
    }

    @Override
    public void printList(LinkedList list, String name) {
        StringBuilder result = new StringBuilder(name);

        for (int i = 0; i < list.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(list.get(i).toString());
        }
        System.out.println(result);
    }

    @Override
    public LinkedList<ImplOrder> getListOfOrder() {
        return listOfOrder;
    }

    @Override
    public HashMap<ImplCar, ImplOrder> getAccessListOfOrder() {
        return accessListOfOrder;
    }

    public ImplAdministrator getAdministrator() {
        return administrator;
    }
}
