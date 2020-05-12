/*
User enters from 2 numbers and more (check)
����- display the minimum on the screen.
����- display the maximum on the screen.
����- display the sum of all numbers on the screen.
����- display the average value of numbers on the screen.
    */
package Practice.Practic_1_16_04_20220;

import java.util.Scanner;

public class ComparisonNumbers {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers:");
        int amount = scan.nextInt();
        System.out.println("Enter type comparison: \n 1 - max number \n 2 - min number \n 3 - sum numbers \n 4 - average value");
        int typeComparison = scan.nextInt(); //Reading a number from the keyboard
        int[] numbers = new int[amount];

        for (int i = 0; i < amount; i++) { //Saving numbers in array
            numbers[i] = scan.nextInt();
        }
        comparisonNumbers(amount, numbers, typeComparison);
    }

    public static int comparisonNumbers(int amount, int[] numbers, int typeComparison) {

        int j = 0;
        switch (typeComparison) {
            case (1):                              //displays max number
                for (int i = 0; i < amount; i++) {
                    j = Math.max(j, numbers[i]);
                }
                break;

            case (2):                              //displays min number
                for (int i = 0; i < amount; i++) {
                    j = Math.min(j, numbers[i]);
                }
                break;

            case (3):                              //displays sum number
                for (int i = 0; i < amount; i++) {
                    j += numbers[i];
                }
                break;

            case (4):                              //displays average numbers
                for (int i = 0; i < amount; i++) {
                    j += numbers[i];
                }
                j /= amount;
                break;

            default:
                System.out.println("You are not correctly have chosen type comparison!");
                break;
        }

        return j;
    }
}
