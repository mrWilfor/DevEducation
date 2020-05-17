package homeWork.hw_8_07_05_2020.object.bus;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoBusTest {
    private DaoBus daoBus;

    @BeforeEach
    public void before() {
        this.daoBus = new DaoBus();
    }

    @AfterEach
    public void after() {
        this.daoBus.clear();
    }

    @Test
    void createMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);

        long actualNumberOfBus1 = this.daoBus.create(b1);
        long actualNumberOfBus2 = this.daoBus.create(b2);
        long actualNumberOfBus3 = this.daoBus.create(b3);
        long actualNumberOfBus4 = this.daoBus.create(b4);
        long actualNumberOfBus5 = this.daoBus.create(b5);

        long expectedNumberOfBus1 = 12;
        long expectedNumberOfBus2 = 13;
        long expectedNumberOfBus3 = 14;
        long expectedNumberOfBus4 = 15;
        long expectedNumberOfBus5 = 16;

        assertEquals(actualNumberOfBus1, expectedNumberOfBus1);
        assertEquals(actualNumberOfBus2, expectedNumberOfBus2);
        assertEquals(actualNumberOfBus3, expectedNumberOfBus3);
        assertEquals(actualNumberOfBus4, expectedNumberOfBus4);
        assertEquals(actualNumberOfBus5, expectedNumberOfBus5);
    }

    @Test
    void createTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);

        long actualNumberOfBus1 = this.daoBus.create(b1);
        long actualNumberOfBus2 = this.daoBus.create(b2);

        long expectedNumberOfBus1 = 12;
        long expectedNumberOfBus2 = 13;

        assertEquals(actualNumberOfBus1, expectedNumberOfBus1);
        assertEquals(actualNumberOfBus2, expectedNumberOfBus2);
    }

    @Test
    void createOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        long actualNumberOfBus1 = this.daoBus.create(b1);

        long expectedNumberOfBus1 = 12;

        assertEquals(actualNumberOfBus1, expectedNumberOfBus1);
    }

    @Test
    void createZero() {
        Bus b1 = new Bus();

        long actualNumberOfBus1 = this.daoBus.create(b1);
        long expectedNumberOfBus1 = 0;

        assertEquals(actualNumberOfBus1, expectedNumberOfBus1);
    }

    @Test
    void readAllMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.create(b3);
        this.daoBus.create(b4);
        this.daoBus.create(b5);

        Bus[] expected = {b1, b2, b3, b4, b5};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);


        Bus[] expected = {b1, b2};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        this.daoBus.create(b1);

        Bus[] expected = {b1};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberBusMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
            2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.create(b3);
        this.daoBus.create(b4);
        this.daoBus.create(b5);

        Bus[] expected = {b2};
        Bus[] actual = this.daoBus.readByNumberBus(13);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberBusTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);

        Bus[] expected = {b2};
        Bus[] actual = this.daoBus.readByNumberBus(13);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberBusOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        this.daoBus.create(b1);

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readByNumberBus(13);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberBusZero() {
        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readByNumberBus(13);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfOperationMoreMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.create(b3);
        this.daoBus.create(b4);
        this.daoBus.create(b5);

        Bus[] expected = {b1, b2, b5};
        Bus[] actual = this.daoBus.readByYearOfOperationMore(1999);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfOperationMoreTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);

        Bus[] expected = {b1, b2};
        Bus[] actual = this.daoBus.readByYearOfOperationMore(1999);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfOperationMoreOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        this.daoBus.create(b1);

        Bus[] expected = {b1};
        Bus[] actual = this.daoBus.readByYearOfOperationMore(1999);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfOperationMoreZero() {
        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readByYearOfOperationMore(1999);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMileageMoreMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.create(b3);
        this.daoBus.create(b4);
        this.daoBus.create(b5);

        Bus[] expected = {b2, b3, b4, b5};
        Bus[] actual = this.daoBus.readByMileageMore(120000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMileageMoreTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);

        Bus[] expected = {b2};
        Bus[] actual = this.daoBus.readByMileageMore(120000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMileageMoreOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        this.daoBus.create(b1);

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readByMileageMore(120000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMileageMoreZero() {
        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readByMileageMore(120000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.create(b3);
        this.daoBus.create(b4);
        this.daoBus.create(b5);
        this.daoBus.remove(14);

        Bus[] expected = {b1, b2, b4, b5};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.remove(14);

        Bus[] expected = {b1, b2};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        this.daoBus.create(b1);
        this.daoBus.remove(14);

        Bus[] expected = {b1};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoBus.remove(14);

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);
        Bus b6 = new Bus("Bilykh M.O", 12, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.create(b3);
        this.daoBus.create(b4);
        this.daoBus.create(b5);
        this.daoBus.update(b6);

        Bus[] expected = {b6, b2, b3, b4, b5};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b6 = new Bus("Bilykh M.O", 12, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.update(b6);

        Bus[] expected = {b6, b2};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b6 = new Bus("Bilykh M.O", 12, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.update(b6);

        Bus[] expected = {b6};
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Bus b6 = new Bus("Bilykh M.O", 12, 5, "34P",
                2001, 125000);

        this.daoBus.update(b6);

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);
        Bus b3 = new Bus("Barabash E.I.", 14, 3, "34P",
                1999, 140000);
        Bus b4 = new Bus("Tarasov V.A.", 15, 5, "34P",
                1999, 145000);
        Bus b5 = new Bus("Bilykh M.O", 16, 5, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.create(b3);
        this.daoBus.create(b4);
        this.daoBus.create(b5);
        this.daoBus.clear();

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);
        Bus b2 = new Bus("Markov I.O", 13, 2, "34P",
                2001, 125000);

        this.daoBus.create(b1);
        this.daoBus.create(b2);
        this.daoBus.clear();

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Bus b1 = new Bus("Sidorenko O.P.", 12, 3, "34P",
                2001, 120000);

        this.daoBus.create(b1);
        this.daoBus.clear();

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoBus.clear();

        Bus[] expected = new Bus[0];
        Bus[] actual = this.daoBus.readAll();

        assertArrayEquals(expected, actual);
    }
}