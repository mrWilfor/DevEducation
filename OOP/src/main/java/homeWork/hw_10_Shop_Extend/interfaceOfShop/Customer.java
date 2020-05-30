package homeWork.hw_10_Shop_Extend.interfaceOfShop;

import java.util.HashMap;
import java.util.LinkedList;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;

public interface Customer {
    String getName();

    int getMoney();

    void setMoney(int money);

    boolean getDiscount();

    void setDiscount(boolean discount);

    int getTotalPurchases();

    void addTotalPurchases(int totalPurchases);

    void addToCheque(long uid);

    HashMap<Long, Boolean> getCheque();

    void addGoodsToCart(ImplGoods implGoods);

    void deleteGoodsToCart(ImplGoods implGoods);

    LinkedList<ImplGoods> getCart();
}
