package Practice.Practic22_04_2020;

public class RecursionSumNumber {
    public static void main(String[] args) {
        System.out.println(RecursionSumNumber(126));
    }

    public static int RecursionSumNumber(int number) {
        int sum = 0;
        if(number == 0){
            return sum;
        }

        sum = sum + number % 10;
        number /= 10;

        return RecursionSumNumber(number) + sum;
    }
}
