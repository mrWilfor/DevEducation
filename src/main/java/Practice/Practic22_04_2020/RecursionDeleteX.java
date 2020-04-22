package Practice.Practic22_04_2020;

import java.util.Scanner;

public class RecursionDeleteX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String enterString = scan.nextLine();
        System.out.println(deleteX(enterString));
    }

    public static String deleteX(String string) {
        int index = string.indexOf('x');

        if (index == -1) {
            return string;
        }

        String newString = string.replaceFirst("x", "");
        return deleteX(newString);
    }
}
