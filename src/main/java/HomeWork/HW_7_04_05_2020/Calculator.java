package HomeWork.HW_7_04_05_2020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calculating(sc));
    }

    public static String calculating(Scanner scan) {
        DecimalFormat df = new DecimalFormat("0.00");
        String str1 = scan.nextLine();
        String result = "";

        int indexSum = str1.indexOf("+");
        int indexMultiplication = str1.indexOf("*");
        int indexDivision = str1.indexOf("/");
        int indexDivisionByRemainder = str1.indexOf("%");
        int indexSubtraction = str1.indexOf("-");

        if (indexSum != -1) {
            double number1 = Double.parseDouble(str1.substring(0, indexSum));
            double number2 = Double.parseDouble(str1.substring(indexSum + 1));
            double sum = number1 + number2;
            result = result + number1 + " + " + number2 + " = " + sum;
        }
        else if (indexMultiplication != -1) {
            double number1 = Double.parseDouble(str1.substring(0, indexMultiplication));
            double number2 = Double.parseDouble(str1.substring(indexMultiplication + 1));
            double multiplication = number1 * number2;
            String strMultiplication = df.format(multiplication);
            result = result + number1 + " * " + number2 + " = " + strMultiplication;
        }
        else if (indexDivision != -1) {
            double number1 = Double.parseDouble(str1.substring(0, indexDivision));
            double number2 = Double.parseDouble(str1.substring(indexDivision + 1));
            double division = number1 / number2;
            String strDivision = df.format(division);
            result = result + number1 + " / " + number2 + " = " + strDivision;
        }
        else if (indexDivisionByRemainder != -1) {
            double number1 = Double.parseDouble(str1.substring(0, indexDivisionByRemainder));
            double number2 = Double.parseDouble(str1.substring(indexDivisionByRemainder + 1));
            double division = number1 % number2;
            result = result + number1 + " % " + number2 + " = " + division;
        }
        else if (indexSubtraction != -1) {
            if (indexSubtraction == 0) {
                int indexFrontNext = str1.indexOf("-", 1);
                double number1 = Double.parseDouble(str1.substring(0, indexFrontNext));
                double number2 = Double.parseDouble(str1.substring(indexFrontNext + 1));
                double division = number1 - number2;
                result = result + number1 + " - " + number2 + " = " + division;
            }
            if (indexSubtraction != 0) {
                double number1 = Double.parseDouble(str1.substring(0, indexSubtraction));
                double number2 = Double.parseDouble(str1.substring(indexSubtraction + 1));
                double division = number1 - number2;
                result = result + number1 + " - " + number2 + " = " + division;
            }
        }
        return result;
    }
}
