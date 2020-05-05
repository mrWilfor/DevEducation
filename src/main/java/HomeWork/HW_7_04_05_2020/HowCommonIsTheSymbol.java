package HomeWork.HW_7_04_05_2020;

import java.util.Scanner;

public class HowCommonIsTheSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkSymbolOfString(sc));
    }

    public static String checkSymbolOfString(Scanner scan) {
        System.out.print("Entered the string:");
        String word = scan.nextLine();
        System.out.print("Entered the search symbol:");
        String charOfTheString = scan.nextLine();
        char[] symbol = charOfTheString.toCharArray();
        int quantity = 0;
        boolean trigger = false;
        String result = "";

        do {
            int indexOfSymbol = word.indexOf(symbol[0]);

            if (indexOfSymbol != - 1) {
                word = word.substring(indexOfSymbol + 1);
                quantity++;
                trigger = true;
            }
            else {
                result = "Symbol " + "\"" + symbol[0] + "\"" + " occurs " + quantity + " times";
                trigger = false;
            }
        } while (trigger);
        return result;
    }
}
