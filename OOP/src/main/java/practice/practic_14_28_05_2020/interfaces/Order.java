package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.implInterfaces.ImplCar;

public interface Order {
    ImplCar getCar();

    String getName();

    long getId();

    boolean getWithOrWithOutDriver();

    int getTermRental();

    boolean getStatusOfOrder();

    void setStatusOfOrder(boolean statusOfOrder);

    String getCause();

    void setCause(String cause);

    int getBill();

    void setBill(int bill);
}
