package HomeWork.hw_30_04_2020.Part_1;

import java.util.Arrays;

public class AllElementsOldArraySquareInNewArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(newArrayBasedOnRange(arr, 1, 4)));
    }

    public static int[] newArrayBasedOnRange(int[] array, int firstIndex, int secondIndex) {
        if ((firstIndex < 0 || secondIndex >= array.length) || firstIndex > secondIndex) {
            System.out.println("Invalid Index");
            int[] arr = {0};
            return arr;
        }
        else {
            int[] newArray = new int[secondIndex - firstIndex + 1];

            for (int i = 0, j = firstIndex; j <= secondIndex; i++, j++) {
                newArray[i] = array[j] * array[j];
            }
            return newArray;
        }
    }
}
