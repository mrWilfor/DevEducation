package Practice.Practic17_04_20220;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mathematical expression:");
        String mathExpression1 = scan.nextLine();
        String mathExpression2 = mathExpression1.replaceAll(".", " ");
        String mathExpression3 = mathExpression2.replaceAll("+", " ");
        String mathExpression4 = mathExpression3.replaceAll("-", " ");
        String mathExpression5 = mathExpression4.replaceAll("*", " ");
        String mathExpression6 = mathExpression5.replaceAll("/", " ");

        String[] Array = mathExpression6.split("s");

        int length = charArray.length;
    }
    public static int numberDetermination(char[] Array1, int length) {
        int[] numbers = new int[2];
        char operation = '0';
        int result = 0;
        for(int i = 0, j = 0; i > length; i ++) {
            switch (Array1[i]){
                case ('0'):
                    numbers[j] *= 10;
                    break;

                case ('1'):
                    numbers[j] = numbers[j] * 10 + 1;
                    break;

                case ('2'):
                    numbers[j] = numbers[j] * 10 + 2;
                    break;

                case ('3'):
                    numbers[j] = numbers[j] * 10 + 3;
                    break;

                case ('4'):
                    numbers[j] = numbers[j] * 10 + 4;
                    break;

                case ('5'):
                    numbers[j] = numbers[j] * 10 + 5;
                    break;
                case ('6'):
                    numbers[j] = numbers[j] * 10 + 6;
                    break;
                case ('7'):
                    numbers[j] = numbers[j] * 10 + 7;
                    break;
                case ('8'):
                    numbers[j] = numbers[j] * 10 + 8;
                    break;
                case ('9'):
                    numbers[j] = numbers[j] * 10 + 9;
                    break;
                case ('+'):
                    operation = '+';
                    j ++;
                    break;
                case ('-'):
                    operation = '-';
                    j ++;
                    break;
                case ('*'):
                    operation = '*';
                    j ++;
                    break;
                case ('/'):
                    operation = '/';
                    j ++;
                    break;
                case ('%'):
                    operation = '%';
                    j ++;
                    break;
                case (' '):
                    break;
                default:
                    System.out.println("Entered not correctly value, please enter only this chars: 0-9, +, -, *, /, % ");
                    break;
            }
        }
            switch(operation){
                case('+'):
                    result = numbers[0] + numbers[1];
                    break;
                case('-'):
                    result = numbers[0] - numbers[1];
                    break;
                case('*'):
                    result = numbers[0] * numbers[1];
                    break;
                case('/'):
                    result = numbers[0] / numbers[1];
                    break;
                case('%'):
                    result = numbers[0] % numbers[1];
                    break;
                case('0'):
                    System.out.println("");
                    break;
            }
        return 0;
    }
}
