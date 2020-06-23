package practice.practic_16_03_06_2020;

import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;
import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;
import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;
import practice.practic_16_03_06_2020.interfaces.*;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplTesting implements Testing {

    private List<Test> tests = new ArrayList<>();
    private Map<String, User> users = new HashMap<>();
    private Map<String, String> loginsAndPasswords = new HashMap<>();
    private Administrator administrator = new ImplAdministrator(this);
    private Map<User, List<AnswersFinal>> resultsOfTesting = new HashMap<>();

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
    public void addResultOfTesting(AnswersFinal answers, User user) throws UserIsNotLoggedIn {
        if (!resultsOfTesting.containsKey(user)) {
            resultsOfTesting.put(user, new ArrayList<>());
        } else {
            throw new UserIsNotLoggedIn("You are not logged in");
        }
        resultsOfTesting.get(user).add(answers);
    }

    @Override
    public Administrator getAdministrator() {
        return administrator;
    }

    @Override
    public List<Test> getTests() {
        return tests;
    }

    @Override
    public Map<String, User> getUsers() {
        return users;
    }

    @Override
    public Map<User, List<AnswersFinal>> getResultsOfTesting() {
        return resultsOfTesting;
    }
}
