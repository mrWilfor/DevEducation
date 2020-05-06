package Practice.Practic_9_06_05_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordPracticeTest {

    @Test
    void reverse() {
        String input = "hello im fine";
        String expected = "olleh mi enif";
        assertTrue(
                expected.equals(ReverseWordPractice.reverse(new Scanner(input))),
                "Test failed"
        );
    }
}