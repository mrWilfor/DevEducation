package Practice.Practic28_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void evenAscendingOddDescendingTest1() {
        int[] array = {5, 3, 4, 9, 8, 2, 1, 3, 4, 6};
        int[] arrayExpected = {2, 9, 4, 5, 4, 3, 6, 3, 8, 1};

        assertTrue(
                Arrays.equals(arrayExpected, Task1.evenAscendingOddDescending(array)),
                "Test failed"
        );
    }

    @Test
    void evenAscendingOddDescendingTest2() {
        int[] array = {0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
        int[] arrayExpected = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        assertTrue(
                Arrays.equals(arrayExpected, Task1.evenAscendingOddDescending(array)),
                "Test failed"
        );
    }

    @Test
    void evenAscendingOddDescendingTest3() {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] arrayExpected = {2, 11, 4, 9, 6, 7, 8, 5, 10, 3};

        assertFalse(
                Arrays.equals(arrayExpected, Task1.evenAscendingOddDescending(array)),
                "Test failed"
        );
    }
}