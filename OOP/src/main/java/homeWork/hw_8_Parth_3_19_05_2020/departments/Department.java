package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Staff;

public interface Department {
    void addProduct(Product product);

    void deleteProduct(Product product);

    String getListProduct();

    Product getProduct(int index);

    void addStaff(Staff staff);

    void deleteStaff(Staff staff);

    String getListStaff();

    Staff getStaff(int index);

    Staff getStaff(String position);

    Staff getStaff(String position, boolean status);

    void addBuyer(Buyer buyer);

    void deleteBuyer(Buyer buyer);

    Buyer getBuyer(int number);

    String getListBuyers();

    String getDepartmentName();

}
