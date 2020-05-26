package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Bank;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.ArrayList;

public interface Shop {
    void paymentOfBuyer(Buyer buyer);

    void takeAProduct(Buyer buyer, Department department, int index);

    void consultation(Department department, Product product);

    boolean checkSecurity(Buyer buyer);

    void printList(ArrayList list, String name);

    Department getTourismDepartment();

    Department getSportEquipmentDepartment();

    Department getSportsWearDepartment();

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

    Bank getBank();
}
