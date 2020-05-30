package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SecurityGuardTest {

    @Test
    void checkProduct() {
        SportsEquipment dumbbell = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        SportsEquipment punchingBag = new SportsEquipment(
                "punchingBag",
                "red",
                "impact training simulator",
                150
        );
        SportsEquipment expander = new SportsEquipment(
                "expander",
                "green",
                "carpal muscle development simulator",
                50
        );
        ImplBuyer implBuyer = new ImplBuyer("Buyer", 500, true);
        Cashier cashier = new Cashier("miky");
        SecurityGuard securityGuard = new SecurityGuard("Nick");

        implBuyer.addProductToBasket(dumbbell);
        implBuyer.addProductToBasket(punchingBag);
        implBuyer.addProductToBasket(expander);

        cashier.payment(implBuyer);
        assertTrue(securityGuard.checkProduct(implBuyer));
    }

    @Test
    void checkProductFalse() {
        SportsEquipment dumbbell = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        SportsEquipment punchingBag = new SportsEquipment(
                "punchingBag",
                "red",
                "impact training simulator",
                150
        );
        SportsEquipment expander = new SportsEquipment(
                "expander",
                "green",
                "carpal muscle development simulator",
                50
        );
        ImplBuyer implBuyer = new ImplBuyer("Buyer", 500, true);
        SecurityGuard securityGuard = new SecurityGuard("Nick");

        implBuyer.addProductToBasket(dumbbell);
        implBuyer.addProductToBasket(punchingBag);
        implBuyer.addProductToBasket(expander);

        assertFalse(securityGuard.checkProduct(implBuyer));
    }
}