package homeWork.hw_17_08_07_2020_Bank.interfaces;

import java.util.List;

public interface Bank {
    long getCapital();

    List<Application> getListOfApplications();

    long getSumOfDeposits();

    long getSumOfLoans();

    int getSizeOfLoan();

    int getSizeOfDeposit();

    boolean getIsPermit();

    void setCapital(long capital);

    void setSumOfDeposits(long sumOfDeposits);

    void setSumOfLoans(long sumOfLoans);

    void setIsPermit(boolean isPermit);

}
