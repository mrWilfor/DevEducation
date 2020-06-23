package practice.practic_16_03_06_2020.userAdmin;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_16_03_06_2020.answers.ImplAnswers;
import practice.practic_16_03_06_2020.answers.ImplAnswersFinal;
import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;
import practice.practic_16_03_06_2020.interfaces.*;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ImplUser implements User {
    private String name;
    private long id = UIDGeneration.getUID();
    private Testing testing;
    private boolean isStatus = false;
    private Test test;
    private Answers answers = new ImplAnswers(this);

    public ImplUser(String name, Testing testing) {
        this.name = name;
        this.testing = testing;
    }

    @Override
    public void chooseTest(Test test) throws UserIsNotLoggedIn {
        int []j = {1, 2};
        if (isStatus) {
            this.test = test;
        } else {
            throw new UserIsNotLoggedIn("You are not logged in");
        }
    }

    @Override
    public void testing() {
        try {
            startTesting();
        } catch (UserIsNotLoggedIn e) {
            System.out.println(e.getMessage());
            return;
        }

        List<Question> questions = test.getQuestions();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < test.getQuestions().size(); i++) {
            questions.get(i).printQuestions();
            System.out.println(questions.get(i).getAnswers().length + 1 + " - Skip");
            System.out.println(questions.get(i).getAnswers().length + 2 + " - Return");
            System.out.println(questions.get(i).getAnswers().length + 3 + " - Finish testing");
            System.out.println();
            int numberAnswer = scan.nextInt();

            if (numberAnswer > 0 && numberAnswer <= questions.get(i).getAnswers().length) {
                answerQuestion(i, numberAnswer - 1);
            } else if (numberAnswer == questions.get(i).getAnswers().length + 1) {
                System.out.println("----------------------------------------");
            } else if (numberAnswer == questions.get(i).getAnswers().length + 2) {
                if (i != 0) {
                    i -= 2;
                } else {
                    i -= 1;
                }
            } else if (numberAnswer == questions.get(i).getAnswers().length + 3) {
                finishTesting();
                break;
            } else {
                i -= 1;
            }
        }
        finishTesting();
    }

    @Override
    public void startTesting() throws UserIsNotLoggedIn {
        if (isStatus) {
            answers.setTest(test);
            answers.setCalendar(new GregorianCalendar());
        } else {
            throw new UserIsNotLoggedIn("You are not logged in");
        }
    }

    @Override
    public void answerQuestion(int indexQuestion, int indexAnswer) {
        if (isStatus) {
            Question question = test.getQuestions().get(indexQuestion);

            answers.addAnswer(question, indexAnswer);
        }
    }

    @Override
    public void finishTesting() {
        if (isStatus) {
            answers.toRate();

            System.out.println("Your assessment - " + answers.getAssessment() + " out of 100");

            AnswersFinal answersFinal = new ImplAnswersFinal(
                    answers.getCalendar(),
                    answers.getTest(),
                    answers.getUser(),
                    answers.getAnswers(),
                    answers.getAssessment()
            );

            try {
                testing.addResultOfTesting(answersFinal, this);
            } catch (UserIsNotLoggedIn e) {
                System.out.println(e.getMessage());
            }

            answers.clear();
            test = null;
        }
    }

    @Override
    public void logOut() {
        isStatus = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Testing getTesting() {
        return testing;
    }

    @Override
    public boolean isStatus() {
        return isStatus;
    }

    @Override
    public void setStatus(boolean status) {
        isStatus = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        return id == user.getId() &&
                Objects.equals(name, user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
