package Practice.Practic16_04_20220;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxNumberTest {
    @Test
    void maxNumber() {
        Assertions.assertEquals(
                7,
MaxNumber.maxNumber(3, 6, 7),
                "Test failed!"
                );
    }
}