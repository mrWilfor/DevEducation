package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplCustomer;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ImplSecurity extends ImplEmployee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Security {
    public ImplSecurity(String name) {
        super(name, Role.SECURITY);
    }

    @Override
    public boolean checkListOfGoods(ImplCustomer customer) {
        if (customer != null) {
            LinkedList<ImplGoods> cartOfCustomer = customer.getCart();
            HashMap<Long, Boolean> cheque = customer.getCheque();

            if (cartOfCustomer.size() != 0 && cheque.size() == 0) {
                return false;
            }

            for (int i = 0; i < cheque.size(); i++) {
                if (!cheque.get(cartOfCustomer.get(i).getUID())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Security{" + super.toString() + "}";
    }
}
