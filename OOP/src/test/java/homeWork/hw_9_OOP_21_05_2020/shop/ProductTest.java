package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void get() {
        Product product = new Product("Bread", 20, 55);
        String expectedName = "Bread";
        int expectedPrise = 20;
        int expectedRating = 55;

        assertEquals(expectedName, product.getName());
        assertEquals(expectedPrise, product.getPrise());
        assertEquals(expectedRating, product.getRating());
    }

    @Test
    void equalsTrue() {
        Product product1 = new Product("Bread", 20, 55);
        Product product2 = new Product("Bread", 20, 55);

        assertTrue(product1.equals(product2));
    }

    @Test
    void equalsFail() {
        Product product1 = new Product("Button", 20, 55);
        Product product2 = new Product("Bread", 20, 55);

        assertFalse(product1.equals(product2));
    }

    @Test
    void hashCodeTrue() {
        Product product1 = new Product("Bread", 20, 55);
        Product product2 = new Product("Bread", 20, 55);

        assertEquals(product1.hashCode(), product2.hashCode());
    }

    @Test
    void hashCodeFail() {
        Product product1 = new Product("Button", 20, 55);
        Product product2 = new Product("Bread", 20, 55);

        assertNotEquals(product1.hashCode(), product2.hashCode());
    }

    @Test
    void toStringTrue() {
        Product product = new Product("Bread", 20, 55);
        String expected = "Product{name='Bread', prise='20', rating='55'}";

        assertEquals(expected, product.toString());
    }

    @Test
    void toStringFail() {
        Product product = new Product("Button", 20, 55);
        String expected = "Product{name='Bread', prise='20', rating='55'}";

        assertNotEquals(expected, product.toString());
    }
}