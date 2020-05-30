package homeWork.hw_10_Shop_Extend.interfaceOfShop.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplConsultant;

public interface Administrator {
    void appointConsultant(ImplConsultant consultant, ImplDepartment department);

    void redirectConsultant(
            ImplDepartment departmentThis,
            ImplDepartment departmentFrom1,
            ImplDepartment departmentFrom2
    );
}
