package homeWork.hw_7_04_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowCommonIsTheSymbolHardTest {

    @Test
    void checkCharacter() {
        String str = "hello";
        String expected = "\"h\" repeat 1 times, \"e\" repeat 1 times, \"l\" repeat 2 times, \"o\" repeat 1 times";
        assertTrue(
                expected.equals(HowCommonIsTheSymbolHard.checkCharacter(str)),
                "Test failed"
        );
    }
}