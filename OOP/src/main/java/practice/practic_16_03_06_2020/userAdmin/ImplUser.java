package practice.practic_16_03_06_2020.userAdmin;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_16_03_06_2020.ImplTesting;
import practice.practic_16_03_06_2020.answers.ImplAnswers;
import practice.practic_16_03_06_2020.answers.ImplAnswersFinal;
import practice.practic_16_03_06_2020.interfaces.User;
import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ImplUser implements User {
    private String name;
    private long id = UIDGeneration.getUID();
    private ImplTesting testing;
    private boolean isStatus = false;
    private ImplTest test;
    private ImplAnswers answers = new ImplAnswers(this);

    public ImplUser(String name, ImplTesting testing) {
        this.name = name;
        this.testing = testing;
    }

    @Override
    public void chooseTest(ImplTest test) {
        if (isStatus) {
            this.test = test;
        }
    }

    @Override
    public void testing() {
        startTesting();

        ArrayList<ImplQuestion> questions = test.getQuestions();
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
    public void startTesting() {
        if (isStatus) {
            answers.setTest(test);
            answers.setCalendar(new GregorianCalendar());
        }
    }

    @Override
    public void answerQuestion(int indexQuestion, int indexAnswer) {
        if (isStatus) {
            ImplQuestion question = test.getQuestions().get(indexQuestion);

            answers.addAnswer(question, indexAnswer);
        }
    }

    @Override
    public void finishTesting() {
        if (isStatus) {
            answers.toRate();

            System.out.println("Your assessment - " + answers.getAssessment() + " out of 100");

            ImplAnswersFinal answersFinal = new ImplAnswersFinal(
                    answers.getCalendar(),
                    answers.getTest(),
                    answers.getUser(),
                    answers.getAnswers(),
                    answers.getAssessment()
            );

            testing.addResultOfTesting(answersFinal, this);
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
    public ImplTesting getTesting() {
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
}
