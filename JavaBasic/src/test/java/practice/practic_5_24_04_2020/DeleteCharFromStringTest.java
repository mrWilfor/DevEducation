package practice.practic_5_24_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteCharFromStringTest {

    @Test
    void missingCharTest1() {
        String input1 = "abcdef\n" + "1";
        assertEquals(
                "acdef",
                DeleteCharFromString.missingChar(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void missingCharTest2() {
        String input2 = "\n" + "4";
        assertEquals(
                "Empty line",
                DeleteCharFromString.missingChar(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void missingCharTest3() {
        String input3 = "abcdef\n" + "10";
        assertEquals(
                "Invalid index",
                DeleteCharFromString.missingChar(new Scanner(input3)),
                "Test 3 failed"
        );
    }
}