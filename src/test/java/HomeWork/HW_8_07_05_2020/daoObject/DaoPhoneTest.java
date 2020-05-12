package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Phone;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoPhoneTest {
    private DaoPhone daoPhone;

    @BeforeEach
    public void before() {
        this.daoPhone = new DaoPhone();
    }

    @AfterEach
    public void after() {
        this.daoPhone.clear();
    }

    @Test
    void createMany() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p3 = new Phone(3, "Abramovich", "Yana", "Ivanovna", "Kiev",
                3857_6394_3545_6576L, 12, 10, 7000);
        Phone p4 = new Phone(4, "Kolesnik", "Anastasiya", "Olegovna", "Kirovograd",
                3857_6394_3545_6576L, 12, 10, 5400);
        Phone p5 = new Phone(5, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        long actualId1 = this.daoPhone.create(p1);
        long actualId2 = this.daoPhone.create(p2);
        long actualId3 = this.daoPhone.create(p3);
        long actualId4 = this.daoPhone.create(p4);
        long actualId5 = this.daoPhone.create(p5);

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
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        long actualId1 = this.daoPhone.create(p1);
        long actualId2 = this.daoPhone.create(p2);

        long expectedId1 = 1;
        long expectedId2 = 2;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);

        long actualId1 = this.daoPhone.create(p1);
        long expectedId1 = 1;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Phone p1 = new Phone();

        long actualId1 = this.daoPhone.create(p1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p3 = new Phone(3, "Abramovich", "Yana", "Ivanovna", "Kiev",
                3857_6394_3545_6576L, 12, 10, 7000);
        Phone p4 = new Phone(4, "Kolesnik", "Anastasiya", "Olegovna", "Kirovograd",
                3857_6394_3545_6576L, 12, 10, 5400);
        Phone p5 = new Phone(5, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.create(p3);
        this.daoPhone.create(p4);
        this.daoPhone.create(p5);

        Phone[] expected = {p1, p2, p3, p4, p5};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);

        Phone[] expected = {p1, p2};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);

        this.daoPhone.create(p1);

        Phone[] expected = {p1};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByTalkTimeMoreThanMany() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p3 = new Phone(3, "Abramovich", "Yana", "Ivanovna", "Kiev",
                3857_6394_3545_6576L, 12, 10, 7000);
        Phone p4 = new Phone(4, "Kolesnik", "Anastasiya", "Olegovna", "Kirovograd",
                3857_6394_3545_6576L, 12, 10, 5400);
        Phone p5 = new Phone(5, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.create(p3);
        this.daoPhone.create(p4);
        this.daoPhone.create(p5);

        Phone[] expected = {p3, p5};
        Phone[] actual = this.daoPhone.readByTalkTimeMoreThan(6000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByTalkTimeMoreThanTwo() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);

        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readByTalkTimeMoreThan(6000);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByTalkTimeMoreThanOne() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);

        this.daoPhone.create(p1);

        Phone[] expected = {p1};
        Phone[] actual = this.daoPhone.readByTalkTimeMoreThan(5900);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByTalkTimeMoreThanZero() {
        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readByTalkTimeMoreThan(5900);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAlphabetMany() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p3 = new Phone(3, "Abramovich", "Yana", "Ivanovna", "Kiev",
                3857_6394_3545_6576L, 12, 10, 7000);
        Phone p4 = new Phone(4, "Kolesnik", "Anastasiya", "Olegovna", "Kirovograd",
                3857_6394_3545_6576L, 12, 10, 5400);
        Phone p5 = new Phone(5, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.create(p3);
        this.daoPhone.create(p4);
        this.daoPhone.create(p5);

        Phone[] expected = {p3, p1, p4, p5, p2};
        Phone[] actual = this.daoPhone.readByAlphabet();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAlphabetTwo() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);

        Phone[] expected = {p1, p2};
        Phone[] actual = this.daoPhone.readByAlphabet();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAlphabetOne() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);

        this.daoPhone.create(p1);

        Phone[] expected = {p1};
        Phone[] actual = this.daoPhone.readByAlphabet();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAlphabetZero() {
        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readByAlphabet();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p3 = new Phone(3, "Abramovich", "Yana", "Ivanovna", "Kiev",
                3857_6394_3545_6576L, 12, 10, 7000);
        Phone p4 = new Phone(4, "Kolesnik", "Anastasiya", "Olegovna", "Kirovograd",
                3857_6394_3545_6576L, 12, 10, 5400);
        Phone p5 = new Phone(5, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.create(p3);
        this.daoPhone.create(p4);
        this.daoPhone.create(p5);
        this.daoPhone.remove(2);

        Phone[] expected = {p1, p3, p4, p5};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.remove(2);

        Phone[] expected = {p1};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);

        this.daoPhone.create(p1);
        this.daoPhone.remove(1);

        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoPhone.remove(1);
        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p3 = new Phone(3, "Abramovich", "Yana", "Ivanovna", "Kiev",
                3857_6394_3545_6576L, 12, 10, 7000);
        Phone p4 = new Phone(4, "Kolesnik", "Anastasiya", "Olegovna", "Kirovograd",
                3857_6394_3545_6576L, 12, 10, 5400);
        Phone p5 = new Phone(5, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);
        Phone p6 = new Phone(1, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.create(p3);
        this.daoPhone.create(p4);
        this.daoPhone.create(p5);
        this.daoPhone.update(p6);

        Phone[] expected = {p6, p2, p3, p4, p5};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p6 = new Phone(1, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.update(p6);

        Phone[] expected = {p6, p2};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p6 = new Phone(1, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.update(p6);

        Phone[] expected = {p6};
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Phone p6 = new Phone(1, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.update(p6);

        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p3 = new Phone(3, "Abramovich", "Yana", "Ivanovna", "Kiev",
                3857_6394_3545_6576L, 12, 10, 7000);
        Phone p4 = new Phone(4, "Kolesnik", "Anastasiya", "Olegovna", "Kirovograd",
                3857_6394_3545_6576L, 12, 10, 5400);
        Phone p5 = new Phone(5, "Pervak", "Anna", "Aleksandrovna", "Lviv",
                3857_6394_3545_6576L, 12, 10, 8700);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.create(p3);
        this.daoPhone.create(p4);
        this.daoPhone.create(p5);
        this.daoPhone.clear();

        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);
        Phone p2 = new Phone(2, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        this.daoPhone.create(p1);
        this.daoPhone.create(p2);
        this.daoPhone.clear();

        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Phone p1 = new Phone(1, "Barabash", "Evgeniy", "Sergeevich", "Poltava",
                3857_6394_3545_6576L, 12, 10, 6000);

        this.daoPhone.create(p1);
        this.daoPhone.clear();

        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoPhone.clear();

        Phone[] expected = new Phone[0];
        Phone[] actual = this.daoPhone.readAll();

        assertArrayEquals(expected, actual);
    }
}
