package practice.practic_11_22_05_2020.com.company.details;

import org.junit.jupiter.api.Test;
import practice.practic_11_22_05_2020.com.company.details.Engine;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void get() {
        Engine engine = new Engine(300, "Japan");
        int expectedPower = 300;
        String expectedManufactured = "Japan";

        assertEquals(expectedPower, engine.getPower());
        assertEquals(expectedManufactured, engine.getManufacturer());
    }

    @Test
    void equalsTrue() {
        Engine engine1 = new Engine(300, "Japan");
        Engine engine2 = new Engine(300, "Japan");

        assertEquals(engine1, engine2);
    }

    @Test
    void equalsFail() {
        Engine engine1 = new Engine(300, "Japan");
        Engine engine2 = new Engine(300, "USA");

        assertNotEquals(engine1, engine2);
    }

    @Test
    void hashcodeTrue() {
        Engine engine1 = new Engine(300, "Japan");
        Engine engine2 = new Engine(300, "Japan");

        assertEquals(engine1.hashCode(), engine2.hashCode());
    }

    @Test
    void hashcodeFail() {
        Engine engine1 = new Engine(300, "Japan");
        Engine engine2 = new Engine(300, "USA");

        assertNotEquals(engine1.hashCode(), engine2.hashCode());
    }

    @Test
    void toStringTrue() {
        Engine engine = new Engine(300, "Japan");
        String expected = "Engine{power='300', manufacturer='Japan'}";

        assertEquals(expected, engine.toString());
    }

    @Test
    void toStringFail() {
        Engine engine = new Engine(300, "Usa");
        String expected = "Engine{power='300', manufacturer='Japan'}";

        assertNotEquals(expected, engine.toString());
    }
}