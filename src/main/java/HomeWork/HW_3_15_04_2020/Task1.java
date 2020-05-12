/*//Task 1. Select strings where explicit casts are required.

int q = 'q';  // 1
char ch2 = q; // 2
short s = 1;  // 3
char ch3 = s; // 4
*/
package HomeWork.HW_3_15_04_2020;

public class Task1 {
    public static void main(String[] args) {
        int q = 'q';  // 1 variable int q assigned number symbol 'q' in Unicode
        char ch2 = (char) q; // 2 variable int q cast to char
        short s = 1;  // 3
        char ch3 = (char) s; // 4 variable short s cast to char

        System.out.println("q = " + q + " ch2 = " + ch2 + " s = " + s + " ch3 = " + ch3);
    }
}
