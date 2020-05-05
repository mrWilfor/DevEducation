package HomeWork.HW_5_27_04_2020;

public class MaxRepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 33, 2, 6, 6, 7, 6, 7, 7, 9};
        System.out.println(checkNumbersInArray(arr));
    }

    public static int checkNumbersInArray(int[] array) {
        int number = 0;
        int index = 0;
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < array.length; i++) {
            index = i;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter1++;
                }
            }
            if (counter1 == counter2) {
                if (array[index] > number) {
                    number = array[index];
                }
            }
            else if (counter1 > counter2) {
                counter2 = counter1;
                number = array[index];
            }
            counter1 = 0;
        }
        return number;
    }
}
