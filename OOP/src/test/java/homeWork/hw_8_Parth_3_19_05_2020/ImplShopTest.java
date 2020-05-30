package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.departments.ImplDepartment;
import homeWork.hw_8_Parth_3_19_05_2020.initialisation.InitialisationShop;
import homeWork.hw_8_Parth_3_19_05_2020.product.ImplProduct;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplShopTest {

    @Test
    void takeAProduct() {
        ImplShop implShop = new ImplShop();
        InitialisationShop.initialisation(implShop);
        ImplBuyer implBuyer = new ImplBuyer("Nick", 200, true);

        implShop.addBuyer(implBuyer);

        int expectedBefore = 3;
        int actualBefore = implShop.getSportEquipmentImplDepartment().getListOfImplProduct().size();

        assertEquals(expectedBefore, actualBefore);

        implShop.takeAProduct(implBuyer, implShop.getSportEquipmentImplDepartment(), 0);

        int expected = 2;
        int actual = implShop.getSportEquipmentImplDepartment().getListOfImplProduct().size();

        assertEquals(expected, actual);
    }

    @Test
    void paymentOfBuyer() {
        ImplShop implShop = new ImplShop();
        InitialisationShop.initialisation(implShop);
        ImplBuyer implBuyer = new ImplBuyer("Nick", 200, true);
        SportsEquipment dumbbell = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );

        implBuyer.addProductToBasket(dumbbell);
        implShop.paymentOfBuyer(implBuyer);

        boolean expected = true;
        boolean actual = implBuyer.getBasket().get(0).getStatus();

        assertEquals(expected, actual);
    }

    @Test
    void paymentOfBuyerCredit() {
        ImplShop implShop = new ImplShop();
        InitialisationShop.initialisation(implShop);
        ImplBuyer implBuyer = new ImplBuyer("Nick", 20, true);
        SportsEquipment dumbbell = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );

        implBuyer.addProductToBasket(dumbbell);

        int expectedBefore = 0;
        int actualBefore = implBuyer.getBankCredit();

        assertEquals(expectedBefore, actualBefore);

        implShop.paymentOfBuyer(implBuyer);

        int expectedAfter = 80;
        int actualAfter = implBuyer.getBankCredit();

        assertEquals(expectedAfter, actualAfter);
    }

    @Test
    void paymentOfBuyerNoBuy() {
        ImplShop implShop = new ImplShop();
        InitialisationShop.initialisation(implShop);
        ImplBuyer implBuyer = new ImplBuyer("Nick", 20, false);
        ImplDepartment implDepartment = implShop.getSportEquipmentImplDepartment();

        implShop.addBuyer(implBuyer);
        implShop.takeAProduct(implBuyer, implDepartment, 0);
        int expectedBefore = 2;
        int actualBefore = implDepartment.getListOfImplProduct().size();

        assertEquals(expectedBefore, actualBefore);

        implShop.paymentOfBuyer(implBuyer);

        int expectedAfter = 3;
        int actualAfter = implDepartment.getListOfImplProduct().size();

        assertEquals(expectedAfter, actualAfter);
    }

    @Test
    void consultation() {
        ImplShop implShop = new ImplShop();
        InitialisationShop.initialisation(implShop);
        ImplProduct implProduct = implShop.getSportEquipmentImplDepartment().getProduct(0);
        ImplDepartment implDepartment = implShop.getSportEquipmentImplDepartment();

        int expectedBefore = 1;
        int actualBefore = implDepartment.getListOfConsultant().size();

        assertEquals(expectedBefore, actualBefore);

        implShop.consultation(implDepartment, implProduct);
        implShop.consultation(implDepartment, implProduct);
        implShop.consultation(implDepartment, implProduct);

        int expected = 3;
        int actual = implDepartment.getListOfConsultant().size();

        assertEquals(expected, actual);
    }

    @Test
    void checkSecurity() {
        ImplShop implShop = new ImplShop();
        InitialisationShop.initialisation(implShop);
        ImplBuyer implBuyer = new ImplBuyer("Nick", 200, true);
        SecurityGuard securityGuard = new SecurityGuard("Mike");

        implShop.addBuyer(implBuyer);
        implShop.takeAProduct(implBuyer, implShop.getSportEquipmentImplDepartment(), 0);
        implShop.paymentOfBuyer(implBuyer);

        assertTrue(securityGuard.checkProduct(implBuyer));
    }

    @Test
    void checkSecurityFail() {
        ImplShop implShop = new ImplShop();
        InitialisationShop.initialisation(implShop);
        ImplBuyer implBuyer = new ImplBuyer("Nick", 200, true);
        SecurityGuard securityGuard = new SecurityGuard("Mike");

        implShop.addBuyer(implBuyer);
        implShop.takeAProduct(implBuyer, implShop.getSportEquipmentImplDepartment(), 0);

        assertFalse(securityGuard.checkProduct(implBuyer));
    }
}