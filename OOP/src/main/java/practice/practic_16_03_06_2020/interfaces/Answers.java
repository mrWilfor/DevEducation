package practice.practic_16_03_06_2020.interfaces;

import java.util.Calendar;
import java.util.Map;

public interface Answers {
    void addAnswer(Question question, int numberAnswer);

    void toRate();

    void clear();

    Calendar getCalendar();

    Test getTest();

    User getUser();

    Map<Question, String> getAnswers();

    int getAssessment();

    void setCalendar(Calendar calendar);

    void setTest(Test test);
}
