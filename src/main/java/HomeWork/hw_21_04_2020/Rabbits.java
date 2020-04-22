package HomeWork.hw_21_04_2020;

public class Rabbits {
    public static void main(String[] args) {
        rabbits (1, 10);
    }

    public static int rabbits(int a, int b) {
        if (a > b) {
            return 0;
        }
        else if (a % 2 == 0) {
            System.out.print("3 ");
        }
        else {
            System.out.print("2 ");
        }
        return rabbits(a + 1, b);
    }
}
