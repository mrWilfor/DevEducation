package practice.practic_11_22_05_2020.com.company.vehicles;

import org.junit.jupiter.api.Test;
import practice.practic_11_22_05_2020.com.company.details.Engine;
import practice.practic_11_22_05_2020.com.company.professions.Driver;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void get() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Car car = new Car("Toyota", "military", 1200, engine);
        car.setDriver(driver);

        String expectedMark = "Toyota";
        String expectedClass = "military";
        int expectedWeight = 1200;
        Driver expectedDriver = new Driver("Rembo J.O.", 20);
        Engine expectedEngine = new Engine(200, "USA");

        assertEquals(expectedMark, car.getMark());
        assertEquals(expectedClass, car.getClassC());
        assertEquals(expectedWeight, car.getWeight());
        assertEquals(expectedDriver, car.getDriver());
        assertEquals(expectedEngine, car.getEngine());
    }

    @Test
    void equalsTrue() {
        Driver driver1 = new Driver("Rembo J.O.", 20);
        Driver driver2 = new Driver("Rembo J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Car car1 = new Car("Toyota", "military", 1200, engine1);
        Car car2 = new Car("Toyota", "military", 1200, engine2);
        car1.setDriver(driver1);
        car2.setDriver(driver2);

        assertEquals(car1, car2);
    }

    @Test
    void equalsFail() {
        Driver driver1 = new Driver("Maclein J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Car car1 = new Car("Toyota", "military", 1200,  engine1);
        Car car2 = new Car("Toyota", "military", 1200,  engine2);
        car1.setDriver(driver1);

        assertNotEquals(car1, car2);
    }

    @Test
    void hashCodeTrue() {
        Driver driver1 = new Driver("Rembo J.O.", 20);
        Driver driver2 = new Driver("Rembo J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Car car1 = new Car("Toyota", "military", 1200, engine1);
        Car car2 = new Car("Toyota", "military", 1200, engine2);
        car1.setDriver(driver1);
        car2.setDriver(driver2);

        assertEquals(car1.hashCode(), car2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Driver driver1 = new Driver("Maclein J.O.", 20);
        Engine engine1 = new Engine(200, "USA");
        Engine engine2 = new Engine(200, "USA");
        Car car1 = new Car("Toyota", "military", 1200, engine1);
        Car car2 = new Car("Toyota", "military", 1200, engine2);
        car1.setDriver(driver1);

        assertNotEquals(car1.hashCode(), car2.hashCode());
    }

    @Test
    void toStringWithDriver() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Car car = new Car("Toyota", "military", 1200, engine);
        car.setDriver(driver);
        String expected = "Car{mark='Toyota', class='military', weight='1200', " +
                "driver=Driver{fullName='Rembo J.O.', experience='20'}, " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertEquals(expected, car.toString());
    }

    @Test
    void toStringWithOutDriver() {
        Engine engine = new Engine(200, "USA");
        Car car = new Car("Toyota", "military", 1200, engine);
        String expected = "Car{mark='Toyota', class='military', weight='1200', " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertEquals(expected, car.toString());
    }

    @Test
    void toStringFail() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Car car = new Car("Mazda", "military", 1200, engine);
        car.setDriver(driver);
        String expected = "Car{mark='Toyota', class='military', weight='1200', " +
                "driver=Driver{fullName='Rembo J.O.', experience='20'}, " +
                "engine=Engine{power='200', manufacturer='USA'}}";

        assertNotEquals(expected, car.toString());
    }

    @Test
    void printInfoWithDriver() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Car car = new Car("Mazda", "military", 1200, engine);
        car.setDriver(driver);
        String expected = "Car:" +
                "\n\tmark = Mazda" +
                "\n\tclass = military" +
                "\n\tweight = 1200" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA" +
                "\n\tdriver:" +
                "\n\t\tfull name = Rembo J.O." +
                "\n\t\texperience = 20";

        assertEquals(expected, car.printInfo());
    }

    @Test
    void printInfoWithOutDriver() {
        Engine engine = new Engine(200, "USA");
        Car car = new Car("Mazda", "military", 1200, engine);
        String expected = "Car:" +
                "\n\tmark = Mazda" +
                "\n\tclass = military" +
                "\n\tweight = 1200" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA";

        assertEquals(expected, car.printInfo());
    }

    @Test
    void printInfoFail() {
        Driver driver = new Driver("Rembo J.O.", 20);
        Engine engine = new Engine(200, "USA");
        Car car = new Car("Toyota", "military", 1200, engine);
        car.setDriver(driver);
        String expected = "Car:" +
                "\n\tmark = Mazda" +
                "\n\tclass = military" +
                "\n\tweight = 1200" +
                "\n\tengine:" +
                "\n\t\tpower = 200" +
                "\n\t\tmanufacturer = USA" +
                "\n\tdriver:" +
                "\n\t\tfull name = Rembo J.O." +
                "\n\t\texperience = 20";

        assertNotEquals(expected, car.printInfo());
    }
}