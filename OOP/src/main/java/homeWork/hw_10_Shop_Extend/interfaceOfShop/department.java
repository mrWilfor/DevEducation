package homeWork.hw_10_Shop_Extend.interfaceOfShop;

import java.util.ArrayList;

public interface department {
    String getName();

    String getBrand();

    void addGoods(Good good);

    void deleteGoods(Good good);

    ArrayList<Good> getListOfGoods();

    void addConsultant();

    void deleteConsultant();

    ArrayList<Employee> getListOfConsultants();
}
