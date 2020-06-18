package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Product;

import java.util.ArrayList;

public class SecurityGuard extends ImplStaff {
    public SecurityGuard(String name) {
        super(name, "SecurityGuard", "Shop");
    }

    public boolean checkProduct(Buyer buyer) {
        if (buyer.getName() != null) {
            ArrayList<Product> basketOfBuyer = buyer.getBasket();
            for (Product product : basketOfBuyer) {
                if (!product.getStatus()) {
                    System.out.println(buyer.getName() + " did not pay for the goods");
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SecurityGuard{" + super.toString() + "}";
    }
}
