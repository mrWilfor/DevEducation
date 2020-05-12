package HomeWork.HW_7_04_05_2020;

public class SortString {
    public static void main(String[] args) {
        String str1 = "acdlldf, cdlgjdlgjld. bdflk aad aabfsf Algl Adld";

        System.out.println(sortByWordLength(str1));
        System.out.println(firstSymbolSorting(str1));
        System.out.println(firstSymbolAndWordLengthSorting(str1));
        System.out.println(sortByCharacter(str1));
    }

    public static String sortByWordLength(String str) {
        str = str.replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " ");
        String[] arrayOfWords = str.split(" ");
        boolean trigger = true;
        String result = "";

        while (trigger) {
            trigger = false;

            for (int i = 0; i < arrayOfWords.length - 1; i++) {
                for (int j = i + 1; j < arrayOfWords.length; j++) {
                    if (arrayOfWords[i].length() < arrayOfWords[j].length()) {
                        String bufferVariable = arrayOfWords[i];
                        arrayOfWords[i] = arrayOfWords[j];
                        arrayOfWords[j] = bufferVariable;
                        trigger = true;
                    }
                }
            }
        }

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (i == 0) {
                result += arrayOfWords[i];
            } else {
                result = result + " " + arrayOfWords[i];
            }
        }
        return result;
    }

    public static String firstSymbolSorting(String str1) {
        str1 = str1.replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " ");
        String[] arrayOfWords = str1.split(" ");
        String result = "";
        boolean trigger;

        do {
            trigger = false;
            for (int i = 0; i < arrayOfWords.length - 1; i++) {
                if ((int) arrayOfWords[i].charAt(0) > (int) arrayOfWords[i + 1].charAt(0)) {
                    String bufferVariable = arrayOfWords[i];
                    arrayOfWords[i] = arrayOfWords[i + 1];
                    arrayOfWords[i + 1] = bufferVariable;
                    trigger = true;
                }
            }
        } while (trigger);

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (i == 0) {
                result += arrayOfWords[i];
            } else {
                result = result + " " + arrayOfWords[i];
            }
        }
        return result;
    }

    public static String firstSymbolAndWordLengthSorting(String str1) {
        str1 = str1.replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " ");
        String[] arrayOfWords = str1.split(" ");
        String result = "";
        boolean trigger;

        do {
            trigger = false;

            for (int i = 0; i < arrayOfWords.length - 1; i++) {
                if ((int) arrayOfWords[i].charAt(0) == (int) arrayOfWords[i + 1].charAt(0)) {
                    if (arrayOfWords[i].length() < arrayOfWords[i + 1].length()) {
                        String bufferVariable = arrayOfWords[i];
                        arrayOfWords[i] = arrayOfWords[i + 1];
                        arrayOfWords[i + 1] = bufferVariable;
                        trigger = true;
                    }
                } else if ((int) arrayOfWords[i].charAt(0) > (int) arrayOfWords[i + 1].charAt(0)) {
                    String bufferVariable = arrayOfWords[i];
                    arrayOfWords[i] = arrayOfWords[i + 1];
                    arrayOfWords[i + 1] = bufferVariable;
                    trigger = true;
                }
            }
        } while (trigger);

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (i == 0) {
                result += arrayOfWords[i];
            } else {
                result = result + " " + arrayOfWords[i];
            }
        }
        return result;
    }

    public static String sortByCharacter(String str1) {
        str1 = str1.replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " ");
        String[] arrayOfWords = str1.split(" ");
        String result = "";
        boolean trigger;

        do {
            trigger = false;

            for (int i = 0; i < arrayOfWords.length - 1; i++) {
                char[] array1 = arrayOfWords[i].toCharArray();
                char[] array2 = arrayOfWords[i + 1].toCharArray();
                int minLengthWord = 0;

                if (array1.length < array2.length) {
                    minLengthWord = array1.length;
                } else {
                    minLengthWord = array2.length;
                }

                for (int j = 0; j < minLengthWord; j++) {
                    if ((int) array1[j] > (int) array2[j]) {
                        String bufferVariable = arrayOfWords[i];
                        arrayOfWords[i] = arrayOfWords[i + 1];
                        arrayOfWords[i + 1] = bufferVariable;
                        trigger = true;
                        break;
                    } else if ((int) array1[j] < (int) array2[j]) {
                        break;
                    }
                }
            }
        } while (trigger);

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (i == 0) {
                result += arrayOfWords[i];
            } else {
                result = result + " " + arrayOfWords[i];
            }
        }
        return result;
    }
}
