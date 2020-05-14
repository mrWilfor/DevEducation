package homeWork.hw_8_07_05_2020.object.bus;

public interface IDaoBus {

    long create(Bus bus);

    Bus[] readAll();

    Bus[] readByNumberBus(int numberBus);

    Bus[] readByYearOfOperationMore(int yearOfOperation);

    Bus[] readByMileageMore(long mileage);

    void remove(int numberBus);

    void update(Bus bus);

    default void clear() {

    }
}
