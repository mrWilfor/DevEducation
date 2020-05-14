package homeWork.hw_7_04_05_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class HowCommonIsTheSymbolTest {

    @Test
    void checkSymbolOfStringTest1() {
        String input = "hello\n" + "l";
        String expected = "Symbol \"l\" occurs 2 times";
        assertTrue(
                expected.equals(HowCommonIsTheSymbol.checkSymbolOfString(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void checkSymbolOfStringTest2() {
        String input = "hello\n" + "e";
        String expected = "Symbol \"e\" occurs 1 times";
        assertTrue(
                expected.equals(HowCommonIsTheSymbol.checkSymbolOfString(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void checkSymbolOfStringTest3() {
        String input = "hello\n" + "k";
        String expected = "Symbol \"k\" occurs 0 times";
        assertTrue(
                expected.equals(HowCommonIsTheSymbol.checkSymbolOfString(new Scanner(input))),
                "Test failed"
        );
    }
}