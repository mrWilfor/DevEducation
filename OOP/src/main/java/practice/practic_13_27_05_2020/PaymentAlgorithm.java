package practice.practic_13_27_05_2020;

import java.util.ArrayList;

public class PaymentAlgorithm {
    public int payment(ArrayList<Integer> coins, ArrayList<Integer> commissions) {
        int commission = -1;
        int indexCommission = -1;
        int subscriber = 10;
        int debt = 0;

        for (int i = 0; i < coins.size(); i++) {
            if (commissions.size() != 0) {
                for (int j = 0; j < commissions.size(); j++) {
                    if (j == 0) {
                        commission = commissions.get(j);
                        indexCommission = j;
                    } else if (Math.abs(coins.get(i) - commissions.get(j)) < Math.abs(subscriber)) {
                        subscriber = coins.get(i) - commissions.get(j);
                        commission = commissions.get(j);
                        indexCommission = j;
                    }
                }
                System.out.println("first checkpoint commission - " + commission + "\npaid with the coin - " + coins.get(i));
                commissions.remove(indexCommission);
                if (subscriber < 0) {
                    debt += subscriber;
                }
                subscriber = 10;
                indexCommission = -1;
                commission = -1;
            }
        }
        return debt;
    }
}
