package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplCustomer;

public interface Queue {
    boolean setInTheEndOfTheQueue(ImplCustomer implCustomer);

    ImplCustomer getFromTheBeginningOfTheQueue();
}
