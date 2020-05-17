package practice.practic_6_28_04_2020;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomNumbersInArray(20)));
    }

    public static int[] randomNumbersInArray(int arrayLength) {
        int[] arrayNumbers = new int[arrayLength];
        int k = 0;

        while (k < arrayNumbers.length) {
            int randomNumber = (int) (Math.random() * 40);
            boolean trigger = true;

            for (int j : arrayNumbers) {
                if (j == randomNumber) {
                    trigger = false;
                }
            }

            if (trigger) {
                arrayNumbers[k] = randomNumber;
                k++;
            }
        }
        return arrayNumbers;
    }
}
