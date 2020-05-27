package homeWork.hw_10_Shop_Extend.interfaceOfShop;

import homeWork.hw_10_Shop_Extend.classes.employee.Consultant;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Employee;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Department {
    String getName();

    String getBrand();

    void addGoods(Good good);

    void deleteGoods(Good good);

    LinkedList<Good> getListOfGoods();

    void addConsultant(Consultant consultant);

    void deleteConsultant(Consultant consultant);

    ArrayList<Consultant> getListOfConsultants();
}
