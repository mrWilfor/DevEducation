package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.implInterfaces.ImplCar;
import practice.practic_14_28_05_2020.implInterfaces.ImplCarRental;
import practice.practic_14_28_05_2020.implInterfaces.ImplOrder;

import java.util.Scanner;

public interface Manager {
    ImplOrder seeOrder(Scanner scan);

    void accessOrder(ImplOrder order);

    void rejectOrder(ImplOrder order, Scanner scan);

    int carReturn(ImplCar car);

    String getName();

    long getId();

    ImplCarRental getCarRental();
}
