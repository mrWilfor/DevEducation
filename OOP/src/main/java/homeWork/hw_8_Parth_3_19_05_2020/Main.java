package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.initialisation.InitialisationShop;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.ControlFile;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new ImplShop();
        ControlFile controlFile = new ImplControlFile(shop);
        InitialisationShop.initialisation(shop);
        controlFile.enteredIntoShop();
    }
}
