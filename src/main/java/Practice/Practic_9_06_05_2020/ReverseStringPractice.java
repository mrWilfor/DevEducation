package practice.practic_9_06_05_2020;

import java.util.Scanner;

public class ReverseStringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc));
    }

    public static String reverse(Scanner scan) {
        StringBuilder str = new StringBuilder(scan.nextLine());

        return str.reverse().toString();
    }
}
