package homeWork.hw_6_30_04_2020.part_2;

import java.util.Arrays;

public class SwitchMaxAndMinElements {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        System.out.println(Arrays.deepToString(switchMinAndMaxInArray(arr)));
    }

    public static int[][] switchMinAndMaxInArray(int[][] array) {
        int maxNumber = 0;
        int minNumber = 0;
        int maxNumberIndex1 = -1;
        int maxNumberIndex2 = -1;
        int minNumberIndex1 = -1;
        int minNumberIndex2 = -1;
        int bufferVariable = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxNumber) {
                    maxNumber = array[i][j];
                    maxNumberIndex1 = i;
                    maxNumberIndex2 = j;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 && j == 0) {
                    minNumber = array[i][j];
                    minNumberIndex1 = i;
                    minNumberIndex2 = j;
                } else if (array[i][j] < minNumber) {
                    minNumber = array[i][j];
                    minNumberIndex1 = i;
                    minNumberIndex2 = j;

                }
            }
        }
        bufferVariable = array[minNumberIndex1][minNumberIndex2];
        array[minNumberIndex1][minNumberIndex2] = array[maxNumberIndex1][maxNumberIndex2];
        array[maxNumberIndex1][maxNumberIndex2] = bufferVariable;
        return array;
    }
}
