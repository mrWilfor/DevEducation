package practice.practic_16_03_06_2020.answers;

import practice.practic_16_03_06_2020.interfaces.AnswersFinal;
import practice.practic_16_03_06_2020.interfaces.Question;
import practice.practic_16_03_06_2020.interfaces.Test;
import practice.practic_16_03_06_2020.interfaces.User;

import java.util.Calendar;
import java.util.Map;

public final class ImplAnswersFinal implements AnswersFinal {
    private final Calendar calendar;
    private final Test test;
    private final User user;
    private final Map<Question, String> answers;
    private final int assessment;

    public ImplAnswersFinal(
            Calendar calendar,
            Test test,
            User user,
            Map<Question, String> answers,
            int assessment
    ) {
        this.calendar = calendar;
        this.test = test;
        this.user = user;
        this.answers = answers;
        this.assessment = assessment;
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
}
