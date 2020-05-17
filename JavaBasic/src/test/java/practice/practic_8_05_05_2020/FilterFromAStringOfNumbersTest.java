package practice.practic_8_05_05_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FilterFromAStringOfNumbersTest {

    @Test
    void filterTest1() {
        String input = "lslf12s sl3 6 67sld";
        int[] expected = {12, 3, 6, 67};

        assertArrayEquals(
                expected, FilterFromAStringOfNumbers.filter(new Scanner(input)),
                "Test failed"
        );
    }

    @Test
    void filterTest2() {
        String input = "lslfs sl  sld";
        int[] expected = {0};

        assertArrayEquals(
                expected, FilterFromAStringOfNumbers.filter(new Scanner(input)),
                "Test failed"
        );
    }
}