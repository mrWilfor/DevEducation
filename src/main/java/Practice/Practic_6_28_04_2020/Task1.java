package Practice.Practic_6_28_04_2020;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 6, 9, 8, 9, 10, 12, 11};
        System.out.println(Arrays.toString(evenAscendingOddDescending(arr)));
    }


    public static int[] evenAscendingOddDescending(int[] array) {
        int[] newArray = new int[array.length];
        int counterEven = 0;
        int counterOdd = 1;
        int evenNumber = 0;
        int oddNumber = 0;
        int bufferVariable = 0;
        boolean trigger = true;

        while (trigger) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenNumber = array[i];
                    for (int j = i; j < array.length; j++) {
                        if (array[j] % 2 == 0) {
                            if (array[j] < array[i]) {
                                bufferVariable = array[j];
                                array[j] = array[i];
                                array[i] = bufferVariable;
                                evenNumber = array[i];
                            }
                        }
                    }
                    newArray[counterEven] = evenNumber;
                    counterEven = counterEven + 2;
                }

                if (array[i] % 2 != 0) {
                    oddNumber = array[i];
                    for (int j = i; j < array.length; j++) {
                        if (array[j] % 2 != 0) {
                            if (array[j] > array[i]) {
                                bufferVariable = array[j];
                                array[j] = array[i];
                                array[i] = bufferVariable;
                                oddNumber = array[i];
                            }
                        }
                    }
                    newArray[counterOdd] = oddNumber;
                    counterOdd = counterOdd + 2;
                }
                if (i == array.length - 1) {
                    trigger = false;
                }
            }
        }
        return newArray;
    }
}
