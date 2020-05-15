package homeWork.hw_8_Parth_2_07_05_2020;

import homeWork.hw_8_07_05_2020.object.person.Person;
import homeWork.hw_8_07_05_2020.toFormatFromFormatPerson.AbstractFormatPerson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class FormatFactoryJunit4Test {
    private final String format;
    private AbstractFormatPerson af;

    public FormatFactoryJunit4Test(String format) {
        this.format = format;
    }

    @BeforeEach
    public void setUp() throws Exception {
        this.af = FormatFactory.choose(format);
    }

    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {ConstantsFormat.CSV_FORMAT},
                {ConstantsFormat.JSON_FORMAT},
                {ConstantsFormat.XML_FORMAT},
                {ConstantsFormat.YML_FORMAT}
        });
    }

    @Test
    public void toFormatFromFormat() {
        Person exp = new Person(1, "ivan", "Tarasov", 18);
        String result = this.af.toFormat(exp);
        Person act = this.af.fromFormat(result);
        assertEquals(exp, act);
    }

    @Test
    public void toFormatArrayFromFormatArray() {
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

    @Test
    public void toFormatArrayStrFromFormatArrayObj() {
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