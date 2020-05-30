package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.ImplShop;
import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;

public interface ControlFile {
    void enteredIntoShop();

    void enteredIntoDepartment(ImplDepartment implDepartment);

    void cashiersManagment();

    void securityManagment();

    void enteredIntoBank();

    void buyersManagment();

    void productsManagment(ImplDepartment implDepartment);

    void createProduct(ImplDepartment implDepartment);

    void consultantManagment(ImplDepartment implDepartment);

    void theBuyerChooseDepartment(ImplBuyer implBuyer);

    void theBuyerManagment(ImplBuyer implBuyer, ImplDepartment implDepartment);

    void outOfShop();

    ImplShop getImplShop();
}
