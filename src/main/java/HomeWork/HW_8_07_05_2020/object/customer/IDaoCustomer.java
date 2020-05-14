package homeWork.hw_8_07_05_2020.object.customer;

public interface IDaoCustomer {

    long create(Customer customer);

    Customer[] readAll();

    Customer[] readBySameNames();

    Customer[] readByNumberOfCreditCard(long numberOfCreditCard);

    void remove(long id);

    void update(Customer customer);

    default void clear() {

    }
}
