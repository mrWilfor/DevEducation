package practice.practic_6_28_04_2020;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sum5ElementsOfArray(2, 4, 67, 3, 12, 54, 67, 1, 3, 4)));
    }

    public static int[] sum5ElementsOfArray(int... array) {
        int[] newArray = new int[5];
        int sum = 0;
        int newSum = 0;

        for (int i = 2; i < array.length - 3; i++) {
            newSum = array[i - 2] + array[i - 1] + array[i] + array[i + 1] + array[i + 2];

            if (newSum > sum) {
                sum = newSum;
                newArray[0] = array[i - 2];
                newArray[1] = array[i - 1];
                newArray[2] = array[i];
                newArray[3] = array[i + 1];
                newArray[4] = array[i + 2];
            }
        }
        return newArray;
    }
}
