package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.Customer;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;
import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Department;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Good;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Cashier extends Employee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Cashier {
    private Queue<Customer> queue = new LinkedList<>();

    public Cashier(String name, Department department) {
        super(UIDGeneration.getUID(), name, Role.CASHIER, department);
    }

    @Override
    public int calculatesPurchase(Customer customer) {
        int purchaseAmount = 0;

        if (customer != null) {
            LinkedList<Good> cart = customer.getCart();

            for (Good good : cart) {
                purchaseAmount += good.getPrise();
            }
        }
        return purchaseAmount;
    }

    @Override
    public boolean checkDiscount(Customer customer) {
        if (customer != null && customer.getDiscount()) {
            return false;
        }
        return true;
    }

    @Override
    public void getDiscount(Customer customer) {
        if (customer != null) {
            customer.setDiscount(true);
        }
    }

    @Override
    public HashMap<Long, Boolean> getCheque(Customer customer) {
        if (customer != null) {
            LinkedList<Good> cart = customer.getCart();
            HashMap<Long, Boolean> cheque = new HashMap<>(cart.size());

            for (Good good : cart) {
                cheque.put(good.getUID(), true);
            }
            return cheque;
        }
        return null;
    }

    @Override
    public boolean setInTheEndOfTheQueue(Customer customer) {
        if (customer != null) {
            if (queue.size() < 5) {
                return queue.offer(customer);
            }
        }
        return false;
    }

    @Override
    public Customer getFromTheBeginningOfTheQueue() {
        if (queue.size() != 0) {
            return queue.poll();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cashier{" + super.toString() + "}";
    }
}
