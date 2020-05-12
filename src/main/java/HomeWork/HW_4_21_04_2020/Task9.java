/*
This program displays on the screen:



         *
      *     *
   *           *
*  *  *  *  *  *  *

* */
package HomeWork.HW_4_21_04_2020;

public class Task9 {
    public static void main(String[] args) {
        task9(1, 7);
    }

    public static void task9(int firstBorder, int secondBorder) {
        int diagonal1 = (secondBorder + 1) / 2;

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i < (secondBorder + 1) / 2) {
                    System.out.print("   ");
                } else if (i == diagonal1 && j == diagonal1) {
                    System.out.print("*  ");
                    diagonal1++;
                } else if (i == secondBorder) {
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
