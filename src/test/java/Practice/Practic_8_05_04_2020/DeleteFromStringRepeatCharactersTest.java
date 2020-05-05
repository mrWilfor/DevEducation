package Practice.Practic_8_05_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DeleteFromStringRepeatCharactersTest {

    @Test
    void deleteRepeatCharactersTest1() {
        String input = "aab cdde fe";
        String expected = "abcdef";

        assertTrue(
                expected.equals(DeleteFromStringRepeatCharacters.deleteRepeatCharacters(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void deleteRepeatCharactersTest2() {
        String input = "ab cd fe";
        String expected = "abcdfe";

        assertTrue(
                expected.equals(DeleteFromStringRepeatCharacters.deleteRepeatCharacters(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void deleteRepeatCharactersTest3() {
        String input = "abacdefe";
        String expected = "abcdef";

        assertTrue(
                expected.equals(DeleteFromStringRepeatCharacters.deleteRepeatCharacters(new Scanner(input))),
                "Test failed"
        );
    }
}