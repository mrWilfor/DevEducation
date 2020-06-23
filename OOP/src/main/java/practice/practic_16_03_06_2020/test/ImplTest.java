package practice.practic_16_03_06_2020.test;

import practice.practic_16_03_06_2020.interfaces.Question;
import practice.practic_16_03_06_2020.interfaces.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImplTest implements Test {
    private String name;
    private List<Question> questions = new ArrayList<>();

    public ImplTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
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

        Test test = (Test) o;

        return Objects.equals(name, test.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
