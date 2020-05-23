package practice.practic_11_22_05_2020.Book.Interface;

import practice.practic_11_22_05_2020.Book.Book;

import java.util.Date;

public interface Reader {
    String getNameSurnamePatronymic();

    void setNameSurnamePatronymic(String nameSurnamePatronymic);

    String getNumberOfLibraryCard();

    void setNumberOfLibraryCard(String numberOfLibraryCard);

    String getFaculty();

    void setFaculty(String faculty);

    Date getDateOfBirthday();

    void setDateOfBirthday(Date dateOfBirthday);

    long getPhoneNumber();

    void setPhoneNumber(long phoneNumber);

    int getQuantityOfBooks();

    void setQuantityOfBooks(int quantityOfBooks);

    String[] getNameOfBooks();

    void setNameOfBooks(String[] nameOfBooks);

    Book[] getBooks();

    void setBooks(Book[] books);

    boolean equals(Object o);

    int hashCode();

    String toString();

    void takeBook(int quantityOfBooks);

    void takeBook(String... books);

    void takeBook(Book... books);

    void returnBook(int quantityOfBooks);

    void returnBook(String... books);

    void returnBook(Book... books);


}
