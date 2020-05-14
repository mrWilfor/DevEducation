package practice.practic_5_24_04_2020;

import java.util.Scanner;

public class StringStartWithHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        startHi(sc);
    }

    public static boolean startHi(Scanner scan) {
        String str = scan.nextLine();

        if (str.length() < 2) {
            System.out.println("Empty string");
            return false;
        }

        String checkHi = str.substring(0, 2);

        if (checkHi.equals("hi")) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
