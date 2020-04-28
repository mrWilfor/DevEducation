package HomeWork.hw_27_04_2020;

import java.util.Arrays;

public class RearrangementNumbersOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangement(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }

    public static int[] rearrangement(int... array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int bufferVariable = 0;
            bufferVariable = array[i];
            array[i] = array[j];
            array[j] = bufferVariable;
        }
        return array;
    }

}
