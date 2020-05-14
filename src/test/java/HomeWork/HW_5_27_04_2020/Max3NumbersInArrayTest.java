package homeWork.hw_5_27_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Max3NumbersInArrayTest {

    @Test
    void max3NumbersTest1() {
        int[] arrayExpected = {9, 7, 6};
        int[] arrayInput = {1, 2, 4, 5, 6, 1, 7, 9};
        assertTrue(
                Arrays.equals(Max3NumbersInArray.max3Numbers(arrayInput), arrayExpected),
                "Test failed"
        );
    }

    @Test
    void max3NumbersTest2() {
        int[] arrayExpected = {9, 7, 7};
        int[] arrayInput = {1, 2, 4, 5, 6, 7, 7, 9};
        assertTrue(
                Arrays.equals(Max3NumbersInArray.max3Numbers(arrayInput), arrayExpected),
                "Test failed"
        );
    }

    @Test
    void max3NumbersTest3() {
        int[] arrayExpected = {5, 5, 5};
        int[] arrayInput = {1, 2, 1, 2, 3, 5, 5, 5};
        assertTrue(
                Arrays.equals(Max3NumbersInArray.max3Numbers(arrayInput), arrayExpected),
                "Test failed"
        );
    }

    @Test
    void max3NumbersTest4() {
        int[] arrayExpected = {3, 3, 3};
        int[] arrayInput = {1, 2, 1, 2, 3, 3, 3, 3};
        assertTrue(
                Arrays.equals(Max3NumbersInArray.max3Numbers(arrayInput), arrayExpected),
                "Test failed"
        );
    }
}