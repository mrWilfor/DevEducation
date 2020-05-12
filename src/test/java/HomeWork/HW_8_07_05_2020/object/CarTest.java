package HomeWork.HW_8_07_05_2020.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createTest() {
        long expId = 642;
        String expCarMake = "Toyota";
        String expModel = "Supra";
        int expYearOfIssue = 1970;
        String expColor = "blue";
        long expPrise = 30000;
        long expRegistrationNumber = 12345689;

        Car c1 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);
        Car c2 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);

        assertEquals(c1, c2);
        assertEquals(expId, c1.getId());
        assertEquals(expCarMake, c1.getCarMake());
        assertEquals(expModel, c1.getModel());
        assertEquals(expYearOfIssue, c1.getYearOfIssue());
        assertEquals(expColor, c1.getColor());
        assertEquals(expPrise, c1.getPrise());
    }

    @Test
    void setGetTest() {
        Car c = new Car();
        long expId = 642;
        String expCarMake = "Toyota";
        String expModel = "Supra";
        int expYearOfIssue = 1970;
        String expColor = "blue";
        long expPrise = 30000;
        long expRegistrationNumber = 12345689;

        c.setId(642);
        c.setCarMake("Toyota");
        c.setModel("Supra");
        c.setYearOfIssue(1970);
        c.setColor("blue");
        c.setPrise(30000);
        c.setRegistrationNumber(123456789);

        assertEquals(expId, c.getId());
        assertEquals(expCarMake, c.getCarMake());
        assertEquals(expModel, c.getModel());
        assertEquals(expYearOfIssue, c.getYearOfIssue());
        assertEquals(expColor, c.getColor());
        assertEquals(expPrise, c.getPrise());
    }

    @Test
    void builderTest() {
        Car c1 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);

        Car c2 = new Car.Builder()
                .id(642)
                .carMake("Toyota")
                .model("Supra")
                .yearOfIssue(1970)
                .color("blue")
                .prise(30000)
                .registrationNumber(123456789)
                .build();

        assertEquals(c1, c2);
    }

    @Test
    void testEqualsTest() {
        Car c1 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);
        Car c2 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);

        assertEquals(c1, c2);
    }

    @Test
    void testEqualsTestFail() {
        Car c1 = new Car(642, "Nissan", "Supra", 1970, "blue",30000, 123456789);
        Car c2 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);

        assertFalse(c1.equals(c2));
    }

    @Test
    void testHashCodeTest() {
        Car c1 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);
        Car c2 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);

        assertTrue(c1.hashCode() == c2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Car c1 = new Car(642, "Nissan", "Supra", 1970, "blue",30000, 123456789);
        Car c2 = new Car(642, "Toyota", "Supra", 1970, "blue",30000, 123456789);

        System.out.println(c1.hashCode());
        assertFalse(c1.hashCode() == c2.hashCode());
    }

    @Test
    void testToString() {
        Car c = new Car(642, "Nissan", "Supra", 1970, "blue",30000, 123456789);
        String expected = "HomeWork.HW_8_07_05_2020.object.Car@-1754599468[id=642, carMake=Nissan, model=Supra, " +
                "yearOfIssue=1970, color=blue, prise=30000, registrationNumber=123456789]";

        assertEquals(expected, c.toString());
    }
}