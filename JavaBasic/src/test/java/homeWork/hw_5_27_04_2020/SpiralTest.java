package homeWork.hw_5_27_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        String input = "5\n" + "5\n";
        assertArrayEquals(
                arrExpected, Spiral.spiralFillOfArray(new Scanner(input)),
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
        String input = "3\n" + "5\n";
        assertArrayEquals(
                arrExpected, Spiral.spiralFillOfArray(new Scanner(input)),
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
        String input = "5\n" + "3\n";
        assertArrayEquals(
                arrExpected, Spiral.spiralFillOfArray(new Scanner(input)),
                "Test failed"
        );
    }

}