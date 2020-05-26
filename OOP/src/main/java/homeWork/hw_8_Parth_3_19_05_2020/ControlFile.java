package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsWear;
import homeWork.hw_8_Parth_3_19_05_2020.product.Tourism;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.Scanner;

public class ControlFile implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.ControlFile {
    private Shop shop;

    public ControlFile(Shop shop) {
        this.shop = shop;
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
                enteredIntoDepartment(shop.getSportEquipmentDepartment());
                break;
            case 2:
                enteredIntoDepartment(shop.getSportsWearDepartment());
                break;
            case 3:
                enteredIntoDepartment(shop.getTourismDepartment());
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
    public void enteredIntoDepartment(Department department) {
        System.out.print("---------------------------------------------------\n");
        System.out.print(department.getClass().getSimpleName() + "\n");
        System.out.print("Select:\n");
        System.out.print("1 - Product\n");
        System.out.print("2 - Consultants\n");
        System.out.print("3 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                productsManagment(department);
                break;
            case 2:
                consultantManagment(department);
                break;
            case 3:
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                enteredIntoDepartment(department);
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

                shop.addCashier(cashier);
                cashiersManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                shop.printList(shop.getListOfCashier(), "Cashiers:");
                cashiersManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                shop.printList(shop.getListOfCashier(), "Cashiers:");
                entered = scan.nextInt();

                shop.deleteCashier(shop.getCashier(entered - 1));
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

                shop.addSecurityGuard(security);
                securityManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                shop.printList(shop.getListOfSecurityGuard(), "Security guards:");
                securityManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                shop.printList(shop.getListOfSecurityGuard(), "Security guards:");
                entered = scan.nextInt();

                shop.deleteSecurityGuard(shop.getSecurityGuard(entered - 1));
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
                System.out.println(shop.getBank().getListOfDebtors());
                shop.getBank().printListOfDebtors();
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

                Buyer buyer = new Buyer(name, money, desireBoolean);

                shop.addBuyer(buyer);
                buyersManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                shop.printList(shop.getListOfBuyers(), "Buyers:");
                buyersManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                shop.printList(shop.getListOfBuyers(), "Buyers:");
                entered = scan.nextInt();
                theBuyerChooseDepartment(shop.getBuyer(entered - 1));
                break;
            case 4:
                System.out.print("---------------------------------------------------\n");
                shop.printList(shop.getListOfBuyers(), "Buyers:");
                entered = scan.nextInt();

                shop.deleteBuyer(shop.getBuyer(entered - 1));
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
    public void productsManagment(Department department) {
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
                createProduct(department);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                shop.printList(department.getListOfProduct(), "Products:");
                productsManagment(department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                shop.printList(department.getListOfProduct(), "Products:");
                entered = scan.nextInt();

                department.deleteProduct(department.getProduct(entered - 1));
                productsManagment(department);
                break;
            case 4:
                enteredIntoDepartment(department);
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                productsManagment(department);
                break;
        }
    }

    @Override
    public void createProduct(Department department) {
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

        switch (department.getName()) {
            case "SportEquipmentDepartment":
                SportsEquipment sportsEquipment = new SportsEquipment(name, color, description, price);
                department.addProduct(sportsEquipment);
                productsManagment(department);
                break;
            case "SportsWearDepartment":
                System.out.println("\nZize: ");
                String size = scan.next();
                System.out.println("\nType of wear: ");
                String typeOfWear = scan.next();

                SportsWear sportsWear = new SportsWear(name, color, description, price, size, typeOfWear);
                department.addProduct(sportsWear);
                productsManagment(department);
                break;
            case "TourismDepartment":
                System.out.println("\nInstruction: ");
                String instruction = scan.next();

                Tourism tourism = new Tourism(name, color, description, price, instruction);
                department.addProduct(tourism);
                productsManagment(department);
                break;
        }
    }

    @Override
    public void consultantManagment(Department department) {
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
                String departmentName = department.getClass().getSimpleName();
                Consultant consultant = new Consultant(name, departmentName);

                department.addConsultant(consultant);
                consultantManagment(department);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                shop.printList(department.getListOfConsultant(), "Consultants:");
                consultantManagment(department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                shop.printList(department.getListOfConsultant(), "Consultants:");
                entered = scan.nextInt();

                department.deleteConsultant(department.getConsultant(entered - 1));
                consultantManagment(department);
                break;
            case 4:
                enteredIntoDepartment(department);
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                consultantManagment(department);
                break;
        }
    }

    @Override
    public void theBuyerChooseDepartment(Buyer buyer) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Select department:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                theBuyerManagment(buyer, shop.getSportEquipmentDepartment());
                break;
            case 2:
                theBuyerManagment(buyer, shop.getSportsWearDepartment());
                break;
            case 3:
                theBuyerManagment(buyer, shop.getTourismDepartment());
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                theBuyerChooseDepartment(buyer);
                break;
        }
    }

    @Override
    public void theBuyerManagment(Buyer buyer, Department department) {
        System.out.print("---------------------------------------------------\n");
        System.out.println(buyer.toString());
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
                shop.printList(department.getListOfProduct(), "Products:");

                theBuyerManagment(buyer, department);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                shop.printList(department.getListOfProduct(), "Products:");
                scan = new Scanner(System.in);
                entered = scan.nextInt();

                shop.takeAProduct(buyer, department, entered - 1);
                theBuyerManagment(buyer, department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                shop.paymentOfBuyer(buyer);
                theBuyerManagment(buyer, department);
                break;
            case 4:
                theBuyerChooseDepartment(buyer);
                break;
            case 5:
                System.out.print("---------------------------------------------------\n");
                shop.printList(department.getListOfProduct(), "Products:");
                scan = new Scanner(System.in);
                System.out.println("Select product:");
                entered = scan.nextInt();

                shop.consultation(department, department.getProduct(entered - 1));
                theBuyerManagment(buyer, department);
                break;
            case 6:
                if (shop.checkSecurity(buyer)) {
                    shop.deleteBuyer(buyer);
                }
                break;
            case 7:
                System.out.print("---------------------------------------------------\n");
                enteredIntoShop();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                theBuyerManagment(buyer, department);
                break;
        }
    }

    @Override
    public void outOfShop() {
        System.out.print("---------------------------------------------------\n");
        System.out.println("Buy))");
    }

    @Override
    public Shop getShop() {
        return shop;
    }
}
