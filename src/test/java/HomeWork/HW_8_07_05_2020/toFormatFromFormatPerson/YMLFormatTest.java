package HomeWork.HW_8_07_05_2020.toFormatFromFormatPerson;


import HomeWork.HW_8_07_05_2020.object.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YMLFormatTest {

    @Test
    void toFormatTest1() {
        Person p = new Person(12L, "Ivan", "Ivanov", 21);
        String expected = "Person:\n" +
                "\tid: 12\n\r" +
                "\tfirstName: Ivan\n\r" +
                "\tlastName: Ivanov\n\r" +
                "\tage: 21\n\r";
        String actual = new YMLFormatPerson().toFormat(p);

        assertTrue(
                expected.equals(actual),
                "Test failed"
        );
    }

    @Test
    void toFormatTest2() {
        Person p = null;
        String expected = null;
        String actual = new YMLFormatPerson().toFormat(p);

        assertEquals(
                expected,
                actual,
                "Test failed");
    }

    @Test
    void fromFormatTest1() {
        String input = "Person:\n" +
                "\tid: 12\n\r" +
                "\tfirstName: Ivan\n\r" +
                "\tlastName: Ivanov\n\r" +
                "\tage: 21\n\r";
        Person expected = new Person(12L, "Ivan", "Ivanov", 21);

        assertTrue(
                expected.equals(new YMLFormatPerson().fromFormat(input)),
                "Test failed"
        );
    }

    @Test
    void fromFormatTest2() {
        String input = null;
        Person expected = null;

        assertEquals(
                expected,
                new YMLFormatPerson().fromFormat(input),
                "Test failed");
    }

    @Test
    void toFormatTestArrayMany() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);
        Person p3 = new Person(14L, "Dmitriy", "Sidorov", 24);
        Person p4 = new Person(15L, "Sergey", "Barabash", 19);
        Person p5 = new Person(16L, "Max", "Chirva", 25);

        Person[] arrayInput = {p1, p2, p3, p4, p5};

        String[] arrayExpected = {
                "Person:\n" +
                        "\tid: 12\n\r" +
                        "\tfirstName: Ivan\n\r" +
                        "\tlastName: Ivanov\n\r" +
                        "\tage: 21\n\r",
                "Person:\n" +
                        "\tid: 13\n\r" +
                        "\tfirstName: Ilya\n\r" +
                        "\tlastName: Petrov\n\r" +
                        "\tage: 20\n\r",
                "Person:\n" +
                        "\tid: 14\n\r" +
                        "\tfirstName: Dmitriy\n\r" +
                        "\tlastName: Sidorov\n\r" +
                        "\tage: 24\n\r",
                "Person:\n" +
                        "\tid: 15\n\r" +
                        "\tfirstName: Sergey\n\r" +
                        "\tlastName: Barabash\n\r" +
                        "\tage: 19\n\r",
                "Person:\n" +
                        "\tid: 16\n\r" +
                        "\tfirstName: Max\n\r" +
                        "\tlastName: Chirva\n\r" +
                        "\tage: 25\n\r"
        };
        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] arrayInput = {p1, p2};

        String[] arrayExpected = {
                "Person:\n" +
                        "\tid: 12\n\r" +
                        "\tfirstName: Ivan\n\r" +
                        "\tlastName: Ivanov\n\r" +
                        "\tage: 21\n\r",
                "Person:\n" +
                        "\tid: 13\n\r" +
                        "\tfirstName: Ilya\n\r" +
                        "\tlastName: Petrov\n\r" +
                        "\tage: 20\n\r"
        };
        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1};

        String[] arrayExpected = {
                "Person:\n" +
                        "\tid: 12\n\r" +
                        "\tfirstName: Ivan\n\r" +
                        "\tlastName: Ivanov\n\r" +
                        "\tage: 21\n\r"
        };
        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayZero() {
        Person p1 = new Person();

        Person[] arrayInput = {p1};

        String[] arrayExpected = {
                "Person:\n" +
                        "\tid: 0\n\r" +
                        "\tfirstName: null\n\r" +
                        "\tlastName: null\n\r" +
                        "\tage: 0\n\r"
        };
        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayMany() {
        String[] arrayInput = {
                "Person:\n" +
                        "\tid: 12\n\r" +
                        "\tfirstName: Ivan\n\r" +
                        "\tlastName: Ivanov\n\r" +
                        "\tage: 21\n\r",
                "Person:\n" +
                        "\tid: 13\n\r" +
                        "\tfirstName: Ilya\n\r" +
                        "\tlastName: Petrov\n\r" +
                        "\tage: 20\n\r",
                "Person:\n" +
                        "\tid: 14\n\r" +
                        "\tfirstName: Dmitriy\n\r" +
                        "\tlastName: Sidorov\n\r" +
                        "\tage: 24\n\r",
                "Person:\n" +
                        "\tid: 15\n\r" +
                        "\tfirstName: Sergey\n\r" +
                        "\tlastName: Barabash\n\r" +
                        "\tage: 19\n\r",
                "Person:\n" +
                        "\tid: 16\n\r" +
                        "\tfirstName: Max\n\r" +
                        "\tlastName: Chirva\n\r" +
                        "\tage: 25\n\r"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);
        Person p3 = new Person(14L, "Dmitriy", "Sidorov", 24);
        Person p4 = new Person(15L, "Sergey", "Barabash", 19);
        Person p5 = new Person(16L, "Max", "Chirva", 25);

        Person[] arrayExpected = {p1, p2, p3, p4, p5};

        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayTwo() {
        String[] arrayInput = {
                "Person:\n" +
                        "\tid: 12\n\r" +
                        "\tfirstName: Ivan\n\r" +
                        "\tlastName: Ivanov\n\r" +
                        "\tage: 21\n\r",
                "Person:\n" +
                        "\tid: 13\n\r" +
                        "\tfirstName: Ilya\n\r" +
                        "\tlastName: Petrov\n\r" +
                        "\tage: 20\n\r"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] arrayExpected = {p1, p2};

        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayOne() {
        String[] arrayInput = {
                "Person:\n" +
                        "\tid: 12\n\r" +
                        "\tfirstName: Ivan\n\r" +
                        "\tlastName: Ivanov\n\r" +
                        "\tage: 21\n\r"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayZero() {
        String[] arrayInput = {null};

        Person p1 = null;

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayEmptyString() {
        String[] arrayInput = {""};

        Person p1 = null;

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new YMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }
}