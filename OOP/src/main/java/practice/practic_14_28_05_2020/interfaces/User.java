package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;
import practice.practic_14_28_05_2020.implInterfaces.ImplCar;
import practice.practic_14_28_05_2020.implInterfaces.ImplCarRental;

import java.util.LinkedList;

public interface User {
    void orderAuto(ImplCar car, boolean isWithOrWithoutDriver, int termRental);

    String getName();

    long getId();

    boolean getAuthorisationStatus();

    void setStatus(boolean isStatus);

    ImplCarRental getCarRental();

    LinkedList<ImplCar> getListOfCarByMark(Mark mark);

    LinkedList<ImplCar> getListOfCarByQualityClass(QualityClass qualityClass);

    void sortByPrise();

    void sortByName();
}
