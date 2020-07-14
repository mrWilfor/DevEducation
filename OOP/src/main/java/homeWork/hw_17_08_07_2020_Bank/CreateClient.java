package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

public class CreateClient extends Thread {
    Bank bank;
    private static int countClient = 0;

    @Override
    public void run() {
        super.run();
    }

    private void createClient() {
        int moneyOfClient = (int) (Math.random() * 10_001 + 10_000);
        int triggerOfTypeOfTransaction = (int) (Math.random() * 2);
        TypeOfTransaction typeOfTransaction;

        if (triggerOfTypeOfTransaction == 0) {
            typeOfTransaction = TypeOfTransaction.LOAN;
        } else {
            typeOfTransaction = TypeOfTransaction.DEPOSIT;
        }
        Client client = new Client("Client ".concat(String.valueOf(countClient)), moneyOfClient, typeOfTransaction);
        countClient++;

        bank.lineUp(client);
    }
}
