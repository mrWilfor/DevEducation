package homeWork.hw_6_30_04_2020.part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfElementsInRangeTest {

    @Test
    void sumAndQuantityTest1() {
        int[] arr = {53, 43, 10, 90, 5, 4, 32, 85, 45};
        int firstIndex = 2;
        int secondIndex = 6;
        String expectedResult = "Sum: 141, quantity: 5";

        assertEquals(
                expectedResult,
                SumOfElementsInRange.sumAndQuantity(arr, firstIndex, secondIndex),
                "Test failed"
        );
    }

    @Test
    void sumAndQuantityTest2() {
        int[] arr = {53, 43, 10, 90, 5, 4, 32, 85, 45};
        int firstIndex = - 1;
        int secondIndex = 6;
        String expectedResult = "Invalid range";

        assertEquals(
                expectedResult,
                SumOfElementsInRange.sumAndQuantity(arr, firstIndex, secondIndex),
                "Test failed"
        );
    }

    @Test
    void sumAndQuantityTest3() {
        int[] arr = {53, 43, 10, 90, 5, 4, 32, 85, 45};
        int firstIndex = 2;
        int secondIndex = 10;
        String expectedResult = "Invalid range";

        assertEquals(
                expectedResult,
                SumOfElementsInRange.sumAndQuantity(arr, firstIndex, secondIndex),
                "Test failed"
        );
    }

    @Test
    void sumAndQuantityTest4() {
        int[] arr = {53, 43, 10, 90, 5, 4, 32, 85, 45};
        int firstIndex = 6;
        int secondIndex = 2;
        String expectedResult = "Invalid range";

        assertEquals(
                expectedResult,
                SumOfElementsInRange.sumAndQuantity(arr, firstIndex, secondIndex),
                "Test failed"
        );
    }
}