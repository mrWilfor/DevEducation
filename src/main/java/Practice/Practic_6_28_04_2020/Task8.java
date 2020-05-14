package practice.practic_6_28_04_2020;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(neighborsNumber(1, 4, 2, 5, 6, 2, 7, 2, 8, 7, 9)));
    }

    public static int[] neighborsNumber(int... array) {
        int index = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                index = i - 1;
            }
        }

        int[] newArray = new int[index];

        for (int j = 0; j < index; j++) {
            newArray[j] = array[j];
        }
        return newArray;
    }
}
