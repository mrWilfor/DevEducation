package practice.practic_14_28_05_2020.implInterfaces;

import practice.practic_14_28_05_2020.interfaces.Manager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ImplManager implements Manager {
    String name;
    long id;
    ImplCarRental carRental;



    public ImplManager(String name, long id, ImplCarRental carRental) {
        this.name = name;
        this.id = id;
        this.carRental = carRental;
    }

    @Override
    public ImplOrder seeOrder() {
        if (carRental.getListOfOrder().size() != 0) {
            ImplOrder order = carRental.getListOfOrder().get(0);
            carRental.getListOfOrder().remove(order);

            System.out.println(order.toString());

            Scanner scan = new Scanner(System.in);
            String entered = scan.next();

            if (entered.equals("y")) {
                order.setStatusOfOrder(true);
                carRental.getAccessListOfOrder().put(order.getCar(), order);
            } else if (entered.equals("n")) {
                entered = scan.next();

                order.setCause(entered);
                order.setStatusOfOrder(false);
            }
                return order;
        }
        return null;
    }

    @Override
    public int carReturn(ImplCar car) {
        int bill = 0;
        int termRental = carRental.getAccessListOfOrder().get(car).getTermRental();

        bill = bill + car.getPrise() * termRental;

        if (car.getDamaged()) {
            bill *= 2;
        }
        return bill;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public ImplCarRental getCarRental() {
        return carRental;
    }
}
