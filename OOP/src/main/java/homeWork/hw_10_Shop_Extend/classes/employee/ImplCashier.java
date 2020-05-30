package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplCustomer;
import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ImplCashier extends ImplEmployee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Cashier {
    private Queue<ImplCustomer> queue;

    {
        queue = new LinkedList<>();
    }

    public ImplCashier(String name) {
        super(name, Role.CASHIER);
    }

    @Override
    public int calculatesPurchase(ImplCustomer customer) {
        int purchaseAmount = 0;

        if (customer != null) {
            LinkedList<ImplGoods> cart = customer.getCart();

            for (ImplGoods implGoods : cart) {
                purchaseAmount += implGoods.getPrise();
            }
        }
        return purchaseAmount;
    }

    @Override
    public void paymentCustomer(ImplCustomer customer, int purchase, ImplStoreKeeper storeKeeper) {
        if (customer.getMoney() >= purchase) {
            customer.setMoney(customer.getMoney() - purchase);
            customer.addTotalPurchases(customer.getTotalPurchases() + purchase);

            for (ImplGoods goods : customer.getCart()) {
                Brand brand = goods.getBrand();
                Group group = goods.getGroup();
                ImplDepartment department = goods.getDepartment();
                ImplGoods goodsFromStorage = storeKeeper.getGoods(brand, group, department);

                storeKeeper.moveGoodsToTheStore(goodsFromStorage);
                storeKeeper.productCountingMinus(goodsFromStorage);

                customer.getCheque().put(goods.getUID(), true);
            }
        } else {
            LinkedList<ImplGoods> cart = customer.getCart();
            ImplGoods goods = cart.getFirst();

            goods.getDepartment().addGoods(goods);
            cart.remove(goods);
            paymentCustomer(customer, purchase, storeKeeper);
        }
    }

    @Override
    public boolean setInTheEndOfTheQueue(ImplCustomer customer) {
        if (customer != null) {
            if (queue.size() < 5) {
                return queue.offer(customer);
            }
        }
        return false;
    }

    @Override
    public ImplCustomer getFromTheBeginningOfTheQueue() {
        if (queue.size() != 0) {
            return queue.poll();
        }
        return null;
    }

    @Override
    public java.util.Queue<ImplCustomer> getQueue() {
        return this.queue;
    }

    @Override
    public void getDiscount(ImplCustomer customer) {
        if (customer != null) {
            customer.setDiscount(true);
        }
    }

    @Override
    public HashMap<Long, Boolean> getCheque(ImplCustomer customer) {
        if (customer != null) {
            LinkedList<ImplGoods> cart = customer.getCart();
            HashMap<Long, Boolean> cheque = new HashMap<>(cart.size());

            for (ImplGoods good : cart) {
                cheque.put(good.getUID(), true);
            }
            return cheque;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cashier{" + super.toString() + "}";
    }
}
