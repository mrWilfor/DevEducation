package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CashierTest {

    @Test
    void equals() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("John");

        assertTrue(cashier.equals(cashier2));
    }

    @Test
    void equalsFail() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("Mike");

        assertFalse(cashier.equals(cashier2));
    }

    @Test
    void hashCodeTrue() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("John");

        assertEquals(cashier.hashCode(), cashier2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Cashier cashier = new Cashier("John");
        Cashier cashier2 = new Cashier("Mike");

        assertNotEquals(cashier.hashCode(), cashier2.hashCode());
    }

    @Test
    void toStringTrue() {
        Cashier cashier = new Cashier("John");
        String expected = "Cashier{name='John', position='Cashier', department='Shop'}";

        assertEquals(expected, cashier.toString());
    }

    @Test
    void toStringFalse() {
        Cashier cashier = new Cashier("John");
        String expected = "Cashier{name='John', position='Security', department='Shop'}";

        assertNotEquals(expected, cashier.toString());
    }
}