package homeWork.hw_6_30_04_2020.part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllElementsOfArrayDivideByMaxElementOfArrayTest {

    @Test
    void divisionOnMaxElementOfArrayTest1() {
        double[][] array = {
                {1.0, 2.0, 3.0},
                {1.2, 3.1, 2.5},
                {2.3, 3.5, 3.3}
        };
        String[][] arrayExpected = {
                {"0,29", "0,57", "0,86"},
                {"0,34", "0,89", "0,71"},
                {"0,66", "1,00", "0,94"}
        };

        assertArrayEquals(
                arrayExpected, AllElementsOfArrayDivideByMaxElementOfArray.divisionOnMaxElementOfArray(array),
                "Test failed"
        );
    }

    @Test
    void divisionOnMaxElementOfArrayTest2() {
        double[][] array = {
                {- 1.0, - 2.0, - 3.0},
                {- 1.2, - 3.1, - 2.5},
                {- 2.3, 0, - 3.3}
        };
        String[][] arrayExpected = {
                {null, null, null},
                {null, null, null},
                {null, null, null}
        };

        assertArrayEquals(
                arrayExpected, AllElementsOfArrayDivideByMaxElementOfArray.divisionOnMaxElementOfArray(array),
                "Test failed"
        );
    }
}