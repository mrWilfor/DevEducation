package practice.practic_16_03_06_2020;

import org.junit.jupiter.api.Test;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import static org.junit.jupiter.api.Assertions.*;

class ImplTestingTest {

    @Test
    void registration() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        testing.registration("Nick", "12345");

        ImplUser user = testing.getUsers().get("Nick");

        assertTrue(testing.getUsers().containsKey("Nick"));
        assertFalse(user.isStatus());
    }

    @Test
    void logIn() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        testing.registration("Nick", "12345");
        testing.logIn("Nick", "12345");

        ImplUser user = testing.getUsers().get("Nick");

        assertTrue(user.isStatus());

    }
}