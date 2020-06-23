package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;

import java.util.List;
import java.util.Map;

public interface Testing extends Registration, LogIn {
    void addResultOfTesting(AnswersFinal answers, User user) throws UserIsNotLoggedIn;

    Administrator getAdministrator();

    List<Test> getTests();

    Map<String, User> getUsers();

    Map<User, List<AnswersFinal>> getResultsOfTesting();
}
