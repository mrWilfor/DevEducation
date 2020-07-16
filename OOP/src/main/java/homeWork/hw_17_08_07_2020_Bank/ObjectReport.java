package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class ObjectReport {
    private String nameOfClient;
    private String data;
    private String type;
    private int sum;
    private int totalAmount;
    private int term;
    private int interestRate;
    private long balanceOfBank;
    private long sumOfAllOperationForTheTypeTransaction;

    public ObjectReport(Transaction transaction, Bank bank) {
        this.nameOfClient = transaction.getClient().getName();
        this.data = new GregorianCalendar().toZonedDateTime().format(DateTimeFormatter.ofPattern("d MMM uuuu, KK:MM"));
        this.type = transaction.getType().toString();
        this.sum = transaction.getSizeOfTransaction();
        this.totalAmount = transaction.getTotalAmount();
        this.term = transaction.getTerm();
        this.interestRate = transaction.getInterestRate();
        this.balanceOfBank = bank.getCapital();

        if (transaction.getType().equals(TypeOfTransaction.LOAN)) {
            sumOfAllOperationForTheTypeTransaction = bank.getSumOfLoans();
        } else {
            sumOfAllOperationForTheTypeTransaction = bank.getSumOfDeposits();
        }
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public String getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public int getSum() {
        return sum;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getTerm() {
        return term;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public long getBalanceOfBank() {
        return balanceOfBank;
    }

    public long getSumOfAllOperationForTheTypeTransaction() {
        return sumOfAllOperationForTheTypeTransaction;
    }
}
