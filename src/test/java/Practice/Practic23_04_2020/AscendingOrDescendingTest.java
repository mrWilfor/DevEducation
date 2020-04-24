package Practice.Practic23_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class AscendingOrDescendingTest {

    @Test
    void sequenceTest() {
        String input = "1\n" + "2\n" + "3\n" + "0\n";
        assertTrue(AscendingOrDescending.sequence(new Scanner(input)), "Test failed");
    }
}