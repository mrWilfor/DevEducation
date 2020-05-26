package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SecurityGuardTest {

    @Test
    void equals() {
        SecurityGuard securityGuard = new SecurityGuard("John");
        SecurityGuard securityGuard2 = new SecurityGuard("John");

        assertTrue(securityGuard.equals(securityGuard2));
    }

    @Test
    void equalsFail() {
        SecurityGuard securityGuard = new SecurityGuard("John");
        SecurityGuard securityGuard2 = new SecurityGuard("Mike");

        assertFalse(securityGuard.equals(securityGuard2));
    }

    @Test
    void hashCodeTrue() {
        SecurityGuard securityGuard = new SecurityGuard("John");
        SecurityGuard securityGuard2 = new SecurityGuard("John");

        assertEquals(securityGuard.hashCode(), securityGuard2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        SecurityGuard securityGuard = new SecurityGuard("John");
        SecurityGuard securityGuard2 = new SecurityGuard("Mike");

        assertNotEquals(securityGuard.hashCode(), securityGuard2.hashCode());
    }

    @Test
    void toStringTrue() {
        SecurityGuard securityGuard = new SecurityGuard("John");
        String expected = "SecurityGuard{name='John', position='SecurityGuard', department='Shop'}";

        assertEquals(expected, securityGuard.toString());
    }

    @Test
    void toStringFalse() {
        SecurityGuard securityGuard = new SecurityGuard("John");
        String expected = "SecurityGuard{name='John', position='Security', department='Shop'}";

        assertNotEquals(expected, securityGuard.toString());
    }
}