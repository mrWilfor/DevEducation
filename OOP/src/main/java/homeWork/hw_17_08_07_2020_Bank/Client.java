package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

public class Client extends Thread {
    private int money;
    private Application application;
    private TypeOfTransaction type;

    public Client(String name, int money, TypeOfTransaction type) {
        super(name);
        this.money = money;
        this.type = type;
    }

    @Override
    public void run() {
        makeApplication();
    }

    public void makeApplication() {
        int sizeOfTransaction;
        int termOfTransaction = (int) (Math.random() * 10 + 1);

        if (type.equals(TypeOfTransaction.LOAN)) {
            sizeOfTransaction = (int) (Math.random() * 19_500 + 500);
        } else {
            sizeOfTransaction = (int) (Math.random() * 19_000 + 1000);
        }

        application = new Application(this, type, sizeOfTransaction, termOfTransaction);
    }

    public Application getApplication() {
        return application;
    }

    public int getMoney() {
        return money;
    }

    public TypeOfTransaction getTypeOfTransaction() {
        return type;
    }

    public TypeOfTransaction getType() {
        return type;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
