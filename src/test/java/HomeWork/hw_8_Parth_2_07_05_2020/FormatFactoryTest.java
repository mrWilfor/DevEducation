package homeWork.hw_8_Parth_2_07_05_2020;

import homeWork.hw_8_07_05_2020.object.person.Person;
import homeWork.hw_8_07_05_2020.toFormatFromFormatPerson.AbstractFormatPerson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class FormatFactoryTest {
    private final String format;
    private AbstractFormatPerson af;

    public FormatFactoryTest(String format) {
        this.format = format;
    }

    @Before
    public void setUp() throws Exception {
        this.af = FormatFactory.choose(format);
    }

    @Parameterized.Parameters
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
}