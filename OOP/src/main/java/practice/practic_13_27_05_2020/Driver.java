package practice.practic_13_27_05_2020;

import java.util.ArrayList;

public class Driver {
    public ArrayList<Integer> getCoins() {
        ArrayList<Integer> coins = new ArrayList<>(10);

        for (int i = 1; i < 11; i++) {
            coins.add(i);
        }
        return coins;
    }

}
