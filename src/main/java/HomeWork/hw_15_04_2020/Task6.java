//Задача 6: Тоже самое что и Задача 5 только используем switch
package HomeWork.hw_15_04_2020;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //Reading a number from the keyboard
        enterNumber(number);
    }

    public static int enterNumber(int a) { //Displays number which was enter
        switch(a){
            case (1):
                System.out.println("Your number: " + a);
                break;

            case (2):
                System.out.println("Your number: " + a);
                break;

            case (3):
                System.out.println("Your number: " + a);
                break;

            default :
                System.out.println("You enter other number, try again");
                break;
        }
        return a;
    }
}


