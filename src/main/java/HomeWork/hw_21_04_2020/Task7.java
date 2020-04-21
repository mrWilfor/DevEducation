/*
This program displays on the screen:
*                 *
   *           *
      *     *
         *
      *     *
   *           *
*                 *

* */

package HomeWork.hw_21_04_2020;

public class Task7 {
    public static void main(String[] args) {
        task7();
    }

    public static void task7() {
        int a = 0;
        int b = 0;
        int c = 6;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == a && j == a) {
                    System.out.print("*  ");
                    a++;
                }
                else if (b == 3 && c == 3) {
                    b++;
                    c--;
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
