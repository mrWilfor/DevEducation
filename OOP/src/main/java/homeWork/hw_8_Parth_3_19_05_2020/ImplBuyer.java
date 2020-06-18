package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Product;

import java.util.ArrayList;

public class ImplBuyer implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Buyer {
    private String name;
    private int money;
    private int bankCredit = 0;
    private boolean desireToTakeALoan;
    private ArrayList<Product> basket;

    public ImplBuyer() {

    }

    public ImplBuyer(String name, int money, boolean desireToTakeALoan) {
        this.name = name;
        this.money = money;
        this.desireToTakeALoan = desireToTakeALoan;
        this.basket = new ArrayList<>();
    }

    @Override
    public void addProductToBasket(Product product) {
        basket.add(product);
    }

    @Override
    public void deleteProductFromBasket(Product product) {
        basket.remove(product);
    }

    @Override
    public ArrayList<Product> getBasket() {
        return basket;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void setBankCredit(int valueCredit) {
        this.bankCredit += valueCredit;
    }

    @Override
    public int getBankCredit() {
        return bankCredit;
    }

    @Override
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
        return this.money == ((ImplBuyer) o).money &&
                this.name.equals(((ImplBuyer) o).name) &&
                this.bankCredit == ((ImplBuyer) o).bankCredit &&
                this.desireToTakeALoan == ((ImplBuyer) o).desireToTakeALoan;
    }

    @Override
    public int hashCode() {
        return 31 * (name != null ? name.hashCode() : 0) + money + bankCredit +
                (desireToTakeALoan ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", bankCredit='" + bankCredit + '\'' +
                ", desireToTakeALoan='" + desireToTakeALoan + '\'' +
                '}';
    }
}
