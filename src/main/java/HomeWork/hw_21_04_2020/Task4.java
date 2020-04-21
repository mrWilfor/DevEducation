/*
This program displays on the screen:
*
*  *
*     *
*        *
*           *
*              *
*  *  *  *  *  *  *

* */

package HomeWork.hw_21_04_2020;

public class Task4 {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
        int a = 1;
        int b = 1;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6 || j == 0) {
                    System.out.print("*  ");
                }
                else if (i == a && j == b) {
                    System.out.print("*  ");
                    a++;
                    b++;
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
