package Practice.Practic24_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class NewStringConstNthCharOldStringTest {

    @Test
    void everyNthTest1() {
        String input1 = "abcdefg\n" + "2";
        assertEquals(
                "aceg",
                NewStringConstNthCharOldString.everyNth(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void everyNthTest2() {
        String input2 = "\n" + "4";
        assertEquals(
                "Empty string",
                NewStringConstNthCharOldString.everyNth(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void everyNthTest3() {
        String input3 = "abcdefg\n" + "10";
        assertEquals(
                "a",
                NewStringConstNthCharOldString.everyNth(new Scanner(input3)),
                "Test 3 failed"
        );
    }
}