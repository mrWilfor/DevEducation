package modificators.pac1;

public class ClassB {
    private int a = 1;
    public int b = 2;
    int c = 3;
    static private int d = 4;
    static public int e = 5;
    static int f = 6;
    public void main1() {
        System.out.println(" " + a + b + c + d + e + f);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static int getD() {
        return d;
    }

    public static int getE() {
        return e;
    }

    public static int getF() {
        return f;
    }
}
