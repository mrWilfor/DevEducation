package Practice.Practic_5_24_04_2020;

import java.util.Scanner;

public class LastCharFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        backAround(sc);
    }

    public static String backAround(Scanner scan) {
        String str = scan.nextLine();

        if (str.length() == 0) {
            System.out.println("Empty string");
            return "Empty string";
        }
        else {
            String newString = str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
            System.out.println(newString);
            return newString;
        }
    }
}
