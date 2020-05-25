package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.departments.SportEquipmentDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.departments.SportsWearDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;
import homeWork.hw_8_Parth_3_19_05_2020.departments.TourismDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsWear;
import homeWork.hw_8_Parth_3_19_05_2020.product.Tourism;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Administrator;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.ArrayList;
import java.util.Scanner;

public class SportingGoodsStore implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.SportingGoodsStore {
    private TourismDepartment tourismDepartment = new TourismDepartment();
    private SportEquipmentDepartment sportEquipmentDepartment = new SportEquipmentDepartment();
    private SportsWearDepartment sportsWearDepartment = new SportsWearDepartment();
    private Bank bank = new Bank();
    private Administrator administrator = new Administrator("Mike");
    private ArrayList<SecurityGuard> listOfSecurityGuards = new ArrayList<>();
    private ArrayList<Cashier> listOfCashiers = new ArrayList<>();
    private ArrayList<Buyer> listOfBuyers = new ArrayList<>();

    public SportingGoodsStore() {

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
                enteredIntoDepartment(sportEquipmentDepartment);
                break;
            case 2:
                enteredIntoDepartment(sportsWearDepartment);
                break;
            case 3:
                enteredIntoDepartment(tourismDepartment);
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

                addCashier(cashier);
                cashiersManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                printListOfCashier();
                cashiersManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                printListOfCashier();
                entered = scan.nextInt();

                deleteCashier(getCashier(entered - 1));
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

                addSecurityGuard(security);
                securityManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                printListOfSecurity();
                securityManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                printListOfSecurity();
                entered = scan.nextInt();

                deleteSecurityGuard(getSecurityGuard(entered - 1));
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
                System.out.println(bank.getListOfDebtors());
                bank.printListOfDebtors();
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

                addBuyer(buyer);
                buyersManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                printListOfBuyers();

                buyersManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                printListOfBuyers();
                entered = scan.nextInt();

                theBuyerChooseDepartment(getBuyer(entered - 1));
                break;
            case 4:
                System.out.print("---------------------------------------------------\n");
                printListOfBuyers();
                entered = scan.nextInt();

                deleteBuyer(getBuyer(entered - 1));
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
                department.printListOfProducts();
                productsManagment(department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                department.printListOfProducts();
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

        switch (department.getClass().getSimpleName()) {
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
                department.printListOfConsultants();
                consultantManagment(department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                department.printListOfConsultants();
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
                theBuyerManagment(buyer, sportEquipmentDepartment);
                break;
            case 2:
                theBuyerManagment(buyer, sportsWearDepartment);
                break;
            case 3:
                theBuyerManagment(buyer, tourismDepartment);
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
                department.printListOfProducts();

                theBuyerManagment(buyer, department);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                department.printListOfProducts();
                scan = new Scanner(System.in);
                entered = scan.nextInt();

                buyer.addProductToBasket(department.getProduct(entered - 1));
                theBuyerManagment(buyer, department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                theBuyerManagmentPayment(buyer);
                theBuyerManagment(buyer, department);
                break;
            case 4:
                theBuyerChooseDepartment(buyer);
                break;
            case 5:
                System.out.print("---------------------------------------------------\n");
                department.printListOfProducts();
                scan = new Scanner(System.in);
                System.out.println("Select product:");
                entered = scan.nextInt();
                Consultant consultant = department.getConsultant(true);

                if (consultant == null) {
                    switch (department.getClass().getSimpleName()) {
                        case "SportEquipmentDepartment":
                            administrator.referralConsultant(department, sportsWearDepartment, tourismDepartment);
                            break;
                        case "SportsWearDepartment":
                            administrator.referralConsultant(department, sportsWearDepartment, sportEquipmentDepartment);
                            break;
                        default:
                            administrator.referralConsultant(department, tourismDepartment, sportEquipmentDepartment);
                            break;
                    }

                    consultant = department.getConsultant(true);
                }

                consultant.consultation(department.getProduct(entered - 1));
                theBuyerManagment(buyer, department);
                break;
            case 6:
                outOfShop();
                break;
            case 7:
                System.out.print("---------------------------------------------------\n");
                theBuyerManagmentCheckSecurity(buyer);
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
    public void theBuyerManagmentPayment(Buyer buyer) {
        for (Cashier cashier : listOfCashiers) {
            if (cashier.getBuyer().getName() == null) {
                cashier.payment(buyer);
                break;
            }
        }

        int index = (int) (Math.random() * listOfCashiers.size());

        listOfCashiers.get(index).payment(buyer);
    }

    @Override
    public void theBuyerManagmentCheckSecurity(Buyer buyer) {
        for (SecurityGuard securityGuard : listOfSecurityGuards) {
            if (securityGuard.getBuyer().getName() == null) {
                securityGuard.checkProduct(buyer);
                break;
            }
        }

        int index = (int) (Math.random() * listOfSecurityGuards.size());

        listOfSecurityGuards.get(index).checkProduct(buyer);
    }

    @Override
    public void printListOfBuyers() {
        StringBuilder result = new StringBuilder("Products:");

        for (int i = 0; i < listOfBuyers.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(listOfBuyers.get(i).toString());
        }
        System.out.println(result);
    }

    @Override
    public void printListOfCashier() {
        StringBuilder result = new StringBuilder("Cashiers:");

        for (int i = 0; i < listOfCashiers.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(listOfCashiers.get(i).toString());
        }
        System.out.println(result);
    }

    @Override
    public void printListOfSecurity() {
        StringBuilder result = new StringBuilder("Cashiers:");

        for (int i = 0; i < listOfSecurityGuards.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(listOfSecurityGuards.get(i).toString());
        }
        System.out.println(result);
    }

    @Override
    public void outOfShop() {
        System.out.print("---------------------------------------------------\n");
        System.out.println("Buy))");
    }

    @Override
    public void addSecurityGuard(SecurityGuard securityGuard) {
        listOfSecurityGuards.add(securityGuard);
    }

    @Override
    public void deleteSecurityGuard(SecurityGuard securityGuard) {
        listOfSecurityGuards.remove(securityGuard);
    }

    @Override
    public ArrayList<SecurityGuard> getListOfSecurityGuard() {
        return listOfSecurityGuards;
    }

    @Override
    public SecurityGuard getSecurityGuard(int index) {
        return listOfSecurityGuards.get(index);
    }

    @Override
    public void addCashier(Cashier cashier) {
        listOfCashiers.add(cashier);
    }

    @Override
    public void deleteCashier(Cashier cashier) {
        listOfCashiers.remove(cashier);
    }

    @Override
    public ArrayList<Cashier> getListOfCashier() {
        return listOfCashiers;
    }

    @Override
    public Cashier getCashier(int index) {
        return listOfCashiers.get(index);
    }

    @Override
    public void addBuyer(Buyer buyer) {
        listOfBuyers.add(buyer);
    }

    @Override
    public void deleteBuyer(Buyer buyer) {
        listOfBuyers.remove(buyer);
    }

    @Override
    public ArrayList<Buyer> getListOfBuyers() {
        return listOfBuyers;
    }

    @Override
    public Buyer getBuyer(int index) {
        return listOfBuyers.get(index);
    }

    @Override
    public TourismDepartment getTourismDepartment() {
        return tourismDepartment;
    }

    @Override
    public SportEquipmentDepartment getSportEquipmentDepartment() {
        return sportEquipmentDepartment;
    }

    @Override
    public SportsWearDepartment getSportsWearDepartment() {
        return sportsWearDepartment;
    }

    @Override
    public Bank getBank() {
        return bank;
    }

    @Override
    public Administrator getAdministrator() {
        return this.administrator;
    }
}
