package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ImplBankTest {

    @Test
    void getListOfDebtors() {
        ImplBank implBank = new ImplBank();
        ImplBuyer implBuyer1 = new ImplBuyer("Miky", 100, true);
        ImplBuyer implBuyer2 = new ImplBuyer("Viky", 100, true);
        ImplBuyer implBuyer3 = new ImplBuyer("Riky", 100, true);
        implBank.banker.issuanceOfCredit(implBuyer1, implBank, 200);
        implBank.banker.issuanceOfCredit(implBuyer2, implBank, 200);
        implBank.banker.issuanceOfCredit(implBuyer3, implBank, 200);

        ArrayList<ImplBuyer> expected = new ArrayList<>();
        expected.add(implBuyer1);
        expected.add(implBuyer2);
        expected.add(implBuyer3);

        assertArrayEquals(expected.toArray(), implBank.getListOfDebtors().toArray());
    }

}