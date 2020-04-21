/*
This program displays on the screen:
*  *  *  *  *  *  *
   *              *
      *           *
         *        *
            *     *
               *  *
                  *

* */

package HomeWork.hw_21_04_2020;

public class Task6 {
    public static void main(String[] args) {
        task6();
    }

    public static void task6() {
        int a = 1;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || j == 6) {
                    System.out.print("*  ");
                }
                else if (i == a && j == a){
                    System.out.print("*  ");
                    a++;
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
