package HomeWork.HW_6_30_04_2020.Part_1;

public class SumElementsOfMainDiagonalLess100 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5, 3},
                {5, 4, 1, 9},
                {7, 10, 2, 4},
                {8, 11, 1, 3}
        };

        System.out.println(sumElementsOfDiagonal(arr));
    }

    public static boolean sumElementsOfDiagonal(int[][] array) {
        boolean result = false;
        int sum = 0;

        if (array.length != array[0].length) {
            result = false;
            System.out.println("Array is not square");
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i][i];
            }
            if (sum < 100) {
                result = true;
            }
        }
        return result;
    }
}
