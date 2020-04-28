package HomeWork.hw_27_04_2020;

import java.util.Arrays;

public class Max3NumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        System.out.println(Arrays.toString(max3Numbers(arr)));
    }

    public static int[] max3Numbers(int[] array) {
        int[] indexArray = {-1, -1, -1};
        int[] numberArray = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > numberArray[i]) {
                    if (j != indexArray[0] && j != indexArray[1]) {
                        numberArray[i] = array[j];
                        indexArray[i] = j;
                    }
                }
            }
        }
        return numberArray;
    }
}
