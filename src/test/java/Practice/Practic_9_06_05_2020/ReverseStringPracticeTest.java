package practice.practic_9_06_05_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringPracticeTest {

    @Test
    void reverseTest() {
        String input = "abcd efgh ijk";
        String expected = "kji hgfe dcba";
        assertTrue(
                expected.equals(ReverseStringPractice.reverse(new Scanner(input))),
                "Test failed"
        );
    }
}