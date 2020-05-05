package HomeWork.HW_7_04_05_2020;

public class ReversWords {
    public static void main(String[] args) {
        String str = "hello, how are you?";
        System.out.println(revers(str));
    }

    public static String revers(String str1) {
        String[] arrayOfStrings = str1.split(" ");
        String str2 = "";

        for (int i = 0; i < arrayOfStrings.length; i++) {
            char[] arrayOfChars = arrayOfStrings[i].toCharArray();
            for (int j = 0, k = arrayOfChars.length - 1; j < k; j++, k--) {
                char bufferVariable = arrayOfChars[j];
                arrayOfChars[j] = arrayOfChars[k];
                arrayOfChars[k] = bufferVariable;
            }
            arrayOfStrings[i] = new String(arrayOfChars);
            if (i == 0) {
                str2 = str2 + arrayOfStrings[i];
            }
            else {
                str2 = str2 + " " + arrayOfStrings[i];
            }
        }
        return str2;
    }
}
