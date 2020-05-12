package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Patient;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoPatientTest {
    private DaoPatient daoPatient;

    @BeforeEach
    public void before() {
        this.daoPatient = new DaoPatient();
    }

    @AfterEach
    public void after() {
        this.daoPatient.clear();
    }

    @Test
    void createMany() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 564, "Healthy");
        Patient p3 = new Patient(312, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 564, "Healthy");
        Patient p4 = new Patient(152, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 564, "Healthy");
        Patient p5 = new Patient(451, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 564, "Healthy");

        long actualId1 = this.daoPatient.create(p1);
        long actualId2 = this.daoPatient.create(p2);
        long actualId3 = this.daoPatient.create(p3);
        long actualId4 = this.daoPatient.create(p4);
        long actualId5 = this.daoPatient.create(p5);

        long expectedId1 = 261;
        long expectedId2 = 150;
        long expectedId3 = 312;
        long expectedId4 = 152;
        long expectedId5 = 451;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
        assertEquals(expectedId3, actualId3);
        assertEquals(expectedId4, actualId4);
        assertEquals(expectedId5, actualId5);
    }

    @Test
    void createTwo() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 564, "Healthy");

        long actualId1 = this.daoPatient.create(p1);
        long actualId2 = this.daoPatient.create(p2);

        long expectedId1 = 261;
        long expectedId2 = 150;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        long actualId1 = this.daoPatient.create(p1);
        long expectedId1 = 261;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Patient p1 = new Patient();
        long actualId1 = this.daoPatient.create(p1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 564, "Cancer");
        Patient p3 = new Patient(312, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 564, "Healthy");
        Patient p4 = new Patient(152, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 564, "Healthy");
        Patient p5 = new Patient(451, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 564, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);

        Patient[] expected = {p1, p2, p3, p4, p5};
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 564, "Cancer");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);

        Patient[] expected = {p1, p2};
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        this.daoPatient.create(p1);

        Patient[] expected = {p1};
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Patient[] expected = new Patient[0];
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readPatientsByDiagnosis() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 564, "Cancer");
        Patient p3 = new Patient(312, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 564, "Healthy");
        Patient p4 = new Patient(152, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 564, "Healthy");
        Patient p5 = new Patient(451, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 564, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);

        Patient[] actual = this.daoPatient.readPatientsByDiagnosis("Cancer");
        Patient[] expected = {p2};

        assertArrayEquals(actual, expected);
    }

    @Test
    void readPatientsByDiagnosisZero() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 564, "Healthy");
        Patient p3 = new Patient(312, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 564, "Healthy");
        Patient p4 = new Patient(152, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 564, "Healthy");
        Patient p5 = new Patient(451, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 564, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);

        Patient[] actual = this.daoPatient.readPatientsByDiagnosis("Cancer");
        Patient[] expected = new Patient[0];

        assertArrayEquals(actual, expected);
    }

    @Test
    void readByNumberOfMedicineCard() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");
        Patient p3 = new Patient(312, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 3, "Healthy");
        Patient p4 = new Patient(152, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 4, "Healthy");
        Patient p5 = new Patient(451, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 5, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);

        Patient actual = daoPatient.readByNumberOfMedicineCard(1);
        Patient expected = p1;
        assertEquals(expected, actual);
    }

    @Test
    void readByNumberOfMedicineCardZero() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(150, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");
        Patient p3 = new Patient(312, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 3, "Healthy");
        Patient p4 = new Patient(152, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 4, "Healthy");
        Patient p5 = new Patient(451, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 5, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);

        Patient actual = daoPatient.readByNumberOfMedicineCard(0);
        Patient expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(2, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");
        Patient p3 = new Patient(3, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 3, "Healthy");
        Patient p4 = new Patient(4, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 4, "Healthy");
        Patient p5 = new Patient(5, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 5, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);

        Patient[] expected = {p1, p2, p4, p5};
        this.daoPatient.remove(3);
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(2, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);


        Patient[] expected = {p1};
        this.daoPatient.remove(2);
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");

        this.daoPatient.create(p1);

        Patient[] expected = new Patient[0];
        this.daoPatient.remove(1);
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        Patient[] expected = new Patient[0];
        this.daoPatient.remove(1);
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(2, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");
        Patient p3 = new Patient(3, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 3, "Healthy");
        Patient p4 = new Patient(4, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 4, "Healthy");
        Patient p5 = new Patient(5, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 5, "Healthy");
        Patient p6 = new Patient(1, "Sidorova", "Maria", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);
        this.daoPatient.update(p6);

        Patient[] expected = {p6, p2, p3, p4, p5};
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(2, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");
        Patient p6 = new Patient(1, "Sidorova", "Maria", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.update(p6);

        Patient[] expected = {p6, p2};
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p6 = new Patient(1, "Sidorova", "Maria", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.update(p6);

        Patient[] expected = {p6};
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Patient p6 = new Patient(1, "Sidorova", "Maria", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");

        this.daoPatient.update(p6);

        Patient[] expected = new Patient[0];
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(2, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");
        Patient p3 = new Patient(3, "Mironova", "Evgeniya", "Ivanovna", "Poltava",
                1234567890L, 3, "Healthy");
        Patient p4 = new Patient(4, "Petrov", "Ilya", "Aleksandrovich", "Kiev",
                1234567890L, 4, "Healthy");
        Patient p5 = new Patient(5, "Tarasov", "Dmitriy", "Ilyin", "Kirovograd",
                1234567890L, 5, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.create(p3);
        this.daoPatient.create(p4);
        this.daoPatient.create(p5);
        this.daoPatient.clear();

        Patient[] expected = new Patient[0];
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");
        Patient p2 = new Patient(2, "Sidorenko", "Anna", "Petrovna", "Dnepr",
                1234567890L, 2, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.create(p2);
        this.daoPatient.clear();

        Patient[] expected = new Patient[0];
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Patient p1 = new Patient(1, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 1, "Healthy");

        this.daoPatient.create(p1);
        this.daoPatient.clear();

        Patient[] expected = new Patient[0];
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoPatient.clear();

        Patient[] expected = new Patient[0];
        Patient[] actual = this.daoPatient.readAll();

        assertArrayEquals(expected, actual);
    }
}