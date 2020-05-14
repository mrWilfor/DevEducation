package practice.practic_5_24_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class From_1_To_3_CharsETest {

    @Test
    void stringETest1() {
        String input1 = "hello\n";
        assertEquals(
                true,
                From_1_To_3_CharsE.stringE(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void stringETest2() {
        String input2 = "heello\n";
        assertEquals(
                true,
                From_1_To_3_CharsE.stringE(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void stringETest3() {
        String input3 = "heeello\n";
        assertEquals(
                true,
                From_1_To_3_CharsE.stringE(new Scanner(input3)),
                "Test 3 failed"
        );
    }

    @Test
    void stringETest4() {
        String input4 = "heeeeeeello\n";
        assertEquals(
                false,
                From_1_To_3_CharsE.stringE(new Scanner(input4)),
                "Test 4 failed"
        );
    }

    @Test
    void stringETest5() {
        String input5 = "\n";
        assertEquals(
                true,
                From_1_To_3_CharsE.stringE(new Scanner(input5)),
                "Test 5 failed"
        );
    }
}