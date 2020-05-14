package practice.practic_3_22_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionSumNumberTest {

    @Test
    void recursionSumNumber() {
        assertEquals(
                8,
                RecursionSumNumber.RecursionSumNumber(314),
                "Test failed"
        );
    }
}