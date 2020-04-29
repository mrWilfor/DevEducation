package Practice.Practic28_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void averageArrayTest1() {
        assertEquals(
                3,
                Task5.averageArray(1, 3, 6, 6, 2),
                "Test failed"
        );
    }

    @Test
    void averageArrayTest2() {
        assertEquals(
                25,
                Task5.averageArray(15, 33, 10, 25, 54),
                "Test failed"
        );
    }

    @Test
    void averageArrayTest3() {
        assertEquals(
                35,
                Task5.averageArray(15, 35, 10, 25, 255),
                "Test failed"
        );
    }
}