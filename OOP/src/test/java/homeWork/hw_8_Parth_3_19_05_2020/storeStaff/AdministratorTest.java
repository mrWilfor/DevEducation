package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorTest {

    @Test
    void referralConsultant() {
        Administrator administrator = new Administrator("adm");
        ImplDepartment implDepartment1 = new ImplDepartment("dep1");
        ImplDepartment implDepartment2 = new ImplDepartment("dep2");
        ImplDepartment implDepartment3 = new ImplDepartment("dep3");
        Consultant consultant1 = new Consultant("miky", implDepartment1.getName());
        Consultant consultant2 = new Consultant("miky", implDepartment2.getName());
        Consultant consultant3 = new Consultant("miky", implDepartment3.getName());

        implDepartment1.addConsultant(consultant1);
        implDepartment2.addConsultant(consultant2);
        implDepartment3.addConsultant(consultant3);
        consultant1.setStatus(false);
        consultant2.setStatus(false);

        administrator.referralConsultant(implDepartment1, implDepartment2, implDepartment3);

        ArrayList<Consultant> expected = new ArrayList<>();
        expected.add(consultant1);
        expected.add(consultant3);
        ArrayList<Consultant> actual = implDepartment1.getListOfConsultant();

        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}