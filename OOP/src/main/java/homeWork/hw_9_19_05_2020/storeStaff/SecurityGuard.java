package homeWork.hw_9_19_05_2020.storeStaff;

import homeWork.hw_9_19_05_2020.Buyer;
import homeWork.hw_9_19_05_2020.product.Product;

import java.util.ArrayList;

public class SecurityGuard extends Staff {

    public SecurityGuard(String name, String department) {
        super(name, "Security", department);
    }

    public SecurityGuard(String name, String position, String department) {
        super(name, position, department);
    }

    public boolean checkProduct(Buyer buyer) {
        ArrayList<Product> basketOfBuyer = buyer.getBasket();
        for (Product product : basketOfBuyer) {
            if (!product.getStatus()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Security{" + super.toString() + "}";
    }
}
