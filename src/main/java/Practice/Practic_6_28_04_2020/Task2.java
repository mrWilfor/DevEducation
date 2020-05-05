package Practice.Practic_6_28_04_2020;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddZero(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0)));
    }

    public static int[] evenOddZero(int... array) {
        int bufferVariable = 0;
        int arrayLength = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < arrayLength; j++) {
                if (array[i] == 0) {
                    if (array[arrayLength] == 0) {
                        arrayLength--;
                    }
                    bufferVariable = array[i];
                    array[i] = array[arrayLength];
                    array[arrayLength] = bufferVariable;
                }
                else if ((array[i] % 2 != 0 && array[j] % 2 == 0) && array[j] != 0) {
                    bufferVariable = array[i];
                    array[i] = array[j];
                    array[j] = bufferVariable;

                }
                else if (array[j] % 2 == 0 && array[j] != 0) {
                    if (array[i] > array[j]) {
                        bufferVariable = array[i];
                        array[i] = array[j];
                        array[j] = bufferVariable;
                    }
                }
                else if (array[i] % 2 != 0 && array[j] != 0) {
                    if (array[i] < array[j]) {
                        bufferVariable = array[i];
                        array[i] = array[j];
                        array[j] = bufferVariable;
                    }
                }
            }
        }
        return array;
    }
}
