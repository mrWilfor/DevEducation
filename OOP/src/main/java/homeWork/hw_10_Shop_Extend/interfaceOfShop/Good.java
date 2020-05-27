package homeWork.hw_10_Shop_Extend.interfaceOfShop;

public interface Good {
    long getUID();

    String getName();

    String getBrand();

    int getPrise();

    String getGroup();

    String getNameOfDepartment();

    void setNameOfDepartment();

    String getInfo();
}
