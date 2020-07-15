package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

import java.util.LinkedList;
import java.util.Queue;

public class Banker extends Thread {
    private Queue<Client> depositWaitingLine = new LinkedList<>();
    private Queue<Client> loanWaitingLine = new LinkedList<>();
    private Bank bank;
    private int interestRateOfLoan;
    private int interestRateOfDeposit;
    private boolean isFlagOfWork = true;

    public Banker(Bank bank, int interestRateOfLoan, int interestRateOfDeposit) {
        super("Banker");
        this.bank = bank;
        this.interestRateOfLoan = interestRateOfLoan;
        this.interestRateOfDeposit = interestRateOfDeposit;
    }

    @Override
    public void run() {
        while (true) {
            if (isFlagOfWork) {
                Client client = bank.getQueue().poll();

                if (client != null) {
                    if (checkStatusOfTransaction(client.getTypeOfTransaction())) {
                        if (checkWaitingLine(client.getTypeOfTransaction())) {
                            makeTransaction(client);
                        } else {
                            lineUpWaiting(client);

                            if (client.getTypeOfTransaction().equals(TypeOfTransaction.LOAN)) {
                                while (bank.getCapital() >= 54_000 && (client = loanWaitingLine.poll()) != null) {
                                    makeTransaction(client);
                                }
                            } else {
                                while (bank.getCapital() <= 1_000_000 && (client = depositWaitingLine.poll()) != null) {
                                    makeTransaction(client);
                                }
                            }
                        }
                    } else {
                        lineUpWaiting(client);
                    }
                } else if (!bank.getChecking().isAlive()) {
                    while ((client = loanWaitingLine.poll()) != null) {
                        makeTransaction(client);
                    }

                    while ((client = depositWaitingLine.poll()) != null) {
                        makeTransaction(client);
                    }
                    break;
                }
            } else {
                try {
                    synchronized (this) {
                        wait();
                    }
                } catch (InterruptedException ie) {
                    System.out.println(Thread.currentThread().getName().concat(" was interrupted"));
                }
            }
        }
    }

    public void makeTransaction(Client client) {
        int interestRate;

        if (client.getTypeOfTransaction().equals(TypeOfTransaction.LOAN)) {
            interestRate = interestRateOfLoan;
        } else {
            interestRate = interestRateOfDeposit;
        }

        Transaction transaction = new Transaction(client.getApplication(), bank, interestRate);

        transaction.start();
        bank.addToLiveDeals(transaction);
        System.out.println(transaction.getType().toString() + " Transaction of ".concat(client.getName()).concat(" was created"));
    }

    public void lineUpWaiting(Client client) {
        if (client.getTypeOfTransaction().equals(TypeOfTransaction.LOAN)) {
            loanWaitingLine.add(client);
        } else if (client.getTypeOfTransaction().equals(TypeOfTransaction.DEPOSIT)) {
            depositWaitingLine.add(client);
        }
        System.out.println(client.getTypeOfTransaction().toString() + client.getName().concat(" wait"));
    }

    public boolean checkStatusOfTransaction(TypeOfTransaction type) {
        if (type.equals(TypeOfTransaction.LOAN)) {
            System.out.println("status of Loan - ".concat(String.valueOf(bank.getIsStatusOfLoan())));
            return bank.getIsStatusOfLoan();
        } else {
            System.out.println("status of Deposit - ".concat(String.valueOf(bank.getIsStatusOfDeposit())));
            return bank.getIsStatusOfDeposit();
        }
    }

    public boolean checkWaitingLine(TypeOfTransaction type) {
        if (type.equals(TypeOfTransaction.LOAN)) {
            return loanWaitingLine.size() == 0;
        } else {
            return depositWaitingLine.size() == 0;
        }
    }

    public synchronized void stopWork() {
        isFlagOfWork = false;
    }

    public synchronized void continueWork() {
        synchronized (this) {
            isFlagOfWork = true;
            notify();
        }
    }

    public void setFlagOfWork(boolean flagOfWork) {
        isFlagOfWork = flagOfWork;
    }
}
