package practice.practic_13_27_05_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class OneDay {
    public static void main(String[] args) {
        GenerationCommissions gc = new GenerationCommissions();
        Driver driver = new Driver();
        PaymentAlgorithm paymentAlgorithm = new PaymentAlgorithm();
        ArrayList<Integer> coins = driver.getCoins();
        ArrayList<Integer> commissions = gc.generateCommissions();

        System.out.println("Coins: " + Arrays.toString(coins.toArray()));
        System.out.println("Commissions: " + Arrays.toString(commissions.toArray()));

        int debt = paymentAlgorithm.payment(coins, commissions);

        System.out.println("Debt of driver = " + Math.abs(debt));
    }
}
