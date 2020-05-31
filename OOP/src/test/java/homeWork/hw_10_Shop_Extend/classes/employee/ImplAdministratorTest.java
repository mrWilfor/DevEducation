package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplAdministratorTest {

    @Test
    void appointAConsultant() {
        ImplDepartment department = new ImplDepartment("Cosmetics", Brand.ADIDAS);
        ImplConsultant consultant = new ImplConsultant("Nick");
        ImplAdministrator administrator = new ImplAdministrator("Mike");

        administrator.appointConsultant(consultant,department);

        int expectedQuantityConsultants = 1;
        int actualQuantityConsultants = department.getListOfConsultants().size();

        assertEquals(expectedQuantityConsultants, actualQuantityConsultants);
    }

    @Test
    void redirectConsultants() {
        ImplDepartment department1 = new ImplDepartment("Adidas", Brand.ADIDAS);
        ImplDepartment department2 = new ImplDepartment("Reyvel", Brand.REYVEL);
        ImplDepartment department3 = new ImplDepartment("Cat", Brand.CAT);
        ImplConsultant consultant1 = new ImplConsultant("Nick");
        ImplConsultant consultant2 = new ImplConsultant("Vick");
        ImplConsultant consultant3 = new ImplConsultant("Zick");
        ImplAdministrator administrator = new ImplAdministrator("Mike");

        consultant1.setStatus(false);
        consultant2.setStatus(false);
        department1.addConsultant(consultant1);
        department2.addConsultant(consultant2);
        department3.addConsultant(consultant3);
        administrator.redirectConsultant(department1, department2, department3);

        int expectedQuantityOfConsultants = 2;
        int actualQuantityOfConsultants = department1.getListOfConsultants().size();

        assertEquals(expectedQuantityOfConsultants, actualQuantityOfConsultants);
    }
}