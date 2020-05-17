package practice.practic_7_29_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task1Test {

    @Test
    void fiveString() {
        int[][] arrayInput = {
                {2, 4, 6, 8, 10, 12},
                {14, 16, 18, 20, 22, 24},
                {26, 28, 30, 32, 34, 36},
                {38, 40, 42, 44, 46, 48},
                {50, 52, 54, 56, 58, 60}
        };
        int[] arrayExpected = {50, 52, 54, 56, 58, 60};
        assertArrayEquals(
                arrayExpected, Task1.fiveString(arrayInput),
                "Test failed"
        );
    }

    @Test
    void displaysColumn() {
        int[][] arrayInput = {
                {2, 4, 6, 8, 10, 12},
                {14, 16, 18, 20, 22, 24},
                {26, 28, 30, 32, 34, 36},
                {38, 40, 42, 44, 46, 48},
                {50, 52, 54, 56, 58, 60}
        };
        int[] arrayExpected = {10, 22, 34, 46, 58};
        assertArrayEquals(
                arrayExpected, Task1.displaysColumn(arrayInput),
                "Test failed"
        );
    }
}