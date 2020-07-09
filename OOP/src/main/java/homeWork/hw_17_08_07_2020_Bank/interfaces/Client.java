package homeWork.hw_17_08_07_2020_Bank.interfaces;

public interface Client {
    void makeTransaction();

    Bank getBank();

    Application getApplication();

    void setApplication(Application application);
}
