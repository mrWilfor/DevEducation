package practice.practic_14_28_05_2020.implInterfaces;

import org.junit.jupiter.api.Test;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplCarRentalTest {

    @Test
    public void getCar() {
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
        order.setBill(0);

        assertEquals(car, carRental.getCar(order));
    }

    @Test
    void registration() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");

        int expectedQuantityOfUsers = 1;
        int actualQuantityOfUsers = carRental.getListOfUsers().size();

        assertEquals(expectedQuantityOfUsers, actualQuantityOfUsers);
    }

    @Test
    void registrationRepeat() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.registration("Ivan", "12345");

        int expectedQuantityOfUsers = 1;
        int actualQuantityOfUsers = carRental.getListOfUsers().size();

        assertEquals(expectedQuantityOfUsers, actualQuantityOfUsers);
    }

    @Test
    void authorisation() {
        ImplCarRental carRental = new ImplCarRental();

        carRental.registration("Ivan", "12345");
        carRental.authorisation("Ivan", "12345");

        boolean isStatusUsers = carRental.getListOfUsers().get("Ivan").getAuthorisationStatus();

        assertTrue(isStatusUsers);
    }
}
