// Display the alphabet ASCII. Displays on the screen the correspondence between the characters and their numerical designations.
package Practice.Practic_1_16_04_20220;

public class Alphabet {

    public static void main(String[] args) { // Displays alphabet
        for(int i = 33; i <= 127; i++){
            char a = (char) i;
            System.out.println(a + " - " + i);
        }
    }
}
