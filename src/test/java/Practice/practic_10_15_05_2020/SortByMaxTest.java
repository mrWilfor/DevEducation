package practice.practic_10_15_05_2020;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortByMaxTest {

    @ParameterizedTest
    @MethodSource("paramsOfSort")
    void sort(int[] arrayInput, int[] arrayExpected) {
        assertArrayEquals(arrayExpected, new SortByMax().sort(arrayInput));
    }

    public static Stream<Arguments> paramsOfSort() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 5, 2, 3, 5}, new int[]{5, 5, 3, 2, 1}),
                Arguments.arguments(new int[]{9, 0, 3, 5, 1}, new int[]{9, 5, 3, 1, 0}),
                Arguments.arguments(new int[]{8, 5, 14, 64, 6, 8}, new int[]{64, 14, 8, 8, 6, 5}),
                Arguments.arguments(null, null));
    }

    @ParameterizedTest
    @MethodSource("paramsOfMerge")
    void merge(int[] array1, int[] array2, int[] arrayExpected) {
        assertArrayEquals(arrayExpected, new SortByMax().merge(array1, array2));
    }

    public static Stream<Arguments> paramsOfMerge() {
        return Stream.of(
                Arguments.arguments(
                        new int[]{1, 5, 2, 7, 10},
                        new int[]{9, 2, 3, 5, 5},
                        new int[]{10, 9, 7, 5, 5, 5, 3, 2, 2, 1}
                ),
                Arguments.arguments(
                        new int[]{9, 11, 8, 5, 1},
                        new int[]{0, 54, 3, 5, 9, 10},
                        new int[]{54, 11, 10, 9, 9, 8, 5, 5, 3, 1, 0}
                ),
                Arguments.arguments(
                        new int[]{81, 53, 14, 67, 6, 12},
                        new int[]{5, 6, 8, 8, 14, 64},
                        new int[]{81, 67, 64, 53, 14, 14, 12, 8, 8, 6, 6, 5}
                ),
                Arguments.arguments(
                        null,
                        new int[]{14, 64, 8, 6, 5, 8},
                        new int[]{64, 14, 8, 8, 6, 5}
                ),
                Arguments.arguments(
                        new int[]{81, 53, 14, 67, 6, 12},
                        null,
                        new int[]{81, 67, 53, 14, 12, 6}
                ),
                Arguments.arguments(
                        null,
                        null,
                        null
                )
        );
    }
}