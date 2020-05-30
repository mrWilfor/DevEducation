package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

import homeWork.hw_8_Parth_3_19_05_2020.ImplBuyer;

import java.util.ArrayList;

public interface Bank {
    ArrayList<ImplBuyer> getListOfDebtors();

    void printListOfDebtors();
}
