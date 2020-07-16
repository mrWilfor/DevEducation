package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.FormatResult;
import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bank extends Thread {
    private volatile long capital = 50_000;
    private volatile Queue<Client> queue = new LinkedList<>();
    private volatile List<Transaction> liveDeals = new LinkedList<>();
    private volatile List<Transaction> completedTransactions = new LinkedList<>();
    private volatile long sumAllDeposits = 0;
    private volatile int countOfDeposits = 0;
    private volatile long sumAllLoan = 0;
    private volatile int countOfLoan = 0;
    private int interestRateOfLoan = 13;
    private int interestRateOfDeposit = 10;
    private volatile boolean isStatusOfLoans = true;
    private volatile boolean isStatusOfDeposits = true;
    private final Banker banker = new Banker(this, interestRateOfLoan, interestRateOfDeposit);
    private Checking checking = new Checking(this);
    private Cashier cashier;
    private CreateClient createClient;

    public Bank(FormatResult formatResult, int quantityOfClients) {
        this.cashier = new Cashier(this, formatResult);
        this.createClient = new CreateClient(this, quantityOfClients);
    }

    @Override
    public void run() {
        createClient.start();
        banker.start();
        checking.start();
        cashier.start();

        try {
            banker.join();
            checking.join();
            cashier.join();
        } catch (InterruptedException ie) {
            System.out.println(";)");
        }
    }

    public void lineUp(Client client) {
        client.start();
        try {
            client.join();
        } catch (InterruptedException ie) {
            System.out.println("client sldkfsf");
        }
        queue.add(client);
    }

    public void moveTransactionToListOfCompletedTransactions(Transaction transaction) {
        synchronized (completedTransactions) {
            liveDeals.remove(transaction);
            completedTransactions.add(transaction);
        }
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
        banker.stopWork();
    }

    public synchronized void continueWorkOfBanker() {
        banker.continueWork();
    }

    public long getCapital() {
        return capital;
    }

    public List<Transaction> getLiveDeals() {
        return liveDeals;
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

    public Banker getBanker() {
        return banker;
    }

    public CreateClient getCreateClient() {
        return createClient;
    }

    public Checking getChecking() {
        return checking;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }
}
