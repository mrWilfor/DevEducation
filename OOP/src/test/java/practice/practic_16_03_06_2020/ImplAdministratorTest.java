package practice.practic_16_03_06_2020;

import org.junit.jupiter.api.Test;
import practice.practic_16_03_06_2020.interfaces.Administrator;
import practice.practic_16_03_06_2020.interfaces.Question;
import practice.practic_16_03_06_2020.interfaces.Testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplAdministratorTest {

    @Test
    void addTestMany() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        practice.practic_16_03_06_2020.interfaces.Test test1 = administrator.createTest("Computer science1");
        practice.practic_16_03_06_2020.interfaces.Test test2 = administrator.createTest("Computer science2");
        practice.practic_16_03_06_2020.interfaces.Test test3 = administrator.createTest("Computer science3");
        practice.practic_16_03_06_2020.interfaces.Test test4 = administrator.createTest("Computer science4");
        practice.practic_16_03_06_2020.interfaces.Test test5 = administrator.createTest("Computer science5");

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
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        practice.practic_16_03_06_2020.interfaces.Test test1 = administrator.createTest("Computer science1");
        practice.practic_16_03_06_2020.interfaces.Test test2 = administrator.createTest("Computer science2");

        administrator.addTest(test1);
        administrator.addTest(test2);

        assertTrue(testing.getTests().contains(test1));
        assertTrue(testing.getTests().contains(test2));
    }

    @Test
    void addTestOne() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        practice.practic_16_03_06_2020.interfaces.Test test = administrator.createTest("Computer science1");

        administrator.addTest(test);

        assertTrue(testing.getTests().contains(test));
    }

    @Test
    void addTestNull() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        administrator.addTest(null);

        assertFalse(testing.getTests().contains(null));
    }

    @Test
    void addQuestionMany() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

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

        assertTrue(test.getQuestions().contains(question1));
        assertTrue(test.getQuestions().contains(question2));
        assertTrue(test.getQuestions().contains(question3));
        assertTrue(test.getQuestions().contains(question4));
        assertTrue(test.getQuestions().contains(question5));
    }

    @Test
    void addQuestionTwo() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

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

        administrator.addQuestion(question1, test);
        administrator.addQuestion(question2, test);

        assertTrue(test.getQuestions().contains(question1));
        assertTrue(test.getQuestions().contains(question2));
    }

    @Test
    void addQuestionOne() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        practice.practic_16_03_06_2020.interfaces.Test test = administrator.createTest("Computer science1");
        Question question1 = administrator.createQuestion(
                "What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );

        administrator.addQuestion(question1, test);

        assertTrue(test.getQuestions().contains(question1));
    }

    @Test
    void addQuestionNull() {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        practice.practic_16_03_06_2020.interfaces.Test test = administrator.createTest("Computer science1");

        administrator.addQuestion(null, test);

        assertFalse(test.getQuestions().contains(null));
    }
}