package homeWork.hw_8_Parth_2_07_05_2020;

import homeWork.hw_8_07_05_2020.object.person.Person;
import homeWork.hw_8_07_05_2020.toFormatFromFormatPerson.AbstractFormatPerson;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class FormatFactory2Test {

    @Parameterized.Parameters
    public static Stream<String> params() {
        return Stream.of(
                ConstantsFormat.CSV_FORMAT,
                ConstantsFormat.JSON_FORMAT,
                ConstantsFormat.XML_FORMAT,
                ConstantsFormat.YML_FORMAT);
    }

//    @Parameterized.Parameters
//    public static Collection params() {
//        return Arrays.asList(new Object[][]{
//                {ConstantsFormat.CSV_FORMAT},
//                {ConstantsFormat.JSON_FORMAT},
//                {ConstantsFormat.XML_FORMAT},
//                {ConstantsFormat.YML_FORMAT}
//        });
//    }

    @ParameterizedTest
    @MethodSource("params")
    public void toFormatFromFormat(String format) {
        AbstractFormatPerson af = FormatFactory.choose(format);
        Person exp = new Person(1, "ivan", "Tarasov", 18);
        String result = af.toFormat(exp);
        Person act = af.fromFormat(result);
        assertEquals(exp, act);
    }
}