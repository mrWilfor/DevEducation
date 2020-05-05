package Practice.Practic_8_05_04_2020;

import java.util.Scanner;

public class DeleteFromStringRepeatCharacters {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println(deleteRepeatCharacters(sc));
    }

    public static String deleteRepeatCharacters(Scanner scan) {
        String str1 = scan.nextLine();
        str1 = str1.replaceAll(" ", "");
        char[] array = str1.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = ' ';
                }
            }
        }

        str1 = new String(array);
        str1 = str1.replaceAll(" ", "");

        return str1;
    }
}
