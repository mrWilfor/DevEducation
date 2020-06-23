package practice.practic_16_03_06_2020.answers;

import practice.practic_16_03_06_2020.interfaces.Answers;
import practice.practic_16_03_06_2020.interfaces.Question;
import practice.practic_16_03_06_2020.interfaces.Test;
import practice.practic_16_03_06_2020.interfaces.User;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class ImplAnswers implements Answers {
    private Calendar calendar;
    private Test test;
    private User user;
    private Map<Question, String> answers = new HashMap<>();
    private int assessment;

    public ImplAnswers(User user) {
        this.user = user;
    }

    @Override
    public void addAnswer(Question question, int indexAnswer) {
        String answer = question.getAnswers()[indexAnswer];
        answers.put(question, answer);
    }

    @Override
    public void toRate() {
        int rate = 0;

        for (Question question : test.getQuestions()) {
            if (question.getAnswers()[question.getIndexRightAnswer()].equals(answers.get(question))) {
                rate++;
            }
        }

        if (answers.size() != 0) {
            rate = rate * 100 / answers.size();
        } else {
            rate = 0;
        }
        assessment = rate;
    }

    @Override
    public void clear() {
        calendar = null;
        test = null;
        answers.clear();
        assessment = 0;

    }

    @Override
    public Calendar getCalendar() {
        return calendar;
    }

    @Override
    public Test getTest() {
        return test;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Map<Question, String> getAnswers() {
        return answers;
    }

    @Override
    public int getAssessment() {
        return assessment;
    }

    @Override
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void setTest(Test test) {
        this.test = test;
    }
}
