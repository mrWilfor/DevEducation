package practice.practic_9_06_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowCommonIsTheSymbolHardPracticeTest {

    @Test
    void checkCharacter() {
        String str = "maman";
        String expected = "m=2\na=2\nn=1\n";

        assertTrue(
                expected.equals(HowCommonIsTheSymbolHardPractice.checkCharacter(str)),
                "Test failed"
        );
    }
}