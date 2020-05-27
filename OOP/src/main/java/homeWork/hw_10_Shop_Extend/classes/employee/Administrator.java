package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.enums.Role;
import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Department;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Consultant;

public class Administrator extends Employee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Administrator {


    public Administrator(String name) {
        super(UIDGeneration.getUID(), name, Role.ADMINISTRATOR, null);
    }

    @Override
    public void appointConsultant(Consultant consultant, Department department) {

    }

    @Override
    public void redirectConsultant(Consultant consultant, Department department) {

    }

    @Override
    public String toString() {
        return "Administrator{" + super.toString() + "}";
    }
}
