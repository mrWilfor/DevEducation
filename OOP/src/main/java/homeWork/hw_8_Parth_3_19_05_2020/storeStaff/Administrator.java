package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;

public class Administrator extends ImplStaff {
    public Administrator(String name) {
        super(name, "Administrator", "Shop");
    }

    public void referralConsultant(ImplDepartment implDepartmentThis, ImplDepartment implDepartmentFrom1, ImplDepartment implDepartmentFrom2) {
        Consultant consultant1;
        Consultant consultant2;
        consultant1 = implDepartmentFrom1.getConsultant(true);
        consultant2 = implDepartmentFrom2.getConsultant(true);

        if (consultant1 != null) {
            implDepartmentThis.addConsultant(consultant1);
            implDepartmentFrom1.deleteConsultant(consultant1);
        } else if (consultant2 != null) {
            implDepartmentThis.addConsultant(consultant2);
            implDepartmentFrom2.deleteConsultant(consultant2);
        } else {
            consultant1 = implDepartmentThis.getConsultant(false);
            consultant1.setStatus(true);
        }
    }

    @Override
    public String toString() {
        return "Administrator{" + super.toString() + "}";
    }
}
