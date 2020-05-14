// 2: Determine the number of days in a year that a user enters. In leap - 366 days, in the usual 365.
package practice.practic_1_16_04_20220;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Enter year:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //Reading a number from the keyboard
        loftyOrNormalYear(number);
    }

    public static int loftyOrNormalYear(int entered) { //Year definition
        final int original = 2020;
        int c = 0;
        int d;
        c = original - entered;

        if ((c % 4) == 0) {
            System.out.println("This year is lofty, because he have 366 days");
            d = 366;
        } else {
            System.out.println("This years is not lofty, because he have 365 days");
            d = 365;
        }
        return d;
    }
}
