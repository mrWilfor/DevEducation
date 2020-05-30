package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplBank;
import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.product.ImplProduct;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.ArrayList;

public interface Shop {
    void paymentOfBuyer(ImplBuyer implBuyer);

    void takeAProduct(ImplBuyer implBuyer, ImplDepartment implDepartment, int index);

    void consultation(ImplDepartment implDepartment, ImplProduct implProduct);

    boolean checkSecurity(ImplBuyer implBuyer);

    void printList(ArrayList list, String name);

    ImplDepartment getTourismImplDepartment();

    ImplDepartment getSportEquipmentImplDepartment();

    ImplDepartment getSportsWearImplDepartment();

    void addSecurityGuard(SecurityGuard securityGuard);

    void deleteSecurityGuard(SecurityGuard securityGuard);

    ArrayList<SecurityGuard> getListOfSecurityGuard();

    SecurityGuard getSecurityGuard(int index);

    void addCashier(Cashier cashier);

    void deleteCashier(Cashier cashier);

    ArrayList<Cashier> getListOfCashier();

    Cashier getCashier(int index);

    void addBuyer(ImplBuyer implBuyer);

    void deleteBuyer(ImplBuyer implBuyer);

    ArrayList<ImplBuyer> getListOfImplBuyers();

    ImplBuyer getBuyer(int index);

    ImplBank getImplBank();
}
