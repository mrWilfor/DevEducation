package Practice.Practic_5_24_04_2020;

import java.util.Scanner;

public class SwapFirstAndLastCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        frontBack(sc);
    }

    public static String frontBack(Scanner scan) {
        String str = scan.nextLine();

        if (str.length() == 0) {
            System.out.println("Empty string");
            return "Empty string";
        } else if (str.length() < 2) {
            System.out.println("Too short string");
            return str;
        } else {
            String newString = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
            System.out.println(newString);
            return newString;
        }
    }
}
