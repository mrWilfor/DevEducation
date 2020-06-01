package practice.practic_14_28_05_2020.interfaces;

public interface Order {
    String getName();

    long getId();

    boolean getWithOrWithOutDriver();

    int getTermRental();

    boolean getStatusOfOrder();

    void setStatusOfOrder(boolean statusOfOrder);

    String getCause();

    void setCause(String cause);
}
