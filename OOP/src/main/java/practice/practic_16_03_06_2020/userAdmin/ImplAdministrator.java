package practice.practic_16_03_06_2020.userAdmin;

import practice.practic_16_03_06_2020.ImplTesting;
import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;

public class ImplAdministrator implements practice.practic_16_03_06_2020.interfaces.Administrator {
    private ImplTesting testing;

    public ImplAdministrator(ImplTesting testing) {
        this.testing = testing;
    }

    @Override
    public void addTest(ImplTest test) {
        if (!testing.getTests().contains(test) && test != null) {
            testing.getTests().add(test);
        } else {
            System.out.println("Such a test already exists");
        }
    }

    @Override
    public void addQuestion(ImplQuestion question, ImplTest test) {
        if (!test.getQuestions().contains(question) && question != null && test != null) {
            question.setTest(test);
            test.getQuestions().add(question);
        } else {
            System.out.println("Such a question already exists");
        }
    }

    @Override
    public ImplQuestion createQuestion(String question, int indexRightAnswer, String... answers) {
        return new ImplQuestion(question, answers, indexRightAnswer);
    }

    @Override
    public ImplTest createTest(String name) {
        return new ImplTest(name);
    }
}
