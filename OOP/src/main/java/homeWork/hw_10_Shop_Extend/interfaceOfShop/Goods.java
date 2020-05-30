package homeWork.hw_10_Shop_Extend.interfaceOfShop;

import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;

public interface Goods {
    long getUID();

    String getName();

    Brand getBrand();

    int getPrise();

    Group getGroup();

    Department getDepartment();

    String getInfo();
}
