package Practice.Practic29_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void sameElementsOfArrayTest1() {
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        assertEquals(
                1,
                Task3.sameElementsOfArray(arr),
                "Test failed"
        );
    }

    @Test
    void sameElementsOfArrayTest2() {
        int[][] arr = {
                {1, 5, 3, 4, 2},
                {8, 7, 6, 9, 10},
                {11, 12, 13, 27, 31},
                {16, 51, 20, 52, 26},
                {21, 22, 23, 24, 25}
        };
        assertEquals(
                25,
                Task3.sameElementsOfArray(arr),
                "Test failed"
        );
    }

    @Test
    void sameElementsOfArrayTest3() {
        int[][] arr = {
                {1, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 10, 1, 0, 1},
                {1, 0, 0, 1, 1},
                {1, 0, 1, 1, 0}
        };
        assertEquals(
                3,
                Task3.sameElementsOfArray(arr),
                "Test failed"
        );
    }
}