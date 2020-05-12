package HomeWork.HW_8_07_05_2020.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void createTest() {
        long expId = 95839;
        String expName = "eat";
        long expUpc = 1242324;
        String expManufacturer = "Virginia";
        long expPrise = 5;
        int expShelfLife = 3;
        long expQuantity = 1000;

        Product p1 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);
        Product p2 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);

        assertEquals(p1, p2);
        assertEquals(expId, p1.getId());
        assertEquals(expName, p1.getName());
        assertEquals(expUpc, p1.getUpc());
        assertEquals(expManufacturer, p1.getManufacturer());
        assertEquals(expPrise, p1.getPrise());
        assertEquals(expShelfLife, p1.getShelfLife());
        assertEquals(expQuantity, p1.getQuantity());
    }

    @Test
    void setGetTest() {
        Product p = new Product();
        long expId = 95839;
        String expName = "eat";
        long expUpc = 1242324;
        String expManufacturer = "Virginia";
        long expPrise = 5;
        int expShelfLife = 3;
        long expQuantity = 1000;

        p.setId(95839);
        p.setName("eat");
        p.setUpc(1242324);
        p.setManufacturer("Virginia");
        p.setPrise(5);
        p.setShelfLife(3);
        p.setQuantity(1000);

        assertEquals(expId, p.getId());
        assertEquals(expName, p.getName());
        assertEquals(expUpc, p.getUpc());
        assertEquals(expManufacturer, p.getManufacturer());
        assertEquals(expPrise, p.getPrise());
        assertEquals(expShelfLife, p.getShelfLife());
        assertEquals(expQuantity, p.getQuantity());
    }

    @Test
    void builderTest() {
        Product p1 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);

        Product p2 = new Product.Builder()
                .id(95839)
                .name("eat")
                .upc(1242324)
                .manufacturer("Virginia")
                .prise(5)
                .shelfLife(3)
                .quantity(1000)
                .build();

        assertEquals(p1, p2);
    }

    @Test
    void testEqualsTest() {
        Product p1 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);
        Product p2 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);

        assertEquals(p1, p2);
    }

    @Test
    void testEqualsTestFail() {
        Product p1 = new Product(95839, "water", 1242324, "Virginia", 5, 3, 1000);
        Product p2 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);

        assertFalse(p1.equals(p2));
    }

    @Test
    void testHashCodeTest() {
        Product p1 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);
        Product p2 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);

        assertTrue(p1.hashCode() == p2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Product p1 = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);
        Product p2 = new Product(95839, "water", 1242324, "Virginia", 5, 3, 1000);

        assertFalse(p1.hashCode() == p2.hashCode());
    }

    @Test
    void testToString() {
        Product p = new Product(95839, "eat", 1242324, "Virginia", 5, 3, 1000);
        String expected = "HomeWork.HW_8_07_05_2020.object.Product@1622836962[id=95839, name=eat, upc=1242324, " +
                "manufacturer=Virginia, prise=5, shelfLife=3, quantity=1000]";

        assertEquals(expected, p.toString());
    }
}