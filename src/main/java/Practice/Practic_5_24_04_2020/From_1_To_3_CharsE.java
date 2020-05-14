package practice.practic_5_24_04_2020;

import java.util.Scanner;

public class From_1_To_3_CharsE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stringE(sc);
    }

    public static boolean stringE(Scanner scan) {
        String str = scan.nextLine();
        int checkE = 0;

        while (str.indexOf("e") != -1) {
            str = str.substring(0, str.indexOf("e")) + str.substring(str.indexOf("e") + 1);
            checkE++;
        }

        if (checkE <= 3) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
