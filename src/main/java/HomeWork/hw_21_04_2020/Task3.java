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

package HomeWork.hw_21_04_2020;

public class Task3 {
    public static void main(String[] args) {
        task3();
    }

    public static void task3() {
        int a = 1;
        int b = 5;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("*  ");
                }
                else if (i == a && j == b){
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
