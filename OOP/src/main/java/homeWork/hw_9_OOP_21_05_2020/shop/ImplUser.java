package homeWork.hw_9_OOP_21_05_2020.shop;

import homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.Product;

public class ImplUser implements homeWork.hw_9_OOP_21_05_2020.shop.interfaceShop.User {
    private String login;
    private String password;
    private ImplBasket implBasket = new ImplBasket();
    private boolean trigger = false;

    public ImplUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void authorisations(String login, String password) {
        if (login != null && password != null) {
            if (login.equals(this.login) && password.equals(this.password)) {
                System.out.println("Confirmed");
                trigger = true;
            } else {
                System.out.println("Incorrect login or password");
            }
        }
    }

    @Override
    public void outOfAccount() {
        trigger = false;
    }

    @Override
    public ImplBasket getImplBasket() {
        if (trigger) {
            return implBasket;
        }

        System.out.println("log in");
        return null;
    }

    @Override
    public boolean getTrigger() {
        return this.trigger;
    }

    @Override
    public void addProduct(Product product) {
        if(product != null) {
            if (trigger) {
                implBasket.addProduct(product);
            } else {
                System.out.println("log in");
            }
        }
    }

    @Override
    public void deleteProduct(Product product) {
        if (product != null) {
            if (trigger) {
                implBasket.deleteProduct(product);
            } else {
                System.out.println("log in");
            }
        }
    }
}
