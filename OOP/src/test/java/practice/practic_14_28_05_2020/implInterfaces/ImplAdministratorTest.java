package practice.practic_14_28_05_2020.implInterfaces;

import org.junit.jupiter.api.Test;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplAdministratorTest {

    @Test
    void registerManagerMany() {
        ImplCarRental carRental = new ImplCarRental();

        int expectedQuantityOfManagersBefore = 0;
        int actualQuantityOfManagersBefore = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagersBefore, actualQuantityOfManagersBefore);

        carRental.getAdministrator().registerManager("Bill");
        carRental.getAdministrator().registerManager("Will");
        carRental.getAdministrator().registerManager("Gill");
        carRental.getAdministrator().registerManager("Zill");
        carRental.getAdministrator().registerManager("Fill");

        int expectedQuantityOfManagersAfter = 5;
        int actualQuantityOfManagersAfter = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagersAfter, actualQuantityOfManagersAfter);
    }

    @Test
    void registerManagerTwo() {
        ImplCarRental carRental = new ImplCarRental();

        int expectedQuantityOfManagersBefore = 0;
        int actualQuantityOfManagersBefore = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagersBefore, actualQuantityOfManagersBefore);

        carRental.getAdministrator().registerManager("Bill");
        carRental.getAdministrator().registerManager("Will");

        int expectedQuantityOfManagersAfter = 2;
        int actualQuantityOfManagersAfter = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagersAfter, actualQuantityOfManagersAfter);
    }

    @Test
    void registerManagerOne() {
        ImplCarRental carRental = new ImplCarRental();

        int expectedQuantityOfManagersBefore = 0;
        int actualQuantityOfManagersBefore = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagersBefore, actualQuantityOfManagersBefore);

        carRental.getAdministrator().registerManager("Bill");

        int expectedQuantityOfManagersAfter = 1;
        int actualQuantityOfManagersAfter = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagersAfter, actualQuantityOfManagersAfter);
    }

    @Test
    void deleteManager() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.getAdministrator().registerManager("Bill");
        carRental.getAdministrator().registerManager("Will");
        carRental.getAdministrator().registerManager("Gill");
        carRental.getAdministrator().registerManager("Zill");
        carRental.getAdministrator().registerManager("Fill");

        ImplManager manager = carRental.getManager(1);

        carRental.getAdministrator().deleteManager(manager);

        int expectedQuantityOfManagers = 4;
        int actualQuantityOfManagers = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagers, actualQuantityOfManagers);
    }

    @Test
    void deleteManagerZero() {
        ImplCarRental carRental = new ImplCarRental();

        ImplManager manager = new ImplManager("Nick", carRental);

        carRental.getAdministrator().deleteManager(manager);

        int expectedQuantityOfManagers = 0;
        int actualQuantityOfManagers = carRental.getListOfManager().size();

        assertEquals(expectedQuantityOfManagers, actualQuantityOfManagers);
    }

    @Test
    void addCarMany() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().addCar("Toyota Supra", Mark.TOYOTA, QualityClass.MIDDLE, 300, "Sport car");
        carRental.getAdministrator().addCar("Ford Mustang", Mark.FORD, QualityClass.MIDDLE, 350, "Sport car");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().addCar("Mercedes S", Mark.MERCEDES, QualityClass.HIGH, 600, "Business car");

        int expectedQuantityOfCars = 5;
        int actualQuantityOfCars = carRental.getListOfCar().size();

        assertEquals(expectedQuantityOfCars, actualQuantityOfCars);
    }

    @Test
    void addCarTwo() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().addCar("Toyota Supra", Mark.TOYOTA, QualityClass.MIDDLE, 300, "Sport car");

        int expectedQuantityOfCars = 2;
        int actualQuantityOfCars = carRental.getListOfCar().size();

        assertEquals(expectedQuantityOfCars, actualQuantityOfCars);
    }

    @Test
    void addCarOne() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");

        int expectedQuantityOfCars = 1;
        int actualQuantityOfCars = carRental.getListOfCar().size();

        assertEquals(expectedQuantityOfCars, actualQuantityOfCars);
    }


    @Test
    void addCarZero() {
        ImplCarRental carRental = new ImplCarRental();

        int expectedQuantityOfCars = 0;
        int actualQuantityOfCars = carRental.getListOfCar().size();

        assertEquals(expectedQuantityOfCars, actualQuantityOfCars);
    }

    @Test
    void deleteCar() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().addCar("Toyota Supra", Mark.TOYOTA, QualityClass.MIDDLE, 300, "Sport car");
        carRental.getAdministrator().addCar("Ford Mustang", Mark.FORD, QualityClass.MIDDLE, 350, "Sport car");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().addCar("Mercedes S", Mark.MERCEDES, QualityClass.HIGH, 600, "Business car");

        ImplCar car = carRental.getListOfCar().get(2);

        carRental.getAdministrator().deleteCar(car);

        int expectedQuantityOfCars = 4;
        int actualQuantityOfCars = carRental.getListOfCar().size();

        assertEquals(expectedQuantityOfCars, actualQuantityOfCars);
    }


    @Test
    void deleteCarZero() {
        ImplCarRental carRental = new ImplCarRental();

        ImplCar car = new ImplCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");

        carRental.getAdministrator().deleteCar(car);

        int expectedQuantityOfCars = 0;
        int actualQuantityOfCars = carRental.getListOfCar().size();

        assertEquals(expectedQuantityOfCars, actualQuantityOfCars);
    }

    @Test
    void editingCarInformation() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");

        ImplCar car = carRental.getListOfCar().get(0);

        carRental.getAdministrator().editingCarInformation(car, "slow car");

        String expected = "slow car";
        String actual = car.getInfoAboutCar();

        assertEquals(expected, actual);
    }

    @Test
    void blockedUser() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Nick", "12345");

        int expectedQuantityOfUsersBefore = 1;
        int actualQuantityOfUsersBefore = carRental.getListOfUsers().size();
        int expectedQuantityOfBlockedUsersBefore = 0;
        int actualQuantityOfBlockedUsersBefore = carRental.getListOfBlockedUsers().size();

        assertEquals(expectedQuantityOfUsersBefore, actualQuantityOfUsersBefore);
        assertEquals(expectedQuantityOfBlockedUsersBefore, actualQuantityOfBlockedUsersBefore);

        ImplUser user = carRental.getListOfUsers().get("Nick");

        carRental.getAdministrator().blockedUser(user);

        int expectedQuantityOfUsersAfter = 0;
        int actualQuantityOfUsersAfter = carRental.getListOfUsers().size();
        int expectedQuantityOfBlockedUsersAfter = 1;
        int actualQuantityOfBlockedUsersAfter = carRental.getListOfBlockedUsers().size();

        assertEquals(expectedQuantityOfUsersAfter, actualQuantityOfUsersAfter);
        assertEquals(expectedQuantityOfBlockedUsersAfter, actualQuantityOfBlockedUsersAfter);
    }

    @Test
    void unblockedUser() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Nick", "1234");
        ImplUser user = carRental.getListOfUsers().get("Nick");

        carRental.getAdministrator().blockedUser(user);

        int expectedQuantityOfUsersBefore = 0;
        int actualQuantityOfUsersBefore = carRental.getListOfUsers().size();
        int expectedQuantityOfBlockedUsersBefore = 1;
        int actualQuantityOfBlockedUsersBefore = carRental.getListOfBlockedUsers().size();

        assertEquals(expectedQuantityOfUsersBefore, actualQuantityOfUsersBefore);
        assertEquals(expectedQuantityOfBlockedUsersBefore, actualQuantityOfBlockedUsersBefore);

        carRental.getAdministrator().unblockedUser(user);

        int expectedQuantityOfUsersAfter = 1;
        int actualQuantityOfUsersAfter = carRental.getListOfUsers().size();
        int expectedQuantityOfBlockedUsersAfter = 0;
        int actualQuantityOfBlockedUsersAfter = carRental.getListOfBlockedUsers().size();

        assertEquals(expectedQuantityOfUsersAfter, actualQuantityOfUsersAfter);
        assertEquals(expectedQuantityOfBlockedUsersAfter, actualQuantityOfBlockedUsersAfter);
    }
}
