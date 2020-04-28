package HomeWork.hw_27_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxRepeatedNumberTest {

    @Test
    void checkNumbersInArrayTest1() {
        int[] array = {1, 8, 2, 5, 4, 4, 8, 0, 8};
        assertEquals(
                8,
                MaxRepeatedNumber.checkNumbersInArray(array),
                "Test failed"
        );
    }


    @Test
    void checkNumbersInArrayTest2() {
        int[] array = {1, 3, 2, 4, 4, 4, 3, 0, 3};
        assertEquals(
                4,
                MaxRepeatedNumber.checkNumbersInArray(array),
                "Test failed"
        );
    }
}