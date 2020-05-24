package homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop;

public interface Categories {
    String getName();

    Product[] getListOfProduct();

    void addProduct(Product product);

    void deleteProduct(Product product);

    Product getProduct(int index);
}
