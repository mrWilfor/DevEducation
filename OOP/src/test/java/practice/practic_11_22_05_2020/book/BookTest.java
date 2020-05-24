package practice.practic_11_22_05_2020.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void setGet() {
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book();
        book2.setName("Monte-Kristo");
        book2.setAuthor("Duma");

        assertEquals(book1, book2);
        assertEquals(book1.getName(), book2.getName());
        assertEquals(book1.getAuthor(), book2.getAuthor());
    }

    @Test
    void Equals() {
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Monte-Kristo", "Duma");

        assertTrue(book1.equals(book2));
    }

    @Test
    void EqualsFail() {
        Book book1 = new Book("Monte-Kristo", "Dante");
        Book book2 = new Book("Monte-Kristo", "Duma");

        assertFalse(book1.equals(book2));
    }

    @Test
    void hashCodeTrue() {
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Monte-Kristo", "Duma");

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Book book1 = new Book("Monte-Kristo", "Duma");
        Book book2 = new Book("Monte-Kristo", "Dante");

        assertNotEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    void toStringTrue() {
        Book book = new Book("Monte-Kristo", "Duma");
        String expected = "Book{name='Monte-Kristo', author='Duma'}";

        assertEquals(expected, book.toString());
    }

    @Test
    void toStringFail() {
        Book book = new Book("Monte-Kristo", "Dante");
        String expected = "Book{name='Monte-Kristo', author='Duma'}";

        assertNotEquals(expected, book.toString());
    }
}