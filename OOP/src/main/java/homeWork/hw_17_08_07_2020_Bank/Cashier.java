package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

import java.util.List;

public class Cashier extends Thread {
    private Bank bank;

    public Cashier(Bank bank) {
        super("Cashier");
        this.bank = bank;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(30);
            bank.stopWorkOfBanker();

            List<Transaction> listCompletedTransaction = bank.getCompletedTransactions();

            if (listCompletedTransaction.size() != 0) {
                for (Transaction transaction : listCompletedTransaction) {
                    closeTransaction(transaction);
                    listCompletedTransaction.remove(transaction);
                }
            }
            bank.continueWorkOfBanker();
        } catch (InterruptedException ie) {
            System.out.println(Thread.currentThread().getName().concat(" has interrupted"));
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
    }

    private void closeDeposit(Transaction transaction) {
        Client client = transaction.getClient();
        int moneyOfClient = client.getMoney();
        int valueOfDeposit = transaction.getTotalAmount();

        client.setMoney(moneyOfClient + valueOfDeposit);
    }
}
