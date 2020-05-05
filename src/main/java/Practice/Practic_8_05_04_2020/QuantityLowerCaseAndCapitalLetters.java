package Practice.Practic_8_05_04_2020;

import java.util.Scanner;

public class QuantityLowerCaseAndCapitalLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(quantity(sc));
    }

    public static String quantity(Scanner scan) {
        String str = scan.nextLine();
        String result = "";
        char[] array = str.toCharArray();
        int counterUpperCase = 0;
        int counterLowerCase = 0;

        for (int i = 0; i < array.length; i++) {
            if (((int) array[i] > 64 && (int) array[i] < 91) && array[i] != ' ') {
                counterUpperCase++;
            }
            else if (((int) array[i] > 96 && (int) array[i] < 123) && array[i] != ' ') {
                counterLowerCase++;
            }
        }
        result = "Uppercase occurs " + counterUpperCase + " times" + ", " + "lowercase occurs " + counterLowerCase + " times";
        return result;
    }
}
