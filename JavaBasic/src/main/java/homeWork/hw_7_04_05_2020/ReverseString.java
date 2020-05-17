package homeWork.hw_7_04_05_2020;

public class ReverseString {
    public static void main(String[] args) {
        String string = "Hello, how are you?";

        System.out.println(reverse(string));
    }

    public static String reverse(String str1) {
        char[] array = str1.toCharArray();

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            char bufferVariable = array[i];
            array[i] = array[j];
            array[j] = bufferVariable;
        }

        String str2 = new String(array);
        return str2;
    }
}
