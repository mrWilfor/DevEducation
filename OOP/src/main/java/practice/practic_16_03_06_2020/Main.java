package practice.practic_16_03_06_2020;

import practice.practic_16_03_06_2020.exeptions.UserIsNotLoggedIn;
import practice.practic_16_03_06_2020.exeptions.UserWithThatUsernameExists;
import practice.practic_16_03_06_2020.exeptions.WrongLoginOrPassword;
import practice.practic_16_03_06_2020.test.ImplQuestion;
import practice.practic_16_03_06_2020.test.ImplTest;
import practice.practic_16_03_06_2020.userAdmin.ImplAdministrator;
import practice.practic_16_03_06_2020.userAdmin.ImplUser;

public class Main {
    public static void main(String[] args) {
        ImplTesting testing = new ImplTesting();
        ImplAdministrator administrator = testing.getAdministrator();

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

        ImplUser user = testing.getUsers().get("Nick");
        ImplTest test = administrator.createTest("Computer science1");
        ImplQuestion question1 = administrator.createQuestion(
                "1 What is processor?",
                2,
                "Auto", "Phone", "Computer part", "Apple"
        );
        ImplQuestion question2 = administrator.createQuestion(
                "2 What is processor?",
                0,
                "Computer part", "Car", "Phone", "Cake"
        );
        ImplQuestion question3 = administrator.createQuestion(
                "3 What is processor?",
                1,
                "Money", "Computer part", "Note", "Apple"
        );
        ImplQuestion question4 = administrator.createQuestion(
                "4 What is processor?",
                4,
                "Laptop", "Scotch", "Riki Martin", "Apple", "Computer part"
        );
        ImplQuestion question5 = administrator.createQuestion(
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
