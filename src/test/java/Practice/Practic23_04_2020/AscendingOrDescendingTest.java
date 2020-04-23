package Practice.Practic23_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscendingOrDescendingTest {

    @Test
    void sequenceNumbersInAscending() {
        assertEquals(
                true,
                AscendingOrDescending.sequenceNumbersInAscending(1234),
                "Test failed"
        );
        assertEquals(
                false,
                AscendingOrDescending.sequenceNumbersInAscending(1534),
                "Test failed"
        );
    }

    @Test
    void sequenceNumbersInDescending() {
        assertEquals(
                true,
                AscendingOrDescending.sequenceNumbersInDescending(4321),
                "Test failed"
        );
        assertEquals(
                false,
                AscendingOrDescending.sequenceNumbersInDescending(1321),
                "Test failed"
        );
    }
}