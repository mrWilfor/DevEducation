package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.product.ImplProduct;

import java.util.ArrayList;

public interface Buyer {
    void addProductToBasket(ImplProduct implProduct);

    void deleteProductFromBasket(ImplProduct implProduct);

    ArrayList<ImplProduct> getBasket();

    String getName();

    int getMoney();

    void setMoney(int money);

    void setBankCredit(int valueCredit);

    int getBankCredit();

    boolean getDesireToTakeALoan();
}
