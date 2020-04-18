public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(2, 2));
        System.out.println(sum(2, -2));
        System.out.println(sum(2.5, 2.5));
        System.out.println(sum(2000000000L, 200000000L));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }
}
