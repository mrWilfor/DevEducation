package Practice.Practic22_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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