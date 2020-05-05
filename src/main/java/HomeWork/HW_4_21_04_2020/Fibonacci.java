/*
This program displays on the screen numbers of fibonacci
* */

package HomeWork.HW_4_21_04_2020;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }
    public static void fibonacci() {
        int low = 0;
        int mid = 1;
        int high = 0;
        System.out.println(low);
        System.out.println(mid);

        while(high != 89) {
           high = low + mid;
           System.out.println(high);
           low = mid;
           mid = high;
        }
    }
}
