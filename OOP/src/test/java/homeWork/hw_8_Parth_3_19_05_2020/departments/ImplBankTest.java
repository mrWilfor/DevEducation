package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Bank;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getListOfDebtors() {
        Bank bank = new ImplBank();
        ImplBuyer implBuyer1 = new ImplBuyer("Miky", 100, true);
        ImplBuyer implBuyer2 = new ImplBuyer("Viky", 100, true);
        ImplBuyer implBuyer3 = new ImplBuyer("Riky", 100, true);
        bank.getBanker().issuanceOfCredit(implBuyer1, bank, 200);
        bank.getBanker().issuanceOfCredit(implBuyer2, bank, 200);
        bank.getBanker().issuanceOfCredit(implBuyer3, bank, 200);

        ArrayList<ImplBuyer> expected = new ArrayList<>();
        expected.add(implBuyer1);
        expected.add(implBuyer2);
        expected.add(implBuyer3);

        assertArrayEquals(expected.toArray(), bank.getListOfDebtors().toArray());
    }

}