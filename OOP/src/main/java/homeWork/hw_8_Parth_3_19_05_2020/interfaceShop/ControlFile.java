package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.Shop;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;

public interface ControlFile {
    void enteredIntoShop();

    void enteredIntoDepartment(Department department);

    void cashiersManagment();

    void securityManagment();

    void enteredIntoBank();

    void buyersManagment();

    void productsManagment(Department department);

    void createProduct(Department department);

    void consultantManagment(Department department);

    void theBuyerChooseDepartment(Buyer buyer);

    void theBuyerManagment(Buyer buyer, Department department);

    void outOfShop();

    Shop getShop();
}