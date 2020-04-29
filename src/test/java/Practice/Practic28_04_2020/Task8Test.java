package Practice.Practic28_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void neighborsNumberTest1() {
        int[] array = {1, 6, 3, 7, 2};

        assertTrue(
                Arrays.equals(array, Task8.neighborsNumber(1, 6, 3, 7, 2, 8, 9, 7, 3)),
                "Test failed"
        );
    }

    @Test
    void neighborsNumberTest2() {
        int[] array = {};

        assertTrue(
                Arrays.equals(array, Task8.neighborsNumber(1, 6, 3, 7, 7, 8, 8, 7, 3)),
                "Test failed"
        );
    }
}