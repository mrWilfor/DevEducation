/*
This program displays on the screen:
*  *  *  *  *  *  *
*              *
*           *
*        *
*     *
*   *
*

* */

package HomeWork.HW_4_21_04_2020;

public class Task3 {
    public static void main(String[] args) {
        task3(1, 7);
    }

    public static void task3(int firstBorder, int secondBorder) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == firstBorder || j == firstBorder) {
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
