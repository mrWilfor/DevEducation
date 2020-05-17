package practice.practic_9_06_05_2020;

import java.util.Scanner;

public class ReverseWordPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc));
    }

    public static String reverse(Scanner scan) {
        String stringInput = scan.nextLine();
        String[] arrayString = stringInput.split(" ");

        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = new StringBuilder(arrayString[i]).reverse().toString();
        }
        return String.join(" ", arrayString);
    }
}
