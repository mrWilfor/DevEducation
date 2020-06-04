package practice.practic_16_03_06_2020;

import org.junit.jupiter.api.Test;
import practice.practic_16_03_06_2020.answers.ImplAnswersFinal;
import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplUserTest {

    @Test
    void testingFiveOutOfFive() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        testing.registration("Nick", "12345");
        testing.logIn("Nick", "12345");

        ImplUser user = testing.getUsers().get("Nick");
        ImplTest test = administrator.createTest("Computer science1");
        ImplQuestion question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        ImplQuestion question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        ImplQuestion question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        ImplQuestion question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        ImplQuestion question5 = administrator.createQuestion(
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

        user.chooseTest(test);
        user.startTesting();
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
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        testing.registration("Nick", "12345");
        testing.logIn("Nick", "12345");

        ImplUser user = testing.getUsers().get("Nick");
        ImplTest test = administrator.createTest("Computer science1");
        ImplQuestion question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        ImplQuestion question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        ImplQuestion question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        ImplQuestion question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        ImplQuestion question5 = administrator.createQuestion(
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

        user.chooseTest(test);
        user.startTesting();
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
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        ImplUser user = new ImplUser("Nick", testing);
        ImplTest test = administrator.createTest("Computer science1");
        ImplQuestion question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        ImplQuestion question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        ImplQuestion question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        ImplQuestion question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        ImplQuestion question5 = administrator.createQuestion(
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

        user.chooseTest(test);
        user.startTesting();
        user.answerQuestion(0, 2);
        user.answerQuestion(1, 0);
        user.answerQuestion(2, 1);
        user.answerQuestion(3, 4);
        user.answerQuestion(4, 3);
        user.finishTesting();

        ArrayList<ImplAnswersFinal> expectedAnswers = null;
        ArrayList<ImplAnswersFinal> actualAnswers = testing.getResultsOfTesting().get(user);

        assertEquals(expectedAnswers, actualAnswers);
    }

    @Test
    void testingNotAuthorisation() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        testing.registration("Nick", "12345");

        ImplUser user = testing.getUsers().get("Nick");
        ImplTest test = administrator.createTest("Computer science1");
        ImplQuestion question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        ImplQuestion question2 = administrator.createQuestion(
                "What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        ImplQuestion question3 = administrator.createQuestion(
                "What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        ImplQuestion question4 = administrator.createQuestion(
                "What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        ImplQuestion question5 = administrator.createQuestion(
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

        user.chooseTest(test);
        user.startTesting();
        user.answerQuestion(0, 2);
        user.answerQuestion(1, 0);
        user.answerQuestion(2, 1);
        user.answerQuestion(3, 4);
        user.answerQuestion(4, 3);
        user.finishTesting();

        ArrayList<ImplAnswersFinal> expectedAnswers = null;
        ArrayList<ImplAnswersFinal> actualAnswers = testing.getResultsOfTesting().get(user);

        assertEquals(expectedAnswers, actualAnswers);
    }
}