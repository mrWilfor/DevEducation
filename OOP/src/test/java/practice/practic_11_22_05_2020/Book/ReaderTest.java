package practice.practic_11_22_05_2020.Book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    @Test
    void equalsTrue() {
        Reader reader1 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader2 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        assertEquals(reader1, reader2);
    }

    @Test
    void equalsFail() {
        Reader reader1 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader2 = new Reader(
                "Ivanov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        assertNotEquals(reader1, reader2);
    }

    @Test
    void hashCodeTrue() {
        Reader reader1 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader2 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        assertEquals(reader1.hashCode(), reader2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Reader reader1 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader2 = new Reader(
                "Ivanov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        assertNotEquals(reader1.hashCode(), reader2.hashCode());
    }

    @Test
    void testToStringTrue() {
        Reader reader = new Reader(
                "Ivanov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        String expected = "Reader{nameSurnamePatronymic='Ivanov I.P.', numberOfLibraryCard='3495393', " +
                "faculty='technical', dateOfBirthday=Sat Jan 10 22:12:28 EET 1970, phoneNumber=304583340}";

        assertEquals(expected, reader.toString());
    }

    @Test
    void testToStringFail() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        String expected = "Reader{nameSurnamePatronymic='Ivanov I.P.', numberOfLibraryCard='3495393', " +
                "faculty='technical', dateOfBirthday=Sat Jan 10 22:12:28 EET 1970, phoneNumber=304583340}";

        assertNotEquals(expected, reader.toString());
    }

    @Test
    void takeBookIntOne() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook(5);
        int expected = 5;

        assertEquals(expected, reader.getQuantityOfBooks());
    }

    @Test
    void takeBookIntTwo() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook(5);
        reader.takeBook(3);
        int expected = 8;

        assertEquals(expected, reader.getQuantityOfBooks());
    }

    @Test
    void takeBookStringMany() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook("Monte-Kristo", "Anna Karenina", "War and piece", "Red hood", "Alphabet");
        String[] expected = {"Monte-Kristo", "Anna Karenina", "War and piece", "Red hood", "Alphabet"};

        assertArrayEquals(expected, reader.getNameOfBooks());
    }

    @Test
    void takeBookStringTwo() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook("Monte-Kristo", "Anna Karenina");
        String[] expected = {"Monte-Kristo", "Anna Karenina"};

        assertArrayEquals(expected, reader.getNameOfBooks());
    }

    @Test
    void takeBookStringOne() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook("Monte-Kristo");
        String[] expected = {"Monte-Kristo"};

        assertArrayEquals(expected, reader.getNameOfBooks());
    }

    @Test
    void takeBookStringNull() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook((String) null);
        String[] expected = {null};

        assertArrayEquals(expected, reader.getNameOfBooks());
    }

    @Test
    void takeBookStringFail() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook("Monte-Kristo", "Anna Karenina");
        String[] expected = {"Monte-Kristo"};

        assertFalse(Arrays.equals(expected, reader.getNameOfBooks()));
    }

    @Test
    void takeBookMany() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Anna Karenina", "Tolstoi");
        Book book3 = new Book("War and piece", "Tolstoi");
        Book book4 = new Book("Red hood", "Perk");
        Book book5 = new Book("Alphabet", "Teacher");

        reader.takeBook(book1, book2, book3, book4, book5);
        Book[] expected = {book1, book2, book3, book4, book5};

        assertArrayEquals(expected, reader.getBooks());
    }

    @Test
    void takeBookTwo() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Anna Karenina", "Tolstoi");

        reader.takeBook(book1, book2);
        Book[] expected = {book1, book2};

        assertArrayEquals(expected, reader.getBooks());
    }

    @Test
    void takeBookOne() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Book book1 = new Book("Monte-Kristo", "Duma");

        reader.takeBook(book1);
        Book[] expected = {book1};

        assertArrayEquals(expected, reader.getBooks());
    }

    @Test
    void takeBookNull() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook((Book) null);
        Book[] expected = {null};

        assertArrayEquals(expected, reader.getBooks());
    }

    @Test
    void takeBookFail() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Anna Karenina", "Tolstoi");

        reader.takeBook(book1, book2);
        Book[] expected = {book1};

        assertFalse(Arrays.equals(expected, reader.getBooks()));
    }

    @Test
    void returnBookInt() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook(5);
        reader.returnBook(3);
        int expected = 2;

        assertEquals(expected, reader.getQuantityOfBooks());
    }

    @Test
    void returnBookIntFail() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook(5);
        reader.returnBook(4);
        int expected = 2;

        assertNotEquals(expected, reader.getQuantityOfBooks());
    }

    @Test
    void ReturnBookString() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook("Monte-Kristo", "Anna Karenina", "War and piece", "Red hood", "Alphabet");
        reader.returnBook("Monte-Kristo", "Anna Karenina", "War and piece", "Red hood", "Alphabet");
        String[] expected = new String[0];

        assertArrayEquals(expected, reader.getNameOfBooks());
    }

    @Test
    void ReturnBookStringFail() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        reader.takeBook("Monte-Kristo", "Anna Karenina", "War and piece", "Red hood", "Alphabet");
        reader.returnBook("Monte-Kristo", "Anna Karenina");
        String[] expected = {"War and piece", "Red hood"};

        assertFalse(Arrays.equals(expected, reader.getNameOfBooks()));
    }

    @Test
    void testReturnBook() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Anna Karenina", "Tolstoi");
        Book book3 = new Book("War and piece", "Tolstoi");
        Book book4 = new Book("Red hood", "Perk");
        Book book5 = new Book("Alphabet", "Teacher");

        reader.takeBook(book1, book2, book3, book4, book5);
        reader.returnBook(book1, book2, book3, book4, book5);
        Book[] expected = new Book[0];

        assertArrayEquals(expected, reader.getBooks());
    }

    @Test
    void testReturnBookFail() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Anna Karenina", "Tolstoi");
        Book book3 = new Book("War and piece", "Tolstoi");
        Book book4 = new Book("Red hood", "Perk");
        Book book5 = new Book("Alphabet", "Teacher");

        reader.takeBook(book1, book2, book3, book4, book5);
        reader.returnBook(book1, book2, book3, book4);
        Book[] expected = new Book[0];

        assertFalse(Arrays.equals(expected, reader.getBooks()));
    }
}