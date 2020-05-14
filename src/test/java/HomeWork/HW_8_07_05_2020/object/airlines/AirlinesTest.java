package homeWork.hw_8_07_05_2020.object.airlines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlinesTest {

    @Test
    void createAirlinesTest() {
        String expDestination = "Poltava";
        int expFlightNumber = 151;
        String expTypeOfAircraft = "Passenger";
        long expDepartureTime = 1800L;
        String expDayOfTheWeek = "Monday";

        Airlines a1 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");

        assertEquals(a1, a2);
        assertEquals(expDestination, a1.getDestination());
        assertEquals(expFlightNumber, a1.getFlightNumber());
        assertEquals(expTypeOfAircraft, a1.getTypeOfAircraft());
        assertEquals(expDepartureTime, a1.getDepartureTime());
        assertEquals(expDayOfTheWeek, a1.getDayOfTheWeek());
    }

    @Test
    void setGetAirlinesTest() {
        Airlines a = new Airlines();
        String expDestination = "Poltava";
        int expFlightNumber = 151;
        String expTypeOfAircraft = "Passenger";
        long expDepartureTime = 1800L;
        String expDayOfTheWeek = "Monday";

        a.setDestination("Poltava");
        a.setFlightNumber(151);
        a.setTypeOfAircraft("Passenger");
        a.setDepartureTime(1800L);
        a.setDayOfTheWeek("Monday");

        assertEquals(expDestination, a.getDestination());
        assertEquals(expFlightNumber, a.getFlightNumber());
        assertEquals(expTypeOfAircraft, a.getTypeOfAircraft());
        assertEquals(expDepartureTime, a.getDepartureTime());
        assertEquals(expDayOfTheWeek, a.getDayOfTheWeek());
    }

    @Test
    void builderAirlinesTest() {
        Airlines a1 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");

        Airlines a2 = new Airlines.Builder()
                .destination("Poltava")
                .flightNumber(151)
                .typeOfAircraft("Passenger")
                .departureTime(1800L)
                .dayOfTheWeek("Monday")
                .build();

        assertEquals(a1, a2);
    }

    @Test
    void testEqualsTest() {
        Airlines a1 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");

        assertEquals(a1, a2);
    }

    @Test
    void testEqualsTestFail() {
        Airlines a1 = new Airlines("Poltava", 134, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");

        assertFalse(a1.equals(a2));
    }

    @Test
    void testHashCodeTest() {
        Airlines a1 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");

        assertTrue(a1.hashCode() == a2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Airlines a1 = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Poltava", 134, "Passenger", 1800L, "Monday");

        assertFalse(a1.hashCode() == a2.hashCode());
    }

    @Test
    void testToString() {
        Airlines a = new Airlines("Poltava", 151, "Passenger", 1800L, "Monday");

        String expected = "HomeWork.HW_8_07_05_2020.object.Airlines@-303826844[destination=Poltava, flightNumber=151, typeOfAircraft=Passenger, " +
                "departureTime=1800, dayOfTheWeek=Monday]";

        assertEquals(expected, a.toString());
    }
}