package practice.practic_11_22_05_2020.com.company.vehicles;

import org.junit.jupiter.api.Test;
import practice.practic_11_22_05_2020.com.company.details.Engine;
import practice.practic_11_22_05_2020.com.company.professions.Driver;

import static org.junit.jupiter.api.Assertions.*;

class SportCarTest {

    @Test
    void get() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        SportCar sportCar = new SportCar("Toyota", "sport car", 1200, 350, engine);
        sportCar.setDriver(driver);

        String expectedMark = "Toyota";
        String expectedClass = "sport car";
        int expectedWeight = 1200;
        int expectedTopSpeed = 350;
        Driver expectedDriver = new Driver("Rembo J.O.", 20);
        Engine expectedEngine = new Engine(200, "USA");

        assertEquals(expectedMark, sportCar.getMark());
        assertEquals(expectedClass, sportCar.getClassC());
        assertEquals(expectedWeight, sportCar.getWeight());
        assertEquals(expectedTopSpeed, sportCar.getTopSpeed());
        assertEquals(expectedDriver, sportCar.getDriver());
        assertEquals(expectedEngine, sportCar.getEngine());
    }


    @Test
    void equalsTrue() {
        Driver driver1 = new Driver("Rembo J.O.", 20);
        Driver driver2 = new Driver("Rembo J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        SportCar sportCar1 = new SportCar("Toyota", "sport car", 1200, 350, engine1);
        SportCar sportCar2 = new SportCar("Toyota", "sport car", 1200, 350, engine2);
        sportCar1.setDriver(driver1);
        sportCar2.setDriver(driver2);

        assertTrue(sportCar1.equals(sportCar2));
    }

    @Test
    void equalsFail() {
        Driver driver1 = new Driver("Maclein J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        SportCar sportCar1 = new SportCar("Toyota", "sport car", 1200, 350, engine1);
        SportCar sportCar2 = new SportCar("Toyota", "sport car", 1200, 350, engine2);
        sportCar1.setDriver(driver1);

        assertFalse(sportCar1.equals(sportCar2));
    }

    @Test
    void hashCodeTrue() {
        Driver driver1 = new Driver("Rembo J.O.", 20);
        Driver driver2 = new Driver("Rembo J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        SportCar sportCar1 = new SportCar("Toyota", "sport car", 1200, 350, engine1);
        SportCar sportCar2 = new SportCar("Toyota", "sport car", 1200, 350, engine2);
        sportCar1.setDriver(driver1);
        sportCar2.setDriver(driver2);

        assertEquals(sportCar1.hashCode(), sportCar2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Driver driver1 = new Driver("Maclein J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        SportCar sportCar1 = new SportCar("Toyota", "sport car", 1200, 350, engine1);
        SportCar sportCar2 = new SportCar("Toyota", "sport car", 1200, 350, engine2);
        sportCar1.setDriver(driver1);

        assertNotEquals(sportCar1.hashCode(), sportCar2.hashCode());
    }

    @Test
    void toStringWithDriver() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        SportCar sportCar = new SportCar("Toyota", "sport car", 1200, 350, engine);
        sportCar.setDriver(driver);
        String expected = "SportCar{mark='Toyota', class='sport car', weight='1200', topSpeed='350', " +
                "driver=Driver{fullName='Rembo J.O.', experience='20'}, " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertEquals(expected, sportCar.toString());
    }

    @Test
    void toStringWithOutDriver() {
        Engine engine = new Engine(200, "USA");
        SportCar sportCar = new SportCar("Toyota", "sport car", 1200, 350, engine);
        String expected = "SportCar{mark='Toyota', class='sport car', weight='1200', topSpeed='350', " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertEquals(expected, sportCar.toString());
    }

    @Test
    void toStringFail() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        SportCar sportCar = new SportCar("Mazda", "sport car", 1200, 350, engine);
        sportCar.setDriver(driver);
        String expected = "SportCar{mark='Toyota', class='sport car', weight='1200', topSpeed='350', " +
                "driver=Driver{fullName='Rembo J.O.', experience='20'}, " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertNotEquals(expected, sportCar.toString());
    }

    @Test
    void printInfoWithDriver() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        SportCar sportCar = new SportCar("Toyota", "sport car", 1200, 350, engine);
        sportCar.setDriver(driver);
        String expected = "SportCar:" +
                "\n\tmark = Toyota" +
                "\n\tclass = sport car" +
                "\n\tweight = 1200" +
                "\n\ttopSpeed = 350" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA" +
                "\n\tdriver:" +
                "\n\t\tfull name = Rembo J.O." +
                "\n\t\texperience = 20";

        assertEquals(expected, sportCar.printInfo());
    }

    @Test
    void printInfoWithOutDriver() {
        Engine engine = new Engine(200, "USA");
        SportCar sportCar = new SportCar("Toyota", "sport car", 1200, 350, engine);
        String expected = "SportCar:" +
                "\n\tmark = Toyota" +
                "\n\tclass = sport car" +
                "\n\tweight = 1200" +
                "\n\ttopSpeed = 350" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA";

        assertEquals(expected, sportCar.printInfo());
    }

    @Test
    void printInfoFail() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        SportCar sportCar = new SportCar("Mazda", "sport car", 1200, 350, engine);
        sportCar.setDriver(driver);
        String expected = "SportCar:" +
                "\n\tmark = Toyota" +
                "\n\tclass = sport car" +
                "\n\tweight = 1200" +
                "\n\ttopSpeed = 350" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA" +
                "\n\tdriver:" +
                "\n\t\tfull name = Rembo J.O." +
                "\n\t\texperience = 20";

        assertNotEquals(expected, sportCar.printInfo());
    }
}