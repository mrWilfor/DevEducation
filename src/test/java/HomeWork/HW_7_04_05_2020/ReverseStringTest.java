package HomeWork.HW_7_04_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseTest() {
        String str = "Nice to meet you";
        String expected = "uoy teem ot eciN";

        assertTrue(
                expected.equals(ReverseString.reverse(str)),
                "Test failed"
        );
    }
}