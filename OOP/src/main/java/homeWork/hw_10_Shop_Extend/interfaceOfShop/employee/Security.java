package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.Customer;

import java.util.HashMap;

public interface Security extends Queue {
    boolean checkListOfGoods(Customer customer);
}
