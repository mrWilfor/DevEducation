package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.ImplTesting;

public interface User {
    void chooseTest(ImplTest test);

    void testing();

    void startTesting();

    void answerQuestion(int indexQuestion, int indexAnswer);

    void finishTesting();

    void logOut();

    String getName();

    long getId();

    ImplTesting getTesting();

    boolean isStatus();

    void setStatus(boolean status);
}
