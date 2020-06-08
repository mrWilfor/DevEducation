package practice.practic_16_03_06_2020.exeptions;

public class UserIsNotLoggedIn extends Exception {
    public UserIsNotLoggedIn(String message) {
        super(message);
    }
}
