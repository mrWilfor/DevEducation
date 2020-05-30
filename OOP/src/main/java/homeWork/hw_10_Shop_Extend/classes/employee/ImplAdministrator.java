package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;

public class ImplAdministrator extends ImplEmployee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Administrator {
    public ImplAdministrator(String name) {
        super(name, Role.ADMINISTRATOR);
    }

    @Override
    public void appointConsultant(ImplConsultant consultant, ImplDepartment department) {
        department.addConsultant(consultant);
    }

    @Override
    public void redirectConsultant(
            ImplDepartment departmentThis,
            ImplDepartment departmentFrom1,
            ImplDepartment departmentFrom2
    ) {
        ImplConsultant consultant;
        consultant = departmentFrom1.getConsultant(true);

        if (consultant != null) {
            departmentThis.addConsultant(consultant);
            departmentFrom1.deleteConsultant(consultant);
        }

        consultant = departmentFrom2.getConsultant(true);

        if (consultant != null) {
            departmentThis.addConsultant(consultant);
            departmentFrom2.deleteConsultant(consultant);
        } else {
            consultant = departmentThis.getConsultant(false);
            consultant.setStatus(true);
        }
    }

    @Override
    public String toString() {
        return "Administrator{" + super.toString() + "}";
    }
}
