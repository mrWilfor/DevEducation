package homeWork.hw_10_Shop_Extend.interfaceOfShop;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplStoreKeeper;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;

import java.util.LinkedList;

public interface Storage {
    void addDepartment(ImplDepartment department);

    void deleteDepartment(ImplDepartment department);

    void addGoods(ImplGoods goods);

    ImplGoods getGoods(Brand brand, Group group, ImplDepartment department);

    LinkedList<ImplGoods> getListOfGoodsByBrandAndGroup(Brand brand, Group group);

    ImplDepartment getDepartment(String name);

    ImplStoreKeeper getStoreKeeper();
}
