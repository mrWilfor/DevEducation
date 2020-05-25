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
    private TourismDepartment tourismDepartment;
    private SportEquipmentDepartment sportEquipmentDepartment;
    private SportsWearDepartment sportsWearDepartment;
    private Bank bank;
    private Administrator administrator;
    private ArrayList<SecurityGuard> listOfSecurityGuards;
    private ArrayList<Cashier> listOfCashiers;
    private ArrayList<Buyer> listOfBuyers;

    public SportingGoodsStore() {
        this.tourismDepartment = new TourismDepartment();
        this.sportEquipmentDepartment = new SportEquipmentDepartment();
        this.sportsWearDepartment = new SportsWearDepartment();
        this.bank = new Bank();
        this.administrator = new Administrator("Mike");
        this.listOfSecurityGuards = new ArrayList<>();
        this.listOfCashiers = new ArrayList<>();
        this.listOfBuyers = new ArrayList<>();
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

        if (entered == 1) {
            enteredIntoDepartment(sportEquipmentDepartment);
        } else if (entered == 2) {
            enteredIntoDepartment(sportsWearDepartment);
        } else if (entered == 3) {
            enteredIntoDepartment(tourismDepartment);
        } else if (entered == 4) {
            cashiersManagment();
        } else if (entered == 5) {
            securityManagment();
        } else if (entered == 6) {
            enteredIntoBank();
        } else if (entered == 7) {
            buyersManagment();
        } else if (entered == 8) {
            outOfShop();
        } else {
            System.out.println("Invalid input");
            enteredIntoShop();
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

        if (entered == 1) {
            productsManagment(department);
        } else if (entered == 2) {
            consultantManagment(department);
        } else if (entered == 3) {
            enteredIntoShop();
        } else {
            System.out.println("Invalid input");
            enteredIntoDepartment(department);
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

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.print("Name: ");
            String name = scan.next();
            Cashier cashier = new Cashier(name);

            addCashier(cashier);
            cashiersManagment();
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            printListOfCashier();
            cashiersManagment();
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            printListOfCashier();
            entered = scan.nextInt();

            deleteCashier(getCashier(entered - 1));
            cashiersManagment();
        } else if (entered == 4) {
            enteredIntoShop();
        } else {
            System.out.print("---------------------------------------------------\n");
            System.out.println("Invalid input");
            cashiersManagment();
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

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.print("Name: ");
            String name = scan.next();
            SecurityGuard security = new SecurityGuard(name);

            addSecurityGuard(security);
            securityManagment();
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            printListOfSecurity();
            securityManagment();
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            printListOfSecurity();
            entered = scan.nextInt();

            deleteSecurityGuard(getSecurityGuard(entered - 1));
            securityManagment();
        } else if (entered == 4) {
            enteredIntoShop();
        } else {
            System.out.print("---------------------------------------------------\n");
            System.out.println("Invalid input");
            securityManagment();
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

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(bank.getListOfDebtors());
            printListOfBuyers();
        } else if (entered == 2) {
            enteredIntoShop();
        } else {
            System.out.println("Invalid input");
            enteredIntoBank();
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

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.println("Name: ");
            String name = scan.next();

            System.out.println("Money: ");
            int money = scan.nextInt();

            System.out.println("Desire to take a loan(n - negative or p - positive): ");
            String desire = scan.next();

            boolean desireBoolean = false;

            if (desire.equals("n")) {
                desireBoolean = false;
            } else if (desire.equals("p")) {
                desireBoolean = true;
            }
            Buyer buyer = new Buyer(name, money, desireBoolean);

            addBuyer(buyer);
            buyersManagment();
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            printListOfBuyers();

            buyersManagment();
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            printListOfBuyers();
            entered = scan.nextInt();

            theBuyerChooseDepartment(getBuyer(entered - 1));
        } else if (entered == 4) {
            System.out.print("---------------------------------------------------\n");
            printListOfBuyers();
            entered = scan.nextInt();

            deleteBuyer(getBuyer(entered - 1));
            buyersManagment();
        } else if (entered == 5) {
            enteredIntoShop();
        } else {
            System.out.println("Invalid input");
            buyersManagment();
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

        if (entered == 1) {
            createProduct(department);
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            department.printListOfProducts();
            productsManagment(department);
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            department.printListOfProducts();
            entered = scan.nextInt();

            department.deleteProduct(department.getProduct(entered - 1));
            productsManagment(department);
        } else if (entered == 4) {
            enteredIntoDepartment(department);
        } else {
            System.out.println("Invalid input");
            productsManagment(department);
        }
    }

    @Override
    public void createProduct(Department department) {
        Scanner scan = new Scanner(System.in);

        if (department.getClass().getSimpleName().equals("SportEquipmentDepartment")) {
            System.out.print("---------------------------------------------------\n");
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("\nColor: ");
            String color = scan.next();
            System.out.println("\nDescription: ");
            String description = scan.next();
            System.out.println("\nPrice: ");
            int price = scan.nextInt();

            SportsEquipment sportsEquipment = new SportsEquipment(name, color, description, price);
            department.addProduct(sportsEquipment);
            productsManagment(department);
        } else if (department.getClass().getSimpleName().equals("SportsWearDepartment")) {
            System.out.print("---------------------------------------------------\n");
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("\nColor: ");
            String color = scan.next();
            System.out.println("\nDescription: ");
            String description = scan.next();
            System.out.println("\nPrice: ");
            int price = scan.nextInt();
            System.out.println("\nZize: ");
            String size = scan.next();
            System.out.println("\nType of wear: ");
            String typeOfWear = scan.next();

            SportsWear sportsWear = new SportsWear(name, color, description, price, size, typeOfWear);
            department.addProduct(sportsWear);
            productsManagment(department);
        } else if (department.getClass().getSimpleName().equals("TourismDepartment")) {
            System.out.print("---------------------------------------------------\n");
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("\nColor: ");
            String color = scan.next();
            System.out.println("\nDescription: ");
            String description = scan.next();
            System.out.println("\nPrice: ");
            int price = scan.nextInt();
            System.out.println("\nInstruction: ");
            String instruction = scan.next();

            Tourism tourism = new Tourism(name, color, description, price, instruction);
            department.addProduct(tourism);
            productsManagment(department);
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

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.print("Name: ");
            String name = scan.next();
            String departmentName = department.getClass().getSimpleName();
            Consultant consultant = new Consultant(name, departmentName);

            department.addConsultant(consultant);
            consultantManagment(department);
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            department.printListOfConsultants();
            consultantManagment(department);
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            department.printListOfConsultants();
            entered = scan.nextInt();

            department.deleteConsultant(department.getConsultant(entered - 1));
            consultantManagment(department);
        } else if (entered == 4) {
            enteredIntoDepartment(department);
        } else {
            System.out.print("---------------------------------------------------\n");
            System.out.println("Invalid input");
            consultantManagment(department);
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
        System.out.println("6 - leave the department");
        System.out.println("7 - leave the store");
        System.out.println("8 - leave the buyer");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.println("Product:");
            department.printListOfProducts();

            theBuyerManagment(buyer, department);
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            department.printListOfProducts();
            scan = new Scanner(System.in);
            entered = scan.nextInt();

            buyer.addProductToBasket(department.getProduct(entered - 1));
            theBuyerManagment(buyer, department);
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            theBuyerManagmentPayment(buyer);
            theBuyerManagment(buyer, department);
        } else if (entered == 4) {
            theBuyerChooseDepartment(buyer);
        } else if (entered == 5) {
            System.out.print("---------------------------------------------------\n");
            department.printListOfProducts();
            scan = new Scanner(System.in);
            System.out.println("Select product:");
            entered = scan.nextInt();
            Consultant consultant = department.getConsultant(true);

            if (consultant == null) {
                if (department.getClass().getSimpleName().equals("Sport equipment department")) {
                    administrator.referralConsultant(department, sportsWearDepartment, tourismDepartment);
                } else if (department.getClass().getSimpleName().equals("Sports wear department")) {
                    administrator.referralConsultant(department, sportsWearDepartment, sportEquipmentDepartment);
                } else {
                    administrator.referralConsultant(department, tourismDepartment, sportEquipmentDepartment);
                }

                consultant = department.getConsultant(true);
            }
            consultant.consultation(department.getProduct(entered - 1));
            theBuyerManagment(buyer, department);
        } else if (entered == 6) {
            theBuyerChooseDepartment(buyer);
        } else if (entered == 7) {
            outOfShop();
        } else if (entered == 8) {
            System.out.print("---------------------------------------------------\n");
            theBuyerManagmentCheckSecurity(buyer);
            enteredIntoShop();
        } else {
            System.out.println("Invalid input");
            theBuyerManagment(buyer, department);
        }
    }

    @Override
    public void theBuyerManagmentPayment(Buyer buyer) {
        for (int i = 0; i < listOfCashiers.size(); i++) {
            if (listOfCashiers.get(i).getBuyer().getName() == null) {
                listOfCashiers.get(i).payment(buyer);
                break;
            }
        }

        int index = (int) (Math.random() * listOfCashiers.size());

        listOfCashiers.get(index).payment(buyer);
    }

    @Override
    public void theBuyerManagmentCheckSecurity(Buyer buyer) {
        for (int i = 0; i < listOfSecurityGuards.size(); i++) {
            if (listOfSecurityGuards.get(i).getBuyer().getName() == null) {
                listOfSecurityGuards.get(i).checkProduct(buyer);
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
}
