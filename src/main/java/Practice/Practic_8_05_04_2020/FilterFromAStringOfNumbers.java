package Practice.Practic_8_05_04_2020;

import java.util.Scanner;
import java.util.Arrays;

public class FilterFromAStringOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(filter(sc)));
    }

    public static int[] filter(Scanner scan) {
        String str = scan.nextLine();
        char[] array = str.toCharArray();
        String number = "";
        int[] arrayNumbers = new int[1];
        int counterArray = 0;

        for (int i = 0; i < array.length; i++) {
            if ((int) array[i] > 47 && (int) array[i] < 58) {
                number += array[i];
                if (i == array.length - 1) {
                    if (arrayNumbers.length == counterArray + 1) {
                        arrayNumbers[counterArray] = Integer.parseInt(number);
                        counterArray++;
                        number = "";
                    }
                    else if (arrayNumbers.length < counterArray + 1) {
                        int[] newArray = new int[arrayNumbers.length + 1];

                        for (int j = 0; j < arrayNumbers.length; j++) {
                            newArray[j] = arrayNumbers[j];
                        }
                        arrayNumbers = newArray;
                        arrayNumbers[counterArray] = Integer.parseInt(number);
                        counterArray++;
                        number = "";
                    }
                }
                else if ((int) array[i + 1] < 47 || (int) array[i + 1] > 58) {
                    if (arrayNumbers.length == counterArray + 1) {
                        arrayNumbers[counterArray] = Integer.parseInt(number);
                        counterArray++;
                        number = "";
                    }
                    else if (arrayNumbers.length < counterArray + 1) {
                        int[] newArray = new int[arrayNumbers.length + 1];

                        for (int j = 0; j < arrayNumbers.length; j++) {
                            newArray[j] = arrayNumbers[j];
                        }
                        arrayNumbers = newArray;
                        arrayNumbers[counterArray] = Integer.parseInt(number);
                        counterArray++;
                        number = "";
                    }
                }
            }
        }
        return arrayNumbers;
    }
}
