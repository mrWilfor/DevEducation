/* Write a method that will take two numbers as a parameter, and as a result
display their sum in the console. Required input options:
1) 2 and 2
2) -2 and 2
3) 2.5 and 2.5
4) 2000000000 and 200000000 * */
package HomeWork.hw_13_04_2020;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(2, 2));
        System.out.println(sum(2, -2));
        System.out.println(sum(2.5, 2.5));
        System.out.println(sum(2000000000L, 200000000L));
    }

    public static int sum(int a, int b) { //Sum integer numbers
        return a + b;
    }

    public static double sum(double a, double b) { //Sum numbers type of double
        return a + b;
    }

    public static long sum(long a, long b) { //Sum numbers type of long
        return a + b;
    }
}
