package practice.practic_6_28_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Task6Test {

    @Test
    void sum5ElementsOfArrayTest1() {
        int[] array = {5, 7, 2, 9, 6};

        assertTrue(
                Arrays.equals(array, Task6.sum5ElementsOfArray(1, 4, 5, 7, 2, 9, 6, 2, 7)),
                "Test failed"
        );
    }

    @Test
    void sum5ElementsOfArrayTest2() {
        int[] array = {55, 7, 2, 9, 6};

        assertTrue(
                Arrays.equals(array, Task6.sum5ElementsOfArray(1, 4, 55, 7, 2, 9, 6, 2, 7)),
                "Test failed"
        );
    }

    @Test
    void sum5ElementsOfArrayTest3() {
        int[] array = {0, 0, 0, 0, 1};

        assertTrue(
                Arrays.equals(array, Task6.sum5ElementsOfArray(0, 0, 0, 0, 1, 0, 0, 0, 0)),
                "Test failed"
        );
    }
}