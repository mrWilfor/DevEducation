package Practice.Practic22_04_2020;

public class RabbitsSum {
    public static void main(String[] args) {
        System.out.println(rabbits(5));
    }

    public static int rabbits(int requiredNumberRabbit) {
        int sumEars = 0;
        if (requiredNumberRabbit == 0) {
            return sumEars;
        }
        else if (requiredNumberRabbit % 2 == 0) {
            sumEars += 3;
        }
        else {
            sumEars += 2;

        }
        return rabbits(requiredNumberRabbit - 1) + sumEars;
    }
}
