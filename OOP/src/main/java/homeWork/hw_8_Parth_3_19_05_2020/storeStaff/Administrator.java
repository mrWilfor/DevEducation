package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.Main;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;

public class Administrator extends Staff {
    public Administrator(String name) {
        super(name, "Administrator", "Shop");
    }

    public void outOfOrTakeCredit(Buyer buyer, int lackOfMoney, boolean desireToTakeALoan) {
        if (!desireToTakeALoan) {
            System.out.println("you are negative about lending, therefore you are forced to ask to leave our store");
            Main.shop.sportEquipmentDepartment.deleteBuyer(buyer);
            Main.shop.sportsWearDepartment.deleteBuyer(buyer);
            Main.shop.tourismDepartment.deleteBuyer(buyer);
        } else {
            System.out.println("you have a negative attitude towards lending, therefore I refer you to a banker");
            Main.shop.bank.banker.issuanceOfCredit(buyer, lackOfMoney);
        }
    }

    public void referralConsultant(Department departmentThis, Department departmentFrom1, Department departmentFrom2) {
        Consultant consultant = null;
        consultant = (Consultant) departmentFrom1.getStaff("Consultant");

        if (consultant != null) {
            departmentThis.addStaff(consultant);
            departmentFrom1.deleteStaff(consultant);
        } else {
            consultant = (Consultant) departmentFrom2.getStaff("Consultant");
        }

        if (consultant != null) {
            departmentThis.addStaff(consultant);
            departmentFrom2.deleteStaff(consultant);
        } else {
            ((Consultant) departmentThis.getStaff("Consultant", false)).setStatus(true);
        }
    }

    @Override
    public String toString() {
        return "Administrator{" + super.toString() + "}";
    }
}
