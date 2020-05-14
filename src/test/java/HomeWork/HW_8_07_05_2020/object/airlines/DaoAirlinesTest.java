package homeWork.hw_8_07_05_2020.object.airlines;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoAirlinesTest {
    private DaoAirlines daoAirlines;

    @BeforeEach
    public void before() {
        this.daoAirlines = new DaoAirlines();
    }

    @AfterEach
    public void after() {
        this.daoAirlines.clear();
    }

    @Test
    void createMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");

        long actual1 = this.daoAirlines.create(a1);
        long actual2 = this.daoAirlines.create(a2);
        long actual3 = this.daoAirlines.create(a3);
        long actual4 = this.daoAirlines.create(a4);
        long actual5 = this.daoAirlines.create(a5);

        long expected1 = 1;
        long expected2 = 2;
        long expected3 = 3;
        long expected4 = 4;
        long expected5 = 5;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }

    @Test
    void createTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");

        long actual1 = this.daoAirlines.create(a1);
        long actual2 = this.daoAirlines.create(a2);
        long expected1 = 1;
        long expected2 = 2;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void createOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");

        long actual1 = this.daoAirlines.create(a1);
        long expected1 = 1;

        assertEquals(expected1, actual1);
    }

    @Test
    void createZero() {
        Airlines a1 = new Airlines();

        long actual1 = this.daoAirlines.create(a1);
        long expected1 = 0;

        assertEquals(expected1, actual1);
    }

    @Test
    void readAllMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.create(a3);
        this.daoAirlines.create(a4);
        this.daoAirlines.create(a5);

        Airlines[] expected = {a1, a2, a3, a4, a5};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);

        Airlines[] expected = {a1, a2};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");

        this.daoAirlines.create(a1);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.create(a3);
        this.daoAirlines.create(a4);
        this.daoAirlines.create(a5);

        Airlines[] expected = {a1, a4, a5};
        Airlines[] actual = this.daoAirlines.readByDestination("Poltava");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readByDestination("Poltava");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");

        this.daoAirlines.create(a1);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readByDestination("Poltava");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationZero() {
        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readByDestination("Poltava");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.create(a3);
        this.daoAirlines.create(a4);
        this.daoAirlines.create(a5);

        Airlines[] expected = {a1, a5};
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeek("Monday");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeek("Monday");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");

        this.daoAirlines.create(a1);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeek("Monday");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekZero() {
        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeek("Monday");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekDepartureTimeMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.create(a3);
        this.daoAirlines.create(a4);
        this.daoAirlines.create(a5);

        Airlines[] expected = {a1, a5};
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeekDepartureTime("Monday", 1700);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekDepartureTimeTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeekDepartureTime("Monday", 1700);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekDepartureTimeOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");

        this.daoAirlines.create(a1);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeekDepartureTime("Monday", 1700);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDayOfTheWeekDepartureTimeZero() {
        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readByDayOfTheWeekDepartureTime("Monday", 1700);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.create(a3);
        this.daoAirlines.create(a4);
        this.daoAirlines.create(a5);
        this.daoAirlines.remove(2);

        Airlines[] expected = {a1, a3, a4, a5};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.remove(2);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.remove(2);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoAirlines.remove(2);

        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");
        Airlines a6 = new Airlines("Poltava", 2, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.create(a3);
        this.daoAirlines.create(a4);
        this.daoAirlines.create(a5);
        this.daoAirlines.update(a6);

        Airlines[] expected = {a1, a6, a3, a4, a5};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a6 = new Airlines("Poltava", 2, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.update(a6);

        Airlines[] expected = {a1, a6};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a6 = new Airlines("Poltava", 2, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.update(a6);

        Airlines[] expected = {a1};
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Airlines a6 = new Airlines("Poltava", 2, "Passenger", 2100L, "Monday");

        this.daoAirlines.update(a6);

        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");
        Airlines a3 = new Airlines("Kiev", 3, "Passenger", 1400L, "Wednesday");
        Airlines a4 = new Airlines("Poltava", 4, "Passenger", 1900L, "Tuesday");
        Airlines a5 = new Airlines("Poltava", 5, "Passenger", 2100L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.create(a3);
        this.daoAirlines.create(a4);
        this.daoAirlines.create(a5);
        this.daoAirlines.clear();

        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");
        Airlines a2 = new Airlines("Kirovograd", 2, "Passenger", 1600L, "Friday");

        this.daoAirlines.create(a1);
        this.daoAirlines.create(a2);
        this.daoAirlines.clear();

        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Airlines a1 = new Airlines("Poltava", 1, "Passenger", 1800L, "Monday");

        this.daoAirlines.create(a1);
        this.daoAirlines.clear();

        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoAirlines.clear();

        Airlines[] expected = new Airlines[0];
        Airlines[] actual = this.daoAirlines.readAll();

        assertArrayEquals(expected, actual);
    }
}