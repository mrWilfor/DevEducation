package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.implInterfaces.ImplCar;
import practice.practic_14_28_05_2020.implInterfaces.ImplCarRental;

public interface User {
    String getName();

    boolean getAuthorisationStatus();

    ImplCarRental getCarRental();

    String checkAuto();

    void orderAuto(ImplCar car, String name, long id, boolean withOrWithoutDriver, int termRental);
}
