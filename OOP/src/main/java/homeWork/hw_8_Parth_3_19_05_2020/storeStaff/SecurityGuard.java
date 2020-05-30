package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.ImplProduct;

import java.util.ArrayList;

public class SecurityGuard extends ImplStaff {
    public SecurityGuard(String name) {
        super(name, "SecurityGuard", "Shop");
    }

    public boolean checkProduct(ImplBuyer implBuyer) {
        if (implBuyer.getName() != null) {
            ArrayList<ImplProduct> basketOfBuyer = implBuyer.getBasket();
            for (ImplProduct implProduct : basketOfBuyer) {
                if (!implProduct.getStatus()) {
                    System.out.println(implBuyer.getName() + " did not pay for the goods");
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
