package homeWork.hw_17_08_07_2020_Bank;

import homeWork.hw_17_08_07_2020_Bank.enums.TypeOfTransaction;

public class Application {
    private Client client;
    private TypeOfTransaction type;
    private int sizeOfTransaction;
    private int term;

    public Application(Client client, TypeOfTransaction type, int sizeOfTransaction, int term) {
        System.out.println("Application of ".concat(client.getName()).concat(" was created"));
        this.client = client;
        this.type = type;
        this.sizeOfTransaction = sizeOfTransaction;
        this.term = term;
    }

    public Client getClient() {
        return client;
    }

    public TypeOfTransaction getType() {
        return type;
    }

    public int getSizeOfTransaction() {
        return sizeOfTransaction;
    }

    public int getTerm() {
        return term;
    }
}
