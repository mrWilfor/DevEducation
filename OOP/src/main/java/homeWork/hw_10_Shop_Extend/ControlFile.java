package homeWork.hw_10_Shop_Extend;

import homeWork.hw_10_Shop_Extend.classes.*;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplCashier;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplConsultant;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplSecurity;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;
import homeWork.hw_10_Shop_Extend.classes.initialisation.InitialisationStorage;
import homeWork.hw_10_Shop_Extend.classes.initialisation.InitialisationStore;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Goods;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;

import java.util.LinkedList;
import java.util.Scanner;

public class ControlFile {
    private ImplStore store  = new ImplStore();

    {
        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);
    }

    public void enteredIntoImplStore() {
        System.out.print("Select:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        System.out.print("4 - Cashiers\n");
        System.out.print("5 - Security\n");
        System.out.print("6 - Customer\n");
        System.out.print("7 - Storage\n");
        System.out.print("8 - Administrator\n");
        System.out.print("9 - Exit\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                enteredIntoDepartment(store.getSportEquipmentsDepartment());
                break;
            case 2:
                enteredIntoDepartment(store.getSportWearsDepartment());
                break;
            case 3:
                enteredIntoDepartment(store.getTourismDepartment());
                break;
            case 4:
                cashiersManagment();
                break;
            case 5:
                securityManagment();
                break;
            case 6:
                customerManagment();
                break;
            case 7:
                enteredIntoImplStorage();
                break;
            case 8:
                administrator();
                break;
            case 9:
                outOfImplStore();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                enteredIntoImplStore();
                break;
        }

    }

    public void enteredIntoDepartment(ImplDepartment department) {
        System.out.print("---------------------------------------------------\n");
        System.out.print(department.getClass().getSimpleName() + "\n");
        System.out.print("Select:\n");
        System.out.print("1 - Goods\n");
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
                enteredIntoImplStore();
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
                ImplCashier cashier = new ImplCashier(name);

                store.addCashier(cashier);
                cashiersManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                store.printList(store.getListOfCashiers(), "Cashiers:");
                cashiersManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                store.printList(store.getListOfCashiers(), "Cashiers:");
                entered = scan.nextInt();

                store.deleteCashier(store.getCashier(entered - 1));
                cashiersManagment();
                break;
            case 4:
                enteredIntoImplStore();
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
                ImplSecurity security = new ImplSecurity(name);

                store.addSecurity(security);
                securityManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                store.printList(store.getListOfSecurity(), "Security guards:");
                securityManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                store.printList(store.getListOfSecurity(), "Security guards:");
                entered = scan.nextInt();

                store.deleteSecurity(store.getSecurity(entered - 1));
                securityManagment();
                break;
            case 4:
                enteredIntoImplStore();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                securityManagment();
                break;
        }
    }

    public void customerManagment() {
        System.out.println("---------------------------------------------------");
        System.out.println("Customers:");
        System.out.println("1 - add customer");
        System.out.println("2 - list of customers");
        System.out.println("3 - choose a customer");
        System.out.println("4 - delete a customer");
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

                ImplCustomer buyer = new ImplCustomer(name, money);

                store.addCustomer(buyer);
                customerManagment();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                store.printList(store.getListOfCustomer(), "Customers:");
                customerManagment();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                store.printList(store.getListOfCustomer(), "Customers:");
                entered = scan.nextInt();
                theCustomerChooseDepartment(store.getCustomer(entered - 1));
                break;
            case 4:
                System.out.print("---------------------------------------------------\n");
                store.printList(store.getListOfCustomer(), "Customers:");
                entered = scan.nextInt();

                store.customerOutFromStore(store.getCustomer(entered - 1));
                customerManagment();
                break;
            case 5:
                enteredIntoImplStore();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                customerManagment();
                break;
        }
    }

    public void productsManagment(ImplDepartment department) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Goods:\n");
        System.out.print("1 - add goods\n");
        System.out.print("2 - list of goods\n");
        System.out.print("3 - delete a goods\n");
        System.out.print("4 - return\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                createGoods(department);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                store.printList(department.getListOfGoods(), "Goods:");
                productsManagment(department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                store.printList(department.getListOfGoods(), "Goods:");
                entered = scan.nextInt();

                department.deleteGoods(department.getListOfGoods().get(entered - 1));
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

    public void createGoods(ImplDepartment department) {
        Scanner scan = new Scanner(System.in);
        System.out.print("---------------------------------------------------\n");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.println("\nPrice: ");
        int price = scan.nextInt();
        System.out.println("\nInfo: ");
        String info = scan.next();
        Group group = selectGroup();

        ImplGoods goods = new ImplGoods(name, department.getBrand(), price, group, department, info);

        department.addGoods(goods);
    }

    public Group selectGroup() {
        System.out.print("---------------------------------------------------\n");
        System.out.println("\nGroups: ");
        System.out.println("1 - " + Group.SHIRT.group + "\n");
        System.out.println("2 - " + Group.TROUSERS.group + "\n");
        System.out.println("3 - " + Group.SNEAKERS.group + "\n");
        System.out.println("4 - " + Group.DUMBBELL.group + "\n");
        System.out.println("5 - " + Group.PUNCHINGBAG.group + "\n");
        System.out.println("6 - " + Group.EXPANDER.group + "\n");
        System.out.println("7 - " + Group.KNIFE.group + "\n");
        System.out.println("8 - " + Group.BACKPACK.group + "\n");
        System.out.println("9 - " + Group.TENT.group + "\n");
        System.out.println("Select: ");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                return Group.SHIRT;
            case 2:
                return Group.TROUSERS;
            case 3:
                return Group.SNEAKERS;
            case 4:
                return Group.DUMBBELL;
            case 5:
                return Group.PUNCHINGBAG;
            case 6:
                return Group.EXPANDER;
            case 7:
                return Group.KNIFE;
            case 8:
                return Group.BACKPACK;
            case 9:
                return Group.TENT;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                return selectGroup();
        }
    }

    public void consultantManagment(ImplDepartment department) {
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
                ImplConsultant consultant = new ImplConsultant(name);

                department.addConsultant(consultant);
                consultantManagment(department);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                store.printList(department.getListOfConsultants(), "Consultants:");
                consultantManagment(department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                store.printList(department.getListOfConsultants(), "Consultants:");
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

    public void theCustomerChooseDepartment(ImplCustomer customer) {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Select department:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                theCustomerManagment(customer, store.getSportEquipmentsDepartment());
                break;
            case 2:
                theCustomerManagment(customer, store.getSportWearsDepartment());
                break;
            case 3:
                theCustomerManagment(customer, store.getTourismDepartment());
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                theCustomerChooseDepartment(customer);
                break;
        }
    }

    public void theCustomerManagment(ImplCustomer customer, ImplDepartment department) {
        System.out.print("---------------------------------------------------\n");
        System.out.println(customer.toString());
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
                System.out.println("Goods:");
                store.printList(department.getListOfGoods(), "Goods:");

                theCustomerManagment(customer, department);
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                store.printList(department.getListOfGoods(), "Goods:");
                scan = new Scanner(System.in);
                entered = scan.nextInt();

                store.takeGoodsToCart(entered - 1, department, customer);
                theCustomerManagment(customer, department);
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                store.buyGoods(store.getCashier(), customer);
                theCustomerManagment(customer, department);
                break;
            case 4:
                theCustomerChooseDepartment(customer);
                break;
            case 5:
                System.out.print("---------------------------------------------------\n");
                store.printList(department.getListOfGoods(), "Goods:");
                scan = new Scanner(System.in);
                System.out.println("Select product:");
                entered = scan.nextInt();

                store.consultation(department.getGoods(entered - 1));
                theCustomerManagment(customer, department);
                break;
            case 6:
                store.getSecurity().checkListOfGoods(customer);
                enteredIntoImplStore();
                break;
            case 7:
                System.out.print("---------------------------------------------------\n");
                enteredIntoImplStore();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                theCustomerManagment(customer, department);
                break;
        }
    }

    public void enteredIntoImplStorage() {
        System.out.print("---------------------------------------------------\n");
        System.out.println("Store keeper:");
        System.out.println(store.getStoreKeeper().toString());
        System.out.print("---------------------------------------------------\n");
        System.out.println("Storage:");
        System.out.println("1 - Quantity of goods by brand");
        System.out.println("2 - Quantity of goods by group");
        System.out.println("3 - Quantity of goods by department");
        System.out.println("4 - return");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                System.out.print("---------------------------------------------------\n");
                Brand[] brands = Brand.values();

                for (Brand brand : brands) {
                    System.out.println(brand.brand);
                    System.out.println(store.getStoreKeeper().getQuantityOfGoodsByBrand(brand));
                }

                enteredIntoImplStorage();
                break;
            case 2:
                System.out.print("---------------------------------------------------\n");
                Group[] groups = Group.values();

                for (Group group : groups) {
                    System.out.println(group.group);
                    System.out.println(store.getStoreKeeper().getQuantityOfGoodsByGroup(group));
                }

                enteredIntoImplStorage();
                break;
            case 3:
                System.out.print("---------------------------------------------------\n");
                ImplDepartment department = store.getSportEquipmentsDepartment();

                System.out.println(department.getName());
                System.out.println(store.getStoreKeeper().getQuantityOfGoodsByDepartment(department));

                department = store.getSportWearsDepartment();

                System.out.println(department.getName());
                System.out.println(store.getStoreKeeper().getQuantityOfGoodsByDepartment(department));

                department = store.getTourismDepartment();

                System.out.println(department.getName());
                System.out.println(store.getStoreKeeper().getQuantityOfGoodsByDepartment(department));

                enteredIntoImplStorage();
            case 4 :
                enteredIntoImplStore();
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                enteredIntoImplStorage();
                break;
        }
    }

    public void administrator(){
        System.out.print("---------------------------------------------------\n");
        System.out.println("1 - appoint consultant");
        System.out.println("2 - return");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                administratorChooseDepartment();
                break;
            case 2:
                enteredIntoImplStore();
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                administratorChooseDepartment();
                break;
        }

    }

    public void administratorChooseDepartment() {
        System.out.print("---------------------------------------------------\n");
        System.out.print("Select department:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();

        switch (entered) {
            case 1:
                chooseConsultant(store.getSportEquipmentsDepartment());
                break;
            case 2:
                chooseConsultant(store.getSportWearsDepartment());
                break;
            case 3:
                chooseConsultant(store.getTourismDepartment());
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                administratorChooseDepartment();
                break;
        }
    }

    public void chooseConsultant(ImplDepartment department) {
        System.out.print("---------------------------------------------------\n");
        store.printList(department.getListOfConsultants(), "Consultants:");
        Scanner scan = new Scanner(System.in);
        int entered = scan.nextInt();
        ImplConsultant consultant = department.getConsultant(entered);

        System.out.print("---------------------------------------------------\n");
        System.out.print("Select department:\n");
        System.out.print("1 - Sport equipment department\n");
        System.out.print("2 - Sports wear department\n");
        System.out.print("3 - Tourism department\n");
        entered = scan.nextInt();

        switch (entered) {
            case 1:
               store.getAdministrator().appointConsultant(consultant, store.getSportEquipmentsDepartment());
               administrator();
                break;
            case 2:
                store.getAdministrator().appointConsultant(consultant, store.getSportWearsDepartment());
                administrator();
                break;
            case 3:
                store.getAdministrator().appointConsultant(consultant, store.getTourismDepartment());
                administrator();
                break;
            default:
                System.out.print("---------------------------------------------------\n");
                System.out.println("Invalid input");
                chooseConsultant(department);
                break;
        }
    }

    public void outOfImplStore() {
        System.out.print("---------------------------------------------------\n");
        System.out.println("Buy))");
    }

    public ImplStore getImplStorage() {
        return store;
    }
}
