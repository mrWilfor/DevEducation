package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.FormatResult;
import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

public class Cashier extends Thread {
    private FormatResult formatResult;
    private Bank bank;
    private ListOfReport listOfReport = new ListOfReport();

    public Cashier(Bank bank, FormatResult formatResult) {
        super("Cashier");
        this.formatResult = formatResult;
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            if (!bank.getBanker().isAlive() && bank.getLiveDeals().size() == 0 && bank.getCompletedTransactions().size() == 0) {
                writeToFileResult(listOfReport, formatResult);
                break;
            }

            try {
                Transaction transaction;

                Thread.sleep(30);

                if (bank.getBanker().isAlive()) {
                    bank.stopWorkOfBanker();
                    System.out.println("Banker " + bank.getBanker().getState());
                }

                synchronized (bank.getCompletedTransactions()) {
                    while (bank.getCompletedTransactions().size() != 0) {
                        try {
                            transaction = bank.getCompletedTransactions().get(0);
                        } catch (NullPointerException e) {
                            continue;
                        }

                        closeTransaction(transaction);
                        bank.getCompletedTransactions().remove(transaction);
                    }
                }

                if (bank.getBanker().isAlive()) {
                    bank.continueWorkOfBanker();
                    System.out.println("Banker " + bank.getBanker().getState());
                }
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName().concat(" was interrupted"));
            }
        }
    }

    public void closeTransaction(Transaction transaction) {
        if (transaction.getType().equals(TypeOfTransaction.LOAN)) {
            closeLoan(transaction, bank);
        } else if (transaction.getType().equals(TypeOfTransaction.DEPOSIT)) {
            closeDeposit(transaction, bank);
        }
    }

    private void closeLoan(Transaction transaction, Bank bank) {
        Client client = transaction.getClient();
        int moneyOfClient = client.getMoney();
        int valueOfLoan = transaction.getTotalAmount();

        client.setMoney(moneyOfClient - valueOfLoan);
        bank.setCapital(bank.getCapital() + valueOfLoan);
        System.out.println("loan of ".concat(client.getName()).concat(" was closed"));
        ObjectReport report = new ObjectReport(transaction, bank);
        listOfReport.addObjectToReport(report);
    }

    private void closeDeposit(Transaction transaction, Bank bank) {
        Client client = transaction.getClient();
        int moneyOfClient = client.getMoney();
        int valueOfDeposit = transaction.getTotalAmount();


        client.setMoney(moneyOfClient + valueOfDeposit);
        bank.setCapital(bank.getCapital() - valueOfDeposit);
        System.out.println("deposit of ".concat(client.getName()).concat(" was closed"));
        ObjectReport report = new ObjectReport(transaction, bank);
        listOfReport.addObjectToReport(report);
    }

    private void writeToFileResult(ListOfReport listOfReport, FormatResult formatResult) {
        CreateReport createReport = new CreateReport(listOfReport, formatResult);
        createReport.start();
    }
}
