package practice.practic_3_22_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RabbitsSumTest {

    @Test
    void rabbits() {
        assertEquals(
                10,
                RabbitsSum.rabbits(4),
                "Test failed"
        );
    }
}