package practice.practic_16_03_06_2020.interfaces;

import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;

public interface Administrator extends AddTestOrQuestion {
    ImplQuestion createQuestion(String question, int rightAnswer, String... answers);

    ImplTest createTest(String name);
}
