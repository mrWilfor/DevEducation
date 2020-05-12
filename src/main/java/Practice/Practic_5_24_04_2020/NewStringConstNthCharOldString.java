package Practice.Practic_5_24_04_2020;

import java.util.Scanner;

public class NewStringConstNthCharOldString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        everyNth(sc);
    }

    public static String everyNth(Scanner scan) {
        System.out.println("Enter your string:");
        String str = scan.nextLine();
        System.out.println("Enter your index:");
        int firstIndex = scan.nextInt();
        String newString = new String();
        int index = 0;

        while (index <= str.length()) {
            if (str.length() == 0) {
                System.out.println("Empty string");
                return "Empty string";
            } else if (index < str.length()) {
                newString += str.substring(index, index + 1);
                index = index + firstIndex;
            } else if (index == str.length()) {
                newString += str.substring(index);
                index = index + firstIndex;
            }
        }
        System.out.println(newString);
        return newString;
    }
}
