package HomeWork.HW_8_07_05_2020.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void createBookTest() {
        long expId = 547L;
        String expName = "Jungle book";
        String expAuthors = "Kipling";
        String expPublishingHouse = "New York Published";
        long expAgePublishing = 1893;
        long expQuantityPage = 300;
        long expPrise = 12;
        String expBinding = "Hard cover";

        Book b1 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");
        Book b2 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");

        assertEquals(b1, b2);
        assertEquals(expId, b1.getId());
        assertEquals(expName, b1.getName());
        assertEquals(expAuthors, b1.getAuthors());
        assertEquals(expPublishingHouse, b1.getPublishingHouse());
        assertEquals(expAgePublishing, b1.getAgePublishing());
        assertEquals(expQuantityPage, b1.getQuantityPage());
        assertEquals(expPrise, b1.getPrise());
        assertEquals(expBinding, b1.getBinding());
    }

    @Test
    void setGetBookTest() {
        Book b = new Book();
        long expId = 547L;
        String expName = "Jungle book";
        String expAuthors = "Kipling";
        String expPublishingHouse = "New York Published";
        long expAgePublishing = 1893;
        long expQuantityPage = 300;
        long expPrise = 12;
        String expBinding = "Hard cover";

        b.setId(547L);
        b.setName("Jungle book");
        b.setAuthors("Kipling");
        b.setPublishingHouse("New York Published");
        b.setAgePublishing(1893);
        b.setQuantityPage(300);
        b.setPrise(12);
        b.setBinding("Hard cover");

        assertEquals(expId, b.getId());
        assertEquals(expName, b.getName());
        assertEquals(expAuthors, b.getAuthors());
        assertEquals(expPublishingHouse, b.getPublishingHouse());
        assertEquals(expAgePublishing, b.getAgePublishing());
        assertEquals(expQuantityPage, b.getQuantityPage());
        assertEquals(expPrise, b.getPrise());
        assertEquals(expBinding, b.getBinding());
    }

    @Test
    void builderBookTest() {
        Book b1 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");

        Book b2 = new Book.Builder()
                .id(547L)
                .name("Jungle book")
                .authors("Kipling")
                .publishingHouse("New York Published")
                .agePublishing(1893)
                .quantityPage(300)
                .prise(12)
                .binding("Hard cover")
                .build();

        assertEquals(b1, b2);
    }

    @Test
    void testEqualsTest() {
        Book b1 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");
        Book b2 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");

        assertEquals(b1, b2);
    }

    @Test
    void testEqualsTestFail() {
        Book b1 = new Book(547, "Jungle book", "Kipling", "New York Published",
                2000, 300, 12, "Hard cover");
        Book b2 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");

        assertFalse(b1.equals(b2));
    }

    @Test
    void testHashCodeTest() {
        Book b1 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");
        Book b2 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");

        assertTrue(b1.hashCode() == b2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Book b1 = new Book(547, "Jungle book", "Kipling", "New York Published",
                2000, 300, 12, "Hard cover");
        Book b2 = new Book(547, "Jungle book", "Kipling", "New York Published",
                1893, 300, 12, "Hard cover");
        System.out.println(b1.hashCode());
        assertFalse(b1.hashCode() == b2.hashCode());
    }

    @Test
    void testToString() {
        Book b = new Book(547, "Jungle book", "Kipling", "New York Published",
                2000, 300, 12, "Hard cover");

        String expected = "HomeWork.HW_8_07_05_2020.object.Book@844739352[id=547, name=Jungle book, authors=Kipling, " +
                "publishingHouse=New York Published, agePublishing=2000, quantityPage=300, prise=12, binding=Hard cover]";

        assertEquals(expected, b.toString());
    }

}