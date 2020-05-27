package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.interfaceOfShop.Department;

public interface Employee {
    long getUID();

    String getName();

    String getRole();

    Department getDepartment();

    void setDepartment(Department department);
}
