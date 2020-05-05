package HomeWork.HW_6_30_04_2020.Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class FillRangeRandomNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(rangeArray(sc)));
    }

    public static int[] rangeArray(Scanner scan) {
        System.out.println("Array length:");
        int arrayLength = scan.nextInt();
        System.out.println("First index of range:");
        int firstIndex = scan.nextInt();
        System.out.println("Second index of range:");
        int secondIndex = scan.nextInt();
        int[] array = new int[arrayLength];

        if (firstIndex < 0 || secondIndex >= array.length) {
            System.out.println("Invalid range");
        }
        else {
            for (int i = firstIndex; i <= secondIndex; i++) {
                array[i] = (int) (Math.random() * secondIndex * 2);
                if (array[i] == 0) {
                    i--;
                }
        }
        }
        return array;
    }
}
