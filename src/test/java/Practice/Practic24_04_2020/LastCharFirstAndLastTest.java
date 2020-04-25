package Practice.Practic24_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class LastCharFirstAndLastTest {

    @Test
    void backAroundTest1() {
        String input1 = "abcd\n";
        assertEquals(
                "dabcdd",
                LastCharFirstAndLast.backAround(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void backAroundTest2() {
        String input2 = "ab\n";
        assertEquals(
                "babb",
                LastCharFirstAndLast.backAround(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void backAroundTest3() {
        String input3 = "a\n";
        assertEquals(
                "aaa",
                LastCharFirstAndLast.backAround(new Scanner(input3)),
                "Test 3 failed"
        );
    }

    @Test
    void backAroundTest4() {
        String input4 = "\n";
        assertEquals(
                "Empty string",
                LastCharFirstAndLast.backAround(new Scanner(input4)),
                "Test 4 failed"
        );
    }
}