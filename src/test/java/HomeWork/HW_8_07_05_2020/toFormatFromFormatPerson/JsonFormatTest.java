package HomeWork.HW_8_07_05_2020.toFormatFromFormatPerson;

import HomeWork.HW_8_07_05_2020.object.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonFormatTest {

    @Test
    void toFormatTest1() {
        Person p = new Person(12L, "Ivan", "Ivanov", 21);
        String expected = "{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}";
        String actual = new JsonFormatPerson().toFormat(p);

        assertTrue(
                expected.equals(actual),
                "Test failed"
        );
    }

    @Test
    void toFormatTest2() {
        Person p = null;
        String expected = null;
        String actual = new JsonFormatPerson().toFormat(p);

        assertEquals(
                expected,
                actual,
                "Test failed");
    }

    @Test
    void fromFormatTest1() {
        String str = "{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}";
        Person expected = new Person(12L, "Ivan", "Ivanov", 21);
        assertTrue(
                expected.equals(new JsonFormatPerson().fromFormat(str)),
                "Test failed"
        );
    }

    @Test
    void fromFormatTest2() {
        String str = "";
        Person expected = null;
        assertEquals(
                expected,
                new JsonFormatPerson().fromFormat(str),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayMany() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);
        Person p3 = new Person(14L, "Dmitriy", "Sidorov", 24);
        Person p4 = new Person(15L, "Sergey", "Barabash", 19);
        Person p5 = new Person(16L, "Max", "Chirva", 25);

        Person[] arrayInput = {p1, p2, p3, p4, p5};

        String[] arrayExpected = {"{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}",
                "{\"id\": \"13\", \"firstName\": \"Ilya\", \"lastName\": \"Petrov\", \"age\": \"20\"}",
                "{\"id\": \"14\", \"firstName\": \"Dmitriy\", \"lastName\": \"Sidorov\", \"age\": \"24\"}",
                "{\"id\": \"15\", \"firstName\": \"Sergey\", \"lastName\": \"Barabash\", \"age\": \"19\"}",
                "{\"id\": \"16\", \"firstName\": \"Max\", \"lastName\": \"Chirva\", \"age\": \"25\"}"
        };
        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] arrayInput = {p1, p2};

        String[] arrayExpected = {"{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}",
                "{\"id\": \"13\", \"firstName\": \"Ilya\", \"lastName\": \"Petrov\", \"age\": \"20\"}",
        };
        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1};

        String[] arrayExpected = {"{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}"};
        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayZero() {
        Person p1 = new Person();

        Person[] arrayInput = {p1};

        String[] arrayExpected = {"{\"id\": \"0\", \"firstName\": \"null\", \"lastName\": \"null\", \"age\": \"0\"}"};
    assertArrayEquals(
                arrayExpected, new JsonFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayMany() {
        String[] arrayInput = {"{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}",
                "{\"id\": \"13\", \"firstName\": \"Ilya\", \"lastName\": \"Petrov\", \"age\": \"20\"}",
                "{\"id\": \"14\", \"firstName\": \"Dmitriy\", \"lastName\": \"Sidorov\", \"age\": \"24\"}",
                "{\"id\": \"15\", \"firstName\": \"Sergey\", \"lastName\": \"Barabash\", \"age\": \"19\"}",
                "{\"id\": \"16\", \"firstName\": \"Max\", \"lastName\": \"Chirva\", \"age\": \"25\"}"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);
        Person p3 = new Person(14L, "Dmitriy", "Sidorov", 24);
        Person p4 = new Person(15L, "Sergey", "Barabash", 19);
        Person p5 = new Person(16L, "Max", "Chirva", 25);

        Person[] arrayExpected = {p1, p2, p3, p4, p5};

        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayTwo() {
        String[] arrayInput = {"{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}",
                "{\"id\": \"13\", \"firstName\": \"Ilya\", \"lastName\": \"Petrov\", \"age\": \"20\"}"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] arrayExpected = {p1, p2};

        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayOne() {
        String[] arrayInput = {"{\"id\": \"12\", \"firstName\": \"Ivan\", \"lastName\": \"Ivanov\", \"age\": \"21\"}"};

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayZero() {
        String[] arrayInput = {null};

        Person p1 = null;

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayEmptyString() {
        String[] arrayInput = {""};

        Person p1 = null;

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new JsonFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }
}