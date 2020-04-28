package HomeWork.hw_27_04_2020;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(5, 3, 0, 2, 2, 6, 7, 2, 1)));
    }

    public static int[] sort(int... array) {
        boolean trigger = true;
        while (trigger) {
            trigger = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int bufferVariable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bufferVariable;
                    trigger = true;
                }
            }
        }
        return array;
    }
}
