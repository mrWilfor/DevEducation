package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Banker;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Buyer> listOfDebtors;
    public Banker banker;

    public Bank() {
        this.listOfDebtors = new ArrayList<>();
        this.banker = new Banker("John");
    }

    public ArrayList<Buyer> getListOfDebtors() {
        return this.listOfDebtors;
    }

    public String printListOfDebtors() {
        int number = 1;
        StringBuilder result = new StringBuilder();

        for (Buyer b : listOfDebtors) {
            result.append(number).append(" - ").append(b.toString()).append("\n");
            number++;
        }
        return result.toString();
    }
}
