package practice.practic_6_28_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2Test {

    @Test
    void evenOddZeroTest1() {
        int[] arrayExpected = {2, 4, 6, 8, 9, 7, 5, 3, 1, 0};

        assertTrue(
                Arrays.equals(arrayExpected, Task2.evenOddZero(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)),
                "Test failed"
        );
    }

    @Test
    void evenOddZeroTest2() {
        int[] arrayExpected = {9, 7, 5, 3, 1, 0, 0, 0};

        assertTrue(
                Arrays.equals(arrayExpected, Task2.evenOddZero(1, 3, 5, 7, 9, 0, 0, 0)),
                "Test failed"
        );
    }

    @Test
    void evenOddZeroTest3() {
        int[] arrayExpected = {2, 4, 8, 10, 12, 0, 0, 0};

        assertTrue(
                Arrays.equals(arrayExpected, Task2.evenOddZero(2, 4, 8, 10, 12, 0, 0, 0)),
                "Test failed"
        );
    }
}