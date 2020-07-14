package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bank extends Thread{
    private long capital = 50_000;
    private Queue<Client> queue = new LinkedList<>();
    private List<Transaction> liveDeals = new LinkedList<>();
    private List<Transaction> completedTransactions = new LinkedList<>();
    private long sumAllDeposits = 0;
    private int countOfDeposits = 0;
    private long sumAllLoan = 0;
    private int countOfLoan = 0;
    private int interestRateOfLoan = 13;
    private int interestRateOfDeposit = 10;
    private int totalProfitOfBank = 0;
    private boolean isStatusOfLoans = true;
    private boolean isStatusOfDeposits = true;
    private Banker banker = new Banker(this, interestRateOfLoan, interestRateOfDeposit);
    private Checking checking = new Checking(this);
    private Cashier cashier = new Cashier(this);

    @Override
    public void run() {
        CreateClient createClient = new CreateClient();
        createClient.start();
        banker.start();
        checking.start();
        cashier.start();

        while (true);
    }

    public void lineUp(Client client) {
        client.start();
        queue.add(client);
    }

    public void moveTransactionToListOfCompletedTransactions(Transaction transaction) {
        liveDeals.remove(transaction);
        completedTransactions.add(transaction);
    }

    public void addToLiveDeals(Transaction transaction) {
        liveDeals.add(transaction);

        if (transaction.getType().equals(TypeOfTransaction.LOAN)) {
            sumAllLoan += transaction.getSizeOfTransaction();
            ++countOfLoan;
        } else if (transaction.getType().equals(TypeOfTransaction.DEPOSIT)) {
            sumAllDeposits += transaction.getSizeOfTransaction();
            ++countOfDeposits;
        }
    }

    public void stopWorkOfBanker() {

    }

    public void continueWorkOfBanker() {

    }

    public long getCapital() {
        return capital;
    }

    public List<Transaction> getCompletedTransactions() {
        return completedTransactions;
    }

    public Queue<Client> getQueue() {
        return queue;
    }

    public long getSumOfDeposits() {
        return sumAllDeposits;
    }

    public long getSumOfLoans() {
        return sumAllLoan;
    }

    public boolean getIsStatusOfLoan() {
        return isStatusOfLoans;
    }

    public boolean getIsStatusOfDeposit() {
        return isStatusOfDeposits;
    }

    public void setStatusOfLoans(boolean statusOfLoans) {
        isStatusOfLoans = statusOfLoans;
    }

    public void setStatusOfDeposits(boolean statusOfDeposits) {
        isStatusOfDeposits = statusOfDeposits;
    }
}
