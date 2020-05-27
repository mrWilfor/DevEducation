package practice.practic_13_27_05_2020;

import java.util.ArrayList;

public class OneDay {
    public static void main(String[] args) {
        GenerationCommissions gc = new GenerationCommissions();
        Driver driver = new Driver();
        PaymentAlgorithm paymentAlgorithm = new PaymentAlgorithm();
        ArrayList<Integer> coins = driver.getCoins();
        ArrayList<Integer> commissions = gc.generateCommissions();

        int debt = paymentAlgorithm.payment(coins, commissions);

        System.out.println("Debt of driver = " + Math.abs(debt));
    }
}
