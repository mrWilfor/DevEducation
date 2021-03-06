package practice.practic_8_05_05_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveExtraSpacesTest {

    @Test
    void removeTest1() {
        String input = " Hello  world  ";
        String expected = "Hello world";

        assertTrue(
                expected.equals(RemoveExtraSpaces.remove(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void removeTest2() {
        String input = "the most important";
        String expected = "the most important";

        assertTrue(
                expected.equals(RemoveExtraSpaces.remove(new Scanner(input))),
                "Test failed"
        );
    }
}