package homeWork.hw_1_13_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    @Test
    void sum() {
        assertEquals(6,
                Sum.sum(2, 4),
                "Test failed");

        assertEquals(3.8,
                Sum.sum(1.7, 2.1),
                "Test failed");

        assertEquals(2000000000L,
                Sum.sum(1500000000L, 500000000),
                "Test failed");
    }

}