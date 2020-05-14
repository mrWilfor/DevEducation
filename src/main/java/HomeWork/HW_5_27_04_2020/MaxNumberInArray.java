package homeWork.hw_5_27_04_2020;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 1, 9, 12, 6, 5, 0};

        System.out.println("Max number in array: " + maxNumber(arr));
    }

    public static int maxNumber(int[] array) {
        int number = 0;

        for (int i : array) {
            if (i > number) {
                number = i;
            }
        }
        return number;
    }
}
