package practice.practic_5_24_04_2020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class AbsoluteDifferenceTest {

    @Test
    void diff21Test1() {
        String input1 = "5";
        assertEquals(
                16,
                AbsoluteDifference.diff21(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void diff21Test2() {
        String input2 = "21";
        assertEquals(
                0,
                AbsoluteDifference.diff21(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void diff21Test3() {
        String input3 = "25";
        assertEquals(
                0,
                AbsoluteDifference.diff21(new Scanner(input3)),
                "Test 3 failed"
        );
    }
}