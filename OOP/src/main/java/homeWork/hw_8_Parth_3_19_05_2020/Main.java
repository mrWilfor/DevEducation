package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.initialisation.InitialisationShop;

import java.util.Scanner;

public class Main {
    public static SportingGoodsStore shop = new SportingGoodsStore();

    public static void main(String[] args) {
        InitialisationShop.initialisation(shop);
        shop.enteredIntoShop();
    }
}
