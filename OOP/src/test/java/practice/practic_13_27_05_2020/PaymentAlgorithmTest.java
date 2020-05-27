package practice.practic_13_27_05_2020;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PaymentAlgorithmTest {

    @Test
    void payment() {
        Driver driver = new Driver();
        ArrayList<Integer> coins = driver.getCoins();
        PaymentAlgorithm paymentAlgorithm = new PaymentAlgorithm();

        ArrayList<Integer> commissions = new ArrayList<>();
        commissions.add(8);
        commissions.add(3);
        commissions.add(10);
        commissions.add(1);
        commissions.add(10);
        commissions.add(4);
        commissions.add(9);
        commissions.add(7);
        commissions.add(5);
        commissions.add(6);

        int actual = paymentAlgorithm.payment(coins, commissions);

        assertEquals(-8, actual);

    }
}