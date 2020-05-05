package HomeWork.HW_3_15_04_2020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HypotenuseTest {

    @Test
    void hypotenuseTest() {
        Assertions.assertEquals(
                5,
                Hypotenuse.hypotenuse(3, 4),
                "test failed!"
        );
        Assertions.assertEquals(5.70087712549569,
                Hypotenuse.hypotenuse(3.5, 4.5),
                "test failed!"
        );
    }
}