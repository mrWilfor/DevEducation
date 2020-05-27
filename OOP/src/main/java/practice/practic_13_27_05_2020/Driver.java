package practice.practic_13_27_05_2020;

import java.util.ArrayList;

public class Driver {
    private ArrayList<Integer> coins = new ArrayList<>(10);

    public ArrayList<Integer> getCoins() {
        for (int i = 1; i < 11; i++) {
            coins.add(i);
        }
        return coins;
    }

}
