package homeWork.hw_17_08_07_2020_Bank.impl_Interfaces;

import homeWork.hw_17_08_07_2020_Bank.interfaces.Application;
import homeWork.hw_17_08_07_2020_Bank.interfaces.Bank;
import homeWork.hw_17_08_07_2020_Bank.interfaces.Client;

public class ClientImpl extends Thread implements Client {
    Bank bank;
    Application application;

    public ClientImpl(String name, Bank bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void run() {

    }

    @Override
    public void makeTransaction() {

    }

    @Override
    public Bank getBank() {
        return bank;
    }

    @Override
    public Application getApplication() {
        return application;
    }

    @Override
    public void setApplication(Application application) {
        this.application = application;
    }
}
