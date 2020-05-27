package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.interfaceOfShop.Department;

public interface Administrator {
    public void appointConsultant(Consultant consultant, Department department);

    public void redirectConsultant(Consultant consultant, Department department);
}
