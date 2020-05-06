package Practice.Practic_9_06_05_2020;

public class HowCommonIsTheSymbolHardPractice {
    public static void main(String[] args) {
        String word = "kraken";
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
                }
                else if (array[i] == array[j]) {
                    counter++;
                    array[j] = ' ';
                }
            }
            result = result.concat(String.join("", String.valueOf(array[i]), "=", String.valueOf(counter), "\n"));
            array[i] = ' ';
            counter = 0;
        }
        return result;
    }
}
