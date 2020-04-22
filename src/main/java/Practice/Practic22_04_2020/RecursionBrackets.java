package Practice.Practic22_04_2020;

import java.util.*;

public class RecursionBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        System.out.println(checkBrackets(string));
    }

    public static boolean checkBrackets(String string) {
        int bracket1 = string.indexOf('(');
        int bracket2 = string.indexOf(')');

        if ((bracket1 != -1) && (bracket2 != -1)) {
            String newString = string.replaceFirst("\\(", "");
            newString = newString.replaceFirst("\\)", "");
            return checkBrackets(newString);
        }
        else if ((bracket1 == -1) && (bracket2 == -1)) {
            return true;
        }
        else {
            return false;
        }
    }
}
