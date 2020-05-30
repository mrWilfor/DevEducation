package homeWork.hw_10_Shop_Extend.classes.enums;

public enum Role {
    ADMINISTRATOR("Administrator"),
    CASHIER("Cashier"),
    CONSULTANT("Consultant"),
    SECURITY("Security"),
    STOREKEEPER("Store keeper");

    public final String role;

    Role(String role) {
        this.role = role;
    }
}
