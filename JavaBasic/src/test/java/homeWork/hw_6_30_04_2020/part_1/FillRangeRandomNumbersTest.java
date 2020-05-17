package homeWork.hw_6_30_04_2020.part_1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FillRangeRandomNumbersTestTest {

    @Test
    void rangeArrayTest1() {
        String input = "6\n" + "1\n" + "3\n";

        int[] array = FillRangeRandomNumbers.rangeArray(new Scanner(input));

        assertTrue(checkArray(array, 1, 3));
    }

    @Test
    void rangeArrayTest2() {
        String input = "7\n" + "3\n" + "7\n";
        int[] arrayExpected = {0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(arrayExpected, FillRangeRandomNumbers.rangeArray(new Scanner(input)));
    }


    public static boolean checkArray(int[] arr, int firstIndex, int secondIndex) {
        for (int i = firstIndex; i <= secondIndex; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
