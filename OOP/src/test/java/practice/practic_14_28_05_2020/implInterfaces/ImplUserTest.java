package practice.practic_14_28_05_2020.implInterfaces;

import org.junit.jupiter.api.Test;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ImplUserTest {

    @Test
    void orderAuto() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().registerManager("Mike");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        carRental.authorisation("Ivan", "12345");
        user.orderAuto(car, false, 1);

        int expectedQuantityOfOrders = 1;
        int actualQuantityOfOrders = carRental.getListOfOrder().size();

        assertEquals(expectedQuantityOfOrders, actualQuantityOfOrders);
    }

    @Test
    void orderAutoNotAuthorisation() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().registerManager("Mike");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        user.orderAuto(car, false, 1);

        int expectedQuantityOfOrders = 0;
        int actualQuantityOfOrders = carRental.getListOfOrder().size();

        assertEquals(expectedQuantityOfOrders, actualQuantityOfOrders);
    }

    @Test
    void orderAutoNotRegistered() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().registerManager("Mike");

        ImplUser user = new ImplUser("Ivan", true, carRental);
        ImplCar car = carRental.getListOfCar().get(0);

        user.orderAuto(car, false, 1);

        int expectedQuantityOfOrders = 0;
        int actualQuantityOfOrders = carRental.getListOfOrder().size();

        assertEquals(expectedQuantityOfOrders, actualQuantityOfOrders);
    }

    @Test
    void orderAutoBlocked() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().registerManager("Mike");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        carRental.getAdministrator().blockedUser(user);
        user.orderAuto(car, false, 1);

        int expectedQuantityOfOrders = 0;
        int actualQuantityOfOrders = carRental.getListOfOrder().size();

        assertEquals(expectedQuantityOfOrders, actualQuantityOfOrders);
    }

    @Test
    void getListOfCarByMark() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().addCar("Toyota Supra", Mark.TOYOTA, QualityClass.MIDDLE, 300, "Sport car");
        carRental.getAdministrator().addCar("Ford Mustang", Mark.FORD, QualityClass.MIDDLE, 350, "Sport car");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().addCar("Mercedes S", Mark.MERCEDES, QualityClass.HIGH, 600, "Business car");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        LinkedList<ImplCar> oldCars = carRental.getListOfCar();
        LinkedList<ImplCar> expectedCars = new LinkedList<>();

        expectedCars.add(oldCars.get(0));
        expectedCars.add(oldCars.get(1));

        LinkedList<ImplCar> actualCars = user.getListOfCarByMark(Mark.TOYOTA);

        assertArrayEquals(expectedCars.toArray(), actualCars.toArray());
    }

    @Test
    void getListOfCarByQualityClass() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().addCar("Toyota Supra", Mark.TOYOTA, QualityClass.MIDDLE, 300, "Sport car");
        carRental.getAdministrator().addCar("Ford Mustang", Mark.FORD, QualityClass.MIDDLE, 350, "Sport car");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().addCar("Mercedes S", Mark.MERCEDES, QualityClass.HIGH, 600, "Business car");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        LinkedList<ImplCar> oldCars = carRental.getListOfCar();
        LinkedList<ImplCar> expectedCars = new LinkedList<>();

        expectedCars.add(oldCars.get(1));
        expectedCars.add(oldCars.get(2));

        LinkedList<ImplCar> actualCars = user.getListOfCarByQualityClass(QualityClass.MIDDLE);

        assertArrayEquals(expectedCars.toArray(), actualCars.toArray());
    }

    @Test
    void sortByName() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().addCar("Toyota Supra", Mark.TOYOTA, QualityClass.MIDDLE, 300, "Sport car");
        carRental.getAdministrator().addCar("Ford Mustang", Mark.FORD, QualityClass.MIDDLE, 350, "Sport car");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().addCar("Mercedes S", Mark.MERCEDES, QualityClass.HIGH, 600, "Business car");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        LinkedList<ImplCar> oldCars = carRental.getListOfCar();
        LinkedList<ImplCar> expectedCars = new LinkedList<>();

        expectedCars.add(oldCars.get(3));
        expectedCars.add(oldCars.get(2));
        expectedCars.add(oldCars.get(4));
        expectedCars.add(oldCars.get(0));
        expectedCars.add(oldCars.get(1));


        user.sortByName();

        LinkedList<ImplCar> actualCars = carRental.getListOfCar();

        assertArrayEquals(expectedCars.toArray(), actualCars.toArray());
    }

    @Test
    void sortByprise() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Ferrari", Mark.FERRARI, QualityClass.HIGH, 550, "Sport car");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().addCar("Ford Mustang", Mark.FORD, QualityClass.MIDDLE, 350, "Sport car");
        carRental.getAdministrator().addCar("Mercedes S", Mark.MERCEDES, QualityClass.HIGH, 600, "Business car");
        carRental.getAdministrator().addCar("Toyota Supra", Mark.TOYOTA, QualityClass.MIDDLE, 300, "Sport car");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        LinkedList<ImplCar> oldCars = carRental.getListOfCar();
        LinkedList<ImplCar> expectedCars = new LinkedList<>();

        expectedCars.add(oldCars.get(1));
        expectedCars.add(oldCars.get(4));
        expectedCars.add(oldCars.get(2));
        expectedCars.add(oldCars.get(0));
        expectedCars.add(oldCars.get(3));


        user.sortByPrise();

        LinkedList<ImplCar> actualCars = carRental.getListOfCar();

        assertArrayEquals(expectedCars.toArray(), actualCars.toArray());
    }
}
