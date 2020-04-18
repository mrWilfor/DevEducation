//Вывод на экран алфавит ASCII. Вывод на экран соответствий между символами и их численными обозначениями.
package Practice.Practic16_04_20220;

public class Alphabet {

    public static void main(String[] args) { // Displays alphabet
        for(int i = 33; i <= 127; i++){
            char a = (char) i;
            System.out.println(a + " - " + i);
        }
    }
}
