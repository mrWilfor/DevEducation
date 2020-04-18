package Practic16_04_20220;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddTest {

     @Test
    void evenAndOdd() {
         assertEquals(
                 6,
                 EvenAndOdd.sumEven(13245),
                 "Test failed!"
         );

         assertEquals(
                 9,
                 EvenAndOdd.sumOdd(13245),
                 "Test failed!"
         );
    }
}