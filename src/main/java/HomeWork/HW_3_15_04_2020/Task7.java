//Problem 7: The same as Problem 5 only use the ternary operator
package homeWork.hw_3_15_04_2020;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //Reading a number from the keyboard

        enterNumber(number);
    }

    public static int enterNumber(int a) { //Displays number which was enter
        String out = a == 1 ? "Your number: " + a : a == 2 ? "Your number: " + a : a == 3 ? "Your number: " + a : "You enter other number, try again";
        System.out.println(out);
        return a;
    }
}
