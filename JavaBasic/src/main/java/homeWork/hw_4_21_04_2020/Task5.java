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

package homeWork.hw_4_21_04_2020;

public class Task5 {
    public static void main(String[] args) {
        task5(7);
    }

    public static void task5(int secondBorder) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == secondBorder || j == secondBorder) {
                    System.out.print("*  ");
                } else if (i + j == secondBorder + 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
