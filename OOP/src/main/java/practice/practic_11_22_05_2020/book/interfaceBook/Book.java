package practice.practic_11_22_05_2020.book.interfaceBook;

public interface Book {
    String getName();

    void setName(String name);

    String getAuthor();

    void setAuthor(String author);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
