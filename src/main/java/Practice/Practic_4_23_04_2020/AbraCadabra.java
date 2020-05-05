package Practice.Practic_4_23_04_2020;

public class AbraCadabra {
    public static void main(String[] args) {
        f(5);
    }

    private static int f(int i) {
        return (i < 2) ? abc(i) : a(i) + f(i - 2) + b(i) + f(i - 1) + c(i);
    }

    private static int abc(int i) {
        System.out.print(i);
        return i;
    }

    private static int a(int i) {
        System.out.print("(");
        return 0;
    }

    private static int b(int i) {
        System.out.print("+");
        return 0;
    }

    private static int c(int i) {
        System.out.print(")");
        return 0;
    }
}
// ((1+(0+1))+((0+1)+(1+(0+1))))