package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Department;

public class Administrator extends ImplStaff {
    public Administrator(String name) {
        super(name, "Administrator", "Shop");
    }

    public void referralConsultant(Department department, Department DepartmentFrom1, Department DepartmentFrom2) {
        Consultant consultant1;
        Consultant consultant2;
        consultant1 = DepartmentFrom1.getConsultant(true);
        consultant2 = DepartmentFrom2.getConsultant(true);

        if (consultant1 != null) {
            department.addConsultant(consultant1);
            DepartmentFrom1.deleteConsultant(consultant1);
        } else if (consultant2 != null) {
            department.addConsultant(consultant2);
            DepartmentFrom2.deleteConsultant(consultant2);
        } else {
            consultant1 = department.getConsultant(false);
            consultant1.setStatus(true);
        }
    }

    @Override
    public String toString() {
        return "Administrator{" + super.toString() + "}";
    }
}
