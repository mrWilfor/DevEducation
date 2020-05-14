package homeWork.hw_8_07_05_2020.object.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    @Test
    void createTest() {
        String expSurNameDriver = "Sidorenko O.P.";
        int expNumberBus = 12;
        int expRouteNumber = 3;
        String expMark = "34P";
        int expYearOfOperation = 2001;
        long expMileage = 120000;

        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        assertEquals(b1, b2);
        assertEquals(expSurNameDriver, b1.getSurNameDriver());
        assertEquals(expNumberBus, b1.getNumberBus());
        assertEquals(expRouteNumber, b1.getRouteNumber());
        assertEquals(expMark, b1.getMark());
        assertEquals(expYearOfOperation, b1.getYearOfOperation());
        assertEquals(expMileage, b1.getMileage());
    }

    @Test
    void setGetTest() {
        Bus b = new Bus();
        String expSurNameDriver = "Sidorenko O.P.";
        int expNumberBus = 12;
        int expRouteNumber = 3;
        String expMark = "34P";
        int expYearOfOperation = 2001;
        long expMileage = 120000;

        b.setSurNameDriver("Sidorenko O.P.");
        b.setNumberBus(12);
        b.setRouteNumber(3);
        b.setMark("34P");
        b.setYearOfOperation(2001);
        b.setMileage(120000);

        assertEquals(expSurNameDriver, b.getSurNameDriver());
        assertEquals(expNumberBus, b.getNumberBus());
        assertEquals(expRouteNumber, b.getRouteNumber());
        assertEquals(expMark, b.getMark());
        assertEquals(expYearOfOperation, b.getYearOfOperation());
        assertEquals(expMileage, b.getMileage());
    }

    @Test
    void builderTest() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        Bus b2 = new Bus.Builder()
                .surNameDriver("Sidorenko O.P.")
                .numberBus(12)
                .routeNumber(3)
                .mark("34P")
                .yearOfOperation(2001)
                .mileage(120000)
                .build();

        assertEquals(b1, b2);
    }

    @Test
    void testEqualsTest() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        assertEquals(b1, b2);
    }

    @Test
    void testEqualsTestFail() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 100000);


        assertFalse(b1.equals(b2));
    }

    @Test
    void testHashCodeTest() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);


        assertTrue(b1.hashCode() == b2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 100000);

        System.out.println(b1.hashCode());
        assertFalse(b1.hashCode() == b2.hashCode());
    }

    @Test
    void testToString() {
        Bus b = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        String expected = "HomeWork.HW_8_07_05_2020.object.Bus@1698200694[surNameDriver=Sidorenko O.P., numberBus=12, routeNumber=3, " +
                "mark=34P, yearOfOperation=2001, mileage=120000]";

        assertEquals(expected, b.toString());
    }
}