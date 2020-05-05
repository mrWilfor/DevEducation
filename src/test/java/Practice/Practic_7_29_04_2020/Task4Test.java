package Practice.Practic_7_29_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void minNumberInStringArrayTest1() {
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {3, 7, 2, 9, 10},
                {0, 0, 0, 0, 0},
                {16, 51, 20, 5, 26},
                {21, 22, 23, 24, 25}
        };
        assertEquals(
                1,
                Task4.minNumberInStringArray(arr, 1),
                "Test failed"
        );
    }

    @Test
    void minNumberInStringArrayTest2() {
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {3, 7, 2, 9, 10},
                {0, 0, 0, 0, 0},
                {16, 51, 20, 5, 26},
                {21, 22, 23, 24, 25}
        };
        assertEquals(
                21,
                Task4.minNumberInStringArray(arr, 5),
                "Test failed"
        );
    }

    @Test
    void maxNumberInColumnArrayTest1() {
        int[][] arr = {
                {1, 2, 50, 4, 3},
                {3, 3, 3, 3, 3},
                {11, 12, 13, 20, 3},
                {16, 51, 20, 5, 3},
                {21, 22, 23, 24, 3}
        };
        assertEquals(
                3,
                Task4.maxNumberInColumnArray(arr, 5),
                "Test failed"
        );
    }

    @Test
    void maxNumberInColumnArrayTest2() {
        int[][] arr = {
                {1, 2, 50, 4, 3},
                {3, 3, 3, 3, 3},
                {11, 12, 13, 20, 51},
                {16, 51, 20, 5, 26},
                {21, 22, 23, 24, 25}
        };
        assertEquals(
                51,
                Task4.maxNumberInColumnArray(arr, 2),
                "Test failed"
        );
    }
}