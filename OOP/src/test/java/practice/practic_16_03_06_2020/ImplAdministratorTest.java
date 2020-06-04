package practice.practic_16_03_06_2020;

import org.junit.jupiter.api.Test;
import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;

import static org.junit.jupiter.api.Assertions.*;

class ImplAdministratorTest {

    @Test
    void addTestMany() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        ImplTest test1 = administrator.createTest("Computer science1");
        ImplTest test2 = administrator.createTest("Computer science2");
        ImplTest test3 = administrator.createTest("Computer science3");
        ImplTest test4 = administrator.createTest("Computer science4");
        ImplTest test5 = administrator.createTest("Computer science5");

        administrator.addTest(test1);
        administrator.addTest(test2);
        administrator.addTest(test3);
        administrator.addTest(test4);
        administrator.addTest(test5);

        assertTrue(testing.getTests().contains(test1));
        assertTrue(testing.getTests().contains(test2));
        assertTrue(testing.getTests().contains(test3));
        assertTrue(testing.getTests().contains(test4));
        assertTrue(testing.getTests().contains(test5));
    }

    @Test
    void addTestTwo() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        ImplTest test1 = administrator.createTest("Computer science1");
        ImplTest test2 = administrator.createTest("Computer science2");

        administrator.addTest(test1);
        administrator.addTest(test2);

        assertTrue(testing.getTests().contains(test1));
        assertTrue(testing.getTests().contains(test2));
    }

    @Test
    void addTestOne() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        ImplTest test = administrator.createTest("Computer science1");

        administrator.addTest(test);

        assertTrue(testing.getTests().contains(test));
    }

    @Test
    void addTestNull() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        administrator.addTest(null);

        assertFalse(testing.getTests().contains(null));
    }

    @Test
    void addQuestionMany() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

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

        assertTrue(test.getQuestions().contains(question1));
        assertTrue(test.getQuestions().contains(question2));
        assertTrue(test.getQuestions().contains(question3));
        assertTrue(test.getQuestions().contains(question4));
        assertTrue(test.getQuestions().contains(question5));
    }

    @Test
    void addQuestionTwo() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

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

        administrator.addQuestion(question1, test);
        administrator.addQuestion(question2, test);

        assertTrue(test.getQuestions().contains(question1));
        assertTrue(test.getQuestions().contains(question2));
    }

    @Test
    void addQuestionOne() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        ImplTest test = administrator.createTest("Computer science1");
        ImplQuestion question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );

        administrator.addQuestion(question1, test);

        assertTrue(test.getQuestions().contains(question1));
    }

    @Test
    void addQuestionNull() {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

        ImplTest test = administrator.createTest("Computer science1");

        administrator.addQuestion(null, test);

        assertFalse(test.getQuestions().contains(null));
    }
}