package HomeWork.hw_27_04_2020;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = spiralFillOfArray(sc);

        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[0].length; j ++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralFillOfArray(Scanner scan) {
        System.out.println("Enter length X:");
        int x = scan.nextInt();
        System.out.println("Enter length X:");
        int y = scan.nextInt();

        int[][] array = new int[y][x];

        int right = array[0].length;
        int down = array.length;
        int left = - 1;
        int up = 0;
        int directionSwitch = 0;
        int arrayLength = (array[0].length * array.length) + 1;
        int index1 = - 1;
        int index2 = - 1;
        int number = 1;
        array[0][0] = 0;

        while (number < arrayLength) {
            if (directionSwitch == 0) {
                index1++;
                index2++;
                while (index2 < right) {
                    array[index1][index2] = number;
                    index2++;
                    number++;
                }
                right--;
                directionSwitch++;
            }
            else if (directionSwitch == 1) {
                index1++;
                index2--;
                    while (index1 < down) {
                        array[index1][index2] = number;
                        index1++;
                        number++;
                    }
                    down--;
                    directionSwitch++;
            }
            else if (directionSwitch == 2) {
                index1--;
                index2--;
                while (index2 > left) {
                    array[index1][index2] = number;
                    index2--;
                    number++;
                }
                left++;
                directionSwitch++;
            }
            else if (directionSwitch == 3) {
                index1--;
                index2++;
                while (index1 > up) {
                    array[index1][index2] = number;
                    index1--;
                    number++;
                }
                up++;
                directionSwitch = 0;
            }
        }
        return array;
    }
}
