package homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop;

public interface User {
    void authorisations(String login, String password);

    void outOfAccount();

    Basket getImplBasket();

    boolean getTrigger();

    void addProduct(Product product);

    void deleteProduct(Product product);
}
