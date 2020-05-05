package Practice.Practic_5_24_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class ConvertOfTemperatureTest {

    @Test
    void convertTest1() {
        String input1 = "10\n" + "C\n" + "K\n";
        assertEquals(
                283.15,
                ConvertOfTemperature.convert(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void convertTest2() {
        String input2 = "10\n" + "C\n" + "F\n";
        assertEquals(
                50,
                ConvertOfTemperature.convert(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void convertTest3() {
        String input3 = "23\n" + "K\n" + "C\n";
        assertEquals(
                -250.15,
                ConvertOfTemperature.convert(new Scanner(input3)),
                "Test 3 failed"
        );
    }

    @Test
    void convertTest4() {
        String input4 = "23\n" + "K\n" + "F\n";
        assertEquals(
                -418.28,
                ConvertOfTemperature.convert(new Scanner(input4)),
                "Test 4 failed"
        );
    }

    @Test
    void convertTest5() {
        String input5 = "34\n" + "F\n" + "C\n";
        assertEquals(
                1.12,
                ConvertOfTemperature.convert(new Scanner(input5)),
                "Test 5 failed"
        );
    }

    @Test
    void convertTest6() {
        String input6 = "34\n" + "F\n" + "K\n";
        assertEquals(
                274.27,
                ConvertOfTemperature.convert(new Scanner(input6)),
                "Test 6 failed"
        );
    }

    @Test
    void convertTest7() {
        String input7 = "5\n" + "4\n" + "K\n";
        assertEquals(
                0,
                ConvertOfTemperature.convert(new Scanner(input7)),
                "Test 7 failed"
        );
    }

    @Test
    void convertTest8() {
        String input8 = "5\n" + "F\n" + "hj\n";
        assertEquals(
                0,
                ConvertOfTemperature.convert(new Scanner(input8)),
                "Test 8 failed"
        );
    }
}