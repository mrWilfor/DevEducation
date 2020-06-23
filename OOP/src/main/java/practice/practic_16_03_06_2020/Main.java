package practice.practic_16_03_06_2020;

import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;
import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;
import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;
import practice.practic_16_03_06_2020.interfaces.*;

public class Main {
    public static void main(String[] args) {
        Testing testing = new ImplTesting();
        Administrator administrator = testing.getAdministrator();

        try {
            testing.registration("Nick", "12345");
        } catch (UserWithThatUsernameExists e) {
            System.out.println(e.getMessage());
        }

        try {
            testing.logIn("Nick", "12345");
        } catch (WrongLoginOrPassword e) {
            System.out.println(e.getMessage());
        }

        User user = testing.getUsers().get("Nick");
        Test test = administrator.createTest("Computer science1");
        Question question1 = administrator.createQuestion(
                "1 What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        Question question2 = administrator.createQuestion(
                "2 What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        Question question3 = administrator.createQuestion(
                "3 What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        Question question4 = administrator.createQuestion(
                "4 What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        Question question5 = administrator.createQuestion(
                "5 What is processor?",
                3,
                "Pen", "Sticky", "Apple", "Computer part"
        );

        administrator.addQuestion(question1, test);
        administrator.addQuestion(question2, test);
        administrator.addQuestion(question3, test);
        administrator.addQuestion(question4, test);
        administrator.addQuestion(question5, test);
        administrator.addTest(test);

        try {
            user.chooseTest(test);
        } catch (UserIsNotLoggedIn e) {
            System.out.println(e.getMessage());
        }

        user.testing();
    }


}
