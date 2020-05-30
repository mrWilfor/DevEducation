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
}