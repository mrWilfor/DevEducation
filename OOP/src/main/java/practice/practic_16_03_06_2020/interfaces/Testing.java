package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.answers.ImplAnswersFinal;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import java.util.ArrayList;
import java.util.HashMap;

public interface Testing extends Registration, LogIn {
    void addResultOfTesting(ImplAnswersFinal answers, ImplUser user);

    ImplAdministrator getAdministrator();

    ArrayList<ImplTest> getTests();

    HashMap<String, ImplUser> getUsers();

    HashMap<ImplUser, ArrayList<ImplAnswersFinal>> getResultsOfTesting();
}
