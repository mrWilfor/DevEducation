package HomeWork.HW_7_04_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversWordsTest {

    @Test
    void revers() {
        String str = "hello, how are you?";
        String expected = ",olleh woh era ?uoy";

        assertTrue(
                expected.equals(ReversWords.revers(str)),
                "Test failed"
        );
    }
}