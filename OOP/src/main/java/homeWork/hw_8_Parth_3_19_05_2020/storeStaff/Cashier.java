package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.ImplProduct;

import java.util.ArrayList;

public class Cashier extends ImplStaff {
    public Cashier(String name) {
        super(name, "Cashier", "Shop");
    }

    public int payment(ImplBuyer implBuyer) {
        int task = 0;
        if (implBuyer != null) {
            ArrayList<ImplProduct> basket = implBuyer.getBasket();
            int cost = 0;

            for (ImplProduct implProduct : basket) {
                cost += implProduct.getPrise();
            }

            task = implBuyer.getMoney() - cost;

            if (task >= 0) {
                implBuyer.setMoney(task);

                for (int i = 0; i < basket.toArray().length; i++) {
                    basket.get(i).setStatus(true);
                }
                System.out.println(implBuyer.getName() + "Thank you, for your purchase");
                return 0;
            }
        }
        System.out.println(implBuyer.getName() + " does not have enough money");
        return task * (-1);
    }

    @Override
    public String toString() {
        return "Cashier{" + super.toString() + "}";
    }
}
