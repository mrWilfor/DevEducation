package practice.practic_1_16_04_20220;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonNumbersTest {

    @Test
    void comparisonNumbersTest() {
        int[] numbers = {4, 7, 11, 23};
        assertEquals(
                23,
                ComparisonNumbers.comparisonNumbers(4, numbers, 1),
                "Test failed!"
                );
    }
}