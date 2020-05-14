package homeWork.hw_3_15_04_2020;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static homeWork.hw_3_15_04_2020.Task7.enterNumber;

import org.junit.jupiter.api.Test;

public class Task7Test {
    @Test
    void task7Test(){  //Testing method enterNumber
        int result = enterNumber(4);
        assertTrue( ((result == 1) || (result == 2))||(result == 3) ,
                " test failed!"
        );
    }
}
