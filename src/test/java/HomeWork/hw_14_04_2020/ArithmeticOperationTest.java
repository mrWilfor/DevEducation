package HomeWork.hw_14_04_2020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticOperationTest {

    @Test
    void arithmeticOperationTest() {
        Assertions.assertEquals(
                7,
                ArithmeticOperation.sum(3, 4),
                "test failed!"
        );
        Assertions.assertEquals(
                4,
                ArithmeticOperation.sum((byte) 2, (byte) 2),
                "test failed!"
        );
        Assertions.assertEquals(
                6,
                ArithmeticOperation.sum((short) 3, (short) 3),
                "test failed!"
        );
        Assertions.assertEquals(
                5900L,
                ArithmeticOperation.sum(3400L, 2500L),
                "test failed!"
        );
        Assertions.assertEquals(
                4.3f,
                ArithmeticOperation.sum(1.15f, 3.15f),
                "test failed!"
        );
        Assertions.assertEquals(
                10.0f,
                ArithmeticOperation.sum(9.75, 0.25),
                "test failed!"
        );

    }
}




