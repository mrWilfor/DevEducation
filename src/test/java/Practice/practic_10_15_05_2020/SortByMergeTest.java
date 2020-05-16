package practice.practic_10_15_05_2020;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortByMergeTest {

    @ParameterizedTest
    @MethodSource("paramsOfSort")
    void sort(int[] arrayInput, int[] arrayExpected) {
             assertArrayEquals(arrayExpected, new SortByMerge().sort(arrayInput));
    }

    public static Stream<Arguments> paramsOfSort() {
        return Stream.of(
                Arguments.arguments(new int[]{9, 0, 3, 5, 1}, new int[]{0, 1, 3, 5, 9}),
                Arguments.arguments(new int[]{8, 5, 14, 64, 6, 8}, new int[]{5, 6, 8, 8, 14, 64}),
                Arguments.arguments(null, null));
    }

    @ParameterizedTest
    @MethodSource("paramsOfMerge")
    void merge(int[] array1, int[] array2, int[] arrayExpected) {
        System.out.println(Arrays.toString(new SortByMerge().merge(array1, array2)));
        assertArrayEquals(arrayExpected, new SortByMerge().merge(array1, array2));
    }

    public static Stream<Arguments> paramsOfMerge() {
        return Stream.of(
                Arguments.arguments(
                        new int[]{9, 11, 8, 5, 1},
                        new int[]{0, 54, 3, 5, 9},
                        new int[]{0, 1, 3, 5, 5, 8, 9, 9, 11, 54}
                ),
                Arguments.arguments(
                        new int[]{81, 53, 14, 67, 6, 12},
                        new int[]{5, 6, 8, 8, 14, 64},
                        new int[]{5, 6, 6, 8, 8, 12, 14, 14, 53, 64, 67, 81}
                ),
                Arguments.arguments(
                        new int[]{5, 6, 8, 8, 14, 64},
                        new int[]{81, 53, 14, 67, 6, 12},
                        new int[]{5, 6, 6, 8, 8, 12, 14, 14, 53, 64, 67, 81}
                ),
                Arguments.arguments(
                        null,
                        new int[]{14, 64, 8, 6, 5, 8},
                        new int[]{5, 6, 8, 8, 14, 64}
                ),
                Arguments.arguments(
                        new int[]{81, 53, 14, 67, 6, 12},
                        null,
                        new int[]{6, 12, 14, 53, 67, 81}
                ),
                Arguments.arguments(
                        null,
                        null,
                        null
                )
        );
    }
}