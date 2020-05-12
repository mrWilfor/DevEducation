/*Task 5: It is necessary to write a program where the user is prompted to enter a number to choose from: 1, 2 or 3,
and the program should say what number the user entered: 1, 2, or 3. If the user entered a different number,
the program should display a message: "You entered a different number." Use Scanner to enter from the console and
if else construct */
package HomeWork.HW_3_15_04_2020;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //Reading a number from the keyboard

        enterNumber(number);
    }

    public static int enterNumber(int a) { //Displays number which was enter
        if (a == 1) {
            System.out.println("Your number: " + a);
        } else if (a == 2) {
            System.out.println("Your number: " + a);
        } else if (a == 3) {
            System.out.println("Your number: " + a);
        } else {
            System.out.println("You enter other number, try again");
        }
        return a;
    }
}
