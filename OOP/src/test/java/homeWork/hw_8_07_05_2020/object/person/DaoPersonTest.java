package homeWork.hw_8_07_05_2020.object.person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DaoPersonTest {

    private IDaoPerson daoPerson;

    @BeforeEach
    public void setUp() throws Exception {
        this.daoPerson = new DaoPerson();
    }

    @AfterEach
    public void tearDown() throws Exception {
        this.daoPerson.clear();
    }

    @Test
    public void createMany() {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);
        Person p3 = new Person(3L, "Kolia", "Lupkin", 34);
        Person p4 = new Person(4L, "Nusia", "Pupkin", 34);
        Person p5 = new Person(5L, "Vasia", "Pupkin", 34);

        long act1 = this.daoPerson.create(p1);
        long act2 = this.daoPerson.create(p2);
        long act3 = this.daoPerson.create(p3);
        long act4 = this.daoPerson.create(p4);
        long act5 = this.daoPerson.create(p5);

        long exp1 = 1L;
        long exp2 = 2L;
        long exp3 = 3L;
        long exp4 = 4L;
        long exp5 = 5L;

        assertEquals(exp1, act1);
        assertEquals(exp2, act2);
        assertEquals(exp3, act3);
        assertEquals(exp4, act4);
        assertEquals(exp5, act5);
    }

    @Test
    public void createTwo() {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);

        long act1 = this.daoPerson.create(p1);
        long act2 = this.daoPerson.create(p2);

        long exp1 = 1L;
        long exp2 = 2L;

        assertEquals(exp1, act1);
        assertEquals(exp2, act2);
    }

    @Test
    public void createOne() {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        long act1 = this.daoPerson.create(p1);
        long exp1 = 1L;
        assertEquals(exp1, act1);
    }

    @Test
    public void createNull() {
        long act1 = this.daoPerson.create(null);
        long exp1 = -1L;
        assertEquals(exp1, act1);
    }

    @Test
    public void readAllMany() {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);
        Person p3 = new Person(3L, "Kolia", "Lupkin", 34);
        Person p4 = new Person(4L, "Nusia", "Pupkin", 34);
        Person p5 = new Person(5L, "Vasia", "Pupkin", 34);

        Person[] exp = new Person[] {
                p1, p2, p3, p4, p5
        };

        this.daoPerson.create(p1);
        this.daoPerson.create(p2);
        this.daoPerson.create(p3);
        this.daoPerson.create(p4);
        this.daoPerson.create(p5);

        Person[] act = this.daoPerson.readAll();

        assertArrayEquals(exp, act);
    }

    @Test
    public void readAllTwo() {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);

        Person[] exp = new Person[] {
                p1, p2
        };

        this.daoPerson.create(p1);
        this.daoPerson.create(p2);

        Person[] act = this.daoPerson.readAll();

        assertArrayEquals(exp, act);
    }

    @Test
    public void readAllOne() {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);

        Person[] exp = new Person[] {
                p1
        };

        this.daoPerson.create(p1);

        Person[] act = this.daoPerson.readAll();

        assertArrayEquals(exp, act);
    }

    @Test
    public void readAllZero() {

        Person[] exp = new Person[0];

        Person[] act = this.daoPerson.readAll();

        assertArrayEquals(exp, act);
    }

    @Test
    public void readByName() {

    }

    @Test
    public void removeMany() {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);
        Person p3 = new Person(3L, "Kolia", "Lupkin", 34);
        Person p4 = new Person(4L, "Nusia", "Pupkin", 34);
        Person p5 = new Person(5L, "Vasia", "Pupkin", 34);

        Person[] exp = new Person[] {
                p1, p3, p4, p5
        };

        this.daoPerson.create(p1);
        this.daoPerson.create(p2);
        this.daoPerson.create(p3);
        this.daoPerson.create(p4);
        this.daoPerson.create(p5);

        this.daoPerson.remove(2L);

        Person[] act = this.daoPerson.readAll();

        assertArrayEquals(exp, act);
    }

    @Test
    public void update() {
    }

}