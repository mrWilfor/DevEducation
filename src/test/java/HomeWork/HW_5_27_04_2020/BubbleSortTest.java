package homeWork.hw_5_27_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortTest1() {
        int[] arrayExpected = {1, 2, 2, 3, 5, 7, 9, 11, 54};
        assertTrue(
                Arrays.equals(arrayExpected, BubbleSort.sort(11, 3, 54, 2, 2, 9, 7, 5, 1)),
                "Test failed"
        );
    }

    @Test
    void sortTest2() {
        int[] arrayExpected = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        assertTrue(
                Arrays.equals(arrayExpected, BubbleSort.sort(0, 1, 2, 3, 4, 5, 6, 7, 8)),
                "Test failed"
        );
    }
}