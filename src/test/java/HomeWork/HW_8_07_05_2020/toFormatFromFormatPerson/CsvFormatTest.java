package homeWork.hw_8_07_05_2020.toFormatFromFormatPerson;

import homeWork.hw_8_07_05_2020.object.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvFormatTest {

    @Test
    void toFormat() {
        Person p = new Person(12L, "Ivan", "Ivanov", 21);
        String expected = "12, Ivan, Ivanov, 21";
        String actual = new CsvFormatPerson().toFormat(p);

        assertTrue(
                expected.equals(actual),
                "Test failed"
        );
    }

    @Test
    void toFormatNull() {
        Person p = null;
        String expected = null;
        String actual = new CsvFormatPerson().toFormat(p);

        assertEquals(
                expected, actual,
                "Test failed"
        );
    }

    @Test
    void fromFormat() {
        String stringInput = "12, Ivan, Ivanov, 21";
        Person actual = new CsvFormatPerson().fromFormat(stringInput);
        Person expected = new Person(12L, "Ivan", "Ivanov", 21);

        assertTrue(
                expected.equals(actual),
                "Test failed"
        );
    }

    @Test
    void fromFormatNull() {
        String stringInput = null;
        Person actual = new CsvFormatPerson().fromFormat(stringInput);
        Person expected = null;

        assertEquals(
                expected, actual,
                "Test failed"
        );
    }

    @Test
    void toFormatStrMany() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p3 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p4 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p5 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1, p2, p3, p4, p5};

        String expected =
                "12, Ivan, Ivanov, 21\n" +
                "12, Ivan, Ivanov, 21\n" +
                "12, Ivan, Ivanov, 21\n" +
                "12, Ivan, Ivanov, 21\n" +
                "12, Ivan, Ivanov, 21";

        assertEquals(expected, new CsvFormatPerson().toFormatStr(arrayInput));
    }

    @Test
    void toFormatStrTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1, p2};

        String expected =
                "12, Ivan, Ivanov, 21\n" +
                        "12, Ivan, Ivanov, 21";

        assertEquals(expected, new CsvFormatPerson().toFormatStr(arrayInput));
    }

    @Test
    void toFormatStrOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person[] arrayInput = {p1};
        String expected = "12, Ivan, Ivanov, 21";

        assertEquals(expected, new CsvFormatPerson().toFormatStr(arrayInput));
    }

    @Test
    void toFormatStrNull() {
        Person[] arrayInput = null;
        String expected = null;

        assertEquals(expected, new CsvFormatPerson().toFormatStr(arrayInput));
    }

    @Test
    void fromFormatObjMany() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p3 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p4 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p5 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1, p2, p3, p4, p5};

        String input =
                "12, Ivan, Ivanov, 21\n" +
                        "12, Ivan, Ivanov, 21\n" +
                        "12, Ivan, Ivanov, 21\n" +
                        "12, Ivan, Ivanov, 21\n" +
                        "12, Ivan, Ivanov, 21";

        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormatObj(input));
    }

    @Test
    void fromFormatObjTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1, p2};

        String input =
                "12, Ivan, Ivanov, 21\n" +
                        "12, Ivan, Ivanov, 21\n";

        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormatObj(input));
    }

    @Test
    void fromFormatObjOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person[] arrayExpected = {p1};
        String input = "12, Ivan, Ivanov, 21\n";

        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormatObj(input));
    }

    @Test
    void fromFormatObjNull() {
        Person[] arrayExpected = null;
        String input = null;

        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormatObj(input));
    }

    @Test
    void toFormatTestArrayMany() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p3 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p4 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p5 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1, p2, p3, p4, p5};

        String[] arrayExpected = {
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21"
        };
        assertArrayEquals(arrayExpected, new CsvFormatPerson().toFormat(arrayInput));
    }

    @Test
    void toFormatTestArrayTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1, p2};

        String[] arrayExpected = {
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21"
        };
        assertArrayEquals(arrayExpected, new CsvFormatPerson().toFormat(arrayInput));
    }

    @Test
    void toFormatTestArrayOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1};

        String[] arrayExpected = {"12, Ivan, Ivanov, 21"};
        assertArrayEquals(arrayExpected, new CsvFormatPerson().toFormat(arrayInput));
    }

    @Test
    void toFormatTestArrayNull() {
        Person p1 = null;

        Person[] arrayInput = {p1};

        String[] arrayExpected = {null};
        assertArrayEquals(arrayExpected, new CsvFormatPerson().toFormat(arrayInput));
    }

    @Test
    void fromFormatTestArrayMany() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p3 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p4 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p5 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1, p2, p3, p4, p5};

        String[] arrayInput = {
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21"
        };
        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormat(arrayInput));
    }

    @Test
    void fromFormatTestArrayTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1, p2};

        String[] arrayInput = {
                "12, Ivan, Ivanov, 21",
                "12, Ivan, Ivanov, 21"
        };
        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormat(arrayInput));
    }

    @Test
    void fromFormatTestArrayOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1};

        String[] arrayInput = {
                "12, Ivan, Ivanov, 21"
        };
        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormat(arrayInput));
    }

    @Test
    void fromFormatTestArrayNull() {
        Person p1 = null;

        Person[] arrayExpected = {null};

        String[] arrayInput = {null};
        assertArrayEquals(arrayExpected, new CsvFormatPerson().fromFormat(arrayInput));
    }
}