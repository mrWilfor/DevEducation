package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.Bank;
import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;
import homeWork.hw_8_Parth_3_19_05_2020.departments.SportEquipmentDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.departments.SportsWearDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.departments.TourismDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Administrator;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.ArrayList;

public interface SportingGoodsStore {
    void addSecurityGuard(SecurityGuard securityGuard);

    void deleteSecurityGuard(SecurityGuard securityGuard);

    ArrayList<SecurityGuard> getListOfSecurityGuard();

    SecurityGuard getSecurityGuard(int index);

    void addCashier(Cashier cashier);

    void deleteCashier(Cashier cashier);

    ArrayList<Cashier> getListOfCashier();

    Cashier getCashier(int index);

    void addBuyer(Buyer buyer);

    void deleteBuyer(Buyer buyer);

    ArrayList<Buyer> getListOfBuyers();

    Buyer getBuyer(int index);

    TourismDepartment getTourismDepartment();

    SportEquipmentDepartment getSportEquipmentDepartment();

    SportsWearDepartment getSportsWearDepartment();

    Bank getBank();

    Administrator getAdministrator();

    void enteredIntoShop();

    void enteredIntoDepartment(Department department);

    void cashiersManagment();

    void printListOfCashier();

    void securityManagment();

    void printListOfSecurity();

    void enteredIntoBank();

    void buyersManagment();

    void productsManagment(Department department);

    void createProduct(Department department);

    void consultantManagment(Department department);

    void theBuyerChooseDepartment(Buyer buyer);

    void theBuyerManagment(Buyer buyer, Department department);

    void theBuyerManagmentPayment(Buyer buyer);

    void theBuyerManagmentCheckSecurity(Buyer buyer);

    void printListOfBuyers();

    void outOfShop();
}
