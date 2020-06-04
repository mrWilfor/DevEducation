package practice.practic_16_03_06_2020.test;

import practice.practic_16_03_06_2020.interfaces.Test;

import java.util.ArrayList;
import java.util.Objects;

public class ImplTest implements Test {
    private String name;
    private ArrayList<ImplQuestion> questions = new ArrayList<>();

    public ImplTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ImplQuestion> getQuestions() {
        return questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplTest implTest = (ImplTest) o;

        return Objects.equals(name, implTest.name) &&
                Objects.equals(questions, implTest.questions);
    }
}
