/*
This program displays on the screen:
*  *  *  *  *  *  *
*  *  *  *  *  *  *
*  *  *  *  *  *  *
*  *  *  *  *  *  *
*  *  *  *  *  *  *
*  *  *  *  *  *  *
*  *  *  *  *  *  *

* */

package HomeWork.hw_21_04_2020;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
