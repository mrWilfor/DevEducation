//Determine which of the three numbers entered by the user is the maximum and display it on the screen.
package Practice.Practic16_04_20220;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        enterNumbers();
    }

    public static void enterNumbers() {
        int[]   numbers = new int[3];  //Announcement an array
        for(int i = 0, j = 0; i < 3; i ++) {
            System.out.println("Enter your number: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt(); //Reading a number from the keyboard
            numbers[j] = number; //Placing number in array
            j++;
        }
        maxNumber(numbers[0], numbers[1], numbers[2]);
    }

    public static int maxNumber(int a, int b, int c) { //Comparison entered number
        int d =0;
        if (a > b) {
            if (a > c) {
                System.out.println("Max number: " + a);
                d = a;
            }
        }
        else {
            if (b > c) {
                System.out.println("Max number: " + b);
                d = b;
            }
            else {
                if ((a == b) && (b == c)) {
                    System.out.println("All numbers are the same");
                } else {
                    System.out.println("Max number: " + c);
                    d = c;
                }
            }
        }
        return d;
    }
}
