package practice.practic_16_03_06_2020.interfaces;

public interface Administrator extends AddTestOrQuestion {
    Question createQuestion(String question, int rightAnswer, String... answers);

    Test createTest(String name);
}
