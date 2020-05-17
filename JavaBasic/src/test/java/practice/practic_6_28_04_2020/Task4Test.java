package practice.practic_6_28_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Task4Test {

    @Test
    void numberFourHalveTest() {
        int[] array = {1, 12, 2, 7, 56, 27, 1, 2, 3};

        assertTrue(
                Arrays.equals(array, Task4.numberFourHalve(1, 24, 4, 14, 56, 54, 1, 4, 3)),
                "Test failed"
        );
    }

    @Test
    void squareEvenAndMultiplicationOddBy2Test() {
        int[] array = {2, 6, 64, 4, 30, 74, 576};

        assertTrue(
                Arrays.equals(array, Task4.squareEvenAndMultiplicationOddBy2(1, 3, 8, 2, 15, 37, 24)),
                "Test failed"
        );
    }

    @Test
    void increaseEvenTest() {
        int[] array = {-3, 5, 1, 9, 3, 11, 7};

        assertTrue(
                Arrays.equals(array, Task4.increaseEven(1, 2, 5, 6, 7, 8, 11)),
                "Test failed"
        );
    }

    @Test
    void multiple10Test() {
        int[] array = {11, 12, 0, 23, 0, 0, 91, 0, 101};

        assertTrue(
                Arrays.equals(array, Task4.multiple10(11, 12, 50, 23, 20, 70, 91, 100, 101)),
                "Test failed"
        );
    }
}