package practice.practic_12_26_05_20;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeekMainTest {

    @ParameterizedTest
    @MethodSource("params")
    void dayOfWeek(DayOfWeekMain.DayOfWeek argument, int expected) {
        assertEquals(DayOfWeekMain.getWorkingHours(argument), expected);
    }

    public static List<Arguments> params() {
        return Arrays.asList(Arguments.arguments(DayOfWeekMain.DayOfWeek.MONDAY, 39),
                Arguments.arguments(DayOfWeekMain.DayOfWeek.TUESDAY, 31),
                Arguments.arguments(DayOfWeekMain.DayOfWeek.WEDNESDAY, 23),
                Arguments.arguments(DayOfWeekMain.DayOfWeek.THURSDAY, 15),
                Arguments.arguments(DayOfWeekMain.DayOfWeek.FRIDAY, 7),
                Arguments.arguments(DayOfWeekMain.DayOfWeek.SATURDAY, 0),
                Arguments.arguments(DayOfWeekMain.DayOfWeek.SUNDAY, 0));
    }
}