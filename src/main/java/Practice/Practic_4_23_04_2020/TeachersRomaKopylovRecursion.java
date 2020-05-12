package Practice.Practic_4_23_04_2020;

public class TeachersRomaKopylovRecursion {
    private static int depth = 0;

    public static void main(String[] args) {
        f(5);
    }

    public static void f(int x) {
        in(x);
        if (check(x)) {
            f(--x);
        }
        out(x);
    }

    private static boolean check(int x) {
        spaces();
        System.out.println("(x > 1): " + (x > 1));
        return x > 1;
    }

    private static void in(int x) {
        spaces();
        System.out.println("(" + x + ")->");
        depth++;
    }

    private static void out(int x) {
        depth--;
        spaces();
        System.out.println("<-(" + x + ")");
    }

    private static void spaces() {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }
}
