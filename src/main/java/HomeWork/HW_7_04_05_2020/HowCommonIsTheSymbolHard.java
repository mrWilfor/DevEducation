package homeWork.hw_7_04_05_2020;

public class HowCommonIsTheSymbolHard {
    public static void main(String[] args) {
        String word = "krakene";
        System.out.println(checkCharacter(word));
    }

    public static String checkCharacter(String str1) {
        char[] array = str1.toCharArray();
        int counter = 0;
        String result = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                continue;
            }

            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    counter++;
                } else if (array[i] == array[j]) {
                    counter++;
                    array[j] = ' ';
                }
            }

            if (i == 0) {
                result = result + "\"" + array[i] + "\" " + "repeat " + counter + " times";
            } else {
                result = result + ", " + "\"" + array[i] + "\" " + "repeat " + counter + " times";
            }
            array[i] = ' ';
            counter = 0;
        }
        return result;
    }
}
