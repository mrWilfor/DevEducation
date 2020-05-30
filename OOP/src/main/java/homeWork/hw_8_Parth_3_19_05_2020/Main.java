package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.initialisation.InitialisationShop;

public class Main {
    public static void main(String[] args) {
        ImplShop implShop = new ImplShop();
        ImplControlFile implControlFile = new ImplControlFile(implShop);
        InitialisationShop.initialisation(implShop);
        implControlFile.enteredIntoShop();
    }
}
