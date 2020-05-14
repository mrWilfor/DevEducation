package homeWork.hw_8_07_05_2020.object.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoCustomerTest {
    private DaoCustomer daoCustomer;

    @BeforeEach
    public void before() {
        this.daoCustomer = new DaoCustomer();
    }

    @AfterEach
    public void after() {
        this.daoCustomer.clear();
    }

    @Test
    void createMany() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c3 = new Customer(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234_1234_9101_1121L, 748159263L);
        Customer c4 = new Customer(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234_1121_9101_1121L, 748159263L);
        Customer c5 = new Customer(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        long actualId1 = this.daoCustomer.create(c1);
        long actualId2 = this.daoCustomer.create(c2);
        long actualId3 = this.daoCustomer.create(c3);
        long actualId4 = this.daoCustomer.create(c4);
        long actualId5 = this.daoCustomer.create(c5);

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
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);

        long actualId1 = this.daoCustomer.create(c1);
        long actualId2 = this.daoCustomer.create(c2);

        long expectedId1 = 1;
        long expectedId2 = 2;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);

        long actualId1 = this.daoCustomer.create(c1);
        long expectedId1 = 1;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Customer c1 = new Customer();

        long actualId1 = this.daoCustomer.create(c1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c3 = new Customer(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234_1234_9101_1121L, 748159263L);
        Customer c4 = new Customer(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234_1121_9101_1121L, 748159263L);
        Customer c5 = new Customer(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.create(c3);
        this.daoCustomer.create(c4);
        this.daoCustomer.create(c5);

        Customer[] expected = {c1, c2, c3, c4, c5};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);

        Customer[] expected = {c1, c2};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);

        Customer[] expected = {c1};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readBySameNamesMany() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vova", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c3 = new Customer(3, "Ivanov", "Dima", "Alexandrovich", "Kiev",
                1234_1234_9101_1121L, 748159263L);
        Customer c4 = new Customer(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234_1121_9101_1121L, 748159263L);
        Customer c5 = new Customer(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.create(c3);
        this.daoCustomer.create(c4);
        this.daoCustomer.create(c5);

        Customer[] expected = {c3, c1, c5, c2};
        Customer[] actual = this.daoCustomer.readBySameNames();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readBySameNamesTwo() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Dima", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);

        Customer[] expected = {c2, c1};
        Customer[] actual = this.daoCustomer.readBySameNames();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readBySameNamesOne() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readBySameNames();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readBySameNamesZero() {
        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readBySameNames();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberOfCreditCardMany() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c3 = new Customer(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234_1234_9101_1121L, 748159263L);
        Customer c4 = new Customer(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234_1121_9101_1121L, 748159263L);
        Customer c5 = new Customer(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.create(c3);
        this.daoCustomer.create(c4);
        this.daoCustomer.create(c5);

        Customer[] expected = {c2};
        Customer[] actual = this.daoCustomer.readByNumberOfCreditCard(1234_5678_5678_1121L);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberOfCreditCardTwo() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);

        Customer[] expected = {c2};
        Customer[] actual = this.daoCustomer.readByNumberOfCreditCard(1234_5678_5678_1121L);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberOfCreditCardOne() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readByNumberOfCreditCard(1234_5678_5678_1121L);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNumberOfCreditCardZero() {
        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readByNumberOfCreditCard(1234_5678_5678_1121L);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c3 = new Customer(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234_1234_9101_1121L, 748159263L);
        Customer c4 = new Customer(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234_1121_9101_1121L, 748159263L);
        Customer c5 = new Customer(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.create(c3);
        this.daoCustomer.create(c4);
        this.daoCustomer.create(c5);
        this.daoCustomer.remove(1);

        Customer[] expected = {c2, c3, c4, c5};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.remove(1);

        Customer[] expected = {c2};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.remove(1);

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoCustomer.remove(1);

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c3 = new Customer(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234_1234_9101_1121L, 748159263L);
        Customer c4 = new Customer(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234_1121_9101_1121L, 748159263L);
        Customer c5 = new Customer(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);
        Customer c6 = new Customer(1, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.create(c3);
        this.daoCustomer.create(c4);
        this.daoCustomer.create(c5);
        this.daoCustomer.update(c6);

        Customer[] expected = {c6, c2, c3, c4, c5};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c6 = new Customer(1, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.update(c6);

        Customer[] expected = {c6, c2};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c6 = new Customer(1, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.update(c6);

        Customer[] expected = {c6};
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Customer c6 = new Customer(1, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.update(c6);

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);
        Customer c3 = new Customer(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234_1234_9101_1121L, 748159263L);
        Customer c4 = new Customer(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234_1121_9101_1121L, 748159263L);
        Customer c5 = new Customer(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                9101_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.create(c3);
        this.daoCustomer.create(c4);
        this.daoCustomer.create(c5);
        this.daoCustomer.clear();

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234_5678_5678_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.create(c2);
        this.daoCustomer.clear();

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Customer c1 = new Customer(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234_5678_9101_1121L, 748159263L);

        this.daoCustomer.create(c1);
        this.daoCustomer.clear();

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoCustomer.clear();

        Customer[] expected = new Customer[0];
        Customer[] actual = this.daoCustomer.readAll();

        assertArrayEquals(expected, actual);
    }
}