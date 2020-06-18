package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplBank;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Bank;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Department;
import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Product;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Administrator;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.ArrayList;

public class ImplShop implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Shop {
    private Department tourismDepartment = new ImplDepartment("TourismDepartment");
    private Department sportEquipmentDepartment = new ImplDepartment("SportEquipmentDepartment");
    private Department sportsWearDepartment = new ImplDepartment("SportsWearDepartment");
    private Bank bank = new ImplBank();
    private Administrator administrator = new Administrator("Mike");
    private ArrayList<SecurityGuard> listOfSecurityGuards = new ArrayList<>();
    private ArrayList<Cashier> listOfCashiers = new ArrayList<>();
    private ArrayList<Buyer> listOfBuyers = new ArrayList<>();

    public ImplShop() {
    }

    @Override
    public void paymentOfBuyer(Buyer buyer) {
        int index = (int) (Math.random() * listOfCashiers.size());

        int task = listOfCashiers.get(index).payment(buyer);

        if (task != 0) {
            if (buyer.getDesireToTakeALoan()) {
                bank.getBanker().issuanceOfCredit(buyer, bank, task);
            } else {
                ArrayList<Product> basket = buyer.getBasket();

                for (int i = 0; i < buyer.getBasket().size(); i++) {
                    if (basket.get(i).getNameOfDepartment().equals(sportEquipmentDepartment.getName())) {
                        sportEquipmentDepartment.addProduct(basket.get(i));
                    } else if (basket.get(i).getNameOfDepartment().equals(sportsWearDepartment.getName())) {
                        sportsWearDepartment.addProduct(basket.get(i));
                    } else if (basket.get(i).getNameOfDepartment().equals(tourismDepartment.getName())) {
                        tourismDepartment.addProduct(basket.get(i));
                    }
                    buyer.deleteProductFromBasket(basket.get(i));
                }
            }
        }
    }

    @Override
    public void takeAProduct(Buyer buyer, Department department, int index) {
        if (buyer != null && department != null && index >= 0 && index < department.getListOfProduct().size()) {
            Product implProduct = department.getProduct(index);
            buyer.addProductToBasket(implProduct);
        }
    }

    @Override
    public void consultation(Department department, Product implProduct) {
        if (department != null && implProduct != null) {
            Consultant consultant = department.getConsultant(true);

            if (consultant == null) {
                switch (implProduct.getNameOfDepartment()) {
                    case "SportEquipmentDepartment":
                        administrator.referralConsultant(department, sportsWearDepartment, tourismDepartment);
                        break;
                    case "TourismDepartment":
                        administrator.referralConsultant(department, sportsWearDepartment, sportEquipmentDepartment);
                        break;
                    default:
                        administrator.referralConsultant(department, tourismDepartment, sportEquipmentDepartment);
                        break;
                }

                consultant = department.getConsultant(true);
            }

            consultant.consultation(implProduct);
        }
    }

    @Override
    public boolean checkSecurity(Buyer buyer) {
        int index = (int) (Math.random() * listOfSecurityGuards.size());

        return listOfSecurityGuards.get(index).checkProduct(buyer);
    }

    @Override
    public void printList(ArrayList list, String name) {
        StringBuilder result = new StringBuilder(name);

        for (int i = 0; i < list.size(); i++) {
            result.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(list.get(i).toString());
        }
        System.out.println(result);
    }

    @Override
    public Department getTourismDepartment() {
        return tourismDepartment;
    }

    @Override
    public Department getSportEquipmentDepartment() {
        return sportEquipmentDepartment;
    }

    @Override
    public Department getSportsWearDepartment() {
        return sportsWearDepartment;
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
    public Bank getImplBank() {
        return bank;
    }
}
