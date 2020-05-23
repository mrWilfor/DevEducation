package practice.practic_11_22_05_2020.com.company.professions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void get() {
        Person person = new Person("Tarasov I.O.");
        String expectedFullName = "Tarasov I.O.";

        assertEquals(expectedFullName, person.getFullName());
    }

    @Test
    void equalsTrue() {
        Person person1 = new Person("Maclein J.D.");
        Person person2 = new Person("Maclein J.D.");

        assertEquals(person1, person2);
    }

    @Test
    void equalsFail() {
        Person person1 = new Person("Maclein D.D.");
        Person person2 = new Person("Maclein J.D.");

        assertNotEquals(person1, person2);
    }

    @Test
    void hashCodeTrue() {
        Person person1 = new Person("Maclein J.D.");
        Person person2 = new Person("Maclein J.D.");

        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Person person1 = new Person("Maclein D.D.");
        Person person2 = new Person("Maclein J.D.");

        assertNotEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    void toStringTrue() {
        Person person = new Person("Maclein J.D.");
        String expected = "Person{fullName='Maclein J.D.'}";

        assertEquals(expected, person.toString());
    }

    @Test
    void toStringFail() {
        Person person = new Person("Maclein D.D.");
        String expected = "Person{fullName='Maclein J.D.'}";

        assertNotEquals(expected, person.toString());
    }
}