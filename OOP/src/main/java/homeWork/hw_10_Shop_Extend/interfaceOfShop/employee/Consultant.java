package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.interfaceOfShop.Good;

public interface Consultant {
    String consultation(Good good);

    void setStatus(boolean status);
}
