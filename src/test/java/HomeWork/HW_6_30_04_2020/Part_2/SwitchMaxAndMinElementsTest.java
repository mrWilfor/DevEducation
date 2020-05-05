package HomeWork.HW_6_30_04_2020.Part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchMaxAndMinElementsTest {

    @Test
    void switchMinAndMaxInArrayTest1() {
        int[][] arr = {
                {1, 2, 2, 2, 2},
                {2, 2, 2, 2, 3},
        };
        int[][] arrExpected = {
                {3, 2, 2, 2, 2},
                {2, 2, 2, 2, 1},
        };

        assertArrayEquals(
                arrExpected, SwitchMaxAndMinElements.switchMinAndMaxInArray(arr),
                "Test failed"
        );
    }

    @Test
    void switchMinAndMaxInArrayTest2() {
        int[][] arr = {
                {1, 2, 2, 0, 2},
                {2, 2, 55, 2, 3},
        };
        int[][] arrExpected = {
                {1, 2, 2, 55, 2},
                {2, 2, 0, 2, 3},
        };

        assertArrayEquals(
                arrExpected, SwitchMaxAndMinElements.switchMinAndMaxInArray(arr),
                "Test failed"
        );
    }
}