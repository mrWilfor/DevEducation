package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.Main;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;

import java.util.ArrayList;

public class Cashier extends Staff{

    public Cashier(String name, String department) {
        super(name, "Cashier", department);
    }

    public Cashier(String name, String position, String department) {
        super(name, position, department);
    }

    public void payment(Buyer buyer) {
        ArrayList<Product> basket = buyer.getBasket();
        int cost = 0;

        for (Product product : basket) {
            cost += product.getPrise();
        }

        if (cost <= buyer.getMoney()) {
            int task = buyer.getMoney() - cost;
            buyer.setMoney(task);

            for (int i = 0; i < basket.toArray().length; i++) {
                basket.get(i).setStatus(true);
            }
            System.out.println("Thank you, for your purchase");
        } else {
            System.out.println("you don’t have enough money directing you to the administrator");
            Main.shop.administrator
                    .outOfOrTakeCredit(buyer, buyer.getMoney() - cost, buyer.getDesireToTakeALoan());
        }
    }

    @Override
    public String toString() {
        return "Cashier{" + super.toString() + "}";
    }
}
