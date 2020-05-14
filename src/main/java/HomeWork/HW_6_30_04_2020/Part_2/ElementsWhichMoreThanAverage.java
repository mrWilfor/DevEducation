package homeWork.hw_6_30_04_2020.part_2;

public class ElementsWhichMoreThanAverage {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6};

        System.out.println(moreThanAverage(arr));
    }

    public static String moreThanAverage(int[] array) {
        String result = "";
        int average = 0;
        int quantity = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
            quantity++;
        }
        average /= quantity;

        for (int i = 0; i < array.length; i++) {

            if (average < array[i]) {
                if (result == "") {
                    result += array[i];
                } else {
                    result = result + ", " + array[i];
                }
            }
        }
        return result;
    }
}
