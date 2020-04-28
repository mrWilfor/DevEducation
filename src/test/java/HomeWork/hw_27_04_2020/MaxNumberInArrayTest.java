package HomeWork.hw_27_04_2020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxNumberInArrayTest {

    @Test
    void maxNumberTest1() {
        int[] array = {1, 5, 7, 4, 34, 32, 19, 55, 0, 1};
        assertEquals(
                55,
                MaxNumberInArray.maxNumber(array),
                "Test failed"
        );
    }


    @Test
    void maxNumberTest2() {
        int[] array = {1, 5, 7, 4, 7, 7, 1, 2, 0, 1};
        assertEquals(
                7,
                MaxNumberInArray.maxNumber(array),
                "Test failed"
        );
    }
}