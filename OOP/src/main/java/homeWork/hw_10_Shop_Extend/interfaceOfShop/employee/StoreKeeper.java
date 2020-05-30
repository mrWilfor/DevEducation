package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.ImplStorage;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;

import java.util.LinkedList;

public interface StoreKeeper {
    void takeTheGoodsToTheWarehouse(LinkedList<ImplGoods> goods);

    void productCountingPlus(ImplGoods implGoods);

    void productCountingMinus(ImplGoods implGoods);

    ImplGoods getGoods(Brand brand, Group group, ImplDepartment department);

    void moveGoodsToTheStore(ImplGoods goods);

    void setImplStorage(ImplStorage storage);

    int getQuantityOfGoodsByBrand(Brand brand);

    int getQuantityOfGoodsByGroup(Group group);

    int getQuantityOfGoodsByDepartment(ImplDepartment department);

    ImplStorage getStorage();
}
