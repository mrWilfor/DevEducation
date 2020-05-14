package practice.practic_9_06_05_2020;

public class WordPalindromePractice {
    public static void main(String[] args) {
        System.out.println(palindrome("12321"));
    }

    public static boolean palindrome(String stringOutput) {
        return stringOutput.replaceAll(" ", "")
                .equals(new StringBuilder(stringOutput).reverse().toString());
    }
}
