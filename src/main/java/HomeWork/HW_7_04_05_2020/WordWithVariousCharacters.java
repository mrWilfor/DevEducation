package HomeWork.HW_7_04_05_2020;

public class WordWithVariousCharacters {
    public static void main(String[] args) {
        String str = "main function is the most important";
        System.out.println(searchWord(str));
    }

    public static String searchWord(String str1) {
        String[] array = str1.split(" ");
        String[] arrayWords = new String[array.length];
        String maxWord = "";
        String minWord = "";
        String result = "";
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            int quantityRepeat = 0;
            char[] arrayChar = array[i].toCharArray();

            for (int j = 0; j < arrayChar.length - 1; j++) {
                for (int k = j + 1; k < arrayChar.length; k++) {
                    if (arrayChar[j] == arrayChar[k]) {
                        quantityRepeat++;
                    }
                }
            }
            if (quantityRepeat == 0) {
                arrayWords[counter] = array[i];
                counter++;
            }
        }

        if (counter == 0) {
            result = "Words with various characters not found";
        }
        else if (counter == 1) {
            result = arrayWords[0];
        }
        else {
            String[] newArrayWords = new String[counter];
            for (int i = 0; i < newArrayWords.length; i++) {
                newArrayWords[i] = arrayWords[i];
            }

            arrayWords = newArrayWords;

            for (int i = 0; i < arrayWords.length; i++) {
                if (i == 0) {
                    minWord = arrayWords[i];
                    maxWord = arrayWords[i];
                }
                else if (arrayWords[i].length() > maxWord.length()) {
                    maxWord = arrayWords[i];
                }
                else if (arrayWords[i].length() < minWord.length()) {
                    minWord = arrayWords[i];
                }
            }
            result = maxWord + " " + minWord;
        }
        return result;
    }
}
