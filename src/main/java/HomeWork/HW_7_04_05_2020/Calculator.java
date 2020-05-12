package HomeWork.HW_7_04_05_2020;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        } else if (indexMultiplication != -1) {
            double number1 = Double.parseDouble(str1.substring(0, indexMultiplication));
            double number2 = Double.parseDouble(str1.substring(indexMultiplication + 1));
            double multiplication = number1 * number2;
            BigDecimal res = new BigDecimal(multiplication).setScale(2, RoundingMode.HALF_EVEN);
            result = result + number1 + " * " + number2 + " = " + res;
        } else if (indexDivision != -1) {
            double number1 = Double.parseDouble(str1.substring(0, indexDivision));
            double number2 = Double.parseDouble(str1.substring(indexDivision + 1));
            double division = number1 / number2;
            BigDecimal res = new BigDecimal(division).setScale(2, RoundingMode.HALF_EVEN);
            result = result + number1 + " / " + number2 + " = " + res;
        } else if (indexDivisionByRemainder != -1) {
            double number1 = Double.parseDouble(str1.substring(0, indexDivisionByRemainder));
            double number2 = Double.parseDouble(str1.substring(indexDivisionByRemainder + 1));
            double division = number1 % number2;
            result = result + number1 + " % " + number2 + " = " + division;
        } else if (indexSubtraction != -1) {
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
