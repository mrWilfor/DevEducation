package practice.practic_3_22_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionDeleteXTest {

    @Test
    void deleteX() {
        assertEquals(
                "abcd",
                RecursionDeleteX.deleteX("axbxcxd"),
                "Test failed"
        );
    }
}