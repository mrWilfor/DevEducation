package Practice.Practic_8_05_05_2020;

import java.util.Scanner;

public class DeleteFromStringRepeatCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(deleteRepeatCharacters(sc));
    }

    public static String deleteRepeatCharacters(Scanner scan) {
        String stringInput = scan.nextLine();
        stringInput = stringInput.replaceAll(" ", "");
        char[] array = stringInput.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = ' ';
                }
            }
        }

        String stringOutput = new String(array);
        stringOutput = stringOutput.replaceAll(" ", "");

        return stringOutput;
    }
}
