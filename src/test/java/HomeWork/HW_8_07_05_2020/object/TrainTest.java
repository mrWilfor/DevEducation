package HomeWork.HW_8_07_05_2020.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    @Test
    void createTest() {
        String expDestination = "San Francisco";
        int expNumberOfTrain = 123;
        long expDepartureTime = 1200;
        int expNumberOfPlaces = 2;

        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 123, 1200, 2);

        assertEquals(t1, t2);
        assertEquals(expDestination, t1.getDestination());
        assertEquals(expNumberOfTrain, t1.getNumberOfTrain());
        assertEquals(expDepartureTime, t1.getDepartureTime());
        assertEquals(expNumberOfPlaces, t1.getNumberOfPlaces());
    }

    @Test
    void setGetTest() {
        Train t = new Train();
        String expDestination = "San Francisco";
        int expNumberOfTrain = 123;
        long expDepartureTime = 1200;
        int expNumberOfPlaces = 2;

        t.setDestination("San Francisco");
        t.setNumberOfTrain(123);
        t.setDepartureTime(1200);
        t.setNumberOfPlaces(2);

        assertEquals(expDestination, t.getDestination());
        assertEquals(expNumberOfTrain, t.getNumberOfTrain());
        assertEquals(expDepartureTime, t.getDepartureTime());
        assertEquals(expNumberOfPlaces, t.getNumberOfPlaces());
    }

    @Test
    void builderTest() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);

        Train t2 = new Train.Builder()
                .destination("San Francisco")
                .numberOfTrain(123)
                .departureTime(1200)
                .numberOfPlaces(2)
                .build();

        assertEquals(t1, t2);
    }

    @Test
    void testEqualsTest() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 123, 1200, 2);

        assertEquals(t1, t2);
    }

    @Test
    void testEqualsTestFail() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 100, 1200, 2);

        assertFalse(t1.equals(t2));
    }

    @Test
    void testHashCodeTest() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 123, 1200, 2);

        assertTrue(t1.hashCode() == t2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 100, 1200, 2);
        System.out.println(t1.hashCode());
        assertFalse(t1.hashCode() == t2.hashCode());
    }

    @Test
    void testToString() {
        Train t = new Train("San Francisco", 123, 1200, 2);
        String expected = "HomeWork.HW_8_07_05_2020.object.Train@506742285[destination=San Francisco," +
                " numberOfTrain=123, departureTime=1200, numberOfPlaces=2]";

        assertEquals(expected, t.toString());
    }
}