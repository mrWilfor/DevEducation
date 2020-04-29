package Practice.Practic29_04_2020;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];

        fillArray(arr);

        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillArray(int[][] array) {
        int indexStringOfArrayBegin = 0;
        int indexStringOfArrayEnd = array[0].length - 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == indexStringOfArrayBegin || j == indexStringOfArrayEnd) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
            indexStringOfArrayBegin++;
            indexStringOfArrayEnd--;
        }
        return array;
    }
}
