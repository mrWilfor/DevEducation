package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.Customer;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;
import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Department;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Good;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Security extends Employee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Security {
    private Queue<Customer> queue = new LinkedList<>();

    public Security(String name, Department department) {
        super(UIDGeneration.getUID(), name, Role.SECURITY, department);
    }

    @Override
    public boolean checkListOfGoods(Customer customer) {
        if (customer != null) {
            LinkedList<Good> cartOfCustomer = customer.getCart();
            HashMap<Long, Boolean> cheque = customer.getCheque();

            for (int i = 0; i < cheque.size(); i++) {
                if (!cheque.get(cartOfCustomer.get(i).getUID())) {
                    return false;
                }
            }
        }
        return true;
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
        return "Security{" + super.toString() + "}";
    }
}
