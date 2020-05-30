package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;

public class ImplConsultant extends ImplEmployee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Consultant {
    private boolean status;
    private ImplDepartment department;

    {
        status = true;
    }

    public ImplConsultant(String name) {
        super(name, Role.CONSULTANT);
    }

    @Override
    public String consultation(ImplGoods goods) {
        this.status = false;
        return goods.getInfo();
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public ImplDepartment getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(ImplDepartment department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ImplConsultant{" + super.toString() + "}";
    }
}
