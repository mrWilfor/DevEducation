package homeWork.hw_10_Shop_Extend.interfaceOfShop;

import java.util.HashMap;
import java.util.LinkedList;

public interface Customer {
    String getName();

    int getMoney();

    boolean getDiscount();

    void setDiscount(boolean discount);

    int getTotalPurchases();

    void addTotalPurchases(int totalPurchases);

    void addToCheque(long uid, boolean status);

    HashMap<Long, Boolean> getCheque();

    void addGoodToCart(Good good);

    void deleteGoodToCart(Good good);

    LinkedList<Good> getCart();
}
