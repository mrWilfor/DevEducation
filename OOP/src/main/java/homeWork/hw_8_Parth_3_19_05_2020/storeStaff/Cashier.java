package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;

import java.util.ArrayList;

public class Cashier extends Staff {
    public Cashier(String name) {
        super(name, "Cashier", "Shop");
    }

    public int payment(Buyer buyer) {
        int task = 0;
        if (buyer != null) {
            ArrayList<Product> basket = buyer.getBasket();
            int cost = 0;

            for (Product product : basket) {
                cost += product.getPrise();
            }

            task = buyer.getMoney() - cost;

            if (task >= 0) {
                buyer.setMoney(task);

                for (int i = 0; i < basket.toArray().length; i++) {
                    basket.get(i).setStatus(true);
                }
                System.out.println(buyer.getName() + "Thank you, for your purchase");
                return 0;
            }
        }
        System.out.println(buyer.getName() + " does not have enough money");
        return task * (-1);
    }

    @Override
    public String toString() {
        return "Cashier{" + super.toString() + "}";
    }
}
