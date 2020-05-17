package practice.practic_5_24_04_2020;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapFirstAndLastCharInStringTest {

    @Test
    void frontBackTest1() {
        String input1 = "abcdefg\n";
        assertEquals(
                "gbcdefa",
                SwapFirstAndLastCharInString.frontBack(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void frontBackTest2() {
        String input2 = "ab\n";
        assertEquals(
                "ba",
                SwapFirstAndLastCharInString.frontBack(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void frontBackTest3() {
        String input3 = "a\n";
        assertEquals(
                "a",
                SwapFirstAndLastCharInString.frontBack(new Scanner(input3)),
                "Test 3 failed"
        );
    }

    @Test
    void frontBackTest4() {
        String input4 = "\n";
        assertEquals(
                "Empty string",
                SwapFirstAndLastCharInString.frontBack(new Scanner(input4)),
                "Test 4 failed"
        );
    }
}
