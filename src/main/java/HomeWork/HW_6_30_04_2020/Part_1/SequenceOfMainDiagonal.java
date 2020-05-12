package HomeWork.HW_6_30_04_2020.Part_1;

import java.util.Arrays;

public class SequenceOfMainDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        System.out.println(sequenceElementsOfDiagonalArray(arr));
    }

    public static String sequenceElementsOfDiagonalArray(int[][] array) {
        int[] indexSequenceViolation = {-1, -1};
        int valueElement = 0;
        String result = "Sequence is not violation";

        if (array.length != array[0].length) {
            result = "Array is not square";
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i][i] >= valueElement) {
                    valueElement = array[i][i];
                } else {
                    indexSequenceViolation[0] = i;
                    indexSequenceViolation[1] = i;
                    result = Arrays.toString(indexSequenceViolation);
                    break;
                }
            }
        }
        return result;
    }
}
