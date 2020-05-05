package HomeWork.HW_6_30_04_2020.Part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllElementsOldArraySquareInNewArrayTest {

    @Test
    void newArrayBasedOnRangeTest1() {
        int[] array = {3, 2, 6, 9, 1, 7, 3};
        int firstIndex = 2;
        int secondIndex = 5;
        int[] arrayExpected = {36, 81, 1, 49};

        assertArrayEquals(
                arrayExpected, AllElementsOldArraySquareInNewArray.newArrayBasedOnRange(array, firstIndex, secondIndex),
                "Test failed"
        );
    }

    @Test
    void newArrayBasedOnRangeTest2() {
        int[] array = {3, 2, 6, 9, 1, 7, 3};
        int firstIndex = 2;
        int secondIndex = 10;
        int[] arrayExpected = {0};

        assertArrayEquals(
                arrayExpected, AllElementsOldArraySquareInNewArray.newArrayBasedOnRange(array, firstIndex, secondIndex),
                "Test failed"
        );
    }

    @Test
    void newArrayBasedOnRangeTest3() {
        int[] array = {3, 2, 6, 9, 1, 7, 3};
        int firstIndex = -3;
        int secondIndex = 5;
        int[] arrayExpected = {0};

        assertArrayEquals(
                arrayExpected, AllElementsOldArraySquareInNewArray.newArrayBasedOnRange(array, firstIndex, secondIndex),
                "Test failed"
        );
    }

    @Test
    void newArrayBasedOnRangeTest4() {
        int[] array = {3, 2, 6, 9, 1, 7, 3};
        int firstIndex = 6;
        int secondIndex = 3;
        int[] arrayExpected = {0};

        assertArrayEquals(
                arrayExpected, AllElementsOldArraySquareInNewArray.newArrayBasedOnRange(array, firstIndex, secondIndex),
                "Test failed"
        );
    }
}