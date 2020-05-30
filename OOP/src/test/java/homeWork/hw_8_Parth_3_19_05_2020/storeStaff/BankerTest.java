package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplBank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BankerTest {

    @Test
    void issuanceOfCredit() {
        ImplBank implBank = new ImplBank();
        ImplBuyer implBuyer = new ImplBuyer("Miky", 100, true);
        implBank.banker.issuanceOfCredit(implBuyer, implBank, 200);
        int expected = 300;
        assertEquals(expected, implBuyer.getMoney());
    }

    @Test
    void issuanceOfCreditNoCredit() {
        ImplBank implBank = new ImplBank();
        ImplBuyer implBuyer = new ImplBuyer("Miky", 100, false);
        implBank.banker.issuanceOfCredit(implBuyer, implBank, 200);
        int expected = 100;
        assertEquals(expected, implBuyer.getMoney());
    }
}