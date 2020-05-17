package homeWork.hw_8_Parth_2_07_05_2020;

import homeWork.hw_8_07_05_2020.object.person.Person;
import homeWork.hw_8_07_05_2020.toFormatFromFormatPerson.AbstractFormatPerson;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatFactoryJunit5Test {
    public static Stream<Object> params() {
        return Stream.of(
                FormatFactory.choose(ConstantsFormat.CSV_FORMAT),
                FormatFactory.choose(ConstantsFormat.JSON_FORMAT),
                FormatFactory.choose(ConstantsFormat.XML_FORMAT),
                FormatFactory.choose(ConstantsFormat.YML_FORMAT));
    }

    @ParameterizedTest
    @MethodSource("params")
    public void toFormatFromFormat(AbstractFormatPerson af) {
        Person exp = new Person(1, "ivan", "Tarasov", 18);
        String result = af.toFormat(exp);
        Person act = af.fromFormat(result);
        assertEquals(exp, act);
    }

    @ParameterizedTest
    @MethodSource("params")
    public void toFormatArrayFromFormatArray(AbstractFormatPerson af) {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);
        Person p3 = new Person(3L, "Kolia", "Lupkin", 34);
        Person p4 = new Person(4L, "Nusia", "Pupkin", 34);
        Person p5 = new Person(5L, "Vasia", "Pupkin", 34);

        Person[] exp = new Person[] {
                p1, p2, p3, p4, p5
        };
        String[] result = af.toFormat(exp);
        Person[] act = af.fromFormat(result);
        assertArrayEquals(exp, act);
    }

    @ParameterizedTest
    @MethodSource("params")
    public void toFormatArrayStrFromFormatArrayObj(AbstractFormatPerson af) {
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);
        Person p3 = new Person(3L, "Kolia", "Lupkin", 34);
        Person p4 = new Person(4L, "Nusia", "Pupkin", 34);
        Person p5 = new Person(5L, "Vasia", "Pupkin", 34);

        Person[] exp = new Person[] {
                p1, p2, p3, p4, p5
        };
        String result = af.toFormatStr(exp);
        Person[] act = af.fromFormatObj(result);
        assertArrayEquals(exp, act);
    }
}