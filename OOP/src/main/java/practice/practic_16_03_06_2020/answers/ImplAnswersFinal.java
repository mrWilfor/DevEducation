package practice.practic_16_03_06_2020.answers;

import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;
import practice.practic_16_03_06_2020.interfaces.AnswersFinal;

import java.util.Calendar;
import java.util.HashMap;

public final class ImplAnswersFinal implements AnswersFinal {
    private final Calendar calendar;
    private final ImplTest test;
    private final ImplUser user;
    private final HashMap<ImplQuestion, String> answers;
    private final int assessment;

    public ImplAnswersFinal(
            Calendar calendar,
            ImplTest test,
            ImplUser user,
            HashMap<ImplQuestion, String> answers,
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
}
