package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Customer;

public interface IDaoCustomer {

    long create(Customer c);

    Customer[] readAll();

    Customer[] readByName(String name);

    void remove(long id);

    void update(Customer c);

    default void clear() {

    }
}
