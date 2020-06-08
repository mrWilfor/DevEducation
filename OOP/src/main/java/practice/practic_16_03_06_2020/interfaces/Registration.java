package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;

public interface Registration {
    boolean registration(String login,  String password) throws UserWithThatUsernameExists;
}
