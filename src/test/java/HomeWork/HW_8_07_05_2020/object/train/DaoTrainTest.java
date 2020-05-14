package homeWork.hw_8_07_05_2020.object.train;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoTrainTest {
    private DaoTrain daoTrain;

    @BeforeEach
    public void before() {
        this.daoTrain = new DaoTrain();
    }

    @AfterEach
    public void after() {
        this.daoTrain.clear();
    }

    @Test
    void createMany() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t3 = new Train("New York", 109, 1000, 1);
        Train t4 = new Train("California", 32, 900, 0);
        Train t5 = new Train("London", 155, 2100, 12);

        long actualNumberOfTrain1 = this.daoTrain.create(t1);
        long actualNumberOfTrain2 = this.daoTrain.create(t2);
        long actualNumberOfTrain3 = this.daoTrain.create(t3);
        long actualNumberOfTrain4 = this.daoTrain.create(t4);
        long actualNumberOfTrain5 = this.daoTrain.create(t5);

        long expectedNumberOfTrain1 = 123;
        long expectedNumberOfTrain2 = 133;
        long expectedNumberOfTrain3 = 109;
        long expectedNumberOfTrain4 = 32;
        long expectedNumberOfTrain5 = 155;

        assertEquals(expectedNumberOfTrain1, actualNumberOfTrain1);
        assertEquals(expectedNumberOfTrain2, actualNumberOfTrain2);
        assertEquals(expectedNumberOfTrain3, actualNumberOfTrain3);
        assertEquals(expectedNumberOfTrain4, actualNumberOfTrain4);
        assertEquals(expectedNumberOfTrain5, actualNumberOfTrain5);
    }

    @Test
    void createTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);
        Train t2 = new Train("San Francisco", 133, 1800, 2);

        long actualNumberOfTrain1 = this.daoTrain.create(t1);
        long actualNumberOfTrain2 = this.daoTrain.create(t2);

        long expectedNumberOfTrain1 = 123;
        long expectedNumberOfTrain2 = 133;

        assertEquals(expectedNumberOfTrain1, actualNumberOfTrain1);
        assertEquals(expectedNumberOfTrain2, actualNumberOfTrain2);
    }

    @Test
    void createOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);

        long actualNumberOfTrain1 = this.daoTrain.create(t1);
        long expectedNumberOfTrain1 = 123;

        assertEquals(expectedNumberOfTrain1, actualNumberOfTrain1);
    }

    @Test
    void createZero() {
        Train t1 = new Train();

        long actualNumberOfTrain1 = this.daoTrain.create(t1);
        long expectedNumberOfTrain1 = 0;

        assertEquals(expectedNumberOfTrain1, actualNumberOfTrain1);
    }

        @Test
    void readAllMany() {
            Train t1 = new Train("San Francisco", 123, 1200, 21);
            Train t2 = new Train("San Francisco", 133, 1800, 2);
            Train t3 = new Train("New York", 109, 1000, 1);
            Train t4 = new Train("California", 32, 900, 0);
            Train t5 = new Train("London", 155, 2100, 12);

            this.daoTrain.create(t1);
            this.daoTrain.create(t2);
            this.daoTrain.create(t3);
            this.daoTrain.create(t4);
            this.daoTrain.create(t5);

            Train[] expected = {t1, t2, t3, t4, t5};
            Train[] actual = this.daoTrain.readAll();

            assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);
        Train t2 = new Train("San Francisco", 133, 1800, 2);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);

        Train[] expected = {t1, t2};
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);

        this.daoTrain.create(t1);

        Train[] expected = {t1};
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationMany() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t3 = new Train("New York", 109, 1000, 1);
        Train t4 = new Train("California", 32, 900, 0);
        Train t5 = new Train("London", 155, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.create(t3);
        this.daoTrain.create(t4);
        this.daoTrain.create(t5);

        Train[] expected = {t4};
        Train[] actual = this.daoTrain.readByDestination("California");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);
        Train t2 = new Train("San Francisco", 133, 1800, 2);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);

        Train[] expected = {t1, t2};
        Train[] actual = this.daoTrain.readByDestination("San Francisco");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);

        this.daoTrain.create(t1);

        Train[] expected = {t1};
        Train[] actual = this.daoTrain.readByDestination("San Francisco");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationZero() {
        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readByDestination("San Francisco");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationAfterMany() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t3 = new Train("New York", 109, 1000, 1);
        Train t4 = new Train("California", 32, 900, 0);
        Train t5 = new Train("London", 155, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.create(t3);
        this.daoTrain.create(t4);
        this.daoTrain.create(t5);

        Train[] expected = {t2};
        Train[] actual = this.daoTrain.readByDestinationAfter("San Francisco", 1200);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationAfterTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);
        Train t2 = new Train("San Francisco", 133, 1800, 2);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);

        Train[] expected = {t1, t2};
        Train[] actual = this.daoTrain.readByDestinationAfter("San Francisco", 1100);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationAfterOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 21);

        this.daoTrain.create(t1);

        Train[] expected = {t1};
        Train[] actual = this.daoTrain.readByDestinationAfter("San Francisco", 1100);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationAfterZero() {
        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readByDestinationAfter("San Francisco", 1100);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationCommonPlacesMany() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t3 = new Train("New York", 109, 1000, 1);
        Train t4 = new Train("California", 32, 900, 0);
        Train t5 = new Train("London", 155, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.create(t3);
        this.daoTrain.create(t4);
        this.daoTrain.create(t5);

        Train[] expected = {t1, t2};
        Train[] actual = this.daoTrain.readByDestinationCommonPlaces("San Francisco", 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationCommonPlacesTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);

        Train[] expected = {t1, t2};
        Train[] actual = this.daoTrain.readByDestinationCommonPlaces("San Francisco", 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationCommonPlacesOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);

        this.daoTrain.create(t1);

        Train[] expected = {t1};
        Train[] actual = this.daoTrain.readByDestinationCommonPlaces("San Francisco", 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByDestinationCommonPlacesZero() {
        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readByDestinationCommonPlaces("San Francisco", 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t3 = new Train("New York", 109, 1000, 1);
        Train t4 = new Train("California", 32, 900, 0);
        Train t5 = new Train("London", 155, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.create(t3);
        this.daoTrain.create(t4);
        this.daoTrain.create(t5);
        this.daoTrain.remove(32);

        Train[] expected = {t1, t2, t3, t5};
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);

        this.daoTrain.remove(32);

        Train[] expected = {t1, t2};
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);

        this.daoTrain.create(t1);
        this.daoTrain.remove(123);

        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoTrain.remove(123);

        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t3 = new Train("New York", 109, 1000, 1);
        Train t4 = new Train("California", 32, 900, 0);
        Train t5 = new Train("London", 155, 2100, 12);
        Train t6 = new Train("London", 133, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.create(t3);
        this.daoTrain.create(t4);
        this.daoTrain.create(t5);
        this.daoTrain.update(t6);

        Train[] expected = {t1, t6, t3, t4, t5};
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t6 = new Train("London", 133, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.update(t6);

        Train[] expected = {t1, t6};
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t6 = new Train("London", 133, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.update(t6);

        Train[] expected = {t1};
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Train t6 = new Train("London", 133, 2100, 12);

        this.daoTrain.update(t6);

        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);
        Train t3 = new Train("New York", 109, 1000, 1);
        Train t4 = new Train("California", 32, 900, 0);
        Train t5 = new Train("London", 155, 2100, 12);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.create(t3);
        this.daoTrain.create(t4);
        this.daoTrain.create(t5);
        this.daoTrain.clear();

        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);
        Train t2 = new Train("San Francisco", 133, 1800, 2);

        this.daoTrain.create(t1);
        this.daoTrain.create(t2);
        this.daoTrain.clear();

        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Train t1 = new Train("San Francisco", 123, 1200, 2);

        this.daoTrain.create(t1);
        this.daoTrain.clear();

        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoTrain.clear();

        Train[] expected = new Train[0];
        Train[] actual = this.daoTrain.readAll();

        assertArrayEquals(expected, actual);
    }
}
