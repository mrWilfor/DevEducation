package practice.practic_14_28_05_2020.implInterfaces;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_14_28_05_2020.interfaces.Manager;

import java.util.Scanner;

public class ImplManager implements Manager {
    String name;
    long id;
    ImplCarRental carRental;

    {
        id = UIDGeneration.getUID();
    }

    public ImplManager(String name, ImplCarRental carRental) {
        this.name = name;
        this.carRental = carRental;
    }

    @Override
    public ImplOrder seeOrder(Scanner scan) {
        if (carRental.getListOfOrder().size() != 0) {
            ImplOrder order = carRental.getListOfOrder().get(0);
            carRental.getListOfOrder().remove(order);

            System.out.println(order.toString());

            scan = new Scanner(System.in);
            String entered = scan.next();

            if (entered.equals("y")) {
                accessOrder(order);
            } else if (entered.equals("n")) {
                rejectOrder(order, scan);
            }
            return order;
        }
        return null;
    }

    @Override
    public void accessOrder(ImplOrder order) {
        order.setStatusOfOrder(true);
        int bill = order.getCar().getPrise() * order.getTermRental();
        order.setBill(bill);
        carRental.getAccessListOfOrder().put(order.getCar(), order);
    }

    @Override
    public void rejectOrder(ImplOrder order, Scanner scan) {
        String entered = scan.next();

        order.setCause(entered);
        order.setStatusOfOrder(false);
        order.setCause(entered);
    }

    @Override
    public int carReturn(ImplCar car) {
        int bill = 0;
        int termRental = carRental.getAccessListOfOrder().get(car).getTermRental();

        if (car.getDamaged()) {
            bill = bill + car.getPrise() * termRental;
        }
        return bill;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public ImplCarRental getCarRental() {
        return carRental;
    }
}
