package Practice.Practic_7_29_04_2020;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5, 4, 3},
                {3, 7, 2, 9, 10},
                {11, 12, 13, 20, 51},
                {16, 51, 20, 5, 26},
                {21, 22, 23, 24, 25}
        };
        System.out.println(sameElementsOfArray(arr));
    }

    public static int sameElementsOfArray(int[][] array) {
        int elements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int counter = 0;

                if (j == array[0].length - 1) {
                    for (int k = i + 1; k < array.length; k++) {
                        for (int l = 0; l < array[k].length; l++) {
                            if (array[i][j] == array[k][l]) {
                                counter++;
                            }
                        }
                    }
                } else {
                    for (int k = i; k < array.length; k++) {
                        if (k == i) {
                            for (int l = j + 1; l < array[k].length; l++) {
                                if (array[i][j] == array[k][l]) {
                                    counter++;
                                }
                            }
                        } else {
                            for (int l = 0; l < array[k].length; l++) {
                                if (array[i][j] == array[k][l]) {
                                    counter++;
                                }
                            }
                        }
                    }
                }

                if (counter == 0) {
                    elements++;
                }
            }
        }
        return elements;
    }
}
