package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

public class CreateClient extends Thread {
    Bank bank;
    private static volatile int countClient = 0;

    public CreateClient(Bank bank) {
        super("Create client thread");
        this.bank = bank;
    }

    @Override
    public void run() {
        while (countClient < 1000) {
            try {
                Thread.sleep(10);
                createClient();
            } catch (InterruptedException ie) {
                System.out.println("Client died");
            }
        }
    }

    private void createClient() {
        countClient++;

        int moneyOfClient = (int) (Math.random() * 10_001 + 10_000);
        int triggerOfTypeOfTransaction = (int) (Math.random() * 2);
        TypeOfTransaction typeOfTransaction;

        if (triggerOfTypeOfTransaction == 0) {
            typeOfTransaction = TypeOfTransaction.LOAN;
        } else {
            typeOfTransaction = TypeOfTransaction.DEPOSIT;
        }
        Client client = new Client("Client ".concat(String.valueOf(countClient)), moneyOfClient, typeOfTransaction);

        bank.lineUp(client);
    }
}
