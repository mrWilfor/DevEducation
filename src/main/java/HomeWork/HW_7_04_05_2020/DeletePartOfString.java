package HomeWork.HW_7_04_05_2020;

import java.util.Scanner;

public class DeletePartOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(delete(sc));
    }

    public static String delete(Scanner scan) {
        System.out.print("Entered string:");
        String str1 = scan.nextLine();
        System.out.print("Entered number of symbol:");
        int index = scan.nextInt();

        if (index > str1.length() || index < 0) {
            return "invalid number of symbol";
        }
        System.out.print("Entered delete size:");
        int length = scan.nextInt();

        if (index - 1 + length > str1.length()) {
            return "invalid delete size";
        }
        String str2 = str1.substring(0, index - 1) + str1.substring(index - 1 + length);
        return str2;
    }
}
