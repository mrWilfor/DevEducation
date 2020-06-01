package practice.practic_14_28_05_2020;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;
import practice.practic_14_28_05_2020.implInterfaces.ImplCar;
import practice.practic_14_28_05_2020.implInterfaces.ImplCarRental;
import practice.practic_14_28_05_2020.implInterfaces.ImplUser;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class ControlFile {
    private ImplCarRental carRental = new ImplCarRental();

    void enteredIntoProgram() {
        System.out.println("1 - User");
        System.out.println("2 - Administrator");
        System.out.println("3 - Manager");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                user(scan);
                break;
            case 2:
                administrator(scan);
                break;
            case 3:
                manager(scan);
                break;
            default:
                System.out.println("Invalid input");
                enteredIntoProgram();
                break;
        }
    }

    public void user(Scanner scan) {
        System.out.println("1 - Authorisation");
        System.out.println("2 - Registration");
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                authorisation(scan);
                break;
            case 2:
                registration(scan);
                break;
            default:
                System.out.println("Invalid input");
                user(scan);
                break;
        }
    }

    public void authorisation(Scanner scan) {
        System.out.println("Login:");
        String login = scan.next();
        System.out.println("Password:");
        String password = scan.next();

        if (carRental.authorisation(login, password)) {
            userOperation(scan);
        } else {
            System.out.println("login or password is entered incorrectly");
            user(scan);
        }
    }

    public void registration(Scanner scan) {
        System.out.println("Login:");
        String login = scan.next();
        System.out.println("Password:");
        String password = scan.next();

        if (carRental.getListOfUsers().containsKey(login)) {
            System.out.println("login is already taken");
            registration(scan);
        } else {
            carRental.registration(login, password);
            authorisation(scan);
        }
    }

    public void userOperation(Scanner scan) {
        System.out.println("1 - View auto");
        System.out.println("2 - choose auto");

        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                carRental.getListOfOrder().
                break;
            case 2:

                break;
            default:
                System.out.println("Invalid input");
                userOperation(scan);
                break;
        }
    }

    public void administrator(Scanner scan) {
        System.out.println("1 - Cars");
        System.out.println("2 - Users");
        System.out.println("3 - Managers");

        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                carsManagment(scan);
                break;
            case 2:
                blockedAndUnblockedUsers(scan);
                break;
            case 3:
                registrationManagers(scan);
                break;
            default:
                System.out.println("Invalid input");
                administrator(scan);
                break;
        }
    }

    public void carsManagment(Scanner scan) {
        System.out.println("1 - Add car");
        System.out.println("2 - Delete car");
        System.out.println("3 - Editing car information");

        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                createCar(scan);
                break;
            case 2:
                deleteCar(scan);
                break;
            case 3:
                editingCarInformation(scan);
                break;
            default:
                System.out.println("Invalid input");
                carsManagment(scan);
                break;
        }
    }

    public void createCar(Scanner scan) {
        System.out.println("Name:");
        String name = scan.next();
        System.out.println("Mark:");
        Mark mark = chooseMark(scan);
        System.out.println("Quality class:");
        QualityClass qualityClass = chooseQualityClass(scan);
        System.out.println("Prise");
        int prise = scan.nextInt();
        System.out.println("Info:");
        String info = scan.next();

        carRental.getAdministrator().addCar(name, mark, qualityClass, prise, info);
    }

    public Mark chooseMark(Scanner scan) {
        System.out.println("1 - Toyota");
        System.out.println("2 - Mercedes");
        System.out.println("3 - Ford");
        System.out.println("4 - Ferrari");

        int entered = scan.nextInt();
        Mark mark = null;

        switch (entered) {
            case 1:
                mark = Mark.TOYOTA;
                break;
            case 2:
                mark = Mark.MERCEDES;
                break;
            case 3:
                mark = Mark.FORD;
                break;
            case 4:
                mark = Mark.FERRARI;
                break;
            default:
                System.out.println("Invalid input");
                chooseMark(scan);
                break;
        }
        return mark;
    }

    public QualityClass chooseQualityClass(Scanner scan) {
        System.out.println("1 - High");
        System.out.println("2 - Middle");
        System.out.println("3 - low");

        int entered = scan.nextInt();
        QualityClass qualityClass = null;

        switch (entered) {
            case 1:
                qualityClass = QualityClass.HIGH;
                break;
            case 2:
                qualityClass = QualityClass.MIDDLE;
                break;
            case 3:
                qualityClass = QualityClass.LOW;
                break;
            default:
                System.out.println("Invalid input");
                chooseQualityClass(scan);
                break;
        }
        return qualityClass;
    }

    public void deleteCar(Scanner scan) {
        carRental.printList(carRental.getListOfCar(), "Cars:");

        int entered = scan.nextInt();
        ImplCar car = carRental.getListOfCar().get(entered);

        carRental.getAdministrator().deleteCar(car);
        carsManagment(scan);
    }

    public void editingCarInformation(Scanner scan) {
        carRental.printList(carRental.getListOfCar(), "Cars:");

        int entered = scan.nextInt();
        ImplCar car = carRental.getListOfCar().get(entered);

        System.out.println("New info:");

        String info = scan.next();

        carRental.getAdministrator().editingCarInformation(car, info);
        carsManagment(scan);
    }

    public void blockedAndUnblockedUsers(Scanner scan) {
        System.out.println("1 - Blocked user");
        System.out.println("2 - Unblocked user");

        int entered = scan.nextInt();

        switch (entered) {
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("Invalid input");
                chooseQualityClass(scan);
                break;
        }
    }

    public ImplUser chooseUser(Scanner scan) {
        Collection<ImplUser> listOfUsers = carRental.getListOfUsers().values().;
    }
}
