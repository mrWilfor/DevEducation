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

public class Task11 {
    public static void main(String[] args) {
        task11();
    }

    public static void task11() {
        int a = 1;
        int b = 4;
        int c = 2;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 0) {
                    System.out.print("*  ");
                }
                else if (j > 3) {
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