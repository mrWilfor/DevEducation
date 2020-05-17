package homeWork.hw_6_30_04_2020.part_2;

public class AverageOfElementsOfArrayInstalledOnOddIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 5, 7, 4, 6};

        System.out.println(averageEven(arr));
    }

    public static int averageEven(int[] array) {
        int sum = 0;

        for (int i = 1; i < array.length; i += 2) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
