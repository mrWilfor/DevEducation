package Practice.Practic23_04_2020;

import java.util.Scanner;


public class AscendingOrDescending {
    public static void main(String[] args) {
        int sequenceNumbers = scanNumbers();
        System.out.println(sequenceNumbers);
        if (sequenceNumbersInAscending(sequenceNumbers)) {
            System.out.println(sequenceNumbersInAscending(sequenceNumbers));
        }
        else {
            System.out.println(sequenceNumbersInDescending(sequenceNumbers));
        }
    }

    public static boolean sequenceNumbersInAscending(int numbers) {
        int i = numbers % 10;
        numbers /= 10;
        if (numbers == 0) {
            return true;
        }
        else if (i > numbers % 10) {
            return sequenceNumbersInAscending(numbers);
        }
        else {
            return false;
        }
    }

    public static boolean sequenceNumbersInDescending(int numbers) {
        int i = numbers % 10;
        numbers /= 10;
        if (numbers == 0) {
            return true;
        }
        else if (i < numbers % 10) {
            return sequenceNumbersInDescending(numbers);
        }
        else {
            return false;
        }
    }

    public static int scanNumbers() {
        int number = 0;

        Scanner scan = new Scanner(System.in);
        number  = scan.nextInt();

            if(number >= 100)   {
                System.out.println("Soo big number. Entered number < 100");
                return 0;
            }
            else if (number >= 10 && number <100) {
            return 10 * 10 * scanNumbers() + number;
            }
            else if (number != 0) {
                return 10 * scanNumbers() + number;
            }
            else {
                return number;
            }
    }
}
