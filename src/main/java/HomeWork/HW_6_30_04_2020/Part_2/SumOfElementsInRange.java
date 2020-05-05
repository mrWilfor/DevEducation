package HomeWork.HW_6_30_04_2020.Part_2;

public class SumOfElementsInRange {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 5, 9, 10, 1, 7, 3};

        System.out.println(sumAndQuantity(arr, 5, 7));
    }

    public static String sumAndQuantity(int[] array, int firstIndexOfRange, int secondIndexOfRange) {
        String part1 = "Sum: ";
        String part2 = ", quantity: ";
        int sum = 0;
        int quantity = 0;

        if ((firstIndexOfRange < 0 || secondIndexOfRange > array.length) || firstIndexOfRange > secondIndexOfRange) {
            return "Invalid range";
        }
        for (int i = firstIndexOfRange; i <= secondIndexOfRange; i++) {
            sum += array[i];
            quantity++;
        }
        part1 += sum;
        part2 += quantity;
        return part1 + part2;
    }
}
