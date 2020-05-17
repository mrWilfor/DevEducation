package practice.practic_8_05_05_2020;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(remove(sc));
    }

    public static String remove(Scanner scan) {
        String stringInput = scan.nextLine();
        String[] array = stringInput.split(" ");
        String result = "";

        for (int i = 0; i < array.length; i++) {
            if (result == "" && array[i].length() != 0) {
                result += array[i];
            } else if (array[i].length() != 0) {
                result = result + " " + array[i];
            }
        }
        return result;
    }
}