package homeWork.hw_8_Parth_2_07_05_2020;

import homeWork.hw_8_07_05_2020.object.person.Person;
import homeWork.hw_8_07_05_2020.toFormatFromFormatPerson.AbstractFormatPerson;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FormatFactoryJunit5Test {
    AbstractFormatPerson af;

//    public static Stream<String> params() {
//        return Stream.of(
//                ConstantsFormat.CSV_FORMAT,
//                ConstantsFormat.JSON_FORMAT,
//                ConstantsFormat.XML_FORMAT,
//                ConstantsFormat.YML_FORMAT);
//    }

    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {ConstantsFormat.CSV_FORMAT},
                {ConstantsFormat.JSON_FORMAT},
                {ConstantsFormat.XML_FORMAT},
                {ConstantsFormat.YML_FORMAT}
        });
    }

    @ParameterizedTest
    @MethodSource("params")
    public void toFormatFromFormat(String format) {
        this.af = FormatFactory.choose(format);
        Person exp = new Person(1, "ivan", "Tarasov", 18);
        String result = this.af.toFormat(exp);
        Person act = this.af.fromFormat(result);
        assertEquals(exp, act);
    }

    @ParameterizedTest
    @MethodSource("params")
    public void toFormatArrayFromFormatArray(String format) {
        this.af = FormatFactory.choose(format);
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);
        Person p3 = new Person(3L, "Kolia", "Lupkin", 34);
        Person p4 = new Person(4L, "Nusia", "Pupkin", 34);
        Person p5 = new Person(5L, "Vasia", "Pupkin", 34);

        Person[] exp = new Person[] {
                p1, p2, p3, p4, p5
        };
        String[] result = this.af.toFormat(exp);
        Person[] act = this.af.fromFormat(result);
        assertArrayEquals(exp, act);
    }

    @ParameterizedTest
    @MethodSource("params")
    public void toFormatArrayStrFromFormatArrayObj(String format) {
        this.af = FormatFactory.choose(format);
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        Person p2 = new Person(2L, "Masia", "Kupkin", 34);
        Person p3 = new Person(3L, "Kolia", "Lupkin", 34);
        Person p4 = new Person(4L, "Nusia", "Pupkin", 34);
        Person p5 = new Person(5L, "Vasia", "Pupkin", 34);

        Person[] exp = new Person[] {
                p1, p2, p3, p4, p5
        };
        String result = this.af.toFormatStr(exp);
        Person[] act = this.af.fromFormatObj(result);
        assertArrayEquals(exp, act);
    }
}