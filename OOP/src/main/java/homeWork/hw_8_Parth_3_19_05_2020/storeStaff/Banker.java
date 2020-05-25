package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.Main;

import java.util.ArrayList;

public class Banker extends Staff {
    public Banker(String name) {
        super(name, "Banker", "Bank");
    }

    public void issuanceOfCredit(Buyer buyer, int lackOfMoney) {
        int credit = buyer.getMoney() + lackOfMoney * (-1);
        buyer.setMoney(credit);
        buyer.setBankCredit(lackOfMoney);
        boolean record = true;
        ArrayList<Buyer> listOfDebtors = Main.shop.getBank().getListOfDebtors();

        if (listOfDebtors.contains(buyer)) {
            int index = listOfDebtors.indexOf(buyer);
            listOfDebtors.set(index, buyer);
        } else {
            listOfDebtors.add(buyer);
        }
        System.out.println("you have a loan in the amount of" + credit);
    }
}
