package HomeWork.hw_30_04_2020.Part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteReplicatesOfElementsTest {

    @Test
    void deleteRepeatingElementsTest1() {
        int[] array = {1, 5, 7, 3, 4, 5, 1, 5};
        int[] arrayExpected = {7, 3, 4, 1, 5};

        assertArrayEquals(
                arrayExpected, DeleteReplicatesOfElements.deleteRepeatingElements(array),
                "Test failed"
        );
    }

    @Test
    void deleteRepeatingElementsTest2() {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrayExpected = {1};

        assertArrayEquals(
                arrayExpected, DeleteReplicatesOfElements.deleteRepeatingElements(array),
                "Test failed"
        );
    }

    @Test
    void deleteRepeatingElementsTest3() {
        int[] array = {1, 3, 4, 2, 6, 8, 5, 9};
        int[] arrayExpected = {1, 3, 4, 2, 6, 8, 5, 9};

        assertArrayEquals(
                arrayExpected, DeleteReplicatesOfElements.deleteRepeatingElements(array),
                "Test failed"
        );
    }
}