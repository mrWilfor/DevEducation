package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplCustomer;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplStoreKeeper;

import java.util.HashMap;

public interface Cashier extends Queue {
    int calculatesPurchase(ImplCustomer customer);

    void paymentCustomer(ImplCustomer customer, int purchase, ImplStoreKeeper storeKeeper);

    java.util.Queue<ImplCustomer> getQueue();

    void getDiscount(ImplCustomer customer);

    HashMap<Long, Boolean> getCheque(ImplCustomer customer);
}
