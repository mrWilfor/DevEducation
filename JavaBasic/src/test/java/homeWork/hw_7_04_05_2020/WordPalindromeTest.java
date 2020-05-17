package homeWork.hw_7_04_05_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordPalindromeTest {

    @Test
    void checkWordTest1() {
        String input = "madam";
        assertEquals(
                "This word is palindrome",
                WordPalindrome.checkWord(new Scanner(input)),
                "Test failed"
        );
    }

    @Test
    void checkWordTest2() {
        String input = "hello";
        assertEquals(
                "This word is not palindrome",
                WordPalindrome.checkWord(new Scanner(input)),
                "Test failed"
        );
    }
}