/*
This program displays on the screen:
*  *  *  *  *  *  *
*                 *
*                 *
*                 *
*                 *
*                 *
*  *  *  *  *  *  *

* */

package HomeWork.hw_21_04_2020;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 || j == 0) || (i == 6 || j == 6)) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
