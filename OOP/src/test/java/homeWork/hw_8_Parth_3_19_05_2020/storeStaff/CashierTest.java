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

    @Test
    void equals() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("John");

        assertTrue(cashier.equals(cashier2));
    }

    @Test
    void equalsFail() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("Mike");

        assertFalse(cashier.equals(cashier2));
    }

    @Test
    void hashCodeTrue() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("John");

        assertEquals(cashier.hashCode(), cashier2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("Mike");

        assertNotEquals(cashier.hashCode(), cashier2.hashCode());
    }

    @Test
    void toStringTrue() {
        Cashier cashier = new Cashier("John");
        String expected = "Cashier{name='John', position='Cashier', department='Shop'}";

        assertEquals(expected, cashier.toString());
    }

    @Test
    void toStringFalse() {
        Cashier cashier = new Cashier("John");
        String expected = "Cashier{name='John', position='Security', department='Shop'}";

        assertNotEquals(expected, cashier.toString());
    }
}