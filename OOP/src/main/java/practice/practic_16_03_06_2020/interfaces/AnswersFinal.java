package practice.practic_16_03_06_2020.interfaces;

import java.util.Calendar;
import java.util.Map;

public interface AnswersFinal {
    Calendar getCalendar();

    Test getTest();

    User getUser();

    Map<Question, String> getAnswers();

    int getAssessment();
}
