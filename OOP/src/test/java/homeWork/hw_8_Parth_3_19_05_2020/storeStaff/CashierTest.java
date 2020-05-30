package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CashierTest {

    @Test
    void payment() {
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
        Buyer buyer = new Buyer("Buyer", 500, true);
        Cashier cashier = new Cashier("miky");

        buyer.addProductToBasket(dumbbell);
        buyer.addProductToBasket(punchingBag);
        buyer.addProductToBasket(expander);

        assertEquals(0, cashier.payment(buyer));
    }

    @Test
    void paymentFail() {
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
        Buyer buyer = new Buyer("Buyer", 100, true);
        Cashier cashier = new Cashier("miky");

        buyer.addProductToBasket(dumbbell);
        buyer.addProductToBasket(punchingBag);
        buyer.addProductToBasket(expander);

        assertEquals(200, cashier.payment(buyer));
    }
}