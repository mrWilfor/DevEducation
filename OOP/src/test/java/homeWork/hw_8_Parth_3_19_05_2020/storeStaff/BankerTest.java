package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BankerTest {

    @Test
    void equals() {
        Banker banker = new Banker("John");
        Banker banker2 = new Banker("John");

        assertTrue(banker.equals(banker2));
    }

    @Test
    void equalsFail() {
        Banker banker = new Banker("John");
        Banker banker2 = new Banker("Mike");

        assertFalse(banker.equals(banker2));
    }

    @Test
    void hashCodeTrue() {
        Banker banker = new Banker("John");
        Banker banker2 = new Banker("John");

        assertEquals(banker.hashCode(), banker2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Banker banker = new Banker("John");
        Banker banker2 = new Banker("Mike");

        assertNotEquals(banker.hashCode(), banker2.hashCode());
    }

    @Test
    void toStringTrue() {
        Banker banker = new Banker("John");
        String expected = "Banker{name='John', position='Banker', department='Bank'}";

        assertEquals(expected, banker.toString());
    }

    @Test
    void toStringFalse() {
        Banker banker = new Banker("John");
        String expected = "Banker{name='John', position='Cashier', department='Bank'}";

        assertNotEquals(expected, banker.toString());
    }
}