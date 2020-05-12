package Practice.Practic_6_28_04_2020;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(changesSing(1, -2, 3, -5, 6, -2));
    }

    public static int changesSing(int... array) {
        int counter = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= 0 && array[i - 1] < 0) {
                counter++;
            } else if (array[i] < 0 && array[i - 1] >= 0) {
                counter++;
            }
        }
        return counter;
    }
}
