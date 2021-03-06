package homeWork.hw_6_30_04_2020.part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageOfElementsOfArrayInstalledOnOddIndexTest {

    @Test
    void averageEvenTest1() {
        int[] arr = {1, 0, 4, 6, 5, 7, 3, 8};

        assertEquals(
                14,
                AverageOfElementsOfArrayInstalledOnOddIndex.averageEven(arr),
                "Test failed"
        );
    }

    @Test
    void averageEvenTest2() {
        int[] arr = {1, 0, 4, 3, 5, 7, 3, 1};

        assertEquals(
                0,
                AverageOfElementsOfArrayInstalledOnOddIndex.averageEven(arr),
                "Test failed"
        );
    }
}