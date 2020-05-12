package HomeWork.HW_7_04_05_2020;

import java.util.Scanner;

public class RandomCombinationOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(WordsAreSetRandomlyInString(sc));
    }

    public static String WordsAreSetRandomlyInString(Scanner scan) {
        String[] arrayOfWords = new String[1];
        int counter = 0;
        String word = "";
        String result = "";

        while (!(word.equals("EXIT"))) {
            word = scan.nextLine();

            if (word.equals("EXIT")) {
                break;
            } else if (arrayOfWords.length == counter + 1) {
                arrayOfWords[counter] = word;
                counter++;
            } else {
                String[] newArrayOfWords = new String[arrayOfWords.length + 1];

                for (int i = 0; i < arrayOfWords.length; i++) {
                    newArrayOfWords[i] = arrayOfWords[i];
                }
                arrayOfWords = newArrayOfWords;
                arrayOfWords[counter] = word;
                counter++;
            }
        }
        int[] arrayRandomNumbers = new int[arrayOfWords.length];

        for (int i = 0; i < arrayRandomNumbers.length; i++) {
            arrayRandomNumbers[i] = (int) (Math.random() * (arrayRandomNumbers.length));
        }
        boolean trigger = true;

        while (trigger) {
            trigger = false;

            for (int i = 0; i < arrayRandomNumbers.length - 1; i++) {
                if (arrayRandomNumbers[i] > arrayRandomNumbers[i + 1]) {
                    int bufferVariableOfNumber = arrayRandomNumbers[i];
                    arrayRandomNumbers[i] = arrayRandomNumbers[i + 1];
                    arrayRandomNumbers[i + 1] = bufferVariableOfNumber;

                    String bufferVariableOfWords = arrayOfWords[i];
                    arrayOfWords[i] = arrayOfWords[i + 1];
                    arrayOfWords[i + 1] = bufferVariableOfWords;
                    trigger = true;
                }
            }
        }

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (i == 0) {
                result += arrayOfWords[i];
            } else {
                result = result + " " + arrayOfWords[i];
            }
        }
        return result;
    }
}
