package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Product;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;

import java.util.ArrayList;

public class ImplDepartment implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Department {
    private String name;
    private ArrayList<Product> listOfProduct = new ArrayList<>();
    private ArrayList<Consultant> listOfConsultant = new ArrayList<>();

    public ImplDepartment(String name) {
        this.name = name;
    }

    @Override
    public void addProduct(Product product) {
        product.setNameOfDepartment(this);
        this.listOfProduct.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        this.listOfProduct.remove(product);
    }

    @Override
    public ArrayList<Product> getListOfProduct() {
        return this.listOfProduct;
    }

    @Override
    public Product getProduct(int index) {
        if (index >= listOfProduct.size() || index < 0) {
            System.out.println("Not correctly number of consultant");
            return null;
        }

        Product product = listOfProduct.get(index);
        deleteProduct(listOfProduct.get(index));
        return product;
    }

    @Override
    public void addConsultant(Consultant consultant) {
        consultant.setStatus(true);
        this.listOfConsultant.add(consultant);
    }

    @Override
    public void deleteConsultant(Consultant consultant) {
        this.listOfConsultant.remove(consultant);
    }

    @Override
    public ArrayList<Consultant> getListOfConsultant() {
        return listOfConsultant;
    }

    @Override
    public Consultant getConsultant(int index) {
        if (index >= listOfConsultant.size() || index < 0) {
            System.out.println("Not correctly number of consultant");
            return null;
        }

        return this.listOfConsultant.get(index);
    }

    @Override
    public Consultant getConsultant(boolean status) {
        for (Consultant consultant : listOfConsultant) {
            if (consultant.getStatus() == status) {
                return consultant;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
