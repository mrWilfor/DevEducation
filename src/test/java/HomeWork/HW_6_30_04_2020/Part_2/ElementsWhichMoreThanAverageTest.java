package homeWork.hw_6_30_04_2020.part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementsWhichMoreThanAverageTest {

    @Test
    void moreThanAverageTest1() {
        int[] arr = {2, 2, 2, 4, 5, 9};
        String result = "5, 9";
        assertEquals(
                result,
                ElementsWhichMoreThanAverage.moreThanAverage(arr),
        "Test failed"
        );
    }

    @Test
    void moreThanAverageTest2() {
        int[] arr = {2, 2, 2, 2, 2, 2};
        String result = "";
        assertEquals(
                result,
                ElementsWhichMoreThanAverage.moreThanAverage(arr),
                "Test failed"
        );
    }
}