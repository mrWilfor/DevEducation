package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplBank;

import java.util.ArrayList;

public class Banker extends ImplStaff {
    public Banker(String name) {
        super(name, "Banker", "Bank");
    }

    public void issuanceOfCredit(ImplBuyer implBuyer, ImplBank implBank, int lackOfMoney) {
        if (implBuyer.getDesireToTakeALoan()) {
            int credit = implBuyer.getMoney() + lackOfMoney;
            implBuyer.setMoney(credit);
            implBuyer.setBankCredit(lackOfMoney);
            ArrayList<ImplBuyer> listOfDebtors = implBank.getListOfDebtors();

            if (listOfDebtors.contains(implBuyer)) {
                int index = listOfDebtors.indexOf(implBuyer);
                listOfDebtors.set(index, implBuyer);
            } else {
                listOfDebtors.add(implBuyer);
            }
            System.out.println("you have a loan in the amount of" + lackOfMoney);
        }
    }

    @Override
    public String toString() {
        return "Banker{" + super.toString() + "}";
    }
}
