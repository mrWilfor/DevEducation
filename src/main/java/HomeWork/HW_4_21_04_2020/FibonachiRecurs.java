/*
This program displays on the screen numbers of fibonacci
* */

package HomeWork.HW_4_21_04_2020;

public class FibonachiRecurs {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibonachi(0, 1, 100);
    }

    public static int fibonachi(int a, int b, int d) {
        int c = a + b;
        a = b;
        b = c;

        if (c > d) {
            return c;
        }
        System.out.println(c);
        return fibonachi(a, b, d);
    }
}
