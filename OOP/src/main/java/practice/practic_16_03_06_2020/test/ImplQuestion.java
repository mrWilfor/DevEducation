package practice.practic_16_03_06_2020.test;

import practice.practic_16_03_06_2020.interfaces.Question;
import practice.practic_16_03_06_2020.interfaces.Test;

public class ImplQuestion implements Question {
    private String question;
    private String[] answers;
    private int indexRightAnswer;
    private Test test;

    public ImplQuestion(String question, String[] answers, int indexRightAnswer) {
        this.question = question;
        this.answers = answers;
        this.indexRightAnswer = indexRightAnswer;
    }

    @Override
    public void printQuestions() {
        StringBuilder result = new StringBuilder(question + "\n");

        for (int i = 0; i < answers.length; i++) {
            result.append(i + 1)
                    .append(" - ")
                    .append(answers[i])
                    .append("\n");
        }

        System.out.println(result.toString());
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String[] getAnswers() {
        return answers;
    }

    @Override
    public int getIndexRightAnswer() {
        return indexRightAnswer;
    }

    @Override
    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
