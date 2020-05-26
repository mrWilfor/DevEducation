package homeWork.hw_8_Parth_3_19_05_2020.storeStaff;

import homeWork.hw_8_Parth_3_19_05_2020.Main;
import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;

import java.util.Scanner;

public class Administrator extends Staff {
    public Administrator(String name) {
        super(name, "Administrator", "Shop");
    }

    public void outOfOrTakeCredit(Buyer buyer, int lackOfMoney, boolean desireToTakeALoan) {
        if (!desireToTakeALoan) {
            System.out.println("you are negative about lending, therefore you are forced to ask to leave our store");
            Main.shop.deleteBuyer(buyer);
            Main.shop.enteredIntoShop();
        } else {
            System.out.println("you have a positive attitude towards lending, therefore I refer you to a banker");
            Main.shop.getBank().banker.issuanceOfCredit(buyer, lackOfMoney);
        }
    }

    public void referralConsultant(Department departmentThis, Department departmentFrom1, Department departmentFrom2) {
        Consultant consultant;
        consultant = departmentFrom1.getConsultant(true);

        if (consultant != null) {
            departmentThis.addConsultant(consultant);
            departmentFrom1.deleteConsultant(consultant);
        } else {
            consultant = departmentFrom2.getConsultant(true);
        }

        if (consultant != null) {
            departmentThis.addConsultant(consultant);
            departmentFrom2.deleteConsultant(consultant);
        } else {
            departmentThis.getConsultant(false).setStatus(true);
        }
    }

    @Override
    public String toString() {
        return "Administrator{" + super.toString() + "}";
    }
}
