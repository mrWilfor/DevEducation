package homeWork.hw_8_07_05_2020.toFormatFromFormatPerson;

import homeWork.hw_8_07_05_2020.object.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLFormatTest {

    @Test
    void toFormatTest1() {
        Person p = new Person(12L, "Ivan", "Ivanov", 21);
        String expected = "<Person>\n" +
                "\t<id>12</id>\n\r" +
                "\t<firstName>Ivan</firstName>\n\r" +
                "\t<lastName>Ivanov</lastName>\n\r" +
                "\t<age>21</age>\n\r" +
                "</Person>";
        String actual = new XMLFormatPerson().toFormat(p);

        assertTrue(
                expected.equals(actual),
                "Test failed"
        );
    }

    @Test
    void toFormatTest2() {
        Person p = null;
        String expected = null;
        String actual = new XMLFormatPerson().toFormat(p);

        assertEquals(
                expected,
                actual,
                "Test failed");
    }

    @Test
    void fromFormatTest1() {
        String input = "<Person>\n" +
                "\t<id>12</id>\n\r" +
                "\t<firstName>Ivan</firstName>\n\r" +
                "\t<lastName>Ivanov</lastName>\n\r" +
                "\t<age>21</age>\n\r" +
                "</Person>";
        Person expected = new Person(12L, "Ivan", "Ivanov", 21);

        assertTrue(
                expected.equals(new XMLFormatPerson().fromFormat(input)),
                "Test failed"
        );
    }

    @Test
    void fromFormatTest2() {
        String input = null;
        Person expected = null;

        assertEquals(
                expected,
                new XMLFormatPerson().fromFormat(input),
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
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>",
                "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>",
                "<Person>\n" +
                        "\t<id>14</id>\n\r" +
                        "\t<firstName>Dmitriy</firstName>\n\r" +
                        "\t<lastName>Sidorov</lastName>\n\r" +
                        "\t<age>24</age>\n\r" +
                        "</Person>",
                "<Person>\n" +
                        "\t<id>15</id>\n\r" +
                        "\t<firstName>Sergey</firstName>\n\r" +
                        "\t<lastName>Barabash</lastName>\n\r" +
                        "\t<age>19</age>\n\r" +
                        "</Person>",
                "<Person>\n" +
                        "\t<id>16</id>\n\r" +
                        "\t<firstName>Max</firstName>\n\r" +
                        "\t<lastName>Chirva</lastName>\n\r" +
                        "\t<age>25</age>\n\r" +
                        "</Person>"
        };
        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] arrayInput = {p1, p2};

        String[] arrayExpected = {
                "<Person>\n" +
                "\t<id>12</id>\n\r" +
                "\t<firstName>Ivan</firstName>\n\r" +
                "\t<lastName>Ivanov</lastName>\n\r" +
                "\t<age>21</age>\n\r" +
                "</Person>",
                "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>"
        };
        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1};

        String[] arrayExpected = {
                "<Person>\n" +
                "\t<id>12</id>\n\r" +
                "\t<firstName>Ivan</firstName>\n\r" +
                "\t<lastName>Ivanov</lastName>\n\r" +
                "\t<age>21</age>\n\r" +
                "</Person>"
        };
        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatTestArrayZero() {
        Person p1 = new Person();

        Person[] arrayInput = {p1};

        String[] arrayExpected = {
                "<Person>\n" +
                        "\t<id>0</id>\n\r" +
                        "\t<firstName>null</firstName>\n\r" +
                        "\t<lastName>null</lastName>\n\r" +
                        "\t<age>0</age>\n\r" +
                        "</Person>"
        };
        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().toFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayMany() {
        String[] arrayInput = {
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                "</Person>",
                "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>",
                "<Person>\n" +
                        "\t<id>14</id>\n\r" +
                        "\t<firstName>Dmitriy</firstName>\n\r" +
                        "\t<lastName>Sidorov</lastName>\n\r" +
                        "\t<age>24</age>\n\r" +
                        "</Person>",
                "<Person>\n" +
                        "\t<id>15</id>\n\r" +
                        "\t<firstName>Sergey</firstName>\n\r" +
                        "\t<lastName>Barabash</lastName>\n\r" +
                        "\t<age>19</age>\n\r" +
                        "</Person>",
                "<Person>\n" +
                        "\t<id>16</id>\n\r" +
                        "\t<firstName>Max</firstName>\n\r" +
                        "\t<lastName>Chirva</lastName>\n\r" +
                        "\t<age>25</age>\n\r" +
                        "</Person>"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);
        Person p3 = new Person(14L, "Dmitriy", "Sidorov", 24);
        Person p4 = new Person(15L, "Sergey", "Barabash", 19);
        Person p5 = new Person(16L, "Max", "Chirva", 25);

        Person[] arrayExpected = {p1, p2, p3, p4, p5};

        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayTwo() {
        String[] arrayInput = {
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                "</Person>",
                "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] arrayExpected = {p1, p2};

        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayOne() {
        String[] arrayInput = {
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>"
        };

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayZero() {
        String[] arrayInput = {null};

        Person p1 = null;

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatTestArrayEmptyString() {
        String[] arrayInput = {""};

        Person p1 = null;

        Person[] arrayExpected = {p1};

        assertArrayEquals(
                arrayExpected, new XMLFormatPerson().fromFormat(arrayInput),
                "Test failed"
        );
    }

    @Test
    void toFormatSrtMany() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);
        Person p3 = new Person(14L, "Dmitriy", "Sidorov", 24);
        Person p4 = new Person(15L, "Sergey", "Barabash", 19);
        Person p5 = new Person(16L, "Max", "Chirva", 25);

        Person[] arrayInput = {p1, p2, p3, p4, p5};

        String expected =
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>\n\n" +
                "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>\n\n" +
                "<Person>\n" +
                        "\t<id>14</id>\n\r" +
                        "\t<firstName>Dmitriy</firstName>\n\r" +
                        "\t<lastName>Sidorov</lastName>\n\r" +
                        "\t<age>24</age>\n\r" +
                        "</Person>\n\n" +
                "<Person>\n" +
                        "\t<id>15</id>\n\r" +
                        "\t<firstName>Sergey</firstName>\n\r" +
                        "\t<lastName>Barabash</lastName>\n\r" +
                        "\t<age>19</age>\n\r" +
                        "</Person>\n\n" +
                "<Person>\n" +
                        "\t<id>16</id>\n\r" +
                        "\t<firstName>Max</firstName>\n\r" +
                        "\t<lastName>Chirva</lastName>\n\r" +
                        "\t<age>25</age>\n\r" +
                        "</Person>\n\n";

        assertTrue(
                expected.equals(new XMLFormatPerson().toFormatStr(arrayInput)),
                "Test failed"
        );
    }

    @Test
    void toFormatSrtTwo() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] arrayInput = {p1, p2};

        String expected =
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>\n\n" +
                        "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>\n\n";

        assertTrue(
                expected.equals(new XMLFormatPerson().toFormatStr(arrayInput)),
                "Test failed"
        );
    }

    @Test
    void toFormatSrtOne() {
        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);

        Person[] arrayInput = {p1};

        String expected =
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>\n\n";

        assertTrue(
                expected.equals(new XMLFormatPerson().toFormatStr(arrayInput)),
                "Test failed"
        );
    }

    @Test
    void toFormatSrtZero() {
        Person p1 = new Person();

        Person[] arrayInput = new Person[0];
        String expected ="";

        assertTrue(
                expected.equals(new XMLFormatPerson().toFormatStr(arrayInput)),
                "Test failed"
        );
    }

    @Test
    void fromFormatObjMany() {
        String stringInput =
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>\n\n" +
                        "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>\n\n" +
                        "<Person>\n" +
                        "\t<id>14</id>\n\r" +
                        "\t<firstName>Dmitriy</firstName>\n\r" +
                        "\t<lastName>Sidorov</lastName>\n\r" +
                        "\t<age>24</age>\n\r" +
                        "</Person>\n\n" +
                        "<Person>\n" +
                        "\t<id>15</id>\n\r" +
                        "\t<firstName>Sergey</firstName>\n\r" +
                        "\t<lastName>Barabash</lastName>\n\r" +
                        "\t<age>19</age>\n\r" +
                        "</Person>\n\n" +
                        "<Person>\n" +
                        "\t<id>16</id>\n\r" +
                        "\t<firstName>Max</firstName>\n\r" +
                        "\t<lastName>Chirva</lastName>\n\r" +
                        "\t<age>25</age>\n\r" +
                        "</Person>\n\n";

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);
        Person p3 = new Person(14L, "Dmitriy", "Sidorov", 24);
        Person p4 = new Person(15L, "Sergey", "Barabash", 19);
        Person p5 = new Person(16L, "Max", "Chirva", 25);

        Person[] expected = {p1, p2, p3, p4, p5};

        assertArrayEquals(
                expected, new XMLFormatPerson().fromFormatObj(stringInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatObjTwo() {
        String stringInput =
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>\n\n" +
                        "<Person>\n" +
                        "\t<id>13</id>\n\r" +
                        "\t<firstName>Ilya</firstName>\n\r" +
                        "\t<lastName>Petrov</lastName>\n\r" +
                        "\t<age>20</age>\n\r" +
                        "</Person>\n\n";

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person p2 = new Person(13L, "Ilya", "Petrov", 20);

        Person[] expected = {p1, p2};

        assertArrayEquals(
                expected, new XMLFormatPerson().fromFormatObj(stringInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatObjOne() {
        String stringInput =
                "<Person>\n" +
                        "\t<id>12</id>\n\r" +
                        "\t<firstName>Ivan</firstName>\n\r" +
                        "\t<lastName>Ivanov</lastName>\n\r" +
                        "\t<age>21</age>\n\r" +
                        "</Person>\n\n";

        Person p1 = new Person(12L, "Ivan", "Ivanov", 21);
        Person[] expected = {p1};

        assertArrayEquals(
                expected, new XMLFormatPerson().fromFormatObj(stringInput),
                "Test failed"
        );
    }

    @Test
    void fromFormatObjZero() {
        String stringInput = "";

        Person[] expected = new Person[0];

        assertArrayEquals(
                expected, new XMLFormatPerson().fromFormatObj(stringInput),
                "Test failed"
        );
    }
}