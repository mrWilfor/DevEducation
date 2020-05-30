package homeWork.hw_10_Shop_Extend.interfaceOfShop;

import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplConsultant;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;

import java.util.LinkedList;

public interface Department {
    void addGoods(ImplGoods goods);

    void deleteGoods(ImplGoods goods);

    String getName();

    Brand getBrand();

    ImplGoods getGoods(int index);


    ImplConsultant getConsultant(boolean status);

    ImplConsultant getConsultant(int index);

    LinkedList<ImplGoods> getListOfGoods();

    void addConsultant(ImplConsultant consultant);

    void deleteConsultant(ImplConsultant consultant);

    LinkedList<ImplConsultant> getListOfConsultants();
}
