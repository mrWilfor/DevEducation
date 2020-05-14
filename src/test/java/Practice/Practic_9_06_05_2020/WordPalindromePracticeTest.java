package practice.practic_9_06_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPalindromePracticeTest {

    @Test
    void palindromeTest1() {
        String str = "madam";
        assertTrue(
                WordPalindromePractice.palindrome(str),
                "Test failed"
                );
    }

    @Test
    void palindromeTest2() {
        String str = "morning";
        assertFalse(
                WordPalindromePractice.palindrome(str),
                "Test failed"
        );
    }
}