package Practice.Practic_6_28_04_2020;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyArray(1, -1, 4, 6, -5, -1, 3, -7)));
    }

    public static int[] copyArray(int... array) {
        int[] newArray = new int[array.length];
        int leftIndexArray = 0;
        int rightIndexArray = array.length - 1;

        for (int i : array) {
            if (i < 0) {
                newArray[leftIndexArray] = i;
                leftIndexArray++;
            }
            else {
                newArray[rightIndexArray] = i;
                rightIndexArray--;
            }
        }
        return newArray;
    }
}
