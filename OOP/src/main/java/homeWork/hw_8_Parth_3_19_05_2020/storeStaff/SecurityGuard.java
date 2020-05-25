package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.Main;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;

import java.util.ArrayList;
import java.util.Objects;

public class SecurityGuard extends Staff {
    Buyer buyer;

    public SecurityGuard(String name) {
        super(name, "Security", "Shop");
        this.buyer = new Buyer();
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void checkProduct(Buyer buyer) {
        if (this.buyer.getName() != null) {
            ArrayList<Product> basketOfBuyer = this.buyer.getBasket();
            for (Product product : basketOfBuyer) {
                if (!product.getStatus()) {
                    System.out.println(this.buyer.getName() + " did not pay for the goods");
                    Main.shop.theBuyerManagmentPayment(buyer);
                    this.buyer = buyer;
                }
            }
            Main.shop.deleteBuyer(this.buyer);
            this.buyer = buyer;
        } else {
            this.buyer = buyer;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        SecurityGuard that = (SecurityGuard) o;

        return Objects.equals(buyer, that.buyer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), buyer);
    }

    @Override
    public String toString() {
        return "Security{" + super.toString() + ", buyer='" +
                (this.buyer != null ? this.buyer.getName() : "") + "\'" + "}";
    }
}
