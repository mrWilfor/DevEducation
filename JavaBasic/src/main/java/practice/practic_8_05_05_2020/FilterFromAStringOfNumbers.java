package practice.practic_8_05_05_2020;

import java.util.Arrays;
import java.util.Scanner;

public class FilterFromAStringOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(filter(sc)));
    }

    public static int[] filter(Scanner scan) {
        String stringInput = scan.nextLine();
        char[] arrayChars = stringInput.toCharArray();
        String number = "";
        int[] arrayNumbers = new int[1];
        int counterArray = 0;

        for (int i = 0; i < arrayChars.length; i++) {
            if ((int) arrayChars[i] > 47 && (int) arrayChars[i] < 58) {
                number += arrayChars[i];

                if (i == arrayChars.length - 1) {
                    if (arrayNumbers.length == counterArray + 1) {
                        arrayNumbers[counterArray] = Integer.parseInt(number);
                        counterArray++;
                        number = "";
                    } else if (arrayNumbers.length < counterArray + 1) {
                        int[] newArray = new int[arrayNumbers.length + 1];

                        for (int j = 0; j < arrayNumbers.length; j++) {
                            newArray[j] = arrayNumbers[j];
                        }
                        arrayNumbers = newArray;
                        arrayNumbers[counterArray] = Integer.parseInt(number);
                        counterArray++;
                        number = "";
                    }
                } else if ((int) arrayChars[i + 1] < 47 || (int) arrayChars[i + 1] > 58) {
                    if (arrayNumbers.length == counterArray + 1) {
                        arrayNumbers[counterArray] = Integer.parseInt(number);
                        counterArray++;
                        number = "";
                    } else if (arrayNumbers.length < counterArray + 1) {
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
