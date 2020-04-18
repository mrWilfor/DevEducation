package HomeWork.hw_15_04_2020;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //Reading a number from the keyboard
        enterNumber(number);
    }

    public static int enterNumber(int a) { //Comparison entered number
        if (a == 1) {
            System.out.println("Your number: " + a);
        }
        else {
            if (a == 2) {
                System.out.println("Your number: " + a);
            }
            else {
                if (a == 3){
                    System.out.println("Your number: " + a);
                }
                else {
                    System.out.println("You enter other number, try again");
                }

            }
        }
        return a;
    }
}
