package HomeWork.hw_27_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralTest {

    @Test
    void spiralFillOfArrayTest1() {
        int[][] arrExpected = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        int[][] arr = new int[5][5];
        assertArrayEquals(
                arrExpected, Spiral.spiralFillOfArray(arr),
                "Test failed"
                );
    }

    @Test
    void spiralFillOfArrayTest2() {
        int[][] arrExpected = {
                {1, 2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9, 8, 7}
        };
        int[][] arr = new int[5][3];
        assertArrayEquals(
                arrExpected, Spiral.spiralFillOfArray(arr),
                "Test failed"
        );
    }

    @Test
    void spiralFillOfArrayTest3() {
        int[][] arrExpected = {
                {1, 2, 3, 4, 5},
                {12, 13, 14, 15, 6},
                {11, 10, 9, 8, 7},
        };
        int[][] arr = new int[3][5];
        assertArrayEquals(
                arrExpected, Spiral.spiralFillOfArray(arr),
                "Test failed"
        );
    }

}