package practice.practic_13_27_05_2020;

import java.util.ArrayList;

public class GenerationCommissions {
    public ArrayList<Integer> generateCommissions() {
        ArrayList<Integer> result = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            int commission;

            if (i == 0) {
                commission = (int) (Math.random() * 11);
            } else {
                do {
                    commission = (int) (Math.random() * 11);
                } while ((result.get(i - 1) + commission) < 11);
            }
            result.add(commission);
        }
        return result;
    }
}
