package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;

public interface Consultant {
    String consultation(ImplGoods goods);

    void setStatus(boolean status);

    boolean getStatus();

    ImplDepartment getDepartment();

    void setDepartment(ImplDepartment department);
}
