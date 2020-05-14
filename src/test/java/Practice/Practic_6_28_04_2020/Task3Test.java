package practice.practic_6_28_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void randomNumbersInArrayTest1() {
        assertEquals(
                20,
                Task3.randomNumbersInArray(20).length,
                "Test failed"
        );
    }

    @Test
    void randomNumbersInArrayTest2() {
        assertTrue(
                repeatabilityTest(Task3.randomNumbersInArray(20)),
                "Test failed"
        );
    }

    public static boolean repeatabilityTest(int[] array1) {
        int[] array2 = array1;
        int trigger = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] == array2[j]) {
                    trigger++;
                }
            }
        }

        if (trigger == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}