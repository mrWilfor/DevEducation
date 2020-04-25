package Practice.Practic24_04_2020;

import java.util.Scanner;

public class DeleteCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        missingChar(sc);
    }

    public static String missingChar(Scanner scan) {
        String newStr = new String();

        System.out.println("Enter string:");
        String str = scan.nextLine();
        System.out.println("Enter index of char than you want delete:");
        int index = scan.nextInt();

        if (str.length() == 0) {
            System.out.println("Empty line");
            return "Empty line";
        }
        else if (index > str.length()) {
            System.out.println("Invalid index");
            return "Invalid index";
        }
        else {
            newStr = str.substring(0, index) + str.substring(index + 1);
        }
        System.out.println(newStr);
        return newStr;
    }
}
