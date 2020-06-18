package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import java.util.ArrayList;

public interface Buyer {
    void addProductToBasket(Product product);

    void deleteProductFromBasket(Product product);

    ArrayList<Product> getBasket();

    String getName();

    int getMoney();

    void setMoney(int money);

    void setBankCredit(int valueCredit);

    int getBankCredit();

    boolean getDesireToTakeALoan();
}
