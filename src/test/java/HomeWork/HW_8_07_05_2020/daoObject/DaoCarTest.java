package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Car;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoCarTest {
    private DaoCar daoCar;

    @BeforeEach
    public void before() {
        this.daoCar = new DaoCar();
    }

    @AfterEach
    public void after() {
        this.daoCar.clear();
    }

    @Test
    void createMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1986,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        long actualId1 = this.daoCar.create(c1);
        long actualId2 = this.daoCar.create(c2);
        long actualId3 = this.daoCar.create(c3);
        long actualId4 = this.daoCar.create(c4);
        long actualId5 = this.daoCar.create(c5);

        long expectedId1 = 1;
        long expectedId2 = 2;
        long expectedId3 = 3;
        long expectedId4 = 4;
        long expectedId5 = 5;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
        assertEquals(expectedId3, actualId3);
        assertEquals(expectedId4, actualId4);
        assertEquals(expectedId5, actualId5);
    }

    @Test
    void createTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);

        long actualId1 = this.daoCar.create(c1);
        long actualId2 = this.daoCar.create(c2);
        long expectedId1 = 1;
        long expectedId2 = 2;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);

        long actualId1 = this.daoCar.create(c1);
        long expectedId1 = 1;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Car c1 = new Car();

        long actualId1 = this.daoCar.create(c1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1986,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.create(c3);
        this.daoCar.create(c4);
        this.daoCar.create(c5);

        Car[] expected = {c1, c2, c3, c4, c5};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);

        this.daoCar.create(c1);
        this.daoCar.create(c2);

        Car[] expected = {c1, c2};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);

        this.daoCar.create(c1);

        Car[] expected = {c1};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMakeMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1986,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.create(c3);
        this.daoCar.create(c4);
        this.daoCar.create(c5);

        Car[] expected = {c3, c4};
        Car[] actual = daoCar.readByMake("Nissan");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMakeTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);

        this.daoCar.create(c1);
        this.daoCar.create(c2);

        Car[] expected = {c1, c2};
        Car[] actual = daoCar.readByMake("Toyota");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMakeOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);

        this.daoCar.create(c1);

        Car[] expected = {c1};
        Car[] actual = daoCar.readByMake("Toyota");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByMakeZero() {
        Car[] expected = new Car[0];
        Car[] actual = daoCar.readByMake("Toyota");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByModelMoreYearOfOperationMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1986,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.create(c3);
        this.daoCar.create(c4);
        this.daoCar.create(c5);

        Car[] expected = {c2};
        Car[] actual = daoCar.readByModelMoreYearOfOperation("Corolla", 20);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByModelMoreYearOfOperationTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);

        this.daoCar.create(c1);
        this.daoCar.create(c2);

        Car[] expected = {c2};
        Car[] actual = daoCar.readByModelMoreYearOfOperation("Corolla", 20);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByModelMoreYearOfOperationOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);

        this.daoCar.create(c1);

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readByModelMoreYearOfOperation("Corolla", 20);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByModelMoreYearOfOperationZero() {
        Car[] expected = new Car[0];
        Car[] actual = daoCar.readByModelMoreYearOfOperation("Corolla", 20);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfIssuePriseMoreMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1970,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.create(c3);
        this.daoCar.create(c4);
        this.daoCar.create(c5);

        Car[] expected = {c1, c4};
        Car[] actual = daoCar.readByYearOfIssuePriseMore(1970, 5000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfIssuePriseMoreTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);

        this.daoCar.create(c1);
        this.daoCar.create(c2);

        Car[] expected = {c1};
        Car[] actual = daoCar.readByYearOfIssuePriseMore(1970, 5000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfIssuePriseMoreOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);

        this.daoCar.create(c1);

        Car[] expected = {c1};
        Car[] actual = daoCar.readByYearOfIssuePriseMore(1970, 5000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByYearOfIssuePriseMoreZero() {
        Car[] expected = new Car[0];
        Car[] actual = daoCar.readByYearOfIssuePriseMore(1970, 5000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1970,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.create(c3);
        this.daoCar.create(c4);
        this.daoCar.create(c5);
        this.daoCar.remove(2);

        Car[] expected = {c1, c3, c4, c5};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.remove(2);

        Car[] expected = {c1};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);

        this.daoCar.create(c1);
        this.daoCar.remove(1);

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoCar.remove(1);

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1970,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);
        Car c6 = new Car(2, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.create(c3);
        this.daoCar.create(c4);
        this.daoCar.create(c5);
        this.daoCar.update(c6);

        Car[] expected = {c1, c6, c3, c4, c5};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c6 = new Car(2, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.update(c6);

        Car[] expected = {c1, c6};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c6 = new Car(2, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.update(c6);

        Car[] expected = {c1};
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Car c6 = new Car(2, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.update(c6);

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);
        Car c3 = new Car(3, "Nissan", "350Z", 1991,
                "black",35000, 855656789);
        Car c4 = new Car(4, "Nissan", "240", 1970,
                "green",10000, 235456789);
        Car c5 = new Car(5, "Range Rover", "Sport", 2010,
                "grey",50000, 893456789);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.create(c3);
        this.daoCar.create(c4);
        this.daoCar.create(c5);
        this.daoCar.clear();

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);
        Car c2 = new Car(2, "Toyota", "Corolla", 1977,
                "red",15000, 1234565689);

        this.daoCar.create(c1);
        this.daoCar.create(c2);
        this.daoCar.clear();

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Car c1 = new Car(1, "Toyota", "Supra", 1970,
                "blue",30000, 634755859);

        this.daoCar.create(c1);
        this.daoCar.clear();

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoCar.clear();

        Car[] expected = new Car[0];
        Car[] actual = daoCar.readAll();

        assertArrayEquals(expected, actual);
    }
}