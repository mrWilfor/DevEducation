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

package HomeWork.HW_4_21_04_2020;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
