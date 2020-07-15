package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.FormatResult;
import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

public class Cashier extends Thread {
    private FormatResult formatResult;
    private Bank bank;

    public Cashier(Bank bank, FormatResult formatResult) {
        super("Cashier");
        this.formatResult = formatResult;
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            if (!bank.getBanker().isAlive() && bank.getLiveDeals().size() == 0 && bank.getCompletedTransactions().size() == 0) {
                break;
            }

            try {
                Transaction transaction;

                Thread.sleep(30);

                if (bank.getBanker().isAlive()) {
                    bank.stopWorkOfBanker();
                    System.out.println("Banker " + bank.getBanker().getState());
                }


                while (bank.getCompletedTransactions().size() != 0) {
                    transaction = bank.getCompletedTransactions().get(0);

                    closeTransaction(transaction);
                    writeToFileResult(transaction, bank, formatResult);
                    bank.getCompletedTransactions().remove(transaction);
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
            closeLoan(transaction);
        } else if (transaction.getType().equals(TypeOfTransaction.DEPOSIT)) {
            closeDeposit(transaction);
        }
    }

    private void closeLoan(Transaction transaction) {
        Client client = transaction.getClient();
        int moneyOfClient = client.getMoney();
        int valueOfLoan = transaction.getTotalAmount();

        client.setMoney(moneyOfClient - valueOfLoan);
        bank.setCapital(bank.getCapital() + valueOfLoan);
        System.out.println("loan of ".concat(client.getName()).concat(" was closed"));
    }

    private void closeDeposit(Transaction transaction) {
        Client client = transaction.getClient();
        int moneyOfClient = client.getMoney();
        int valueOfDeposit = transaction.getTotalAmount();

        client.setMoney(moneyOfClient + valueOfDeposit);
        bank.setCapital(bank.getCapital() - valueOfDeposit);
        System.out.println("deposit of ".concat(client.getName()).concat(" was closed"));
    }

    private void writeToFileResult(Transaction transaction, Bank bank, FormatResult formatResult) {
            ObjectReport report = new ObjectReport(transaction, bank);
            CreateReport createReport = new CreateReport(report, formatResult);
            createReport.start();
    }
}
