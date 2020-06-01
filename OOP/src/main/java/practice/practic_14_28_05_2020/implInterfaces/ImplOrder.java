package practice.practic_14_28_05_2020.implInterfaces;

import practice.practic_14_28_05_2020.interfaces.Order;

import java.util.Objects;

public class ImplOrder implements Order {
    private ImplCar car;
    private ImplUser user;
    private String name;
    private long id;
    private boolean isWithOrWithOutDriver;
    private int termRental;
    private boolean isStatusOfOrder = false;
    private String cause;
    private int bill = 0;

    public ImplOrder(ImplCar car, ImplUser user, boolean isWithOrWithOutDriver, int termRental) {
        this.car = car;
        this.user = user;
        this.name = user.getName();
        this.id = user.getId();
        this.isWithOrWithOutDriver = isWithOrWithOutDriver;
        this.termRental = termRental;
    }

    @Override
    public ImplCar getCar() {
        return car;
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
    public boolean getWithOrWithOutDriver() {
        return isWithOrWithOutDriver;
    }

    @Override
    public int getTermRental() {
        return this.termRental;
    }

    @Override
    public boolean getStatusOfOrder() {
        return isStatusOfOrder;
    }

    @Override
    public void setStatusOfOrder(boolean statusOfOrder) {
        this.isStatusOfOrder = statusOfOrder;
    }

    @Override
    public String getCause() {
        return cause;
    }

    @Override
    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public int getBill() {
        return bill;
    }

    @Override
    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplOrder order = (ImplOrder) o;

        return id == order.id &&
                isWithOrWithOutDriver == order.isWithOrWithOutDriver &&
                termRental == order.termRental &&
                Objects.equals(car, order.car) &&
                Objects.equals(user, order.user) &&
                Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, user, name, id, isWithOrWithOutDriver, termRental);
    }

    @Override
    public String toString() {
        return "ImplOrder{" +
                "car=" + car +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", isWithOrWithOutDriver=" + isWithOrWithOutDriver +
                ", termRental=" + termRental +
                ", isStatusOfOrder=" + isStatusOfOrder +
                '}';
    }
}
