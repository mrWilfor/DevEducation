package homeWork.hw_6_30_04_2020.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberStringWithTheMostValueMultiplicationElementsTest {

    @Test
    void fillArrayTest() {
        int[][] arr = new int[7][4];

        arr = NumberStringWithTheMostValueMultiplicationElements.fillArray(arr);
        checkArray(arr);
        assertTrue(
                checkArray(arr),
                "Test failed"
        );
    }

    @Test
    void numberStringWithMaxSumOfElementsTest() {
        int[][] arr = {
                {1, 3, 5, -1},
                {5, 4, 5, -3},
                {-1, -5, 3, 2},
                {2, 4, 5, 3},
                {-3, -4, 1, 2},
                {1, 2, 3, -5},
                {4, 4, 4, -4},
        };
        assertEquals(
                1,
                NumberStringWithTheMostValueMultiplicationElements.numberStringWithMaxSumOfElements(arr),
                "Test failed"
        );
    }

    public static boolean checkArray(int[][] array) {
        boolean trigger = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    trigger = false;
                }
            }
        }
        return trigger;
    }
}