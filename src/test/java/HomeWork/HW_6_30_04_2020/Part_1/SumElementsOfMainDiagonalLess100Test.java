package HomeWork.HW_6_30_04_2020.Part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumElementsOfMainDiagonalLess100Test {

    @Test
    void sumElementsOfDiagonalTest1() {
        int[][] arr = {
                {21, 12, 65, 35},
                {51, 14, 17, 90},
                {72, 10, 23, 41},
                {86, 110, 41, 33}
        };

        assertTrue(
                SumElementsOfMainDiagonalLess100.sumElementsOfDiagonal(arr),
                "Test failed"
        );
    }

    @Test
    void sumElementsOfDiagonalTest2() {
        int[][] arr = {
                {21, 12, 65, 35},
                {51, 140, 17, 90},
                {72, 10, 23, 41},
                {86, 110, 41, 55}
        };

        assertFalse(
                SumElementsOfMainDiagonalLess100.sumElementsOfDiagonal(arr),
                "Test failed"
        );
    }

    @Test
    void sumElementsOfDiagonalTest3() {
        int[][] arr = {
                {21, 12, 65, 35},
                {51, 140, 17, 90},
                {72, 10, 23, 41},
        };

        assertFalse(
                SumElementsOfMainDiagonalLess100.sumElementsOfDiagonal(arr),
                "Test failed"
        );
    }

    @Test
    void sumElementsOfDiagonalTest4() {
        int[][] arr = {
                {21, 12, 65},
                {51, 140, 17},
                {72, 10, 23},
                {86, 110, 41}
        };

        assertFalse(
                SumElementsOfMainDiagonalLess100.sumElementsOfDiagonal(arr),
                "Test failed"
        );
    }
}