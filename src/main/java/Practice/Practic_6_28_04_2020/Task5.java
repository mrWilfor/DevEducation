package Practice.Practic_6_28_04_2020;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(averageArray(1, 2, 3, 4, 10));
    }

    public static int averageArray(int... array) {
        int average = 0;
        int difference = 0;
        int element = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average / array.length;

        for (int j = 0; j < array.length; j++) {
            if (array[j] < average) {
                if (difference == 0 && j == 0) {
                    difference = average - array[j];
                    element = array[j];
                } else if ((average - array[j]) <= difference) {
                    difference = average - array[j];
                    element = array[j];
                }
            } else if (array[j] >= average) {
                if (difference == 0 && j == 0) {
                    difference = array[j] - average;
                    element = array[j];
                } else if ((array[j] - average) <= difference) {
                    difference = array[j] - average;
                    element = array[j];
                }
            }
        }
        return element;
    }
}
