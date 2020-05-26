package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Banker;

import java.util.ArrayList;

public class Bank implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Bank {
    private ArrayList<Buyer> listOfDebtors = new ArrayList<>();
    public Banker banker = new Banker("John");

    public Bank() {

    }

    @Override
    public ArrayList<Buyer> getListOfDebtors() {
        return this.listOfDebtors;
    }

    @Override
    public void printListOfDebtors() {
        int number = 1;
        StringBuilder result = new StringBuilder();

        for (Buyer b : listOfDebtors) {
            result.append(number).append(" - ").append(b.getName()).append(" - ").append(b.getBankCredit()).append("\n");
            number++;
        }
        System.out.println(result);
    }
}
