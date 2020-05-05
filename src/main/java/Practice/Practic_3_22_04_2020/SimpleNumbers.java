package Practice.Practic_3_22_04_2020;

public class SimpleNumbers {
    public static void main(String[] args) {
        simpleNumbers();
    }

    public static void simpleNumbers() {
        int number = 1;

        while (number < 1000) {
            if (checkNumbers(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    public static boolean checkNumbers(int number) {
        if (number % 2 == 0 && number / 2 > 1) {
            return false;
        }
        else if (number % 3 == 0 && number / 3 > 1) {
            return false;
        }
        else if (number % 5 == 0 && number / 5 > 1) {
            return false;
        }
        else if (number % 7 == 0 && number / 7 > 1) {
            return false;
        }
        else {
            return true;
        }
    }
}
