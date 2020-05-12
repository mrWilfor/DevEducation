package Practice.Practic_6_28_04_2020;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberFourHalve(1, 4, 3, 114, 56, 64, 24, 15, 4)));
        System.out.println(Arrays.toString(squareEvenAndMultiplicationOddBy2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println(Arrays.toString(increaseEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println(Arrays.toString(multiple10(10, 23, 35, 40, 50, 61, 73, 82, 90, 101)));
    }

    public static int[] numberFourHalve(int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 4) {
                array[i] /= 2;
            }
        }
        return array;
    }

    public static int[] squareEvenAndMultiplicationOddBy2(int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] *= array[i];
            } else if (array[i] % 2 != 0) {
                array[i] *= 2;
            }
        }
        return array;
    }

    public static int[] increaseEven(int... array) {
        int a = 3;
        int b = 4;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] += a;
            } else if (i % 2 == 0) {
                array[i] -= b;
            }
        }
        return array;
    }

    public static int[] multiple10(int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }
}
