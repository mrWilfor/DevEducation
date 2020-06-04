package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

import java.util.Calendar;
import java.util.HashMap;

public interface Answers {
    void addAnswer(ImplQuestion question, int numberAnswer);

    void toRate();

    void clear();

    Calendar getCalendar();

    ImplTest getTest();

    ImplUser getUser();

    HashMap<ImplQuestion, String> getAnswers();

    int getAssessment();

    void setCalendar(Calendar calendar);

    void setTest(ImplTest test);
}
