package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;

import java.util.ArrayList;

public interface Department {
    void addProduct(Product product);

    void deleteProduct(Product product);

    ArrayList<Product> getListOfProduct();

    void printListOfProducts();

    Product getProduct(int index);

    void addConsultant(Consultant consultant);

    void deleteConsultant(Consultant consultant);

    ArrayList<Consultant> getListOfConsultant();

    void printListOfConsultants();

    Consultant getConsultant(int index);

    Consultant getConsultant(boolean status);
}
