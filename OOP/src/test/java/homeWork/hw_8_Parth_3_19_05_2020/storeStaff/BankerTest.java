package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BankerTest {

    @Test
    void issuanceOfCredit() {
        Bank bank = new Bank();
        Buyer buyer = new Buyer("Miky", 100, true);
        bank.banker.issuanceOfCredit(buyer, bank, 200);
        int expected = 300;
        assertEquals(expected, buyer.getMoney());
    }

    @Test
    void issuanceOfCreditNoCredit() {
        Bank bank = new Bank();
        Buyer buyer = new Buyer("Miky", 100, false);
        bank.banker.issuanceOfCredit(buyer, bank, 200);
        int expected = 100;
        assertEquals(expected, buyer.getMoney());
    }
}