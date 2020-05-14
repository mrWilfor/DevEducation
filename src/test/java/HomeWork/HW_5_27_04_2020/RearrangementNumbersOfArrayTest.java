package homeWork.hw_5_27_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RearrangementNumbersOfArrayTest {

    @Test
    void rearrangementTest1() {
        int[] arrayExpected = {99, 67, 55, 40, 35, 23, 12};
        assertTrue(
                Arrays.equals(arrayExpected, RearrangementNumbersOfArray.rearrangement(12, 23, 35, 40, 55, 67, 99))
        );
    }

    @Test
    void rearrangementTest2() {
        int[] arrayExpected = {8, 7, 6, 5, 4, 3, 2, 1};
        assertTrue(
                Arrays.equals(arrayExpected, RearrangementNumbersOfArray.rearrangement(1, 2, 3, 4, 5, 6, 7, 8))
        );
    }
}