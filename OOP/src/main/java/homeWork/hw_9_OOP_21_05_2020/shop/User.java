package homeWork.hw_9_OOP_21_05_2020.shop;

import homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Product;

public class User implements homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.User {
    private String login;
    private String password;
    private Basket basket;
    private boolean trigger;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.trigger = false;
        this.basket = new Basket();
    }

    @Override
    public void authorisations(String login, String password) {
        if (login.equals(this.login) && password.equals(this.password)) {
            System.out.println("Confirmed");
            trigger = true;
        } else {
            System.out.println("Incorrect login or password");
        }
    }

    @Override
    public Basket getBasket() {
        if (trigger) {
            return basket;
        } else {
            System.out.println("log in");
            return null;
        }
    }

    @Override
    public boolean getTrigger() {
        return this.trigger;
    }

    @Override
    public void addProduct(Product product) {
        if (trigger) {
            basket.addProduct(product);
        } else {
            System.out.println("log in");
        }
    }

    @Override
    public void deleteProduct(Product product) {
        if (trigger) {
            basket.deleteProduct(product);
        } else {
            System.out.println("log in");
        }
    }

    @Override
    public void outOfAccount() {
        trigger = false;
    }
}
