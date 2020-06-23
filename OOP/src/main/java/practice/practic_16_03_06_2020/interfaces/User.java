package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;

public interface User {
    void chooseTest(Test test) throws UserIsNotLoggedIn;

    void testing();

    void startTesting() throws UserIsNotLoggedIn;

    void answerQuestion(int indexQuestion, int indexAnswer);

    void finishTesting();

    void logOut();

    String getName();

    long getId();

    Testing getTesting();

    boolean isStatus();

    void setStatus(boolean status);
}
