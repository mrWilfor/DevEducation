package practice.practic_7_29_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void fillArrayTest1() {
        int[][] arrayInput = new int[10][10];
        int[][] arrayExpected = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        };
        assertArrayEquals(
                arrayExpected, Task2.fillArray(arrayInput),
                "Test failed"
                );
    }

    @Test
    void fillArrayTest2() {
        int[][] arrayInput = new int[9][9];
        int[][] arrayExpected = {
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},

                {0, 0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
        };
        assertArrayEquals(
                arrayExpected, Task2.fillArray(arrayInput),
                "Test failed"
        );
    }
}