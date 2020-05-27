package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.interfaceOfShop.Good;

import java.util.LinkedList;

public interface StoreKeeper {
    void takeTheGoodsToTheWarehouse(LinkedList<Good> goods);

    void distributeGoods(LinkedList<Good> goods);

    void productCounting();

    Good getGood();
}
