package practice.practic_11_22_05_2020.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void getListOfReader() {
        Reader reader = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Library library1 = new Library(reader);
        Reader[] expected = {reader};
        assertArrayEquals(expected, library1.getListOfReader());

    }

    @Test
    void addReaderMany() {
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
        Reader reader3 = new Reader(
                "Sidorov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader4 = new Reader(
                "Ilyin I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader5 = new Reader(
                "Vasilyev I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Library library = new Library();
        Reader[] expected = {reader1, reader2, reader3, reader4, reader5};

        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);
        library.addReader(reader4);
        library.addReader(reader5);

        assertArrayEquals(expected, library.getListOfReader());
    }

    @Test
    void addReaderTwo() {
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

        Library library = new Library();
        Reader[] expected = {reader1, reader2};

        library.addReader(reader1);
        library.addReader(reader2);

        assertArrayEquals(expected, library.getListOfReader());
    }

    @Test
    void addReaderOne() {
        Reader reader1 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        Library library = new Library();
        Reader[] expected = {reader1};

        library.addReader(reader1);

        assertArrayEquals(expected, library.getListOfReader());
    }

    @Test
    void deleteReaderMany() {
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
        Reader reader3 = new Reader(
                "Sidorov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader4 = new Reader(
                "Ilyin I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Reader reader5 = new Reader(
                "Vasilyev I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );
        Library library = new Library();
        Reader[] expected = {reader1, reader2, reader4, reader5};

        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);
        library.addReader(reader4);
        library.addReader(reader5);
        library.deleteReader(reader3);

        assertArrayEquals(expected, library.getListOfReader());
    }

    @Test
    void deleteReaderTwo() {
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

        Library library = new Library();
        Reader[] expected = {reader2};

        library.addReader(reader1);
        library.addReader(reader2);
        library.deleteReader(reader1);

        assertArrayEquals(expected, library.getListOfReader());
    }

    @Test
    void deleteReaderOne() {
        Reader reader1 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        Library library = new Library();
        Reader[] expected = new Reader[0];

        library.addReader(reader1);
        library.deleteReader(reader1);

        assertArrayEquals(expected, library.getListOfReader());
    }

    @Test
    void deleteReaderZero() {
        Reader reader1 = new Reader(
                "Petrov I.P.",
                "3495393",
                "technical",
                "1996-12-12T00:00:00.00Z",
                304583340L
        );

        Library library = new Library();
        Reader[] expected = null;

        library.deleteReader(reader1);

        assertArrayEquals(expected, library.getListOfReader());
    }
}