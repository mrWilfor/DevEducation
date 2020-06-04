package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;

public interface AddTestOrQuestion {
    void addTest(ImplTest test);

    void addQuestion(ImplQuestion question, ImplTest test);
}
