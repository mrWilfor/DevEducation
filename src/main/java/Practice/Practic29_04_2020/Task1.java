package Practice.Practic29_04_2020;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        System.out.println(Arrays.toString(fiveString(arr)));
        System.out.println(Arrays.toString(displaysColumn(arr)));
    }

    public static int[] fiveString(int[][] array) {

        int[] fiveStringOfArray = new int[array[0].length];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 4) {
                    fiveStringOfArray[j] = array[i][j];
                }
            }
        }
        return fiveStringOfArray;
    }

    public static int[] displaysColumn(int[][] array) {
        int[] columnArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            columnArray[i] = array[i][4];
        }
        return columnArray;
    }
}
