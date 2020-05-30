package homeWork.hw_10_Shop_Extend.classes;

import homeWork.hw_10_Shop_Extend.classes.employee.*;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.initialisation.InitialisationStorage;

import java.util.LinkedList;

public class ImplStore {
    private ImplStorage storage;
    private ImplDepartment sportEquipments;
    private ImplDepartment sportWears;
    private ImplDepartment tourism;
    private ImplAdministrator administrator;
    private LinkedList<ImplCustomer> listOfCustomer;
    private LinkedList<ImplCashier> listOfCashiers;
    private LinkedList<ImplSecurity> listOfSecurity;
    private ImplStoreKeeper storeKeeper;

    {
        storeKeeper = new ImplStoreKeeper("Viktor");
        storage = new ImplStorage(storeKeeper);
        storeKeeper.setImplStorage(storage);
        sportEquipments = new ImplDepartment("Sport equipments", Brand.REYVEL);
        sportWears = new ImplDepartment("Sport wears", Brand.ADIDAS);
        tourism = new ImplDepartment("Tourism", Brand.CAT);
        administrator = new ImplAdministrator("Nick");
        listOfCustomer = new LinkedList<>();
        listOfCashiers = new LinkedList<>();
        listOfSecurity = new LinkedList<>();
    }

    public void addCustomer(ImplCustomer customer) {
        listOfCustomer.add(customer);
    }

    public void addCashier(ImplCashier cashier) {
        listOfCashiers.add(cashier);
    }

    public void deleteCashier(ImplCashier cashier) {
        listOfCashiers.remove(cashier);
    }

    public void addSecurity(ImplSecurity security) {
        listOfSecurity.add(security);
    }

    public void deleteSecurity(ImplSecurity security) {
        listOfSecurity.remove(security);
    }

    public void takeGoodsToCart(int index, ImplDepartment department, ImplCustomer customer) {
        ImplGoods goods = department.getListOfGoods().get(index);
        customer.addGoodsToCart(goods);
    }

    public void returnGoods(ImplGoods goods) {
        goods.getDepartment().addGoods(goods);
    }

    public void buyGoods(ImplCashier cashier, ImplCustomer customer) {
        if (!cashier.setInTheEndOfTheQueue(customer)) {
            ImplCustomer customer1 = cashier.getFromTheBeginningOfTheQueue();
            int purchase = cashier.calculatesPurchase(customer1);

            if (customer1.getDiscount()) {
                purchase = purchase * 75 / 100;
            } else if (customer1.getTotalPurchases() + purchase > 1000) {
                customer1.setDiscount(true);
                purchase = purchase * 75 / 100;
            }
            cashier.paymentCustomer(customer1, purchase, storeKeeper);
        }
    }

    public void consultation(ImplGoods goods) {
        ImplDepartment department = goods.getDepartment();
        if (department.getConsultant(true) == null) {
            if (department.getName().equals(sportEquipments.getName())) {
                administrator.redirectConsultant(sportEquipments, sportWears, tourism);
            } else if (department.getName().equals(sportWears.getName())) {
                administrator.redirectConsultant(sportWears, sportEquipments, tourism);
            } else {
                administrator.redirectConsultant(tourism, sportEquipments, sportWears);
            }
        }
        System.out.println(department.getConsultant(true).consultation(goods));
    }

    public void securityCheckList(ImplCustomer customer) {
        int index = (int) (Math.random() * listOfCashiers.size());
        ImplSecurity security = listOfSecurity.get(index);
        if (security.checkListOfGoods(customer)) {
            customerOutFromStore(customer);
        }
    }

    public void customerOutFromStore(ImplCustomer customer) {
        listOfCustomer.remove(customer);
    }

    public void printList(LinkedList list, String name) {
        StringBuilder result = new StringBuilder(name);

        for (int i = 0; i < list.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(list.get(i).toString());
        }
        System.out.println(result);
    }

    public ImplDepartment getSportEquipmentsDepartment() {
        return sportEquipments;
    }

    public ImplDepartment getSportWearsDepartment() {
        return sportWears;
    }

    public ImplDepartment getTourismDepartment() {
        return tourism;
    }

    public LinkedList<ImplCustomer> getListOfCustomer() {
        return listOfCustomer;
    }

    public LinkedList<ImplCashier> getListOfCashiers() {
        return listOfCashiers;
    }

    public LinkedList<ImplSecurity> getListOfSecurity() {
        return listOfSecurity;
    }

    public ImplCashier getCashier(int index) {
        return listOfCashiers.get(index);
    }

    public ImplCashier getCashier() {
        int index = (int) (Math.random() * listOfCashiers.size());
        return listOfCashiers.get(index);
    }

    public ImplSecurity getSecurity(int index) {
        return listOfSecurity.get(index);
    }

    public ImplSecurity getSecurity() {
        int index = (int) (Math.random() * listOfCashiers.size());
        return listOfSecurity.get(index);
    }

    public ImplCustomer getCustomer(int index) {
        return listOfCustomer.get(index);
    }

    public ImplGoods getGoods(int index, ImplDepartment department) {
        return department.getListOfGoods().get(index);
    }

    public ImplStoreKeeper getStoreKeeper() {
        return storeKeeper;
    }

    public ImplAdministrator getAdministrator() {
        return administrator;
    }
}
