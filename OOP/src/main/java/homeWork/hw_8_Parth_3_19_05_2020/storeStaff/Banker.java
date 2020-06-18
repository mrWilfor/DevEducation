package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Bank;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Buyer;

import java.util.ArrayList;

public class Banker extends ImplStaff {
    public Banker(String name) {
        super(name, "Banker", "Bank");
    }

    public void issuanceOfCredit(Buyer buyer, Bank bank, int lackOfMoney) {
        if (buyer.getDesireToTakeALoan()) {
            int credit = buyer.getMoney() + lackOfMoney;
            buyer.setMoney(credit);
            buyer.setBankCredit(lackOfMoney);
            ArrayList<Buyer> listOfDebtors = bank.getListOfDebtors();

            if (listOfDebtors.contains(buyer)) {
                int index = listOfDebtors.indexOf(buyer);
                listOfDebtors.set(index, buyer);
            } else {
                listOfDebtors.add(buyer);
            }
            System.out.println("you have a loan in the amount of" + lackOfMoney);
        }
    }

    @Override
    public String toString() {
        return "Banker{" + super.toString() + "}";
    }
}
