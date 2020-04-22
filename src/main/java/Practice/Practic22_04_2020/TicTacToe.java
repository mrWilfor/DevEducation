package Practice.Practic22_04_2020;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        displaysField(makeField());
        ticTacToe(0, makeField());
    }

    public static void ticTacToe(int moveTrigger, char[][] charArray) {
        Scanner scan = new Scanner(System.in);

        if (moveTrigger % 2 == 0) {
            System.out.println("First player enter coordinate");
            System.out.println("Vertically: ");
            int firstCoordinate = scan.nextInt();
            System.out.println("Horizontally: ");
            int secondCoordinate = scan.nextInt();
            charArray[firstCoordinate - 1][secondCoordinate - 1] = 'X';
        }
        else {
            System.out.println("Second player enter coordinate");
            System.out.println("Vertically: ");
            int firstCoordinate = scan.nextInt();
            System.out.println("Horizontally: ");
            int secondCoordinate = scan.nextInt();
            charArray[firstCoordinate - 1][secondCoordinate - 1] = 'O';
        }

        displaysField(charArray);
        if (checkWinner(charArray)) {
            System.out.println("End Game");
        }
        else {
            ticTacToe(moveTrigger +1,charArray);
        }
    }

    public static char[][] makeField() {
        char[][] field = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '*';
            }
        }

        return field;
    }

    public static void displaysField(char[][] charArray) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("   ");
                }
                else if (i == 0) {
                    System.out.print(j + "  ");
                }
                else if (j == 0) {
                    System.out.print(i + "  ");
                }
                else {
                    System.out.print(charArray[i - 1][j - 1] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] charArray) {
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            if (((charArray[0][i] == 'X') && (charArray[1][i] == 'X')) && (charArray[2][i] == 'X')) {
                System.out.println("First players winn");
                result = true;
            }
            else if (((charArray[0][i] == 'O') && (charArray[1][i] == 'O')) && (charArray[2][i] == 'O')) {
                System.out.println("Second players winn");
                result = true;
            }
            else if (((charArray[i][0] == 'X') && (charArray[i][1] == 'X')) && (charArray[i][2] == 'X')) {
                System.out.println("First players winn");
                result = true;
            }
            else if (((charArray[i][0] == 'O') && (charArray[i][1] == 'O')) && (charArray[i][2] == 'O')) {
                System.out.println("Second players winn");
                result = true;
            }
        }

        if (((charArray[0][0] == 'X') && (charArray[1][1] == 'X')) && (charArray[2][2] == 'X')) {
            System.out.println("First players winn");
            result = true;
        }
        else if (((charArray[0][0] == 'O') && (charArray[1][1] == 'O')) && (charArray[2][2] == 'O')) {
            System.out.println("Second players winn");
            result = true;
        }
        else if (((charArray[0][2] == 'X') && (charArray[1][1] == 'X')) && (charArray[2][0] == 'X')) {
            System.out.println("First players winn");
            result = true;
        }
        else if (((charArray[0][2] == 'O') && (charArray[1][1] == 'O')) && (charArray[2][0] == 'O')) {
            System.out.println("Second players winn");
            result = true;
        }

        return result;
    }
}
