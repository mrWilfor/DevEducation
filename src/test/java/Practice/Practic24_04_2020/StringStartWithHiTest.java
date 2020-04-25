package Practice.Practic24_04_2020;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class StringStartWithHiTest {

    @Test
    void startHiTest1() {
        String input1 = "hi slfsldf\n";
        assertEquals(
                true,
                StringStartWithHi.startHi(new Scanner(input1)),
                "Test 1 failed"
        );
    }

    @Test
    void startHiTest2() {
        String input2 = "hi\n";
        assertEquals(
                true,
                StringStartWithHi.startHi(new Scanner(input2)),
                "Test 2 failed"
        );
    }

    @Test
    void startHiTest3() {
        String input3 = "slfsldf hi\n";
        assertEquals(
                false,
                StringStartWithHi.startHi(new Scanner(input3)),
                "Test 3 failed"
        );
    }

    @Test
    void startHiTest4() {
        String input4 = "a\n";
        assertEquals(
                false,
                StringStartWithHi.startHi(new Scanner(input4)),
                "Test 4 failed"
        );
    }
}