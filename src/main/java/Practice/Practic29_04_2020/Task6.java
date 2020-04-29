package Practice.Practic29_04_2020;

public class Task6 {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 24, 7, 20, 3},
                {4, 12, 25, 8, 16},
                {17, 5, 13, 21, 9},
                {10, 18, 1, 14, 22},
                {23, 6, 19, 2, 15}
        };
        System.out.println(magicSquare(arr));
    }

    public static boolean magicSquare(int[][] array) {
        int sumString = 0;
        int sumColumn = 0;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;

            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
            if (i == 0) {
                sumString = sum;
            }
            else if (sum == sumString) {
                sumString = sum;
            }
            else {
                return false;
            }
        }

        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;

            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            if (i == 0) {
                sumColumn = sum;
            }
            else if (sum == sumColumn) {
                sumColumn = sum;
            }
            else {
                return false;
            }
        }

        for (int i = 0, j = 0; i < array[0].length && j < array.length; i++, j++) {
            sumDiagonal1 += array[i][j];
        }

        for(int i = array[0].length - 1, j = 0; i >= 0 && j < array.length; i--, j++) {
            sumDiagonal2 += array[i][j];
        }
        if((sumString == sumColumn && sumColumn == sumDiagonal1) && sumDiagonal1 == sumDiagonal2) {
            return true;
        }
        else {
            return false;
        }
    }
}
