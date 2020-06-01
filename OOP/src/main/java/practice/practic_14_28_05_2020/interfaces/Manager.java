package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.implInterfaces.ImplCar;
import practice.practic_14_28_05_2020.implInterfaces.ImplOrder;

public interface Manager {
    ImplOrder seeOrder();

    int carReturn(ImplCar car);
}
