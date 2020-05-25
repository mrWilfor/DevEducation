package homeWork.hw_8_Parth_3_19_05_2020.interfaceShop;

public interface Product {
    String getNameOfProduct();

    String getCategory();

    String getColor();

    String getDescription();

    int getPrise();

    void setStatus(boolean status);

    boolean getStatus();
}
