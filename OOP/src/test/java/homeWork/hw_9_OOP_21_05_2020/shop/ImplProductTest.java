package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplProductTest {

    @Test
    void get() {
        ImplProduct implProduct = new ImplProduct("Bread", 20, 55);
        String expectedName = "Bread";
        int expectedPrise = 20;
        int expectedRating = 55;

        assertEquals(expectedName, implProduct.getName());
        assertEquals(expectedPrise, implProduct.getPrise());
        assertEquals(expectedRating, implProduct.getRating());
    }

    @Test
    void equalsTrue() {
        ImplProduct implProduct1 = new ImplProduct("Bread", 20, 55);
        ImplProduct implProduct2 = new ImplProduct("Bread", 20, 55);

        assertTrue(implProduct1.equals(implProduct2));
    }

    @Test
    void equalsFail() {
        ImplProduct implProduct1 = new ImplProduct("Button", 20, 55);
        ImplProduct implProduct2 = new ImplProduct("Bread", 20, 55);

        assertFalse(implProduct1.equals(implProduct2));
    }

    @Test
    void hashCodeTrue() {
        ImplProduct implProduct1 = new ImplProduct("Bread", 20, 55);
        ImplProduct implProduct2 = new ImplProduct("Bread", 20, 55);

        assertEquals(implProduct1.hashCode(), implProduct2.hashCode());
    }

    @Test
    void hashCodeFail() {
        ImplProduct implProduct1 = new ImplProduct("Button", 20, 55);
        ImplProduct implProduct2 = new ImplProduct("Bread", 20, 55);

        assertNotEquals(implProduct1.hashCode(), implProduct2.hashCode());
    }

    @Test
    void toStringTrue() {
        ImplProduct implProduct = new ImplProduct("Bread", 20, 55);
        String expected = "Product{name='Bread', prise='20', rating='55'}";

        assertEquals(expected, implProduct.toString());
    }

    @Test
    void toStringFail() {
        ImplProduct implProduct = new ImplProduct("Button", 20, 55);
        String expected = "Product{name='Bread', prise='20', rating='55'}";

        assertNotEquals(expected, implProduct.toString());
    }
}