package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;

public class ImplConsultant extends ImplEmployee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Consultant {
    private boolean isStatus;
    private ImplDepartment department;

    {
        isStatus = true;
    }

    public ImplConsultant(String name) {
        super(name, Role.CONSULTANT);
    }

    @Override
    public String consultation(ImplGoods goods) {
        this.isStatus = false;
        return goods.getInfo();
    }

    @Override
    public boolean getStatus() {
        return isStatus;
    }

    @Override
    public void setStatus(boolean status) {
        this.isStatus = status;
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
