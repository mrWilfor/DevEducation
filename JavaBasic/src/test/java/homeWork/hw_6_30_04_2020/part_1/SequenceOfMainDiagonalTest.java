package homeWork.hw_6_30_04_2020.part_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceOfMainDiagonalTest {

    @Test
    void sequenceElementsOfDiagonalArrayTest1() {
        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        String expected = "Sequence is not violation";

        assertEquals(
                expected, SequenceOfMainDiagonal.sequenceElementsOfDiagonalArray(array),
                "Test failed"
                );
    }

    @Test
    void sequenceElementsOfDiagonalArrayTest2() {
        int[][] array = {
                {1, 2, 3},
                {1, 1, 3},
                {1, 2, 0}
        };
        String expected = "[2, 2]";

        assertEquals(
                expected, SequenceOfMainDiagonal.sequenceElementsOfDiagonalArray(array),
                "Test failed"
        );
    }

    @Test
    void sequenceElementsOfDiagonalArrayTest3() {
        int[][] array = {
                {1, 2, 3, 5},
                {1, 0, 3, 4},
                {1, 2, 3, 7}
        };
        String expected = "Array is not square";

        assertEquals(
                expected, SequenceOfMainDiagonal.sequenceElementsOfDiagonalArray(array),
                "Test failed"
        );
    }
}