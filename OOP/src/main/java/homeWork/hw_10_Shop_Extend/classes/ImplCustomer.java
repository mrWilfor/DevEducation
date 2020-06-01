package homeWork.hw_10_Shop_Extend.classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class ImplCustomer implements homeWork.hw_10_Shop_Extend.interfaceOfShop.Customer {
    private String name;
    private int money;
    private boolean isDiscount;
    private int totalPurchases;
    private HashMap<Long, Boolean> cheque;
    private LinkedList<ImplGoods> cart;

    {
        isDiscount = false;
        totalPurchases = 0;
        cheque = new HashMap<>();
        cart = new LinkedList<>();
    }

    public ImplCustomer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void addGoodsToCart(ImplGoods goods) {
        cart.add(goods);
        goods.getDepartment().deleteGoods(goods);
    }

    @Override
    public void deleteGoodsToCart(ImplGoods implGoods) {
        implGoods.getDepartment().addGoods(implGoods);
        cart.remove(implGoods);
    }

    @Override
    public void addTotalPurchases(int totalPurchases) {
        this.totalPurchases += totalPurchases;
    }

    @Override
    public void addToCheque(long uid) {
        cheque.put(uid, true);
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
    public LinkedList<ImplGoods> getCart() {
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
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public boolean getDiscount() {
        return isDiscount;
    }

    @Override
    public void setDiscount(boolean discount) {
        this.isDiscount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplCustomer implCustomer = (ImplCustomer) o;

        return money == implCustomer.money &&
                isDiscount == implCustomer.isDiscount &&
                totalPurchases == implCustomer.totalPurchases &&
                Objects.equals(name, implCustomer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, isDiscount, totalPurchases);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", discount=" + isDiscount +
                ", totalPurchases=" + totalPurchases +
                '}';
    }
}
