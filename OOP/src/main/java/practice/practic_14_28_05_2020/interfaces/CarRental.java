package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.implInterfaces.ImplCar;
import practice.practic_14_28_05_2020.implInterfaces.ImplManager;
import practice.practic_14_28_05_2020.implInterfaces.ImplOrder;
import practice.practic_14_28_05_2020.implInterfaces.ImplUser;

import java.util.HashMap;
import java.util.LinkedList;

public interface CarRental {
    void addManager(ImplManager manager);

    ImplManager getManager(int index);

    void deleteManager(ImplManager manager);

    HashMap<String, ImplUser> getListOfUsers();

    HashMap<String, ImplUser> getListOfBlockedUsers();

    void registration(String nameLogin, String password);

    void addCar(ImplCar car);

    void deleteCar(ImplCar car);

    boolean authorisation(String login, String password);

    String checkAuto();

    void addOrder(ImplOrder order);

    void orderAuto(ImplCar car, String name, long id, boolean withOrWithOutDriver, int termRental);

    ImplCar getCar(ImplOrder order);

    void OutOfCarRental(ImplUser user);

    void printList(LinkedList list, String name);

    LinkedList<ImplOrder> getListOfOrder();

    HashMap<ImplCar, ImplOrder> getAccessListOfOrder();
}
