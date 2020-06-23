package practice.practic_16_03_06_2020;

import org.junit.jupiter.api.Test;
import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;
import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;
import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;
import practice.practic_16_03_06_2020.interfaces.*;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplUserTest {

    @Test
    void testingFiveOutOfFive() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        try {
            testing.logIn("Nick", "12345");
        } catch (WrongLoginOrPassword e) {
            System.out.println(e.getMessage());
        }

        User user = testing.getUsers().get("Nick");
        practice.practic_16_03_06_2020.interfaces.Test test = administrator.createTest("Computer science1");
        Question question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        Question question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        Question question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        Question question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        Question question5 = administrator.createQuestion(
                "What is processor?",
                3,
                "Pen", "Sticky", "Apple", "Computer part"
        );

        administrator.addQuestion(question1, test);
        administrator.addQuestion(question2, test);
        administrator.addQuestion(question3, test);
        administrator.addQuestion(question4, test);
        administrator.addQuestion(question5, test);
        administrator.addTest(test);

        try {
            user.chooseTest(test);
            user.startTesting();
        } catch (UserIsNotLoggedIn e) {
            System.out.println(e.getMessage());
        }

        user.answerQuestion(0, 2);
        user.answerQuestion(1, 0);
        user.answerQuestion(2, 1);
        user.answerQuestion(3, 4);
        user.answerQuestion(4, 3);
        user.finishTesting();

        int expectedAssessment = 100;
        int actualAssessment = testing.getResultsOfTesting().get(user).get(0).getAssessment();

        assertEquals(expectedAssessment, actualAssessment);
    }

    @Test
    void testingThreeOutOfFive() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        try {
            testing.logIn("Nick", "12345");
        } catch (WrongLoginOrPassword e) {
            System.out.println(e.getMessage());
        }

        User user = testing.getUsers().get("Nick");
        practice.practic_16_03_06_2020.interfaces.Test test = administrator.createTest("Computer science1");
        Question question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        Question question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        Question question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        Question question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        Question question5 = administrator.createQuestion(
                "What is processor?",
                3,
                "Pen", "Sticky", "Apple", "Computer part"
        );

        administrator.addQuestion(question1, test);
        administrator.addQuestion(question2, test);
        administrator.addQuestion(question3, test);
        administrator.addQuestion(question4, test);
        administrator.addQuestion(question5, test);
        administrator.addTest(test);

        try {
            user.chooseTest(test);
            user.startTesting();
        } catch (UserIsNotLoggedIn e) {
            System.out.println(e.getMessage());
        }

        user.answerQuestion(0, 1);
        user.answerQuestion(1, 1);
        user.answerQuestion(2, 1);
        user.answerQuestion(3, 4);
        user.answerQuestion(4, 3);
        user.finishTesting();

        int expectedAssessment = 60;
        int actualAssessment = testing.getResultsOfTesting().get(user).get(0).getAssessment();

        assertEquals(expectedAssessment, actualAssessment);
    }

    @Test
    void testingNotRegistration() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        User user = new ImplUser("Nick", testing);
        practice.practic_16_03_06_2020.interfaces.Test test = administrator.createTest("Computer science1");
        Question question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        Question question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        Question question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        Question question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        Question question5 = administrator.createQuestion(
                "What is processor?",
                3,
                "Pen", "Sticky", "Apple", "Computer part"
        );

        administrator.addQuestion(question1, test);
        administrator.addQuestion(question2, test);
        administrator.addQuestion(question3, test);
        administrator.addQuestion(question4, test);
        administrator.addQuestion(question5, test);
        administrator.addTest(test);

        try {
            user.chooseTest(test);
            user.startTesting();
        } catch (UserIsNotLoggedIn e) {
            System.out.println(e.getMessage());
        }

        user.answerQuestion(0, 2);
        user.answerQuestion(1, 0);
        user.answerQuestion(2, 1);
        user.answerQuestion(3, 4);
        user.answerQuestion(4, 3);
        user.finishTesting();

        List<AnswersFinal> expectedAnswers = null;
        List<AnswersFinal> actualAnswers = testing.getResultsOfTesting().get(user);

        assertEquals(expectedAnswers, actualAnswers);
    }

    @Test
    void testingNotAuthorisation() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        User user = testing.getUsers().get("Nick");
        practice.practic_16_03_06_2020.interfaces.Test test = administrator.createTest("Computer science1");
        Question question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        Question question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        Question question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        Question question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        Question question5 = administrator.createQuestion(
                "What is processor?",
                3,
                "Pen", "Sticky", "Apple", "Computer part"
        );

        administrator.addQuestion(question1, test);
        administrator.addQuestion(question2, test);
        administrator.addQuestion(question3, test);
        administrator.addQuestion(question4, test);
        administrator.addQuestion(question5, test);
        administrator.addTest(test);

        try {
            user.chooseTest(test);
            user.startTesting();
        } catch (UserIsNotLoggedIn e) {
            System.out.println(e.getMessage());
        }

        user.answerQuestion(0, 2);
        user.answerQuestion(1, 0);
        user.answerQuestion(2, 1);
        user.answerQuestion(3, 4);
        user.answerQuestion(4, 3);
        user.finishTesting();

        List<AnswersFinal> expectedAnswers = null;
        List<AnswersFinal> actualAnswers = testing.getResultsOfTesting().get(user);

        assertEquals(expectedAnswers, actualAnswers);
    }
}