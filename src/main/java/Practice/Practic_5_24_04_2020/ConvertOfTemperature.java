package practice.practic_5_24_04_2020;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ConvertOfTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convert(sc));
    }

    public static double convert(Scanner scan) {
        String celsius = "C";
        String kelvin = "K";
        String fahrenheit = "F";

        System.out.println("Enter value of temperature:");
        double valueT = scan.nextInt();
        System.out.println("Enter initial units of measure(C - celsius, K - kelvin, F - fahrenheit):");
        String initialUnits = scan.next();
        System.out.println("Enter conversion units of measure(C - celsius, K - kelvin, F - fahrenheit):");
        String conversionUnits = scan.next();

        if (initialUnits.equals(celsius)) {
            if (conversionUnits.equals(kelvin)) {
                valueT += 273.15;
                valueT = new BigDecimal(valueT).setScale(2, RoundingMode.UP).doubleValue();
                return valueT;
            } else if (conversionUnits.equals(fahrenheit)) {
                valueT = valueT * 1.8 + 32;
                valueT = new BigDecimal(valueT).setScale(2, RoundingMode.UP).doubleValue();
                return valueT;
            } else {
                System.out.println("Entered not correctly conversion units");
                return 0;
            }
        } else if (initialUnits.equals(kelvin)) {
            if (conversionUnits.equals(celsius)) {
                valueT -= 273.15;
                valueT = new BigDecimal(valueT).setScale(2, RoundingMode.UP).doubleValue();
                return valueT;
            } else if (conversionUnits.equals(fahrenheit)) {
                valueT = valueT * 1.8 - 459.67;
                valueT = new BigDecimal(valueT).setScale(2, RoundingMode.UP).doubleValue();
                return valueT;
            } else {
                System.out.println("Entered not correctly conversion units");
                return 0;
            }
        } else if (initialUnits.equals(fahrenheit)) {
            if (conversionUnits.equals(kelvin)) {
                valueT = (valueT + 459.67) / 1.8;
                valueT = new BigDecimal(valueT).setScale(2, RoundingMode.UP).doubleValue();
                return valueT;
            } else if (conversionUnits.equals(celsius)) {
                valueT = (valueT - 32) / 1.8;
                valueT = new BigDecimal(valueT).setScale(2, RoundingMode.UP).doubleValue();
                return valueT;
            } else {
                System.out.println("Entered not correctly conversion units");
                return 0;
            }
        } else {
            System.out.println("Entered not correctly initial units");
            return 0;
        }
    }
}
