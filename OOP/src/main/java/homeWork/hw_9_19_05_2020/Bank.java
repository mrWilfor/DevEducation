package homeWork.hw_9_19_05_2020;

import homeWork.hw_9_19_05_2020.storeStaff.Staff;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Buyer> listOfDebtors;
    public Banker banker;

    public Bank() {
        this.listOfDebtors = new ArrayList<>();
        this.banker = new Banker("John");
    }

    public String getListOfDebtors() {
        int number = 1;
        String result = "";

        for(Buyer b : listOfDebtors) {
            result = result + number + "\t" + b.toString() + "\n";
            number++;
        }
        return result;
    }

    public class Banker extends Staff {
        public Banker(String name) {
            super(name, "Banker", "Bank");
        }

        public void issuanceOfCredit(Buyer buyer, int lackOfMoney) {
            int credit = buyer.getMoney() + lackOfMoney * (-1);
            buyer.setMoney(credit);
            buyer.setBankCredit(lackOfMoney);
            boolean record = true;

            if (listOfDebtors.contains(buyer)) {
                int index = listOfDebtors.indexOf(buyer);
                listOfDebtors.set(index, buyer);
            } else {
                listOfDebtors.add(buyer);
            }
            System.out.println("you have a loan in the amount of" + credit);
        }
    }
}
