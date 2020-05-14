package homeWork.hw_5_27_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricArrayTest {

    @Test
    void symmetricArrayTest1() {
        int[] arrayExpected = {4, 3, 2, 1, 0, 1, 2, 3, 4};
        assertTrue(
                Arrays.equals(arrayExpected, SymmetricArray.symmetricArray(9)),
                "Test failed"
        );
    }

    @Test
    void symmetricArrayTest2() {
        int[] arrayExpected = {5, 4, 3, 2, 1, 0, 1, 2, 3, 4};
        assertTrue(
                Arrays.equals(arrayExpected, SymmetricArray.symmetricArray(10)),
                "Test failed"
        );
    }
}