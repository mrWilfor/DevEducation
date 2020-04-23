package Practice.Practic23_04_2020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursionBracketsTest {

    @Test
    void checkBrackets() {
        assertEquals(
                true,
                RecursionBrackets.checkBrackets("12(34(45)1)9"),
                "Test failed"
        );
        assertEquals(
                false,
                RecursionBrackets.checkBrackets("1234(45)1)9"),
                "Test failed"
        );
    }
}