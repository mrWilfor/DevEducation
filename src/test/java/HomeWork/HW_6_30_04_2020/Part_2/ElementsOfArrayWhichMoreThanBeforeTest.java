package HomeWork.HW_6_30_04_2020.Part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementsOfArrayWhichMoreThanBeforeTest {

    @Test
    void moreThanPreviousTest1() {
        int[] arr = {1, 4, 5, 3, 9, 1, 2};
        String result = "4, 5, 9, 2";
        assertTrue(
                result.equals(ElementsOfArrayWhichMoreThanBefore.moreThanPrevious(arr)),
                "Test failed"
        );
    }

    @Test
    void moreThanPreviousTest2() {
        int[] arr = {9, 7, 5, 3, 1, 0};
        String result = "";
        assertTrue(
                result.equals(ElementsOfArrayWhichMoreThanBefore.moreThanPrevious(arr)),
                "Test failed"
        );
    }

    @Test
    void moreThanPreviousTest3() {
        int[] arr = {3, 3, 3, 3, 3, 3};
        String result = "";
        assertTrue(
                result.equals(ElementsOfArrayWhichMoreThanBefore.moreThanPrevious(arr)),
                "Test failed"
        );
    }
}