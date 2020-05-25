package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.Main;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;

import java.util.ArrayList;
import java.util.Objects;

public class Cashier extends Staff {
    Buyer buyer;

    public Cashier(String name) {
        super(name, "Cashier", "Shop");
        this.buyer = new Buyer();
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void payment(Buyer buyer) {
        if (this.buyer.getName() != null) {
            ArrayList<Product> basket = this.buyer.getBasket();
            int cost = 0;

            for (Product product : basket) {
                cost += product.getPrise();
            }

            if (cost <= this.buyer.getMoney()) {
                int task = this.buyer.getMoney() - cost;
                this.buyer.setMoney(task);

                for (int i = 0; i < basket.toArray().length; i++) {
                    basket.get(i).setStatus(true);
                }
                System.out.println("Thank you, for your purchase");

            } else {
                System.out.println(buyer.getName() + " does not have enough money directing to the administrator");
                Main.shop.getAdministrator()
                        .outOfOrTakeCredit(this.buyer, this.buyer.getMoney() - cost, this.buyer.getDesireToTakeALoan());
            }
        }
        this.buyer = buyer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        Cashier cashier = (Cashier) o;

        return Objects.equals(buyer, cashier.buyer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), buyer);
    }

    @Override
    public String toString() {
        return "Cashier{" + super.toString() + ", buyer='" + (this.buyer != null ? this.buyer.getName() : "") + '\'' + "}";
    }
}
