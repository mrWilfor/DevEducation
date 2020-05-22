package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.product.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class Buyer {
    private String name;
    private int money;
    private int bankCredit = 0;
    private boolean desireToTakeALoan;
    private ArrayList<Product> basket = new ArrayList<>();

    public Buyer (String name, int money, boolean desireToTakeALoan) {
        this.name = name;
        this.money = money;
        this.desireToTakeALoan = desireToTakeALoan;
    }

    public void addProductToBasket(Product product) {
        basket.add(product);
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setBankCredit(int valueCredit) {
        this.money += valueCredit;
        this.bankCredit -= bankCredit;
    }

    public boolean getDesireToTakeALoan() {
        return this.desireToTakeALoan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.money == ((Buyer) o).money &&
               this.name.equals(((Buyer) o).name) &&
                Arrays.equals(this.basket.toArray(), ((Buyer) o).basket.toArray()) &&
                this.bankCredit == ((Buyer) o).bankCredit &&
                this.desireToTakeALoan == ((Buyer) o).desireToTakeALoan;
    }

    @Override
    public int hashCode() {
        return 31 * (name != null ? name.hashCode() : 0) + money + Arrays.hashCode(basket.toArray()) + bankCredit +
                (desireToTakeALoan ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", bankCredit='" + bankCredit + '\'' +
                ", basket='" + Arrays.toString(basket.toArray()) + '\'' +
                ", desireToTakeALoan='" + desireToTakeALoan + '\'' +
                '}';
    }
}
