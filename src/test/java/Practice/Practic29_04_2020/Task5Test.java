package Practice.Practic29_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void twoSameElementsOfArrayTest1() {
        int[][] arr = {
                {1, 2, 50, 4, 3},
                {100, 7, 8, 9, 10},
                {11, 25, 13, 14, 15},
                {16, 17, 18, 5, 20},
                {21, 22, 23, 24, 25}
        };
        assertEquals(
                25,
                Task5.twoSameElementsOfArray(arr),
                "Test failed"
        );
    }

    @Test
    void twoSameElementsOfArrayTest2() {
        int[][] arr = {
                {1, 2, 50, 4, 3},
                {100, 7, 8, 9, 10},
                {11, 101, 13, 14, 15},
                {16, 17, 18, 5, 20},
                {21, 22, 23, 24, 25}
        };
        assertEquals(
                0,
                Task5.twoSameElementsOfArray(arr),
                "Test failed"
        );
    }
}