//Task 6: The same as Task 5, only use switch
package homeWork.hw_3_15_04_2020;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //Reading a number from the keyboard

        enterNumber(number);
    }

    public static int enterNumber(int a) { //Displays number which was enter
        switch (a) {
            case (1):
                System.out.println("Your number: " + a);
                break;

            case (2):
                System.out.println("Your number: " + a);
                break;

            case (3):
                System.out.println("Your number: " + a);
                break;

            default:
                System.out.println("You enter other number, try again");
                break;
        }
        return a;
    }
}


