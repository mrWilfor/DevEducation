/*
This program displays on the screen:
                  *
               *  *
            *     *
         *        *
            *     *
               *  *
                  *

* */
package HomeWork.HW_4_21_04_2020;

public class Task10 {
    public static void main(String[] args) {
        task10( 7);
    }

    public static void task10(int secondBorder) {
        int diagonal1 = (secondBorder + 1) / 2;

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == secondBorder) {
                    System.out.print("*  ");
                }
                else if (j < (secondBorder + 1) / 2) {
                    System.out.print("   ");
                }
                else if (i == diagonal1 && j == diagonal1) {
                    System.out.print("*  ");
                    diagonal1++;
                }
                else if (i + j == secondBorder + 1) {
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
