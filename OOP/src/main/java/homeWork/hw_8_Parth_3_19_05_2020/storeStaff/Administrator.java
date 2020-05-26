package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;

public class Administrator extends Staff {
    public Administrator(String name) {
        super(name, "Administrator", "Shop");
    }

    public void referralConsultant(Department departmentThis, Department departmentFrom1, Department departmentFrom2) {
        Consultant consultant1;
        Consultant consultant2;
        consultant1 = departmentFrom1.getConsultant(true);
        consultant2 = departmentFrom2.getConsultant(true);

        if (consultant1 != null) {
            departmentThis.addConsultant(consultant1);
            departmentFrom1.deleteConsultant(consultant1);
        } else if (consultant2 != null) {
            departmentThis.addConsultant(consultant2);
            departmentFrom2.deleteConsultant(consultant2);
        } else {
            consultant1 = departmentThis.getConsultant(false);
            consultant1.setStatus(true);
        }
    }

    @Override
    public String toString() {
        return "Administrator{" + super.toString() + "}";
    }
}
