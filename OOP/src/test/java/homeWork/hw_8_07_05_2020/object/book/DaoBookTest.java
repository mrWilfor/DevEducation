package homeWork.hw_8_07_05_2020.object.book;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoBookTest {
    private DaoBook daoBook;

    @BeforeEach
    public void before() {
        this.daoBook = new DaoBook();
    }

    @AfterEach
    public void after() {
        this.daoBook.clear();
    }

    @Test
    void createMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");

        long actualId1 = this.daoBook.create(b1);
        long actualId2 = this.daoBook.create(b2);
        long actualId3 = this.daoBook.create(b3);
        long actualId4 = this.daoBook.create(b4);
        long actualId5 = this.daoBook.create(b5);

        long expectedId1 = 1;
        long expectedId2 = 2;
        long expectedId3 = 3;
        long expectedId4 = 4;
        long expectedId5 = 5;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
        assertEquals(expectedId3, actualId3);
        assertEquals(expectedId4, actualId4);
        assertEquals(expectedId5, actualId5);
    }

    @Test
    void createTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");

        long actualId1 = this.daoBook.create(b1);
        long actualId2 = this.daoBook.create(b2);

        long expectedId1 = 1;
        long expectedId2 = 2;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        long actualId1 = this.daoBook.create(b1);
        long expectedId1 = 1;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Book b1 = new Book();
        long actualId1 = this.daoBook.create(b1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.create(b3);
        this.daoBook.create(b4);
        this.daoBook.create(b5);

        Book[] expected = {b1, b2, b3, b4, b5};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);

        Book[] expected = {b1, b2};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");

        this.daoBook.create(b1);

        Book[] expected = {b1};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAuthorMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.create(b3);
        this.daoBook.create(b4);
        this.daoBook.create(b5);

        Book[] expected = {b1, b2};
        Book[] actual = this.daoBook.readByAuthor("Kipling");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAuthorTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);

        Book[] expected = {b1, b2};
        Book[] actual = this.daoBook.readByAuthor("Kipling");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAuthorOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");

        this.daoBook.create(b1);

        Book[] expected = {b1};
        Book[] actual = this.daoBook.readByAuthor("Kipling");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAuthorZero() {
        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readByAuthor("Kipling");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPublishingHouseMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.create(b3);
        this.daoBook.create(b4);
        this.daoBook.create(b5);

        Book[] expected = {b3};
        Book[] actual = this.daoBook.readByPublishingHouse("San Francisco Published");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPublishingHouseTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);

        Book[] expected = {b1, b2};
        Book[] actual = this.daoBook.readByPublishingHouse("New York Published");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPublishingHouseOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");

        this.daoBook.create(b1);

        Book[] expected = {b1};
        Book[] actual = this.daoBook.readByPublishingHouse("New York Published");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByPublishingHouseZero() {
        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readByPublishingHouse("New York Published");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterAgePublishingMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.create(b3);
        this.daoBook.create(b4);
        this.daoBook.create(b5);

        Book[] expected = {b4, b5};
        Book[] actual = this.daoBook.readByAfterAgePublishing(1900);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterAgePublishingTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);

        Book[] expected = {b2};
        Book[] actual = this.daoBook.readByAfterAgePublishing(1890);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterAgePublishingOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");

        this.daoBook.create(b1);

        Book[] expected = {b1};
        Book[] actual = this.daoBook.readByAfterAgePublishing(1880);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByAfterAgePublishingZero() {
        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readByAfterAgePublishing(1880);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.create(b3);
        this.daoBook.create(b4);
        this.daoBook.create(b5);
        this.daoBook.remove(1);

        Book[] expected = {b2, b3, b4, b5};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.remove(1);

        Book[] expected = {b2};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.remove(1);

        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        Book[] expected = new Book[0];
        this.daoBook.remove(1);
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");
        Book b6 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Soft cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.create(b3);
        this.daoBook.create(b4);
        this.daoBook.create(b5);
        this.daoBook.update(b6);

        Book[] expected = {b6, b2, b3, b4, b5};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b6 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Soft cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.update(b6);

        Book[] expected = {b6, b2};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b6 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Soft cover");

        this.daoBook.create(b1);
        this.daoBook.update(b6);

        Book[] expected = {b6};
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Book b6 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Soft cover");

        this.daoBook.update(b6);

        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");
        Book b3 = new Book(3, "Monte Kristo", "Dumas", "San Francisco Published",
                1850, 300, 12, "Hard cover");
        Book b4 = new Book(4, "Bright", "King", "Hollywood Published",
                1902, 380, 12, "Hard cover");
        Book b5 = new Book(5, "C++", "Shild", "London Published",
                1999, 1300, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.create(b3);
        this.daoBook.create(b4);
        this.daoBook.create(b5);
        this.daoBook.clear();

        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");
        Book b2 = new Book(2, "Jungle book part 2", "Kipling", "New York Published",
                1893, 260, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.create(b2);
        this.daoBook.clear();

        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Book b1 = new Book(1, "Jungle book part 1", "Kipling", "New York Published",
                1888, 250, 12, "Hard cover");

        this.daoBook.create(b1);
        this.daoBook.clear();

        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoBook.clear();

        Book[] expected = new Book[0];
        Book[] actual = this.daoBook.readAll();

        assertArrayEquals(expected, actual);
    }
}