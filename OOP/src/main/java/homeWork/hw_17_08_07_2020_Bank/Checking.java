package homeWork.hw_17_08_07_2020_Bank;

public class Checking extends Thread{
    Bank bank;

    public Checking(Bank bank) {
        super("Checking");
        this.bank = bank;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sleep(300);

                if (!bank.getCreateClient().isAlive() && bank.getQueue().size() == 0) {
                    bank.setStatusOfDeposits(true);
                    bank.setStatusOfLoans(true);
                    break;
                }
                checkRatioLoansDeposits();
            }
        } catch (InterruptedException ie) {
            System.out.println("Thread ".concat(Thread.currentThread().getName()).concat(" has interrupted"));
        }
    }

    public void checkRatioLoansDeposits() {
        long sumOfDeposits = bank.getSumOfDeposits();
        long sumOfLoan = bank.getSumOfLoans();

        if (sumOfDeposits != 0 && sumOfLoan != 0) {
            if ((sumOfDeposits > sumOfLoan)) {
                if (sumOfDeposits - sumOfLoan * 100 / sumOfLoan >= 20) {
                    bank.setStatusOfDeposits(false);
                    bank.setStatusOfLoans(true);
                } else {
                    bank.setStatusOfDeposits(true);
                }
            } else {
                if ((sumOfLoan - sumOfDeposits) * 100 / sumOfDeposits >= 20) {
                    bank.setStatusOfLoans(false);
                    bank.setStatusOfDeposits(true);
                } else {
                    bank.setStatusOfLoans(true);
                }
            }
        }
    }
}
