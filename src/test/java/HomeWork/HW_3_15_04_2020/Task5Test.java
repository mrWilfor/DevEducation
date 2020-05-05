package HomeWork.HW_3_15_04_2020;

import org.junit.jupiter.api.Test;

import static HomeWork.HW_3_15_04_2020.Task5.enterNumber;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void task5Test() { //Testing method enterNumber
        int result = enterNumber(1);
        assertTrue(((result == 1) || (result == 2)) || (result == 3),
                " test failed!"
        );
    }
}