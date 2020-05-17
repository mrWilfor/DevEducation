package practice.practic_9_06_05_2020;

public class HowCommonIsTheSymbolHardPractice {
    public static void main(String[] args) {
        String word = "kraken";
        System.out.println(checkCharacter(word));
    }

    public static String checkCharacter(String stringInput) {
        char[] arrayOfChars = stringInput.toCharArray();
        int counter = 0;
        String result = "";

        for (int i = 0; i < arrayOfChars.length; i++) {
            if (arrayOfChars[i] == ' ') {
                continue;
            }
            for (int j = 0; j < arrayOfChars.length; j++) {
                if (i == j) {
                    counter++;
                } else if (arrayOfChars[i] == arrayOfChars[j]) {
                    counter++;
                    arrayOfChars[j] = ' ';
                }
            }
            result = result.concat(String.join(
                    "",
                    String.valueOf(arrayOfChars[i]), "=", String.valueOf(counter), "\n")
            );
            arrayOfChars[i] = ' ';
            counter = 0;
        }
        return result;
    }
}
