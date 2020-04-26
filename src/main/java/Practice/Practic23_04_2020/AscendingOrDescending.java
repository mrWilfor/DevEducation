package Practice.Practic23_04_2020;

import java.util.Scanner;


public class AscendingOrDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sequence(sc));
    }

    public static boolean sequence(Scanner scan) {
        long number;
        long numbers = 0;

        while ((number = scan.nextInt()) != 0) {
            if (number > 1000) {
               System.out.println("Too many, entered number < 1000");
            }
            else {
                numbers = numbers * 1000 + number;
            }
        }

        long ascending = numbers;
        boolean result = true;

        while ( ascending != 0) {
            if (ascending / 1000 == 0) {
                return true;
            }
            else if (ascending % 1000 >= (ascending / 1000) % 1000) {
                ascending /= 1000;
            }
            else {
                result = false;
                break;
            }
        }

        long descending = numbers;

        while (descending != 0) {
            if (descending / 1000 == 0) {
                return true;
            }
            else if (descending % 1000 <= (descending / 1000) % 1000) {
                descending /= 1000;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
