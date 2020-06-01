package practice.practic_14_28_05_2020.implInterfaces;

import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;
import practice.practic_14_28_05_2020.interfaces.Administrator;

public class ImplAdministrator implements Administrator {
    String name;
    long id;
    ImplCarRental carRental;

    public ImplAdministrator(String name, long id, ImplCarRental carRental) {
        this.name = name;
        this.id = id;
        this.carRental = carRental;
    }

    @Override
    public void registerManager(String name, long id, ImplCarRental carRental) {
        ImplManager manager = new ImplManager(name, id, carRental);

        carRental.addManager(manager);
    }

    @Override
    public void deleteManager(ImplManager manager) {
        carRental.deleteManager(manager);
    }

    @Override
    public void addCar(String name, long id, Mark mark, QualityClass qualityClass, int prise, String infoAboutCar) {
        ImplCar car = new ImplCar(name, mark, qualityClass, prise, infoAboutCar);

        carRental.addCar(car);
    }

    @Override
    public void deleteCar(ImplCar car) {
        carRental.deleteCar(car);
    }

    @Override
    public void editingCarInformation(ImplCar car, String infoAboutCar) {
        car.setInfoAboutCar(infoAboutCar);
    }

    @Override
    public void blockedUser(ImplUser user) {
        carRental.getListOfBlockedUsers().put(user.getName(), user);
        carRental.getListOfUsers().remove(user.getName());
    }

    @Override
    public void unblockedUser(ImplUser user) {
        carRental.getListOfUsers().put(user.getName(), user);
        carRental.getListOfBlockedUsers().remove(user.getName());
    }
}
