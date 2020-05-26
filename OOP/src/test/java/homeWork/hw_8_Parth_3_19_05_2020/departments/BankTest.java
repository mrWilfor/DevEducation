package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getListOfDebtors() {
        Bank bank = new Bank();
        Buyer buyer1 = new Buyer("Miky", 100, true);
        Buyer buyer2 = new Buyer("Viky", 100, true);
        Buyer buyer3 = new Buyer("Riky", 100, true);
        bank.banker.issuanceOfCredit(buyer1, bank, 200);
        bank.banker.issuanceOfCredit(buyer2, bank, 200);
        bank.banker.issuanceOfCredit(buyer3, bank, 200);

        ArrayList<Buyer> expected = new ArrayList<>();
        expected.add(buyer1);
        expected.add(buyer2);
        expected.add(buyer3);

        assertArrayEquals(expected.toArray(), bank.getListOfDebtors().toArray());
    }

}