package homeWork.hw_17_08_07_2020_Bank.interfaces;

import homeWork.hw_17_08_07_2020_Bank.TypeOfTransaction;

public interface Application {
    Client getClient();

    TypeOfTransaction getTransaction();

    int getSizeOfTransaction();

    int getTerm();
}
