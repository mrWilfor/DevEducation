package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AdministratorTest {

    @Test
    void equals() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("John");

        assertTrue(administrator.equals(administrator2));
    }

    @Test
    void equalsFail() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("Mike");

        assertFalse(administrator.equals(administrator2));
    }

    @Test
    void hashCodeTrue() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("John");

        assertEquals(administrator.hashCode(), administrator2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Administrator administrator = new Administrator("John");
        Administrator administrator2 = new Administrator("Mike");

        assertNotEquals(administrator.hashCode(), administrator2.hashCode());
    }

    @Test
    void toStringTrue() {
        Administrator administrator = new Administrator("John");
        String expected = "Administrator{name='John', position='Administrator', department='Shop'}";

        assertEquals(expected, administrator.toString());
    }

    @Test
    void toStringFalse() {
        Administrator administrator = new Administrator("John");
        String expected = "Administrator{name='John', position='Cashier', department='Shop'}";

        assertNotEquals(expected, administrator.toString());
    }
}