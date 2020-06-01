package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.implInterfaces.*;

import java.util.HashMap;
import java.util.LinkedList;

public interface CarRental {
    void addManager(ImplManager manager);

    ImplManager getManager(int index);

    void deleteManager(ImplManager manager);

    LinkedList<ImplManager> getListOfManager();

    HashMap<String, ImplUser> getListOfUsers();

    HashMap<String, ImplUser> getListOfBlockedUsers();

    void registration(String nameLogin, String password);

    void addCar(ImplCar car);

    void deleteCar(ImplCar car);

    LinkedList<ImplCar> getListOfCar();

    boolean authorisation(String login, String password);

    String checkAuto();

    void addOrder(ImplOrder order);

    void orderAuto(ImplCar car, ImplUser user, boolean withOrWithOutDriver, int termRental);

    ImplCar getCar(ImplOrder order);

    void outOfCarRental(ImplUser user);

    LinkedList<ImplOrder> getListOfOrder();

    HashMap<ImplCar, ImplOrder> getAccessListOfOrder();

    ImplAdministrator getAdministrator();
}
