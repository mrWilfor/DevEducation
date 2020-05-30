package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplBank;
import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.product.ImplProduct;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Administrator;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

import java.util.ArrayList;

public class ImplShop implements homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Shop {
    private ImplDepartment tourismImplDepartment = new ImplDepartment("TourismDepartment");
    private ImplDepartment sportEquipmentImplDepartment = new ImplDepartment("SportEquipmentDepartment");
    private ImplDepartment sportsWearImplDepartment = new ImplDepartment("SportsWearDepartment");
    private ImplBank implBank = new ImplBank();
    private Administrator administrator = new Administrator("Mike");
    private ArrayList<SecurityGuard> listOfSecurityGuards = new ArrayList<>();
    private ArrayList<Cashier> listOfCashiers = new ArrayList<>();
    private ArrayList<ImplBuyer> listOfImplBuyers = new ArrayList<>();

    public ImplShop() {
    }

    @Override
    public void paymentOfBuyer(ImplBuyer implBuyer) {
        int index = (int) (Math.random() * listOfCashiers.size());

        int task = listOfCashiers.get(index).payment(implBuyer);

        if (task != 0) {
            if (implBuyer.getDesireToTakeALoan()) {
                implBank.banker.issuanceOfCredit(implBuyer, implBank, task);
            } else {
                ArrayList<ImplProduct> basket = implBuyer.getBasket();

                for (int i = 0; i < implBuyer.getBasket().size(); i++) {
                    if (basket.get(i).getNameOfDepartment().equals(sportEquipmentImplDepartment.getName())) {
                        sportEquipmentImplDepartment.addProduct(basket.get(i));
                    } else if (basket.get(i).getNameOfDepartment().equals(sportsWearImplDepartment.getName())) {
                        sportsWearImplDepartment.addProduct(basket.get(i));
                    } else if (basket.get(i).getNameOfDepartment().equals(tourismImplDepartment.getName())) {
                        tourismImplDepartment.addProduct(basket.get(i));
                    }
                    implBuyer.deleteProductFromBasket(basket.get(i));
                }
            }
        }
    }

    @Override
    public void takeAProduct(ImplBuyer implBuyer, ImplDepartment implDepartment, int index) {
        if (implBuyer != null && implDepartment != null && index >= 0 && index < implDepartment.getListOfImplProduct().size()) {
            ImplProduct implProduct = implDepartment.getProduct(index);
            implBuyer.addProductToBasket(implProduct);
        }
    }

    @Override
    public void consultation(ImplDepartment implDepartment, ImplProduct implProduct) {
        if (implDepartment != null && implProduct != null) {
            Consultant consultant = implDepartment.getConsultant(true);

            if (consultant == null) {
                switch (implProduct.getNameOfDepartment()) {
                    case "SportEquipmentDepartment":
                        administrator.referralConsultant(implDepartment, sportsWearImplDepartment, tourismImplDepartment);
                        break;
                    case "TourismDepartment":
                        administrator.referralConsultant(implDepartment, sportsWearImplDepartment, sportEquipmentImplDepartment);
                        break;
                    default:
                        administrator.referralConsultant(implDepartment, tourismImplDepartment, sportEquipmentImplDepartment);
                        break;
                }

                consultant = implDepartment.getConsultant(true);
            }

            consultant.consultation(implProduct);
        }
    }

    @Override
    public boolean checkSecurity(ImplBuyer implBuyer) {
        int index = (int) (Math.random() * listOfSecurityGuards.size());

        return listOfSecurityGuards.get(index).checkProduct(implBuyer);
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
    public ImplDepartment getTourismImplDepartment() {
        return tourismImplDepartment;
    }

    @Override
    public ImplDepartment getSportEquipmentImplDepartment() {
        return sportEquipmentImplDepartment;
    }

    @Override
    public ImplDepartment getSportsWearImplDepartment() {
        return sportsWearImplDepartment;
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
    public void addBuyer(ImplBuyer implBuyer) {
        listOfImplBuyers.add(implBuyer);
    }

    @Override
    public void deleteBuyer(ImplBuyer implBuyer) {
        listOfImplBuyers.remove(implBuyer);
    }

    @Override
    public ArrayList<ImplBuyer> getListOfImplBuyers() {
        return listOfImplBuyers;
    }

    @Override
    public ImplBuyer getBuyer(int index) {
        return listOfImplBuyers.get(index);
    }

    @Override
    public ImplBank getImplBank() {
        return implBank;
    }
}
