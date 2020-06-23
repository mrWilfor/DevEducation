package practice.practic_16_03_06_2020;

import org.junit.jupiter.api.Test;
import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;
import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;
import practice.practic_16_03_06_2020.interfaces.Administrator;
import practice.practic_16_03_06_2020.interfaces.Testing;
import practice.practic_16_03_06_2020.interfaces.User;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplTestingTest {

    @Test
    void registration() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        User user = testing.getUsers().get("Nick");

        assertTrue(testing.getUsers().containsKey("Nick"));
        assertFalse(user.isStatus());
    }

    @Test
    void registrationException() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        User user = testing.getUsers().get("Nick");

        assertTrue(testing.getUsers().containsKey("Nick"));
        assertFalse(user.isStatus());
    }

    @Test
    void logIn() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

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

        User user = testing.getUsers().get("Nick");

        assertTrue(user.isStatus());
    }

    @Test
    void logInWrongLogin() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

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

        User user = testing.getUsers().get("Nick");

        assertFalse(user.isStatus());
    }

    @Test
    void logInWrongPassword() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

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

        User user = testing.getUsers().get("Nick");

        assertFalse(user.isStatus());
    }
}