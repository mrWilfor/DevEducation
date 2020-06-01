package practice.practic_14_28_05_2020.implInterfaces;

import org.junit.jupiter.api.Test;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ImplManagerTest {

    @Test
    void accessOrder() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().registerManager("Bill");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        carRental.authorisation("Ivan", "12345");
        user.orderAuto(car, false, 1);

        ImplOrder order = carRental.getListOfOrder().get(0);

        carRental.getManager(0).accessOrder(order);

        int expectedBill = 100;
        int actualBill = order.getBill();

        assertTrue(order.getStatusOfOrder());
        assertEquals(expectedBill, actualBill);
    }

    @Test
    void accessOrderNotAuthorisation() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().registerManager("Bill");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        user.orderAuto(car, false, 1);

        int expectedQuantityOfOrders = 0;
        int actualQuantityOfOrders = carRental.getListOfOrder().size();

       assertEquals(expectedQuantityOfOrders, actualQuantityOfOrders);
    }

    @Test
    void rejectOrder() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().registerManager("Bill");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        carRental.authorisation("Ivan", "12345");
        user.orderAuto(car, false, 1);

        ImplOrder order = carRental.getListOfOrder().get(0);
        ImplManager manager = carRental.getManager(0);

        manager.rejectOrder(order, new Scanner("reject"));

        int expectedBill = 0;
        int actualBill = order.getBill();
        String expected = "reject";
        String actual = order.getCause();

        assertFalse(order.getStatusOfOrder());
        assertEquals(expectedBill, actualBill);
        assertEquals(expected, actual);
    }

    @Test
    void carReturn() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().registerManager("Bill");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        carRental.authorisation("Ivan", "12345");
        user.orderAuto(car, false, 1);

        ImplOrder order = carRental.getListOfOrder().get(0);
        ImplManager manager = carRental.getManager(0);

        carRental.getManager(0).accessOrder(order);

        int expectedBill = 100;
        int actualBill = manager.carReturn(car);

        assertEquals(expectedBill, actualBill);
    }

    @Test
    void carReturnDamaged() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.getAdministrator().addCar("Toyota", Mark.TOYOTA, QualityClass.LOW, 100, "pickUp");
        carRental.getAdministrator().registerManager("Bill");

        ImplUser user = carRental.getListOfUsers().get("Ivan");
        ImplCar car = carRental.getListOfCar().get(0);

        carRental.authorisation("Ivan", "12345");
        user.orderAuto(car, false, 1);

        ImplOrder order = carRental.getListOfOrder().get(0);
        ImplManager manager = carRental.getManager(0);

        carRental.getManager(0).accessOrder(order);
        car.setDamaged(true);

        int expectedBill = 100;
        int actualBill = manager.carReturn(car);

        assertEquals(expectedBill, actualBill);
    }
}
