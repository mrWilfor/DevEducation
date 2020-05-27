package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.enums.Role;
import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Department;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Good;

public class Consultant extends Employee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Consultant {
    private boolean status = true;

    public Consultant(String name, Department department) {
        super(UIDGeneration.getUID(), name, Role.CONSULTANT, department);
    }

    @Override
    public String consultation(Good good) {
        this.status = false;
        return good.getInfo();
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Consultant{" + super.toString() + "}";
    }
}
