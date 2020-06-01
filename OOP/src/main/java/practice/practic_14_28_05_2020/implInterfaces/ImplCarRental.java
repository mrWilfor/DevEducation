package practice.practic_14_28_05_2020.implInterfaces;

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
        listOfOrder = new LinkedList<>();
        accessListOfOrder = new HashMap<>();
        administrator = new ImplAdministrator("Nick", this);
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
    public LinkedList<ImplManager> getListOfManager() {
        return listOfManager;
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
        if (order.getStatusOfOrder() && order.getBill() == 0) {
            return order.getCar();
        }
        return null;
    }

    @Override
    public void deleteCar(ImplCar car) {
        listOfCar.remove(car);
    }

    @Override
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
    public void orderAuto(ImplCar car, ImplUser user, boolean withOrWithOutDriver, int termRental) {
        ImplOrder order = new ImplOrder(car, user, withOrWithOutDriver, termRental);
        addOrder(order);
    }

    @Override
    public void outOfCarRental(ImplUser user) {
        user.setStatus(false);
    }

    @Override
    public LinkedList<ImplOrder> getListOfOrder() {
        return listOfOrder;
    }

    @Override
    public HashMap<ImplCar, ImplOrder> getAccessListOfOrder() {
        return accessListOfOrder;
    }

    @Override
    public ImplAdministrator getAdministrator() {
        return administrator;
    }
}
