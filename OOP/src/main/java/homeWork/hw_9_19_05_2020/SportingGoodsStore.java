package homeWork.hw_9_19_05_2020;

import homeWork.hw_9_19_05_2020.departments.Department;
import homeWork.hw_9_19_05_2020.departments.SportEquipmentDepartment;
import homeWork.hw_9_19_05_2020.departments.SportsWearDepartment;
import homeWork.hw_9_19_05_2020.departments.TourismDepartment;
import homeWork.hw_9_19_05_2020.product.SportsEquipment;
import homeWork.hw_9_19_05_2020.product.SportsWear;
import homeWork.hw_9_19_05_2020.product.Tourism;
import homeWork.hw_9_19_05_2020.storeStaff.*;

import java.util.Scanner;

public class SportingGoodsStore {
    public TourismDepartment tourismDepartment;
    public SportEquipmentDepartment sportEquipmentDepartment;
    public SportsWearDepartment sportsWearDepartment;
    public Bank bank;
    public Administrator administrator;

    public SportingGoodsStore() {
        this.tourismDepartment = new TourismDepartment();
        this.sportEquipmentDepartment = new SportEquipmentDepartment();
        this.sportsWearDepartment = new SportsWearDepartment();
        this.bank = new Bank();
        this.administrator = new Administrator("Mike");
    }

