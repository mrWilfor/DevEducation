package Practice.Practic_6_28_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void changesSingTest1() {
        assertEquals(
                3,
                Task7.changesSing(1, -2, -4, 1, -5, -7),
                "Test failed"
        );
    }

    @Test
    void changesSingTest2() {
        assertEquals(
                0,
                Task7.changesSing(1, 2, 4, 0, 5, 7),
                "Test failed"
        );
    }
}