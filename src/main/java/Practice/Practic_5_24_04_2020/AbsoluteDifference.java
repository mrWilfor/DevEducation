package practice.practic_5_24_04_2020;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        diff21(sc);
    }

    public static int diff21(Scanner scan) {
        System.out.println("Enter second number:");
        int number = scan.nextInt();
        int variable21 = 21;
        int result = variable21 - number;

        if ((variable21 - number) < 0) {
            System.out.println("Can not calculate absolute difference");
            return 0;
        }
        System.out.println("Absolute difference between 21 and " + number + ": " + result);
        return result;
    }
}

