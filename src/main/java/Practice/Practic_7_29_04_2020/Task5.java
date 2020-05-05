package Practice.Practic_7_29_04_2020;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 50, 4, 3},
                {100, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 5, 20},
                {21, 22, 23, 24, 25}
        };
        System.out.println(twoSameElementsOfArray(arr));
    }

    public static int twoSameElementsOfArray(int[][] array) {
        int element = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {

                if (j == array[0].length - 1) {
                    for (int k = i + 1; k < array.length; k++) {
                        for (int l = 0; l < array[k].length; l++) {
                            if (array[i][j] == array[k][l]) {
                                element = array[i][j];
                                break;
                            }
                        }
                    }
                }
                else {
                    for (int k = i; k < array.length; k++) {
                        for (int l = j + 1; l < array[k].length; l++) {
                            if (array[i][j] == array[k][l]) {
                                element = array[i][j];
                                break;
                            }
                        }
                    }
                }
            }
        }
        return element;
    }
}
