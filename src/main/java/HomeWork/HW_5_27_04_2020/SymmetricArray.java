package homeWork.hw_5_27_04_2020;

import java.util.Arrays;

public class SymmetricArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(symmetricArray(19)));
    }

    public static int[] symmetricArray(int lengthArray) {
        int[] array = new int[lengthArray];
        int middle = array.length / 2;

        for (int i = middle, j = middle, k = 0; i >= 0 || j < array.length; k++) {
            if (i >= 0) {
                array[i] = k;
                i--;
            }

            if (j < array.length) {
                array[j] = k;
                j++;
            }
        }
        return array;
    }
}
