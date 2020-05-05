package HomeWork.HW_7_04_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStringTest {

    @Test
    void sortByWordLengthTest() {
        String str = "Hello, im your support";
        String expected = "support Hello your im";

        assertTrue(
                expected.equals(SortString.sortByWordLength(str)),
                        "Test failed"
        );
    }

    @Test
    void firstSymbolSortingTest() {
        String str = "Hello im your, support. hi and";
        String expected = "Hello and hi im support your";

        assertTrue(
                expected.equals(SortString.firstSymbolSorting(str)),
                "Test failed"
        );
    }

    @Test
    void firstSymbolAndWordLengthSorting() {
        String str = "Hello And im your support! hi and appa";
        String expected = "And Hello appa and hi im support your";

        assertTrue(
                expected.equals(SortString.firstSymbolAndWordLengthSorting(str)),
                "Test failed"
        );
    }

    @Test
    void sortByCharacter() {
        String str = "Arra Aas mom mather kitchen kitti kiss?";
        String expected = "Aas Arra kiss kitchen kitti mather mom";

        assertTrue(
                expected.equals(SortString.sortByCharacter(str)),
                "Test failed"
        );
    }
}