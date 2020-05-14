package homeWork.hw_7_04_05_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculatingTest1() {
        String input = "2+4";
        String strExpected = "2.0 + 4.0 = 6.0";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest2() {
        String input = "2*4";
        String strExpected = "2.0 * 4.0 = 8.00";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest3() {
        String input = "3/4";
        String strExpected = "3.0 / 4.0 = 0.75";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest4() {
        String input = "-3/4";
        String strExpected = "-3.0 / 4.0 = -0.75";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest5() {
        String input = "3*-4";
        String strExpected = "3.0 * -4.0 = -12.00";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest6() {
        String input = "3-4";
        String strExpected = "3.0 - 4.0 = -1.0";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest7() {
        String input = "-3-4";
        String strExpected = "-3.0 - 4.0 = -7.0";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest8() {
        String input = "3--4";
        String strExpected = "3.0 - -4.0 = 7.0";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void calculatingTest9() {
        String input = "-3--4";
        String strExpected = "-3.0 - -4.0 = 1.0";

        assertTrue(
                strExpected.equals(Calculator.calculating(new Scanner(input))),
                "Test failed"
        );
    }
}