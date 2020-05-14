package practice.practic_4_23_04_2020;

import java.util.Scanner;

public class TeachersRomaKopylovRecursionBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(rec(s));
    }

    private static boolean rec(String s) {
        int first = s.indexOf("(");
        int last = s.lastIndexOf(")");

        if (first == -1 && last == -1) {
            System.out.println(s);
            return true;
        } else if (first != -1 && last != -1) {
            s = s.substring(0, first) + s.substring(first + 1, last) + s.substring(last + 1);
            return rec(s);
        }
        return false;
    }
}
