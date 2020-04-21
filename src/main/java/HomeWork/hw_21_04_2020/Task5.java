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

public class Task5 {
    public static void main(String[] args) {
        task5();
    }

    public static void task5() {
        int a = 1;
        int b = 5;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 6 || j == 6) {
                    System.out.print("*  ");
                }
                else if (i == a && j == b) {
                    System.out.print("*  ");
                    a++;
                    b--;
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
