package practice.practic_14_28_05_2020.implInterfaces;

import practice.practic_14_28_05_2020.interfaces.User;

public class ImplUser implements User {
    private String name;
    private boolean status;
    private ImplCarRental carRental;

    public ImplUser(String name, boolean status, ImplCarRental carRental) {
        this.name = name;
        this.status = status;
        this.carRental = carRental;
    }

    @Override
    public String checkAuto() {
        return null;
    }

    @Override
    public void orderAuto(ImplCar car, String name, long id, boolean withOrWithoutDriver, int termRental) {
        carRental.orderAuto(car, name, id, withOrWithoutDriver, termRental);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getAuthorisationStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public ImplCarRental getCarRental() {
        return carRental;
    }
}
