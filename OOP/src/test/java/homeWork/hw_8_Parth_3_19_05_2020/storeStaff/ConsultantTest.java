package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ConsultantTest {

    @Test
    void equals() {
        Consultant consultant = new Consultant("John", "Shop");
        Consultant consultant2 = new Consultant("John", "Shop");

        assertTrue(consultant.equals(consultant2));
    }

    @Test
    void equalsFail() {
        Consultant consultant = new Consultant("John", "Shop");
        Consultant consultant2 = new Consultant("Mike", "Shop");

        assertFalse(consultant.equals(consultant2));
    }

    @Test
    void hashCodeTrue() {
        Consultant consultant = new Consultant("John", "Shop");
        Consultant consultant2 = new Consultant("John", "Shop");

        assertEquals(consultant.hashCode(), consultant2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Consultant consultant = new Consultant("John", "Shop");
        Consultant consultant2 = new Consultant("Mike", "Shop");

        assertNotEquals(consultant.hashCode(), consultant2.hashCode());
    }

    @Test
    void toStringTrue() {
        Consultant consultant = new Consultant("John", "Shop");
        String expected = "Consultant{name='John', position='Consultant', department='Shop'}";

        assertEquals(expected, consultant.toString());
    }

    @Test
    void toStringFalse() {
        Consultant consultant = new Consultant("John", "Shop");
        String expected = "Consultant{name='John', position='Security', department='Shop'}";

        assertNotEquals(expected, consultant.toString());
    }
}