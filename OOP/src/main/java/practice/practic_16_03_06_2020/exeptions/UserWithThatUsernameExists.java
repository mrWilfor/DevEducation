package practice.practic_16_03_06_2020.exeptions;

public class UserWithThatUsernameExists extends Exception {
    public UserWithThatUsernameExists(String message) {
        super(message);
    }
}
