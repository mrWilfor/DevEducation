package practice.practic_4_23_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class AscendingOrDescendingTest {

    @Test
    void sequenceTest() {
        String input1 = "1\n" + "2\n" + "3\n" + "0\n";
        String input2 = "3\n" + "2\n" + "1\n" + "0\n";
        String input3 = "1\n" + "2\n" + "1\n" + "0\n";

        assertTrue(AscendingOrDescending.sequence(new Scanner(input1)), "Test failed");
        assertTrue(AscendingOrDescending.sequence(new Scanner(input2)), "Test failed");
        assertTrue(!(AscendingOrDescending.sequence(new Scanner(input3))), "Test failed");
        }
}