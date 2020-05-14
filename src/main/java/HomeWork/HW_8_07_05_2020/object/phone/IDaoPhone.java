package homeWork.hw_8_07_05_2020.object.phone;

public interface IDaoPhone {

    long create(Phone p);

    Phone[] readAll();

    Phone[] readByTalkTimeMoreThan(long talkTime);

    Phone[] readByAlphabet();

    void remove(long id);

    void update(Phone p);

    default void clear() {

    }
}
