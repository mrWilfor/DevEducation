package HomeWork.HW_5_27_04_2020;

import java.util.Scanner;
import java.util.Arrays;

public class SumLeftAndRightPathArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumLeftAndRightPathArray(createArray(sc));
    }

    public static int[] createArray(Scanner scan) {
        int evenNumber;
        do {
            System.out.println("Enter even number:");
            evenNumber = scan.nextInt();
        }
        while (evenNumber % 2 != 0);
        int[] array = new int[evenNumber];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11) - 5;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int sumLeftAndRightPathArray(int[] array) {
        int leftPath = 0;
        int rightPath = 0;
        int result = 0;

        for (int i = (array.length / 2) - 1, j = array.length / 2; i >= 0; i--, j++) {
            if (array[i] >= 0) {
                leftPath += array[i];
            }
            else {
                leftPath = leftPath + (-1) * (array[i]);
            }

            if (array[j] >= 0) {
                rightPath += array[j];
            }
            else {
                rightPath = rightPath + (-1) * (array[j]);
            }
        }
        if (leftPath == rightPath) {
            System.out.println("Left and right path are equal");
        }
        else if (leftPath > rightPath) {
            result = leftPath;
            System.out.println("Left path array more than right");
        }
        else {
            result = rightPath;
            System.out.println("Right path array more than let");
        }
        return result;
    }
}
