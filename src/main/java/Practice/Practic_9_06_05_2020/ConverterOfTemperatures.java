package practice.practic_9_06_05_2020;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.StringJoiner;

public class ConverterOfTemperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(converter(sc));
    }

    public static String converter(Scanner scan) {
        String stringInput = scan.nextLine().toUpperCase();
        StringJoiner result = new StringJoiner(", ", "{", "}");

        if (stringInput.endsWith("C")) {
            double celsius = Double.parseDouble(stringInput.replace("C", ""));
            String kelvin = String.join(" : ", "\"K\"", "\"" + new BigDecimal(celsius + 273.15)
                    .setScale(2, RoundingMode.HALF_EVEN).toString() + "\"");
            String fahrenheit = String.join(" : ", "\"F\"", "\"" + new BigDecimal(celsius * 1.8 + 32)
                    .setScale(2, RoundingMode.HALF_EVEN).toString() + "\"");
            result.add(kelvin);
            result.add(fahrenheit);
        } else if (stringInput.endsWith("K")) {
            double kelvin = Double.parseDouble(stringInput.replace("K", ""));
            String celsius = String.join(" : ", "\"C\"", "\"" + new BigDecimal(kelvin - 273.15)
                    .setScale(2, RoundingMode.HALF_EVEN).toString() + "\"");
            String fahrenheit = String.join(" : ", "\"F\"", "\"" + new BigDecimal(kelvin * 1.8 - 459.67)
                    .setScale(2, RoundingMode.HALF_EVEN).toString() + "\"");
            result.add(celsius);
            result.add(fahrenheit);
        } else if (stringInput.endsWith("F")) {
            double fahrenheit = Double.parseDouble(stringInput.replace("F", ""));
            String celsius = String.join(" : ", "\"C\"", "\"" + BigDecimal.valueOf((fahrenheit - 32) / 1.8)
                    .setScale(2, RoundingMode.HALF_EVEN).toString() + "\"");
            String kelvin = String.join(" : ", "\"K\"", "\"" + BigDecimal.valueOf((fahrenheit + 459.67) / 1.8)
                    .setScale(2, RoundingMode.HALF_EVEN).toString() + "\"");
            result.add(celsius).add(kelvin);
        } else {
            result.add("Not correctly entered value");
        }
        String prefix = stringInput.concat(" -> ");
        return prefix.concat(result.toString());
    }
}
