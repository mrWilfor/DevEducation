package homeWork.hw_6_30_04_2020.part_1;

import java.util.Arrays;

public class NumberStringWithTheMostValueMultiplicationElements {
    public static void main(String[] args) {
        int[][] arr = new int[7][4];

        arr = fillArray(arr);
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Index string with max sum of elements: " + numberStringWithMaxSumOfElements(arr));
    }

    public static int[][] fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11 - 5);
                if (array[i][j] == 0) {
                    j--;
                }
            }
        }
        return array;
    }

    public static int numberStringWithMaxSumOfElements(int[][] array) {
        int sumStringOfElements = 0;
        int newSumStringOfElements = 0;
        int indexString = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    newSumStringOfElements = newSumStringOfElements + array[i][j] * (-1);
                } else {
                    newSumStringOfElements += array[i][j];
                }
            }

            if (newSumStringOfElements > sumStringOfElements) {
                sumStringOfElements = newSumStringOfElements;
                indexString = i;
            }
            newSumStringOfElements = 0;
        }
        System.out.println(sumStringOfElements);
        return indexString;
    }
}
