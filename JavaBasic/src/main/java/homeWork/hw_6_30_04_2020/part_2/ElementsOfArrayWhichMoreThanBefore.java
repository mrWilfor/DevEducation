package homeWork.hw_6_30_04_2020.part_2;

public class ElementsOfArrayWhichMoreThanBefore {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 9, 4, 7};

        System.out.println(moreThanPrevious(arr));
    }

    public static String moreThanPrevious(int[] array) {
        String result = "";

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                if (result == "") {
                    result = result + array[i];
                } else {
                    result = result + ", " + array[i];
                }
            }
        }
        return result;
    }
}
