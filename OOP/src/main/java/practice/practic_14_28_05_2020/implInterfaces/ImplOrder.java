package practice.practic_14_28_05_2020.implInterfaces;

import practice.practic_14_28_05_2020.interfaces.Order;

public class ImplOrder implements Order {
    private ImplCar car;
    private String name;
    private long id;
    private boolean withOrWithOutDriver;
    private int termRental;
    private boolean statusOfOrder;
    private String cause;

    public ImplOrder(ImplCar car, String name, long id, boolean withOrWithOutDriver, int termRental) {
        this.car = car;
        this.name = name;
        this.id = id;
        this.withOrWithOutDriver = withOrWithOutDriver;
        this.termRental = termRental;
    }

    public ImplCar getCar() {
        return car;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public boolean getWithOrWithOutDriver() {
        return false;
    }

    @Override
    public int getTermRental() {
        return 0;
    }

    @Override
    public boolean getStatusOfOrder() {
        return false;
    }

    @Override
    public void setStatusOfOrder(boolean statusOfOrder) {
        this.statusOfOrder = statusOfOrder;
    }

    @Override
    public String getCause() {
        return null;
    }

    @Override
    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "ImplOrder{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", withOrWithOutDriver=" + withOrWithOutDriver +
                ", termRental=" + termRental +
                '}';
    }
}
