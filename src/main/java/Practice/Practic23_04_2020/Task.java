package Practice.Practic23_04_2020;

public class Task {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    private static int f(int i) {
        return (i < 2) ? abc(i) : a(i) + f(i - 2) + b(i) + f(i - 1) + c(i);
    }

    private static int abc(int i) {
        System.out.print("a" + i + "b");
        return i;
    }

    private static int a(int i) {
        System.out.print("c" + i + "d");
        return 0;
    }

    private static int b(int i) {
        System.out.print("e" + i + "f");
        return 0;
    }

    private static int c(int i) {
        System.out.print("g" + i + "h");
        return 0;
    }
}
