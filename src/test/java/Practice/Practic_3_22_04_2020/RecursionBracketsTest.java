package Practice.Practic_3_22_04_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionBracketsTest {

    @Test
    void checkBrackets() {
        assertEquals(
                true,
                RecursionBrackets.checkBrackets("12()"),
                "Test failed"
        );
    }
}