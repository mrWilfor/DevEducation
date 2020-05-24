package practice.practic_11_22_05_2020.book;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Reader implements practice.practic_11_22_05_2020.book.interfaceBook.Reader {
    private String nameSurnamePatronymic;
    private String numberOfLibraryCard;
    private String faculty;
    private Date dateOfBirthday;
    private long phoneNumber;
    private int quantityOfBooks = 0;
    private String[] nameOfBooks;
    private Book[] books;

    public Reader(String nameSurnamePatronymic, String numberOfLibraryCard, String faculty, String date, long phoneNumber) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.numberOfLibraryCard = numberOfLibraryCard;
        this.faculty = faculty;
        this.dateOfBirthday = new Date(Instant.parse(date).getEpochSecond());
        this.phoneNumber = phoneNumber;
    }

    public Reader() {

    }

    @Override
    public String getNameSurnamePatronymic() {
        return nameSurnamePatronymic;
    }

    @Override
    public void setNameSurnamePatronymic(String nameSurnamePatronymic) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
    }

    @Override
    public String getNumberOfLibraryCard() {
        return numberOfLibraryCard;
    }

    @Override
    public void setNumberOfLibraryCard(String numberOfLibraryCard) {
        this.numberOfLibraryCard = numberOfLibraryCard;
    }

    @Override
    public String getFaculty() {
        return faculty;
    }

    @Override
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    @Override
    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int getQuantityOfBooks() {
        return quantityOfBooks;
    }

    @Override
    public void setQuantityOfBooks(int quantityOfBooks) {
        this.quantityOfBooks = quantityOfBooks;
    }

    @Override
    public String[] getNameOfBooks() {
        return nameOfBooks;
    }

    @Override
    public void setNameOfBooks(String[] nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    @Override
    public Book[] getBooks() {
        return books;
    }

    @Override
    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reader reader = (Reader) o;
        return phoneNumber == reader.phoneNumber &&
                Objects.equals(nameSurnamePatronymic, reader.nameSurnamePatronymic) &&
                Objects.equals(numberOfLibraryCard, reader.numberOfLibraryCard) &&
                Objects.equals(faculty, reader.faculty) &&
                Objects.equals(dateOfBirthday, reader.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurnamePatronymic, numberOfLibraryCard, faculty, dateOfBirthday, phoneNumber);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "nameSurnamePatronymic='" + nameSurnamePatronymic + '\'' +
                ", numberOfLibraryCard='" + numberOfLibraryCard + '\'' +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public void takeBook(int quantityOfBooks) {
        System.out.println(nameSurnamePatronymic + " took " + quantityOfBooks + " books");
        this.quantityOfBooks += quantityOfBooks;
    }

    @Override
    public void takeBook(String... books) {
        String result = nameSurnamePatronymic + " took the books: ";

        for (int i = 0; i < books.length; i++) {
            if (i == 0) {
                result += books[i];
            } else {
                result = result + ", " + books[i];
            }
        }

        if (nameOfBooks == null) {
            nameOfBooks = books;
        } else {
            String[] newNameOfBooks = new String[nameOfBooks.length + books.length];

            for (int i = 0; i < nameOfBooks.length; i++) {
                newNameOfBooks[i] = nameOfBooks[i];
            }

            for (int i = 0, j = nameOfBooks.length; i < books.length; i++, j++) {
                newNameOfBooks[j] = books[i];
            }

            nameOfBooks = newNameOfBooks;
        }
        System.out.println(result);
    }

    @Override
    public void takeBook(Book... books) {
        String result = nameSurnamePatronymic + " took the books: ";

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            } else if (i == 0) {
                result += books[i].getName();
            } else {
                result = result + ", " + books[i].getName();
            }
        }

        if (nameOfBooks == null) {
            this.books = books;
        } else {
            Book[] newBooks = new Book[this.books.length + books.length];

            for (int i = 0; i < this.books.length; i++) {
                newBooks[i] = this.books[i];
            }

            for (int i = 0, j = this.books.length; i < books.length; i++, j++) {
                newBooks[j] = books[i];
            }

            this.books = newBooks;
        }

        System.out.println(result);
    }

    @Override
    public void returnBook(int quantityOfBooks) {
        System.out.println(this.nameSurnamePatronymic + " returned " + quantityOfBooks + " books");
        this.quantityOfBooks -= quantityOfBooks;
    }

    @Override
    public void returnBook(String... books) {
        StringBuilder result = new StringBuilder(this.nameSurnamePatronymic);
        result.append(" returned books: ");
        int counter = 0;
        boolean trigger = false;

        if (this.nameOfBooks == null) {
            System.out.println(result.toString());
        } else {
            result.append(String.join(", ", books));

            for (int i = 0; i < books.length; i++) {
                for (int j = 0; j < this.nameOfBooks.length; j++) {
                    if (this.nameOfBooks[j] != null && this.nameOfBooks[j].equals(books[i])) {
                        this.nameOfBooks[j] = null;
                        counter++;
                    }
                }
            }

            do {
                trigger = false;

                for (int i = 0; i < this.nameOfBooks.length - 1; i++) {
                    if (this.nameOfBooks[i] == null && this.nameOfBooks[i + 1] != null) {
                        this.nameOfBooks[i] = this.nameOfBooks[i + 1];
                        this.nameOfBooks[i + 1] = null;
                        trigger = true;
                    }
                }
            } while (trigger);

            this.nameOfBooks = Arrays.copyOf(this.nameOfBooks, this.nameOfBooks.length - counter);
        }

        System.out.println(result.toString());
    }

    @Override
    public void returnBook(Book... books) {
        StringBuilder result = new StringBuilder(this.nameSurnamePatronymic);
        result.append(" returned books: ");
        int counter = 0;
        boolean trigger = false;

        if (this.books == null) {
            System.out.println(result.toString());
        } else {
            for (int i = 0; i < books.length; i++) {
                if (i == 0) {
                    result.append(books[i].getName());
                } else {
                    result.append(", ");
                    result.append(books[i].getName());
                }
            }

            for (int i = 0; i < books.length; i++) {
                for (int j = 0; j < this.books.length; j++) {
                    if (this.books[j] != null && this.books[j].equals(books[i])) {
                        this.books[j] = null;
                        counter++;
                    }
                }
            }

            do {
                trigger = false;

                for (int i = 0; i < this.books.length - 1; i++) {
                    if (this.books[i] == null && this.books[i + 1] != null) {
                        this.books[i] = this.books[i + 1];
                        this.books[i + 1] = null;
                        trigger = true;
                    }
                }
            } while (trigger);

            this.books = Arrays.copyOf(this.books, this.books.length - counter);
        }

        System.out.println(result.toString());
    }
}
