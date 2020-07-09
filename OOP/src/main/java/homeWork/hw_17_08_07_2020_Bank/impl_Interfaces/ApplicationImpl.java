package homeWork.hw_17_08_07_2020_Bank.impl_Interfaces;

import homeWork.hw_17_08_07_2020_Bank.TypeOfTransaction;
import homeWork.hw_17_08_07_2020_Bank.interfaces.Application;
import homeWork.hw_17_08_07_2020_Bank.interfaces.Client;

public class ApplicationImpl implements Application {
    private Client client;
    private TypeOfTransaction typeOfTransaction;
    private int sizeOfTransaction;
    private int term;

    public ApplicationImpl(Client client, TypeOfTransaction typeOfTransaction, int sizeOfTransaction, int term) {
        this.client = client;
        this.typeOfTransaction = typeOfTransaction;
        this.sizeOfTransaction = sizeOfTransaction;
        this.term = term;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public TypeOfTransaction getTransaction() {
        return typeOfTransaction;
    }

    @Override
    public int getSizeOfTransaction() {
        return sizeOfTransaction;
    }

    @Override
    public int getTerm() {
        return term;
    }
}
