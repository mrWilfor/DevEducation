package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.initialisation.InitialisationShop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportingGoodsStoreTest {
    public static SportingGoodsStore shop = new SportingGoodsStore();

    @Test
    void takeALoan() {
        InitialisationShop.initialisation(shop);
    }


}