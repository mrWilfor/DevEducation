package Practice.Practic_8_05_05_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class QuantityLowerCaseAndCapitalLettersTest {

    @Test
    void quantityTest1() {
        String input = "Hello world";
        String expected = "Uppercase occurs 1 times, lowercase occurs 9 times";

        assertTrue(
                expected.equals(QuantityLowerCaseAndCapitalLetters.quantity(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void quantityTest2() {
        String input = "hello world";
        String expected = "Uppercase occurs 0 times, lowercase occurs 10 times";

        assertTrue(
                expected.equals(QuantityLowerCaseAndCapitalLetters.quantity(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void quantityTest3() {
        String input = "HELLO WORLD";
        String expected = "Uppercase occurs 10 times, lowercase occurs 0 times";

        assertTrue(
                expected.equals(QuantityLowerCaseAndCapitalLetters.quantity(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void quantityTest4() {
        String input = "\n";
        String expected = "Uppercase occurs 0 times, lowercase occurs 0 times";

        assertTrue(
                expected.equals(QuantityLowerCaseAndCapitalLetters.quantity(new Scanner(input))),
                "Test failed"
        );
    }
}