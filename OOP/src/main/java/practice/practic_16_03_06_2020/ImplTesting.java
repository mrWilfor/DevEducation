package practice.practic_16_03_06_2020;

import practice.practic_16_03_06_2020.answers.ImplAnswersFinal;
import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;
import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;
import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;
import practice.practic_16_03_06_2020.interfaces.Testing;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import java.util.ArrayList;
import java.util.HashMap;

public class ImplTesting implements Testing {

    private ArrayList<ImplTest> tests = new ArrayList<>();
    private HashMap<String, ImplUser> users = new HashMap<>();
    private HashMap<String, String> loginsAndPasswords = new HashMap<>();
    private ImplAdministrator administrator = new ImplAdministrator(this);
    private HashMap<ImplUser, ArrayList<ImplAnswersFinal>> resultsOfTesting = new HashMap<>();

    @Override
    public boolean registration(String login,  String password) throws UserWithThatUsernameExists {
        if (users.containsKey(login)) {
            throw new UserWithThatUsernameExists("A user with that username exists");
        }

        users.put(login, new ImplUser(login,  this));
        loginsAndPasswords.put(login, password);
        return true;
    }

    @Override
    public boolean logIn(String login, String password) throws WrongLoginOrPassword {
        if (users.containsKey(login)) {
            if (password.equals(loginsAndPasswords.get(login))) {
                users.get(login).setStatus(true);
                return true;
            } else {
                throw new WrongLoginOrPassword("Wrong password");
            }
        } else {
            throw new WrongLoginOrPassword("Wrong login");
        }
    }

    @Override
    public void addResultOfTesting(ImplAnswersFinal answers, ImplUser user) throws UserIsNotLoggedIn {
        if (!resultsOfTesting.containsKey(user)) {
            resultsOfTesting.put(user, new ArrayList<>());
        } else {
            throw new UserIsNotLoggedIn("You are not logged in");
        }
        resultsOfTesting.get(user).add(answers);
    }

    @Override
    public ImplAdministrator getAdministrator() {
        return administrator;
    }

    @Override
    public ArrayList<ImplTest> getTests() {
        return tests;
    }

    @Override
    public HashMap<String, ImplUser> getUsers() {
        return users;
    }

    @Override
    public HashMap<ImplUser, ArrayList<ImplAnswersFinal>> getResultsOfTesting() {
        return resultsOfTesting;
    }
}
