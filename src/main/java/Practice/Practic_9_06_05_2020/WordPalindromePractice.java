package Practice.Practic_9_06_05_2020;

public class WordPalindromePractice {
    public static void main(String[] args) {
        System.out.println(palindrome("12321"));
    }

    public static boolean palindrome(String str) {
        return new StringBuilder(str).toString().equals(new StringBuilder(str).reverse().toString());
    }
}
