package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.Customer;

public interface Queue {
    boolean setInTheEndOfTheQueue(Customer customer);

    Customer getFromTheBeginningOfTheQueue();
}
