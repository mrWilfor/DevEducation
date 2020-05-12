package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Book;

public interface IDaoBook {

    long create(Book b);

    Book[] readAll();

    Book[] readByAuthor(String author);

    Book[] readByPublishingHouse(String publishingHouse);

    Book[] readByAfterAgePublishing(long agePublishing);

    void remove(long id);

    void update(Book b);

    default void clear() {

    }
}
