package HomeWork.HW_7_04_05_2020;

import java.util.Scanner;

public class WordPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkWord(sc));
    }

    public static String checkWord(Scanner scan) {
        String word = scan.nextLine();
        char[] charOfWord = word.toCharArray();
        String result = "";

        for (int i = 0, j = charOfWord.length - 1; i < j; i++, j--) {
            char bufferVariable = charOfWord[i];
            charOfWord[i] = charOfWord[j];
            charOfWord[j] = bufferVariable;
        }
        String reversWord = new String(charOfWord);

        if (word.equals(reversWord)) {
            result = "This word is palindrome";
        } else {
            result = "This word is not palindrome";
        }
        return result;
    }
}
