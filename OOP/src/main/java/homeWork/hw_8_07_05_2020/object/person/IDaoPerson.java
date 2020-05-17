package homeWork.hw_8_07_05_2020.object.person;

public interface IDaoPerson {

    long create(Person p);

    Person[] readAll();

    Person[] readByName(String name);

    void remove(long id);

    void update(Person p);

    default void clear() {

    }
}
