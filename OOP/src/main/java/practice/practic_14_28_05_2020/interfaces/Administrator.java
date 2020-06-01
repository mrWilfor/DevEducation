package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;
import practice.practic_14_28_05_2020.implInterfaces.ImplCar;
import practice.practic_14_28_05_2020.implInterfaces.ImplManager;
import practice.practic_14_28_05_2020.implInterfaces.ImplUser;

public interface Administrator {
    void registerManager(String name);

    void deleteManager(ImplManager manager);

    void addCar(String name, Mark mark, QualityClass qualityClass, int prise, String infoAboutCar);

    void deleteCar(ImplCar car);

    void editingCarInformation(ImplCar car, String infoAboutCar);

    void blockedUser(ImplUser user);

    void unblockedUser(ImplUser user);
}
