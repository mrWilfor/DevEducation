package practice.practic_16_03_06_2020.exeptions;

public class WrongLoginOrPassword extends Exception {
    public WrongLoginOrPassword(String message) {
        super(message);
    }
}
