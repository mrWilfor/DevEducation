package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;

import java.util.ArrayList;

public class Department implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Department {
    private ArrayList<Product> listOfProduct;
    private ArrayList<Consultant> listOfConsultant;

    public Department() {
        this.listOfProduct = new ArrayList<>();
        this.listOfConsultant = new ArrayList<>();
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
    public void consultation(Product product, Buyer buyer) {

    }

    @Override
    public Consultant getConsultant(int index) {
        return this.listOfConsultant.get(index);
    }

    @Override
    public Consultant getConsultant(boolean status) {
        for (int i = 0; i < listOfConsultant.size(); i++) {
            if (listOfConsultant.get(i).getStatus() == status) {
                return listOfConsultant.get(i);
            }
        }
        return null;
    }
}
