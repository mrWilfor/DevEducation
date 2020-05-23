package practice.practic_11_22_05_2020.com.company.professions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    void get() {
        Driver driver = new Driver("Tarasov I.O.", 10);
        int expectedExperience = 10;

        assertEquals(expectedExperience, driver.getExperience());
    }

    @Test
    void equalsTrue() {
        Driver driver1 = new Driver("Maclein J.D.", 15);
        Driver driver2 = new Driver("Maclein J.D.", 15);

        assertEquals(driver1, driver2);
    }

    @Test
    void equalsFail() {
        Driver driver1 = new Driver("Maclein J.D.", 15);
        Driver driver2 = new Driver("Maclein J.D.", 5);

        assertNotEquals(driver1, driver2);
    }

    @Test
    void hashCodeTrue() {
        Driver driver1 = new Driver("Maclein J.D.", 15);
        Driver driver2 = new Driver("Maclein J.D.", 15);

        assertEquals(driver1.hashCode(), driver2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Driver driver1 = new Driver("Maclein J.D.", 15);
        Driver driver2 = new Driver("Maclein J.D.", 5);

        assertNotEquals(driver1.hashCode(), driver2.hashCode());
    }

    @Test
    void toStringTrue() {
        Driver driver = new Driver("Maclein J.D.", 10);
        String expected = "Driver{fullName='Maclein J.D.', experience='10'}";

        assertEquals(expected, driver.toString());
    }

    @Test
    void toStringFail() {
        Driver driver = new Driver("Maclein J.D.", 5);
        String expected = "Driver{fullName='Maclein J.D.', experience='10'}";

        assertNotEquals(expected, driver.toString());
    }
}