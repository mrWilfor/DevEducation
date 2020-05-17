package practice.practic_9_06_05_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConverterOfTemperaturesTest {

    @Test
    void converterTest1() {
        String input = "15C";
        String expected = "{K : 288.15, F : 59.00}";

        assertTrue(
                expected.equals(ConverterOfTemperatures.converter(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void converterTest2() {
        String input = "15F";
        String expected = "{C : -9.44, K : 263.71}";

        assertTrue(
                expected.equals(ConverterOfTemperatures.converter(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void converterTest3() {
        String input = "15K";
        String expected = "{C : -258.15, F : -432.67}";

        assertTrue(
                expected.equals(ConverterOfTemperatures.converter(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void converterTest4() {
        String input = "15";
        String expected = "{Not correctly entered value}";

        assertTrue(
                expected.equals(ConverterOfTemperatures.converter(new Scanner(input))),
                "Test failed"
        );
    }
}