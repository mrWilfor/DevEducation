package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

public class Transaction extends Thread {
    private Bank bank;
    private Client client;
    private TypeOfTransaction type;
    private int sizeOfTransaction;
    private int interestRate;
    private int term;
    private int totalAmount;

    public Transaction(Application application, Bank bank, int interestRate) {
        this.bank = bank;
        this.client = application.getClient();
        this.type = application.getType();
        this.sizeOfTransaction = application.getSizeOfTransaction();
        this.interestRate = interestRate;
        this.term = application.getTerm();
        this.totalAmount = sizeOfTransaction;
    }

    @Override
    public void run() {
        for (int i = term; i != 0; i--) {
            try {
                sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Thread ".concat(Thread.currentThread().getName()).concat(" has interrupted"));
            }

            totalAmount += totalAmount * interestRate / 100;
        }

        bank.moveTransactionToListOfCompletedTransactions(this);
    }

    public Client getClient() {
        return client;
    }

    public TypeOfTransaction getType() {
        return type;
    }

    public int getSizeOfTransaction() {
        return sizeOfTransaction;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
