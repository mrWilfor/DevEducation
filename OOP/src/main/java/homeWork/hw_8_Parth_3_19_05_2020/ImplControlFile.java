package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsWear;
import homeWork.hw_8_Parth_3_19_05_2020.product.Tourism;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.Scanner;

public class ImplControlFile implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.ControlFile {
    private ImplShop implShop;

    public ImplControlFile(ImplShop implShop) {
        this.implShop = implShop;
    }

    @Override
    public void enteredIntoShop() {
        System.out.print("Select:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        System.out.print("4 - Cashiers\n");
        System.out.print("5 - Security\n");
        System.out.print("6 - Bank\n");
        System.out.print("7 - Buyers\n");
        System.out.print("8 - Exit\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                enteredIntoDepartment(implShop.getSportEquipmentImplDepartment());
                break;
            case 2:
                enteredIntoDepartment(implShop.getSportsWearImplDepartment());
                break;
            case 3:
                enteredIntoDepartment(implShop.getTourismImplDepartment());
                break;
            case 4:
                cashiersManagment();
                break;
            case 5:
                securityManagment();
                break;
            case 6:
                enteredIntoBank();
                break;
            case 7:
                buyersManagment();
                break;
            case 8:
                outOfShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                enteredIntoShop();
                break;
        }

    }

    @Override
    public void enteredIntoDepartment(ImplDepartment implDepartment) {
        System.out.print("---------------------------------------------------\n");
        System.out.print(implDepartment.getClass().getSimpleName() + "\n");
        System.out.print("Select:\n");
        System.out.print("1 - Product\n");
        System.out.print("2 - Consultants\n");
        System.out.print("3 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                productsManagment(implDepartment);
                break;
            case 2:
                consultantManagment(implDepartment);
                break;
            case 3:
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                enteredIntoDepartment(implDepartment);
                break;
        }
    }

    @Override
    public void cashiersManagment() {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Cashier:\n");
        System.out.print("1 - add cashier\n");
        System.out.print("2 - list of cashiers\n");
        System.out.print("3 - delete a cashier\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                System.out.print("---------------------------------------------------\n");
                System.out.print("Name: ");
                String name = scan.next();
                Cashier cashier = new Cashier(name);

                implShop.addCashier(cashier);
                cashiersManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implShop.getListOfCashier(), "Cashiers:");
                cashiersManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implShop.getListOfCashier(), "Cashiers:");
                entered = scan.nextInt();

                implShop.deleteCashier(implShop.getCashier(entered - 1));
                cashiersManagment();
                break;
            case 4:
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                cashiersManagment();
                break;
        }
    }

    @Override
    public void securityManagment() {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Security:\n");
        System.out.print("1 - add security\n");
        System.out.print("2 - list of security\n");
        System.out.print("3 - delete a security\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                System.out.print("---------------------------------------------------\n");
                System.out.print("Name: ");
                String name = scan.next();
                SecurityGuard security = new SecurityGuard(name);

                implShop.addSecurityGuard(security);
                securityManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implShop.getListOfSecurityGuard(), "Security guards:");
                securityManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implShop.getListOfSecurityGuard(), "Security guards:");
                entered = scan.nextInt();

                implShop.deleteSecurityGuard(implShop.getSecurityGuard(entered - 1));
                securityManagment();
                break;
            case 4:
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                securityManagment();
                break;
        }
    }

    @Override
    public void enteredIntoBank() {
        System.out.println("---------------------------------------------------");
        System.out.println("Bank:");
        System.out.println("1 - list of debtors");
        System.out.println("2 - return");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                System.out.print("---------------------------------------------------\n");
                System.out.println(implShop.getImplBank().getListOfDebtors());
                implShop.getImplBank().printListOfDebtors();
                enteredIntoBank();
                break;
            case 2:
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                enteredIntoBank();
                break;
        }
    }

    @Override
    public void buyersManagment() {
        System.out.println("---------------------------------------------------");
        System.out.println("Buyers:");
        System.out.println("1 - add buyer");
        System.out.println("2 - list of buyers");
        System.out.println("3 - choose a buyer");
        System.out.println("4 - delete a buyer");
        System.out.println("5 - return");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Name: ");
                String name = scan.next();

                System.out.println("Money: ");
                int money = scan.nextInt();

                System.out.println("Desire to take a loan(n - negative or p - positive): ");
                String desire = scan.next();

                boolean desireBoolean = false;

                if (desire.equals("p")) {
                    desireBoolean = true;
                }

                ImplBuyer implBuyer = new ImplBuyer(name, money, desireBoolean);

                implShop.addBuyer(implBuyer);
                buyersManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implShop.getListOfImplBuyers(), "Buyers:");
                buyersManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implShop.getListOfImplBuyers(), "Buyers:");
                entered = scan.nextInt();
                theBuyerChooseDepartment(implShop.getBuyer(entered - 1));
                break;
            case 4:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implShop.getListOfImplBuyers(), "Buyers:");
                entered = scan.nextInt();

                implShop.deleteBuyer(implShop.getBuyer(entered - 1));
                buyersManagment();
                break;
            case 5:
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                buyersManagment();
                break;
        }
    }

    @Override
    public void productsManagment(ImplDepartment implDepartment) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Products:\n");
        System.out.print("1 - add product\n");
        System.out.print("2 - list of product\n");
        System.out.print("3 - delete a product\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                createProduct(implDepartment);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implDepartment.getListOfImplProduct(), "Products:");
                productsManagment(implDepartment);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implDepartment.getListOfImplProduct(), "Products:");
                entered = scan.nextInt();

                implDepartment.deleteProduct(implDepartment.getProduct(entered - 1));
                productsManagment(implDepartment);
                break;
            case 4:
                enteredIntoDepartment(implDepartment);
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                productsManagment(implDepartment);
                break;
        }
    }

    @Override
    public void createProduct(ImplDepartment implDepartment) {
        Scanner scan = new Scanner(System.in);
        System.out.print("---------------------------------------------------\n");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("\nColor: ");
        String color = scan.next();
        System.out.println("\nDescription: ");
        String description = scan.next();
        System.out.println("\nPrice: ");
        int price = scan.nextInt();

        switch (implDepartment.getName()) {
            case "SportEquipmentDepartment":
                SportsEquipment sportsEquipment = new SportsEquipment(name, color, description, price);
                implDepartment.addProduct(sportsEquipment);
                productsManagment(implDepartment);
                break;
            case "SportsWearDepartment":
                System.out.println("\nZize: ");
                String size = scan.next();
                System.out.println("\nType of wear: ");
                String typeOfWear = scan.next();

                SportsWear sportsWear = new SportsWear(name, color, description, price, size, typeOfWear);
                implDepartment.addProduct(sportsWear);
                productsManagment(implDepartment);
                break;
            case "TourismDepartment":
                System.out.println("\nInstruction: ");
                String instruction = scan.next();

                Tourism tourism = new Tourism(name, color, description, price, instruction);
                implDepartment.addProduct(tourism);
                productsManagment(implDepartment);
                break;
        }
    }

    @Override
    public void consultantManagment(ImplDepartment implDepartment) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Staffs:\n");
        System.out.print("1 - add consultant\n");
        System.out.print("2 - list of consultants\n");
        System.out.print("3 - delete a consultant\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                System.out.print("---------------------------------------------------\n");
                System.out.print("Name: ");
                String name = scan.next();
                String departmentName = implDepartment.getClass().getSimpleName();
                Consultant consultant = new Consultant(name, departmentName);

                implDepartment.addConsultant(consultant);
                consultantManagment(implDepartment);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implDepartment.getListOfConsultant(), "Consultants:");
                consultantManagment(implDepartment);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implDepartment.getListOfConsultant(), "Consultants:");
                entered = scan.nextInt();

                implDepartment.deleteConsultant(implDepartment.getConsultant(entered - 1));
                consultantManagment(implDepartment);
                break;
            case 4:
                enteredIntoDepartment(implDepartment);
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                consultantManagment(implDepartment);
                break;
        }
    }

    @Override
    public void theBuyerChooseDepartment(ImplBuyer implBuyer) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Select department:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                theBuyerManagment(implBuyer, implShop.getSportEquipmentImplDepartment());
                break;
            case 2:
                theBuyerManagment(implBuyer, implShop.getSportsWearImplDepartment());
                break;
            case 3:
                theBuyerManagment(implBuyer, implShop.getTourismImplDepartment());
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                theBuyerChooseDepartment(implBuyer);
                break;
        }
    }

    @Override
    public void theBuyerManagment(ImplBuyer implBuyer, ImplDepartment implDepartment) {
        System.out.print("---------------------------------------------------\n");
        System.out.println(implBuyer.toString());
        System.out.println("1 - view products");
        System.out.println("2 - add products to basket");
        System.out.println("3 - pay of");
        System.out.println("4 - change department");
        System.out.println("5 - ask for a consultation");
        System.out.println("6 - leave the store");
        System.out.println("7 - leave the buyer");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Product:");
                implShop.printList(implDepartment.getListOfImplProduct(), "Products:");

                theBuyerManagment(implBuyer, implDepartment);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implDepartment.getListOfImplProduct(), "Products:");
                scan = new Scanner(System.in);
                entered = scan.nextInt();

                implShop.takeAProduct(implBuyer, implDepartment, entered - 1);
                theBuyerManagment(implBuyer, implDepartment);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                implShop.paymentOfBuyer(implBuyer);
                theBuyerManagment(implBuyer, implDepartment);
                break;
            case 4:
                theBuyerChooseDepartment(implBuyer);
                break;
            case 5:
                System.out.print("---------------------------------------------------\n");
                implShop.printList(implDepartment.getListOfImplProduct(), "Products:");
                scan = new Scanner(System.in);
                System.out.println("Select product:");
                entered = scan.nextInt();

                implShop.consultation(implDepartment, implDepartment.getProduct(entered - 1));
                theBuyerManagment(implBuyer, implDepartment);
                break;
            case 6:
                if (implShop.checkSecurity(implBuyer)) {
                    implShop.deleteBuyer(implBuyer);
                }
                break;
            case 7:
                System.out.print("---------------------------------------------------\n");
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                theBuyerManagment(implBuyer, implDepartment);
                break;
        }
    }

    @Override
    public void outOfShop() {
        System.out.print("---------------------------------------------------\n");
        System.out.println("Buy))");
    }

    @Override
    public ImplShop getImplShop() {
        return implShop;
    }
}
