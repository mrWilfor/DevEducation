package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;

public interface LogIn {
    boolean logIn(String login, String password) throws WrongLoginOrPassword;
}
