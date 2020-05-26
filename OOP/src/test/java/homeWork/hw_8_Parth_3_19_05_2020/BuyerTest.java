package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.product.SportsWear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyerTest {

    @Test
    void addProductToBasket() {
        Buyer buyer = new Buyer("Mike", 100, true);
        SportsWear trousers = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        buyer.addProductToBasket(trousers);

        assertEquals(trousers, buyer.getBasket().get(0));
    }
    @Test
    void deleteProductToBasket() {
        Buyer buyer = new Buyer("Mike", 100, true);
        SportsWear trousers = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        buyer.addProductToBasket(trousers);

        int expectedBefore = 1;
        int actualBefore = buyer.getBasket().size();

        assertEquals(expectedBefore, actualBefore);

        buyer.deleteProductFromBasket(trousers);

        int expectedAfter = 0;
        int actualAfter = buyer.getBasket().size();

        assertEquals(expectedAfter, actualAfter);
    }

    @Test
    void equals() {
        Buyer buyer1 = new Buyer("Mike", 100, true);
        Buyer buyer2 = new Buyer("Mike", 100, true);

        assertTrue(buyer1.equals(buyer2));
    }

    @Test
    void equalsFalse() {
        Buyer buyer1 = new Buyer("Mike", 100, true);
        Buyer buyer2 = new Buyer("Amelia", 100, true);

        assertFalse(buyer1.equals(buyer2));
    }

    @Test
    void hashCodeTrue() {
        Buyer buyer1 = new Buyer("Mike", 100, true);
        Buyer buyer2 = new Buyer("Mike", 100, true);

        assertEquals(buyer1.hashCode(), buyer2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Buyer buyer1 = new Buyer("Mike", 100, true);
        Buyer buyer2 = new Buyer("Amelia", 100, true);

        assertNotEquals(buyer1.hashCode(), buyer2.hashCode());
    }

    @Test
    void toStringTrue() {
        Buyer buyer = new Buyer("Mike", 100, true);
        String expected = "Buyer{name='Mike', money='100', bankCredit='0', desireToTakeALoan='true'}";

        assertEquals(expected, buyer.toString());
    }

    @Test
    void toStringFalse() {
        Buyer buyer = new Buyer("Amelia", 100, true);
        String expected = "Buyer{name='Mike', money='100', bankCredit='0', desireToTakeALoan='true'}";

        assertNotEquals(expected, buyer.toString());
    }
}