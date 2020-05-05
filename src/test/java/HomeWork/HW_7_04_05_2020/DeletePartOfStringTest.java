package HomeWork.HW_7_04_05_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class DeletePartOfStringTest {

    @Test
    void deleteTest1() {
        String input = "abcd ef ghij\n" + "9\n" + "3\n";
        String expected = "abcd ef j";
        assertTrue(
                expected.equals(DeletePartOfString.delete(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void deleteTest2() {
        String input = "abcd ef ghij\n" + "-1\n" + "3\n";
        String expected = "invalid number of symbol";
        assertTrue(
                expected.equals(DeletePartOfString.delete(new Scanner(input))),
                "Test failed"
        );
    }

    @Test
    void deleteTest3() {
        String input = "abcd ef ghij\n" + "10\n" + "5\n";
        String expected = "invalid delete size";
        assertTrue(
                expected.equals(DeletePartOfString.delete(new Scanner(input))),
                "Test failed"
        );
    }
}