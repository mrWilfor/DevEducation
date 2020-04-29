package Practice.Practic28_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void copyArrayTest1() {
        int[] array = {-1, -8, -1, -1, 0, 5, 5, 3};

        assertTrue(
                Arrays.equals(array, Task9.copyArray(-1, 3, -8, 5, 5, -1, -1, 0)),
                "Test failed"
        );
    }

    @Test
    void copyArrayTest2() {
        int[] array = {-1, -8, -1, -1, -5, -5, -3};

        assertTrue(
                Arrays.equals(array, Task9.copyArray(-1, -8, -1, -1, -5, -5, -3)),
                "Test failed"
        );
    }

    @Test
    void copyArrayTest3() {
        int[] array = {1, 8, 1, 1, 0, 5, 5, 3};

        assertTrue(
                Arrays.equals(array, Task9.copyArray(3, 5, 5, 0, 1, 1, 8, 1)),
                "Test failed"
        );
    }
}