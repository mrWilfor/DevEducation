/* A natural number is entered. Find the sum of the even numbers in its composition. test: when entering the number "1474"
we get "8" at the output, since only two digits of "4" are even.
Write a program that counts the number of even and odd numbers in a number.
*/
package Practice.Practic_1_16_04_20220;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt(); //Reading a number from the keyboard
        sumEven(number);
        sumOdd(number);
    }

    public static int sumEven(int number) { //Sum even numbers and amount even numbers
        int a = number;
        int amountEventNumbers = 0;
        int event = 0;

        for (int i = 0; a > 0; i++) {
            if ((a % 10) % 2 == 0) {
                event += (a % 10);
                amountEventNumbers++;
            }
            a /= 10;
        }
        System.out.println("Sum event: " + event);
        System.out.println("Amount event: " + amountEventNumbers);
        return event;
    }

    public static int sumOdd(int number) {   //Sum odd numbers and amount odd numbers
        int a = number;
        int amountOddNumbers = 0;
        int odd = 0;

        for (int i = 0; a > 0; i++) {
            if ((a % 10) % 2 != 0) {
                odd += (a % 10);
                amountOddNumbers++;
            }
            a /= 10;
        }
        System.out.println("Sum odd: " + odd);
        System.out.println("Amount odd: " + amountOddNumbers);
        return odd;
    }
}
