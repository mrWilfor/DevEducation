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
package HomeWork.hw_21_04_2020;

public class Task10 {
    public static void main(String[] args) {
        task10();
    }

    public static void task10() {
        int a = 3;
        int b = 1;
        int c = 5;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    System.out.print("*  ");
                }
                else if (j < 3) {
                    System.out.print("   ");
                }
                else if (i == a && j == a) {
                    System.out.print("*  ");
                    a++;
                }
                else if (i == b && j == c) {
                    System.out.print("*  ");
                    b++;
                    c--;
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
