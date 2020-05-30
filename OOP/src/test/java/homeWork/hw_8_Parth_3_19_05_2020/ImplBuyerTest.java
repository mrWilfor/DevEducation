package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.product.SportsWear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplBuyerTest {

    @Test
    void addProductToBasket() {
        ImplBuyer implBuyer = new ImplBuyer("Mike", 100, true);
        SportsWear trousers = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        implBuyer.addProductToBasket(trousers);

        assertEquals(trousers, implBuyer.getBasket().get(0));
    }
    @Test
    void deleteProductToBasket() {
        ImplBuyer implBuyer = new ImplBuyer("Mike", 100, true);
        SportsWear trousers = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        implBuyer.addProductToBasket(trousers);

        int expectedBefore = 1;
        int actualBefore = implBuyer.getBasket().size();

        assertEquals(expectedBefore, actualBefore);

        implBuyer.deleteProductFromBasket(trousers);

        int expectedAfter = 0;
        int actualAfter = implBuyer.getBasket().size();

        assertEquals(expectedAfter, actualAfter);
    }
}