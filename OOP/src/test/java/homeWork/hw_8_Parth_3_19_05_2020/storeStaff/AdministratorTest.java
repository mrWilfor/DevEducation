package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorTest {

    @Test
    void referralConsultant() {
        Administrator administrator = new Administrator("adm");
        Department department1 = new Department("dep1");
        Department department2 = new Department("dep2");
        Department department3 = new Department("dep3");
        Consultant consultant1 = new Consultant("miky", department1.getName());
        Consultant consultant2 = new Consultant("miky", department2.getName());
        Consultant consultant3 = new Consultant("miky", department3.getName());

        department1.addConsultant(consultant1);
        department2.addConsultant(consultant2);
        department3.addConsultant(consultant3);
        consultant1.setStatus(false);
        consultant2.setStatus(false);

        administrator.referralConsultant(department1, department2, department3);

        ArrayList<Consultant> expected = new ArrayList<>();
        expected.add(consultant1);
        expected.add(consultant3);
        ArrayList<Consultant> actual = department1.getListOfConsultant();

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void equals() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("John");

        assertTrue(administrator.equals(administrator2));
    }

    @Test
    void equalsFail() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("Mike");

        assertFalse(administrator.equals(administrator2));
    }

    @Test
    void hashCodeTrue() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("John");

        assertEquals(administrator.hashCode(), administrator2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("Mike");

        assertNotEquals(administrator.hashCode(), administrator2.hashCode());
    }

    @Test
    void toStringTrue() {
        Administrator administrator = new Administrator("John");
        String expected = "Administrator{name='John', position='Administrator', department='Shop'}";

        assertEquals(expected, administrator.toString());
    }

    @Test
    void toStringFalse() {
        Administrator administrator = new Administrator("John");
        String expected = "Administrator{name='John', position='Cashier', department='Shop'}";

        assertNotEquals(expected, administrator.toString());
    }
}