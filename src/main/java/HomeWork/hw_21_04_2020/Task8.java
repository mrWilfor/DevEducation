/*
This program displays on the screen:
*  *  *  *  *  *  *
   *           *
      *     *
         *




* */
package HomeWork.hw_21_04_2020;

public class Task8 {
    public static void main(String[] args) {
        task8(1, 7);
    }

    public static void task8(int firstBorder, int secondBorder) {
        int line = firstBorder;

        for(int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i > (secondBorder + 1) / 2) {
                    System.out.print("   ");
                }
                else if (i == firstBorder && j == firstBorder) {
                    System.out.print("*  ");
                    firstBorder++;
                }
                else if (i + j == secondBorder +1) {
                    System.out.print("*  ");
                }
                else if (i == line) {
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
