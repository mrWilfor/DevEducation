package homeWork.hw_5_27_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SumLeftAndRightPathArrayTest {

    @Test
    void createArrayTest1() {
        String input = "18\n";
        assertEquals(
                18,
                SumLeftAndRightPathArray.createArray(new Scanner(input)).length,
                "Test failed"
        );
    }

    @Test
    void createArrayTest2() {
        String input = "13\n" + "5\n" + "8\n";
        assertEquals(
                8,
                SumLeftAndRightPathArray.createArray(new Scanner(input)).length,
                "Test failed"
        );
    }

    @Test
    void sumLeftAndRightPathArrayTest1() {
        int[] arrayInput1 = {1, -2, 4, -3, 5, -3, -1, 2};
        assertEquals(
                11,
                SumLeftAndRightPathArray.sumLeftAndRightPathArray(arrayInput1),
                "Test failed"
        );
    }

    @Test
    void sumLeftAndRightPathArrayTest2() {
        int[] arrayInput2 = {1, -2, 4, -3, 5, -3, 0, 2};
        assertEquals(
                0,
                SumLeftAndRightPathArray.sumLeftAndRightPathArray(arrayInput2),
                "Test failed"
        );
    }

    @Test
    void sumLeftAndRightPathArrayTest3() {
        int[] arrayInput3 = {1, -4, 4, -3, 5, -3, -1, 2};
        assertEquals(
                12,
                SumLeftAndRightPathArray.sumLeftAndRightPathArray(arrayInput3),
                "Test failed"
        );
    }
}