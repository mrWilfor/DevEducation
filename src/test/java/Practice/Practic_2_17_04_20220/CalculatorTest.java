package practice.practic_2_17_04_20220;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void calculatorTest() {
        Assertions.assertEquals(34.9,
                Calculator.calculator("13.2+21.7"),
                "Test failed!");
        Assertions.assertEquals(8.0,
                Calculator.calculator("5+3"),
                "Test failed!");
    }
}