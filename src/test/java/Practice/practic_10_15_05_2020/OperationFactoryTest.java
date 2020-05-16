package practice.practic_10_15_05_2020;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OperationFactoryTest {

    @ParameterizedTest
    @MethodSource("paramsOfChooseTest")
    void chooseTest(IOperations object) {
        int[] array1 = new int[] {9, 1, 2, 2, 5, 3, 10, 5, 7, 5};
        int[] array2 = new int[] {1, 5, 2, 7, 10};
        int[] array3 = new int[] {9, 2, 3, 5, 5};

        int[] actualSort = object.sort(array1);
        int[] actualMerge = object.merge(array2, array3);

        assertArrayEquals(actualSort, actualMerge);
    }

    public static Stream<Arguments> paramsOfChooseTest() {
        return Stream.of(
                Arguments.arguments(OperationFactory.choose(OperationConstants.SORT_BY_MIN)),
                Arguments.arguments(OperationFactory.choose(OperationConstants.SORT_BY_MAX)),
                Arguments.arguments(OperationFactory.choose(OperationConstants.SORT_BY_MERGE))
        );
    }
}