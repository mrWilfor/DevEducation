package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.initialisation.InitialisationShop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ControlFile controlFile = new ControlFile(shop);
        InitialisationShop.initialisation(shop);
        controlFile.enteredIntoShop();
    }
}
