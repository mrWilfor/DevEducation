package practice.practic_16_03_06_2020.answers;

import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;
import practice.practic_16_03_06_2020.interfaces.Answers;

import java.util.Calendar;
import java.util.HashMap;

public class ImplAnswers implements Answers {
    private Calendar calendar;
    private ImplTest test;
    private ImplUser user;
    private HashMap<ImplQuestion, String> answers = new HashMap<>();
    private int assessment;

    public ImplAnswers(ImplUser user) {
        this.user = user;
    }

    @Override
    public void addAnswer(ImplQuestion question, int indexAnswer) {
        String answer = question.getAnswers()[indexAnswer];
                answers.put(question, answer);
    }

    @Override
    public void toRate() {
        int rate = 0;

        for (ImplQuestion question : test.getQuestions()) {
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
    public ImplTest getTest() {
        return test;
    }

    @Override
    public ImplUser getUser() {
        return user;
    }

    @Override
    public HashMap<ImplQuestion, String> getAnswers() {
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
    public void setTest(ImplTest test) {
        this.test = test;
    }
}
