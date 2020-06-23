package practice.practic_16_03_06_2020.interfaces;

public interface Question {
    void printQuestions();

    String getQuestion();

    String[] getAnswers();

    int getIndexRightAnswer();

    Test getTest();

    void setTest(Test test);
}
