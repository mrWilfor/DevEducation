package homeWork.hw_8_07_05_2020.object.abiturient;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoAbiturientTest {
    private DaoAbiturient daoAbiturient;

    @BeforeEach
    public void before() {
        this.daoAbiturient = new DaoAbiturient();
    }

    @AfterEach
    public void after() {
        this.daoAbiturient.clear();
    }

    @Test
    void createMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        long actualId1 = this.daoAbiturient.create(a1);
        long actualId2 = this.daoAbiturient.create(a2);
        long actualId3 = this.daoAbiturient.create(a3);
        long actualId4 = this.daoAbiturient.create(a4);
        long actualId5 = this.daoAbiturient.create(a5);

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
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});

        long actualId1 = this.daoAbiturient.create(a1);
        long actualId2 = this.daoAbiturient.create(a2);

        long expectedId1 = 1;
        long expectedId2 = 2;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});

        long actualId1 = this.daoAbiturient.create(a1);
        long expectedId1 = 1;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Abiturient a1 = new Abiturient();

        long actualId1 = this.daoAbiturient.create(a1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.create(a3);
        this.daoAbiturient.create(a4);
        this.daoAbiturient.create(a5);

        Abiturient[] expected = {a1, a2, a3, a4, a5};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);

        Abiturient[] expected = {a1, a2};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});

        this.daoAbiturient.create(a1);

        Abiturient[] expected = {a1};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPoorGradesMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.create(a3);
        this.daoAbiturient.create(a4);
        this.daoAbiturient.create(a5);

        Abiturient[] expected = {a2, a5};
        Abiturient[] actual = this.daoAbiturient.readByPoorGrades();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPoorGradesTwo() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);

        Abiturient[] expected = {a2};
        Abiturient[] actual = this.daoAbiturient.readByPoorGrades();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPoorGradesOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});

        this.daoAbiturient.create(a1);

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readByPoorGrades();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPoorGradesZero() {
        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readByPoorGrades();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAverageMarkHigherGivenMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.create(a3);
        this.daoAbiturient.create(a4);
        this.daoAbiturient.create(a5);

        Abiturient[] expected = {a1, a3, a4, a5};
        Abiturient[] actual = this.daoAbiturient.readByAverageMarkHigherGiven(3.4);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAverageMarkHigherGivenTwo() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);

        Abiturient[] expected = {a1};
        Abiturient[] actual = this.daoAbiturient.readByAverageMarkHigherGiven(3.4);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAverageMarkHigherGivenOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});

        this.daoAbiturient.create(a1);

        Abiturient[] expected = {a1};
        Abiturient[] actual = this.daoAbiturient.readByAverageMarkHigherGiven(3.4);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAverageMarkHigherGivenZero() {
        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readByAverageMarkHigherGiven(3.4);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByHighestAverageMarkMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.create(a3);
        this.daoAbiturient.create(a4);
        this.daoAbiturient.create(a5);

        Abiturient[] expected = {a1, a4, a3};
        Abiturient[] actual = this.daoAbiturient.readByHighestAverageMark(3);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByHighestAverageMarkTwo() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);

        Abiturient[] expected = {a1, a2};
        Abiturient[] actual = this.daoAbiturient.readByHighestAverageMark(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByHighestAverageMarkOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});

        this.daoAbiturient.create(a1);

        Abiturient[] expected = {a1};
        Abiturient[] actual = this.daoAbiturient.readByHighestAverageMark(1);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByHighestAverageMarkZero() {
        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readByHighestAverageMark(0);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.create(a3);
        this.daoAbiturient.create(a4);
        this.daoAbiturient.create(a5);
        this.daoAbiturient.remove(4);

        Abiturient[] expected = {a1, a2, a3, a5};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.remove(1);

        Abiturient[] expected = {a2};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.remove(1);

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoAbiturient.remove(1);

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});
        Abiturient a6 = new Abiturient(2, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.create(a3);
        this.daoAbiturient.create(a4);
        this.daoAbiturient.create(a5);
        this.daoAbiturient.update(a6);

        Abiturient[] expected = {a1, a6, a3, a4, a5};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a6 = new Abiturient(2, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.update(a6);

        Abiturient[] expected = {a1, a6};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a6 = new Abiturient(2, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.update(a6);

        Abiturient[] expected = {a1};
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Abiturient a6 = new Abiturient(2, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.update(a6);

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});
        Abiturient a3 = new Abiturient(3, "Ivanov", "Max", "Alexandrovich", "Kiev",
                1234567890L, new int[]{3, 4, 3, 4});
        Abiturient a4 = new Abiturient(4, "Sergeev", "Alex", "Ivanovich", "Dnepr",
                1234567890L, new int[]{4, 4, 3, 4});
        Abiturient a5 = new Abiturient(5, "Tarasov", "Vova", "Olegovich", "Lviv",
                1234567890L, new int[]{5, 2, 3, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.create(a3);
        this.daoAbiturient.create(a4);
        this.daoAbiturient.create(a5);
        this.daoAbiturient.clear();

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});
        Abiturient a2 = new Abiturient(2, "Petrov", "Vasya", "Alexeevich", "Poltava",
                1234567890L, new int[]{2, 4, 3, 3});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.create(a2);
        this.daoAbiturient.clear();

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Abiturient a1 = new Abiturient(1, "Ilyin", "Dima", "Petrovich", "Uzhgorod",
                1234567890L, new int[]{5, 4, 4, 4});

        this.daoAbiturient.create(a1);
        this.daoAbiturient.clear();

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoAbiturient.clear();

        Abiturient[] expected = new Abiturient[0];
        Abiturient[] actual = this.daoAbiturient.readAll();

        assertArrayEquals(expected, actual);
    }
}