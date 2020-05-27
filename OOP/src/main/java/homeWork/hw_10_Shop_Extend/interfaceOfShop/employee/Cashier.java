package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.Customer;

import java.util.HashMap;

public interface Cashier extends Queue {
    int calculatesPurchase(Customer customer);

    boolean checkDiscount(Customer customer);

    void getDiscount(Customer customer);

    HashMap<Long, Boolean> getCheque(Customer customer);
}