    public void enteredIntoShop() {
        System.out.print("Select department:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        System.out.print("4 - Bank\n");
        System.out.print("5 - Exit\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        if (entered == 1) {
            enteredIntoDepartment(sportEquipmentDepartment);
        } else if (entered == 2) {
            enteredIntoDepartment(sportsWearDepartment);
        } else if (entered == 3) {
            enteredIntoDepartment(tourismDepartment);
        } else if (entered == 4) {
            enteredIntoBank();
        } else if (entered == 5) {
            outOfShop();
        } else {
            System.out.println("Invalid input");
            enteredIntoShop();
        }

    }

    public void enteredIntoDepartment(Department department) {
        System.out.print("---------------------------------------------------\n");
        System.out.print(department.getDepartmentName() + "\n");
        System.out.print("Select:\n");
        System.out.print("1 - Buyers\n");
        System.out.print("2 - Product\n");
        System.out.print("3 - Staff\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        if (entered == 1) {
            goToBuyers(department);
        } else if (entered == 2) {
            goToProducts(department);
        } else if (entered == 3) {
            goToStaffs(department);
        } else if (entered == 4) {
            enteredIntoShop();
        } else {
            System.out.println("Invalid input");
            enteredIntoDepartment(department);
        }
    }


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
            enteredIntoBank();
        } else if (entered == 2) {
            enteredIntoShop();
        } else {
            System.out.println("Invalid input");
            enteredIntoBank();
        }
    }

    public void goToBuyers(Department department) {
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

            department.addBuyer(buyer);
            goToBuyers(department);
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListBuyers());

            goToBuyers(department);
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListBuyers());
            entered = scan.nextInt();

            goToTheBuyer(department.getBuyer(entered - 1), department);
        } else if (entered == 4) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListBuyers());
            entered = scan.nextInt();

            department.deleteBuyer(department.getBuyer(entered - 1));
            goToBuyers(department);
        } else if (entered == 5) {
            enteredIntoDepartment(department);
        } else {
            System.out.println("Invalid input");
            goToBuyers(department);
        }
    }

    public void goToProducts(Department department) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Products:\n");
        System.out.print("1 - add product\n");
        System.out.print("2 - list of product\n");
        System.out.print("3 - delete a product\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        if (entered == 1) {
            if (department.getDepartmentName().equals("Sport equipment department")) {
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
                goToProducts(department);
            } else if (department.getDepartmentName().equals("Sport wear department")) {
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
                goToProducts(department);
            } else if (department.getDepartmentName().equals("Tourism department")) {
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
                goToProducts(department);
            }
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListProduct());
            goToProducts(department);
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListProduct());
            entered = scan.nextInt();

            department.deleteProduct(department.getProduct(entered - 1));
            goToProducts(department);
        } else if (entered == 4) {
            enteredIntoDepartment(department);
        } else {
            System.out.println("Invalid input");
            goToProducts(department);
        }
    }

    public void goToStaffs(Department department) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Staffs:\n");
        System.out.print("1 - add staff\n");
        System.out.print("2 - list of staffs\n");
        System.out.print("3 - delete a staff\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.print("Name: ");
            String name = scan.next();
            System.out.println("\nPosition:");
            System.out.println("1 - Cashier");
            System.out.println("2 - Consultant");
            System.out.println("3 - Security");
            entered = scan.nextInt();
            String position = "";

            if (entered == 1) {
                position = "Cashier";
            } else if (entered == 2) {
                position = "Consultant";
            } else if (entered == 3) {
                position = "Security";
            } else {
                System.out.println("Invalid input");
                goToStaffs(department);
            }
            String departmentName = department.getDepartmentName();

            if (position.equals("Cashier")) {
                Cashier cashier = new Cashier(name, position, departmentName);
                department.addStaff(cashier);
                goToStaffs(department);
            } else if (position.equals("Consultant")) {
                Consultant consultant = new Consultant(name, position, departmentName);
                department.addStaff(consultant);
                goToStaffs(department);
            } else if (position.equals("Security")) {
                SecurityGuard securityGuard = new SecurityGuard(name, position, departmentName);
                department.addStaff(securityGuard);
                goToStaffs(department);
            }
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListStaff());
            goToStaffs(department);
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListStaff());
            entered = scan.nextInt();

            department.deleteStaff(department.getStaff(entered - 1));
            goToStaffs(department);
        } else if (entered == 4) {
            enteredIntoDepartment(department);
        } else {
            System.out.print("---------------------------------------------------\n");
            System.out.println("Invalid input");
            goToStaffs(department);
        }
    }

    public void goToTheBuyer(Buyer buyer, Department department) {
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

        if (entered == 1) {
            System.out.print("---------------------------------------------------\n");
            System.out.println("Product:");
            System.out.println(department.getListProduct());

            goToTheBuyer(buyer, department);
        } else if (entered == 2) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListProduct());
            scan = new Scanner(System.in);
            entered = scan.nextInt();

            buyer.addProductToBasket(department.getProduct(entered - 1));
            goToTheBuyer(buyer, department);
        } else if (entered == 3) {
            System.out.print("---------------------------------------------------\n");
            ((Cashier) department.getStaff("Cashier")).payment(buyer);
            goToTheBuyer(buyer, department);
        } else if (entered == 4) {
            System.out.print("---------------------------------------------------\n");
            System.out.println("1 - Sport equipment department");
            System.out.println("2 - Sport wear department");
            System.out.println("3 - Tourism department");
            scan = new Scanner(System.in);
            entered = scan.nextInt();

            if (entered == 1) {
                System.out.print("---------------------------------------------------\n");
                department.deleteBuyer(buyer);
                sportEquipmentDepartment.addBuyer(buyer);
                goToTheBuyer(buyer, sportEquipmentDepartment);
            } else if (entered == 2) {
                System.out.print("---------------------------------------------------\n");
                department.deleteBuyer(buyer);
                sportsWearDepartment.addBuyer(buyer);
                goToTheBuyer(buyer, sportsWearDepartment);
            } else if (entered == 3) {
                System.out.print("---------------------------------------------------\n");
                department.deleteBuyer(buyer);
                tourismDepartment.addBuyer(buyer);
                goToTheBuyer(buyer, tourismDepartment);
            } else {
                System.out.println("Invalid input");
                goToTheBuyer(buyer, department);
            }
        } else if (entered == 5) {
            System.out.print("---------------------------------------------------\n");
            System.out.println(department.getListProduct());
            scan = new Scanner(System.in);
            System.out.println("Select product:");
            entered = scan.nextInt();
            Consultant consultant = (Consultant) department.getStaff("Consultant");

            if (consultant == null) {
                if (department.getDepartmentName().equals("Sport equipment department")) {
                    administrator.referralConsultant(department, sportsWearDepartment, tourismDepartment);
                } else if (department.getDepartmentName().equals("Sports wear department")) {
                    administrator.referralConsultant(department, sportsWearDepartment, sportEquipmentDepartment);
                } else {
                    administrator.referralConsultant(department, tourismDepartment, sportEquipmentDepartment);
                }

                consultant = (Consultant) department.getStaff("Consultant");
            }
            consultant.productDescription(department.getProduct(entered - 1));
            consultant.setStatus(false);
            goToTheBuyer(buyer, department);
        } else if (entered == 6) {
            outOfShop();
        } else if (entered == 7) {
            System.out.print("---------------------------------------------------\n");
            ((SecurityGuard) department.getStaff("Security")).checkProduct(buyer);
            department.deleteBuyer(buyer);
            goToTheBuyer(buyer, department);
        } else {
            System.out.println("Invalid input");
            goToTheBuyer(buyer, department);
        }
    }

    public void outOfShop() {
        System.out.print("---------------------------------------------------\n");
        System.out.println("Buy))");
    }
}
