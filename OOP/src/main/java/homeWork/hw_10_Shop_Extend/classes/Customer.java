package homeWork.hw_10_Shop_Extend.classes;

import homeWork.hw_10_Shop_Extend.interfaceOfShop.Good;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Customer implements homeWork.hw_10_Shop_Extend.interfaceOfShop.Customer {
    private String name;
    private int money;
    private boolean discount = false;
    private int totalPurchases = 0;
    private HashMap<Long, Boolean> cheque = new HashMap<>();
    private LinkedList<Good> cart = new LinkedList<>();

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void addGoodToCart(Good good) {
        cart.add(good);
    }

    @Override
    public void deleteGoodToCart(Good good) {
        cart.remove(good);
    }

    @Override
    public void addTotalPurchases(int totalPurchases) {
        this.totalPurchases += totalPurchases;
    }

    @Override
    public void addToCheque(long uid, boolean status) {
        cheque.put(uid, status);
    }

    @Override
    public int getTotalPurchases() {
        return totalPurchases;
    }

    @Override
    public HashMap<Long, Boolean> getCheque() {
        return cheque;
    }

    @Override
    public LinkedList<Good> getCart() {
        return cart;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public boolean getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Customer customer = (Customer) o;

        return money == customer.money &&
                discount == customer.discount &&
                totalPurchases == customer.totalPurchases &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, discount, totalPurchases);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", discount=" + discount +
                ", totalPurchases=" + totalPurchases +
                '}';
    }
}
