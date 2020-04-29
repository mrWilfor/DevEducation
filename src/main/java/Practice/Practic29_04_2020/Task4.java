package Practice.Practic29_04_2020;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 50, 4, 3},
                {3, 7, 2, 9, 10},
                {11, 12, 13, 20, 51},
                {16, 51, 20, 5, 26},
                {21, 22, 23, 24, 25}
        };
        System.out.println(maxNumberInStringArray(arr, 1));
        System.out.println(maxNumberInColumnArray(arr, 2));
    }

    public static int maxNumberInStringArray(int[][] array, int numberString) {
        int number = 0;

        for(int i = 0; i < array.length; i++) {
                if (array[numberString - 1][i] > number) {
                    number = array[numberString - 1][i];
                }
        }
        return number;
    }

    public static int maxNumberInColumnArray(int[][] array, int numberColumn) {
        int number = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i][numberColumn - 1] > number) {
                number = array[i][numberColumn - 1];
            }
        }
        return number;
    }
}
