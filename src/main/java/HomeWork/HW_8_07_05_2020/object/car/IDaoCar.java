package homeWork.hw_8_07_05_2020.object.car;

public interface IDaoCar {

    long create(Car c);

    Car[] readAll();

    Car[] readByMake(String make);

    Car[] readByModelMoreYearOfOperation(String model, int yearsOfOperation);

    Car[] readByYearOfIssuePriseMore(int yearOfIssue, long prise);

    void remove(long id);

    void update(Car c);

    default void clear() {

    }
}
