package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.product.Product;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;

import java.util.ArrayList;

public class Department implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Department {
    private String name;
    private ArrayList<Product> listOfProduct = new ArrayList<>();
    private ArrayList<Consultant> listOfConsultant = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void addProduct(Product product) {
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
    public void printListOfProducts() {
        StringBuilder result = new StringBuilder("Products:");

        for (int i = 0; i < listOfProduct.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(listOfProduct.get(i).toString());
        }
        System.out.println(result);
    }

    @Override
    public Product getProduct(int index) {
        return this.listOfProduct.get(index);
    }

    @Override
    public void addConsultant(Consultant consultant) {
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
    public void printListOfConsultants() {
        StringBuilder result = new StringBuilder("Consultants:");

        for (int i = 0; i < listOfConsultant.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(listOfConsultant.get(i).toString());
        }
        System.out.println(result);
    }

    @Override
    public Consultant getConsultant(int index) {
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

    public String getName() {
        return name;
    }

}
