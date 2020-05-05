package HomeWork.HW_6_30_04_2020.Part_2;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AllElementsOfArrayDivideByMaxElementOfArray {
    public static void main(String[] args) {
        double[][] array = {
                {1.0, 2.0, 3.0},
                {1.2, 3.1, 2.5},
                {2.3, 4.5, 4.3}
        };

        System.out.println(Arrays.deepToString(divisionOnMaxElementOfArray(array)));
    }

    public static String[][] divisionOnMaxElementOfArray(double[][] array) {
        DecimalFormat df = new DecimalFormat("0.00");
        String[][] newArray = new String[array.length][array[0].length];
        double maxElement = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 && j == 0) {
                    maxElement = array[i][j];
                }
                else if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (maxElement == 0) {
                System.out.println("Division is impossible, max element of array - 0");
                break;
            }
            else {
                for (int j = 0; j < array[i].length; j++) {
                    newArray[i][j] = df.format(array[i][j] / maxElement);
                }
            }
        }
        return newArray;
    }
}
