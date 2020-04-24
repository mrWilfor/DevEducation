package Practice.Practic23_04_2020;

import java.util.Scanner;


public class AscendingOrDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sequence(sc));
    }

    public static boolean sequence(Scanner scan) {
        int number;
        int numbers = 0;

        while ((number = scan.nextInt()) != 0) {
            if (number > 10) {
               System.out.println("Too many, entered number < 10");
            }
            else {
                numbers = numbers * 10 + number;
            }
        }

        int ascending = numbers;
        boolean result = true;

        while ( ascending != 0) {
            if (ascending / 10 == 0) {
                return true;
            }
            else if (ascending % 10 > (ascending / 10) % 10) {
                ascending /= 10;
            }
            else {
                result = false;
                break;
            }
        }

        int descending = numbers;

        while (descending != 0) {
            if (descending / 10 == 0) {
                return true;
            }
            else if (descending % 10 < (descending / 10) % 10) {
                descending /= 10;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
