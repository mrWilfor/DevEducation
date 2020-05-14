package practice.practic_7_29_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void magicSquareTest1() {
        int[][] arr = {
                {4, 11, 6},
                {9, 7, 5},
                {8, 3, 10}
        };
        assertEquals(
                true,
                Task6.magicSquare(arr),
                "test failed"
        );
    }

    @Test
    void magicSquareTest2() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(
                false,
                Task6.magicSquare(arr),
                "test failed"
        );
    }
}