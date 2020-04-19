package Practice.Practic17_04_20220;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mathematical expression:");
        String mathExpression1 = scan.nextLine();
        System.out.println(calculator(mathExpression1));
    }

    public static double calculator(String mathExpression1) {
        String[] arrayNum = new String[2];
        char operator = ' ';
        String stringNum1 = "";
        String stringNum2 = "";
        BigDecimal num1;
        BigDecimal num2;
        double result =0.0;

        int index = mathExpression1.indexOf('+'); //Definition arithmetic`s operation and splitting a string into parts
        if (index != -1) {
            arrayNum = mathExpression1.split("\\+");
            operator = '+';
        } else {
            int index1 = mathExpression1.indexOf('-');
            if (index1 != -1) {
                arrayNum = mathExpression1.split("-");
                operator = '-';
            } else {
                int index2 = mathExpression1.indexOf('*');
                if (index2 != -1) {
                    arrayNum = mathExpression1.split("\\*");
                    operator = '*';
                } else {
                    int index3 = mathExpression1.indexOf('/');
                    if (index3 != -1) {
                        arrayNum = mathExpression1.split("/");
                        operator = '/';
                    }
                }
            }

        }
        stringNum1 = arrayNum[0];
            num1 = BigDecimal.valueOf(Double.parseDouble(stringNum1));   // Cast string to Double

        stringNum2 = arrayNum[1];

            num2 = BigDecimal.valueOf(Double.parseDouble(stringNum2));    // Cast string to Double
        if(num2.doubleValue() == 0){
            System.out.println("cannot be divided by zero");
        }
        else {
            switch (operator) {                                             //Arithmetic operation
                case ('+'):
                    BigDecimal result1 = num1.add(num2);
                    result = result1.doubleValue();
                    break;
                case ('-'):
                    BigDecimal result2 = num1.subtract(num2);
                    result = result2.doubleValue();
                    break;
                case ('*'):
                    BigDecimal result3 = num1.multiply(num2);
                    result = result3.doubleValue();
                    break;
                case ('/'):
                    BigDecimal result4 = num1.divide(num2);
                    result = result4.doubleValue();
            }
        }
        return result;
    }
}
