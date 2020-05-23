package practice.practic_11_22_05_2020.com.company.vehicles;

import org.junit.jupiter.api.Test;
import practice.practic_11_22_05_2020.com.company.details.Engine;
import practice.practic_11_22_05_2020.com.company.professions.Driver;

import static org.junit.jupiter.api.Assertions.*;

class LorryTest {

    @Test
    void get() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Lorry lorry = new Lorry("Toyota", "lorry", 1200, 40, engine);
        lorry.setDriver(driver);

        String expectedMark = "Toyota";
        String expectedClass = "lorry";
        int expectedWeight = 1200;
        int expectedCarryingCapacity = 40;
        Driver expectedDriver = new Driver("Rembo J.O.", 20);
        Engine expectedEngine = new Engine(200, "USA");

        assertEquals(expectedMark, lorry.getMark());
        assertEquals(expectedClass, lorry.getClassC());
        assertEquals(expectedWeight, lorry.getWeight());
        assertEquals(expectedCarryingCapacity, lorry.getCarryingCapacity());
        assertEquals(expectedDriver, lorry.getDriver());
        assertEquals(expectedEngine, lorry.getEngine());
    }


    @Test
    void equalsTrue() {
        Driver driver1 = new Driver("Rembo J.O.", 20);
        Driver driver2 = new Driver("Rembo J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Lorry lorry1 = new Lorry("Toyota", "lorry", 1200, 40, engine1);
        Lorry lorry2 = new Lorry("Toyota", "lorry", 1200, 40, engine2);
        lorry1.setDriver(driver1);
        lorry2.setDriver(driver2);

        assertEquals(lorry1, lorry2);
    }

    @Test
    void equalsFail() {
        Driver driver1 = new Driver("Maclein J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Lorry lorry1 = new Lorry("Toyota", "lorry", 1200, 40, engine1);
        Lorry lorry2 = new Lorry("Toyota", "lorry", 1200, 40, engine2);
        lorry1.setDriver(driver1);

        assertNotEquals(lorry1, lorry2);
    }

    @Test
    void hashCodeTrue() {
        Driver driver1 = new Driver("Rembo J.O.", 20);
        Driver driver2 = new Driver("Rembo J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Lorry lorry1 = new Lorry("Toyota", "lorry", 1200, 40, engine1);
        Lorry lorry2 = new Lorry("Toyota", "lorry", 1200, 40, engine2);
        lorry1.setDriver(driver1);
        lorry2.setDriver(driver2);

        assertEquals(lorry1.hashCode(), lorry2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Driver driver1 = new Driver("Maclein J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Lorry lorry1 = new Lorry("Toyota", "lorry", 1200, 40, engine1);
        Lorry lorry2 = new Lorry("Toyota", "lorry", 1200, 40, engine2);
        lorry1.setDriver(driver1);

        assertNotEquals(lorry1.hashCode(), lorry2.hashCode());
    }

    @Test
    void toStringWithDriver() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Lorry lorry = new Lorry("Toyota", "lorry", 1200, 40, engine);
        lorry.setDriver(driver);
        String expected = "Lorry{mark='Toyota', class='lorry', weight='1200', carryingCapacity='40', " +
                "driver=Driver{fullName='Rembo J.O.', experience='20'}, " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertEquals(expected, lorry.toString());
    }

    @Test
    void toStringWithOutDriver() {
        Engine engine = new Engine(200, "USA");
        Lorry lorry = new Lorry("Toyota", "lorry", 1200, 40, engine);
        String expected = "Lorry{mark='Toyota', class='lorry', weight='1200', carryingCapacity='40', " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertEquals(expected, lorry.toString());
    }

    @Test
    void toStringFail() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Lorry lorry = new Lorry("Mazda", "lorry", 1200, 40, engine);
        lorry.setDriver(driver);
        String expected = "Lorry{mark='Toyota', class='lorry', weight='1200', carryingCapacity='40', " +
                "driver=Driver{fullName='Rembo J.O.', experience='20'}, " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertNotEquals(expected, lorry.toString());
    }

    @Test
    void printInfoWithDriver() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Lorry lorry = new Lorry("Toyota", "lorry", 1200, 40, engine);
        lorry.setDriver(driver);
        String expected = "Lorry:" +
                "\n\tmark = Toyota" +
                "\n\tclass = lorry" +
                "\n\tweight = 1200" +
                "\n\tcarryingCapacity = 40" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA" +
                "\n\tdriver:" +
                "\n\t\tfull name = Rembo J.O." +
                "\n\t\texperience = 20";

        assertEquals(expected, lorry.printInfo());
    }

    @Test
    void printInfoWithOutDriver() {
        Engine engine = new Engine(200, "USA");
        Lorry lorry = new Lorry("Toyota", "lorry", 1200, 40, engine);
        String expected = "Lorry:" +
                "\n\tmark = Toyota" +
                "\n\tclass = lorry" +
                "\n\tweight = 1200" +
                "\n\tcarryingCapacity = 40" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA";

        assertEquals(expected, lorry.printInfo());
    }

    @Test
    void printInfoFail() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Lorry lorry = new Lorry("Mazda", "lorry", 1200, 40, engine);
        lorry.setDriver(driver);
        String expected = "Lorry:" +
                "\n\tmark = Toyota" +
                "\n\tclass = lorry" +
                "\n\tweight = 1200" +
                "\n\tcarryingCapacity = 40" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA" +
                "\n\tdriver:" +
                "\n\t\tfull name = Rembo J.O." +
                "\n\t\texperience = 20";

        assertNotEquals(expected, lorry.printInfo());
    }
}