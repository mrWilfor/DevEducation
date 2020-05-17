package practice.practic_8_05_05_2020;

import java.util.Scanner;

public class QuantityLowerCaseAndCapitalLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(quantity(sc));
    }

    public static String quantity(Scanner scan) {
        String stringInput = scan.nextLine();
        String result = "";
        char[] arrayOfChars = stringInput.toCharArray();
        int counterUpperCase = 0;
        int counterLowerCase = 0;

        for (int i = 0; i < arrayOfChars.length; i++) {
            if (((int) arrayOfChars[i] > 64 && (int) arrayOfChars[i] < 91) && arrayOfChars[i] != ' ') {
                counterUpperCase++;
            } else if (((int) arrayOfChars[i] > 96 && (int) arrayOfChars[i] < 123) && arrayOfChars[i] != ' ') {
                counterLowerCase++;
            }
        }
        result = "Uppercase occurs " + counterUpperCase + " times" + ", " + "lowercase occurs " + counterLowerCase + " times";
        return result;
    }
}
