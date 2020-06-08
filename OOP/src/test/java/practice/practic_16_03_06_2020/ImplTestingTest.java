package practice.practic_16_03_06_2020;

import org.junit.jupiter.api.Test;
import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;
import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import static org.junit.jupiter.api.Assertions.*;

class ImplTestingTest {

    @Test
    void registration() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        ImplUser user = testing.getUsers().get("Nick");

        assertTrue(testing.getUsers().containsKey("Nick"));
        assertFalse(user.isStatus());
    }

    @Test
    void registrationException() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        ImplUser user = testing.getUsers().get("Nick");

        assertTrue(testing.getUsers().containsKey("Nick"));
        assertFalse(user.isStatus());
    }

    @Test
    void logIn() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        try {
            testing.logIn("Nick", "12345");
        } catch (WrongLoginOrPassword e) {
            System.out.println(e.getMessage());
        }

        ImplUser user = testing.getUsers().get("Nick");

        assertTrue(user.isStatus());
    }

    @Test
    void logInWrongLogin() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        try {
            testing.logIn("Nick23", "12345");
        } catch (WrongLoginOrPassword e) {
            System.out.println(e.getMessage());
        }

        ImplUser user = testing.getUsers().get("Nick");

        assertFalse(user.isStatus());
    }

    @Test
    void logInWrongPassword() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        try {
            testing.logIn("Nick", "123");
        } catch (WrongLoginOrPassword e) {
            System.out.println(e.getMessage());
        }

        ImplUser user = testing.getUsers().get("Nick");

        assertFalse(user.isStatus());
    }
}