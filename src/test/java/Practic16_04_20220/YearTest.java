package Practic16_04_20220;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class YearTest {
    @Test
    void loftyOrNormalYear() {
        Assertions.assertEquals(366,
                Year.loftyOrNormalYear(2012),
                "Test failed"
        );

        Assertions.assertEquals(365,
                Year.loftyOrNormalYear(2011), // entered only lofty years
                "Test failed"
        );
    }
}