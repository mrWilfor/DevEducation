package homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop;

public interface Basket {
    Product[] getListOfProduct();

    void addProduct(Product product);

    void deleteProduct(Product product);
}
