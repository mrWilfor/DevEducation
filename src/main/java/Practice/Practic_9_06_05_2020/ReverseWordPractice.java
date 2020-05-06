package Practice.Practic_9_06_05_2020;

import java.util.Scanner;

public class ReverseWordPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc));
    }

    public static String reverse(Scanner scan) {
        String str = scan.nextLine();
        String[] arrayString = str.split(" ");

        for(int i = 0; i < arrayString.length; i++) {
            arrayString[i] = new StringBuilder(arrayString[i]).reverse().toString();
        }
        str = String.join(" ", arrayString);
        return str;
    }
}
