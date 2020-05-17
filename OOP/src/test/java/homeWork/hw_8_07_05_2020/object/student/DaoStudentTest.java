package homeWork.hw_8_07_05_2020.object.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoStudentTest {
    private DaoStudent daoStudent;

    @BeforeEach
    public void before() {
        this.daoStudent = new DaoStudent();
    }

    @AfterEach
    public void after() {
        this.daoStudent.clear();
    }

    @Test
    void createMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Bridges", 3, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 3, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        long actualId1 = this.daoStudent.create(s1);
        long actualId2 = this.daoStudent.create(s2);
        long actualId3 = this.daoStudent.create(s3);
        long actualId4 = this.daoStudent.create(s4);
        long actualId5 = this.daoStudent.create(s5);

        long expectedId1 = 14;
        long expectedId2 = 15;
        long expectedId3 = 16;
        long expectedId4 = 17;
        long expectedId5 = 18;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
        assertEquals(expectedId3, actualId3);
        assertEquals(expectedId4, actualId4);
        assertEquals(expectedId5, actualId5);
    }

    @Test
    void createTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Bridges", 3, "3B");

        long actualId1 = this.daoStudent.create(s1);
        long actualId2 = this.daoStudent.create(s2);

        long expectedId1 = 14;
        long expectedId2 = 15;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        long actualId1 = this.daoStudent.create(s1);
        long expectedId1 = 14;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Student s1 = new Student();

        long actualId1 = this.daoStudent.create(s1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Bridges", 3, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 3, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.create(s3);
        this.daoStudent.create(s4);
        this.daoStudent.create(s5);

        Student[] expected = {s1, s2, s3, s4, s5};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);

        Student[] expected = {s1, s2};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByFacultyMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 3, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 3, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.create(s3);
        this.daoStudent.create(s4);
        this.daoStudent.create(s5);

        Student[] expected = {s1, s3, s4, s5};
        Student[] actual = this.daoStudent.readByFaculty("Bridges");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByFacultyTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readByFaculty("Bridges");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByFacultyOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readByFaculty("Bridges");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByFacultyZero() {
        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readByFaculty("Bridges");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllByFacultyAndCourseMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 2, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.create(s3);
        this.daoStudent.create(s4);
        this.daoStudent.create(s5);

        Student[] expected = {s1, s3, s5};
        Student[] actual = this.daoStudent.readAllByFacultyAndCourse("Bridges", 3);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllByFacultyAndCourseTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readAllByFacultyAndCourse("Bridges", 3);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllByFacultyAndCourseOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readAllByFacultyAndCourse("Bridges", 3);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllByFacultyAndCourseZero() {
        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAllByFacultyAndCourse("Bridges", 3);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterYearMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 2, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.create(s3);
        this.daoStudent.create(s4);
        this.daoStudent.create(s5);

        Student[] expected = {s3, s4, s5};
        Student[] actual = this.daoStudent.readByAfterYear(1975);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterYearTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readByAfterYear(1970);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterYearOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readByAfterYear(1970);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterYearZero() {
        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readByAfterYear(1970);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 2, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.create(s3);
        this.daoStudent.create(s4);
        this.daoStudent.create(s5);
        this.daoStudent.remove(15);

        Student[] expected = {s1, s3, s4, s5};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.remove(15);

        Student[] expected = {s1};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.remove(14);

        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoStudent.remove(14);

        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 2, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");
        Student s6 = new Student(14, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.create(s3);
        this.daoStudent.create(s4);
        this.daoStudent.create(s5);
        this.daoStudent.update(s6);

        Student[] expected = {s6, s2, s3, s4, s5};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");
        Student s6 = new Student(14, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.update(s6);

        Student[] expected = {s6, s2};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s6 = new Student(14, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.update(s6);

        Student[] expected = {s6};
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Student s6 = new Student(14, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.update(s6);

        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");
        Student s3 = new Student(16, "Ivanov", "Max", "Alexandrovich", 22_04_1986,
                "Kiev", 1234567890, "Bridges", 3, "3B");
        Student s4 = new Student(17, "Sergeev", "Alex", "Ivanovich", 30_11_1978,
                "Dnepr", 1234567890, "Bridges", 2, "3B");
        Student s5 = new Student(18, "Tarasov", "Vova", "Olegovich", 12_06_1981,
                "Lviv", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.create(s3);
        this.daoStudent.create(s4);
        this.daoStudent.create(s5);
        this.daoStudent.clear();

        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(15, "Petrov", "Vasya", "Alexeevich", 1_01_1970,
                "Poltava", 1234567890, "Tunels", 2, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.create(s2);
        this.daoStudent.clear();

        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1975,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        this.daoStudent.create(s1);
        this.daoStudent.clear();

        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoStudent.clear();

        Student[] expected = new Student[0];
        Student[] actual = this.daoStudent.readAll();

        assertArrayEquals(expected, actual);
    }
}