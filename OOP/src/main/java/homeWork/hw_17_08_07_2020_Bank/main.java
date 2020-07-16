package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.FormatResult;

public class main {
    public static void main(String[] args) {
       Bank bank = new Bank(FormatResult.CSV, 10000);
       bank.start();
    }
}
