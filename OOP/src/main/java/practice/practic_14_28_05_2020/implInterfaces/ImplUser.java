package practice.practic_14_28_05_2020.implInterfaces;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;
import practice.practic_14_28_05_2020.interfaces.User;

import java.util.LinkedList;
import java.util.Objects;

public class ImplUser implements User {
    private String name;
    private long id = UIDGeneration.getUID();
    private boolean isStatus;
    private ImplCarRental carRental;

    public ImplUser(String name, boolean isStatus, ImplCarRental carRental) {
        this.name = name;
        this.isStatus = isStatus;
        this.carRental = carRental;
    }

    @Override
    public void orderAuto(ImplCar car, boolean isWithOrWithoutDriver, int termRental) {
        if (carRental.getListOfUsers().containsValue(this) && isStatus) {
            carRental.orderAuto(car, this, isWithOrWithoutDriver, termRental);
        } else if (carRental.getListOfBlockedUsers().containsValue(this)) {
            System.out.println("Your account are blocked");
        } else {
            System.out.println("You are not registered");
        }
    }

    @Override
    public LinkedList<ImplCar> getListOfCarByMark(Mark mark) {
        LinkedList<ImplCar> carsByMark = new LinkedList<>();

        for (ImplCar car :
                carRental.getListOfCar()) {
            if (car.getMark().equals(mark)) {
                carsByMark.add(car);
            }
        }
        return carsByMark;
    }

    @Override
    public LinkedList<ImplCar> getListOfCarByQualityClass(QualityClass qualityClass) {
        LinkedList<ImplCar> carsByMark = new LinkedList<>();

        for (ImplCar car :
                carRental.getListOfCar()) {
            if (car.getQualityClass().equals(qualityClass)) {
                carsByMark.add(car);
            }
        }
        return carsByMark;
    }

    @Override
    public void sortByPrise() {
        LinkedList<ImplCar> cars = carRental.getListOfCar();
        boolean trigger;

        do {
            trigger = false;

            for (int i = 0; i < cars.size() - 1; i++) {
                if (cars.get(i).getPrise() > cars.get(i + 1).getPrise()) {
                    ImplCar bufferCar = cars.get(i);
                    cars.set(i, cars.get(i + 1));
                    cars.set(i + 1, bufferCar);

                    trigger = true;
                }
            }
        } while (trigger);
    }

    @Override
    public void sortByName() {
        LinkedList<ImplCar> cars = carRental.getListOfCar();
        boolean isTrigger;

        do {
            isTrigger = false;

            for (int i = 0; i < cars.size() - 1; i++) {
                if (cars.get(i).getName().compareToIgnoreCase(cars.get(i + 1).getName()) > 0) {
                    ImplCar bufferCar = cars.get(i);
                    cars.set(i, cars.get(i + 1));
                    cars.set(i + 1, bufferCar);

                    isTrigger = true;
                }
            }
        } while (isTrigger);
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
    public boolean getAuthorisationStatus() {
        return isStatus;
    }

    @Override
    public void setStatus(boolean isStatus) {
        this.isStatus = isStatus;
    }

    @Override
    public ImplCarRental getCarRental() {
        return carRental;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplUser user = (ImplUser) o;

        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(carRental, user.carRental);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, carRental);
    }

    @Override
    public String toString() {
        return "ImplUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isStatus=" + isStatus +
                ", carRental=" + carRental +
                '}';
    }
}
