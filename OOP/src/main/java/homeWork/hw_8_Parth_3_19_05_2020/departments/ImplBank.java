package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Banker;

import java.util.ArrayList;

public class ImplBank implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Bank {
    private ArrayList<ImplBuyer> listOfDebtors = new ArrayList<>();
    public Banker banker = new Banker("John");

    public ImplBank() {

    }

    @Override
    public ArrayList<ImplBuyer> getListOfDebtors() {
        return this.listOfDebtors;
    }

    @Override
    public void printListOfDebtors() {
        int number = 1;
        StringBuilder result = new StringBuilder();

        for (ImplBuyer b : listOfDebtors) {
            result.append(number).append(" - ").append(b.getName()).append(" - ").append(b.getBankCredit()).append("\n");
            number++;
        }
        System.out.println(result);
    }
}
