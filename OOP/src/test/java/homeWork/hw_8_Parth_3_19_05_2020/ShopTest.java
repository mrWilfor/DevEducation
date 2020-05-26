package homeWork.hw_8_Parth_3_19_05_2020;

import homeWork.hw_8_Parth_3_19_05_2020.departments.Department;
import homeWork.hw_8_Parth_3_19_05_2020.initialisation.InitialisationShop;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void takeAProduct() {
        Shop shop = new Shop();
        InitialisationShop.initialisation(shop);
        Buyer buyer = new Buyer("Nick", 200, true);

        shop.addBuyer(buyer);

        int expectedBefore = 3;
        int actualBefore = shop.getSportEquipmentDepartment().getListOfProduct().size();

        assertEquals(expectedBefore, actualBefore);

        shop.takeAProduct(buyer, shop.getSportEquipmentDepartment(), 0);

        int expected = 2;
        int actual = shop.getSportEquipmentDepartment().getListOfProduct().size();

        assertEquals(expected, actual);
    }

    @Test
    void paymentOfBuyer() {
        Shop shop = new Shop();
        InitialisationShop.initialisation(shop);
        Buyer buyer = new Buyer("Nick", 200, true);
        SportsEquipment dumbbell = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );

        buyer.addProductToBasket(dumbbell);
        shop.paymentOfBuyer(buyer);

        boolean expected = true;
        boolean actual = buyer.getBasket().get(0).getStatus();

        assertEquals(expected, actual);
    }

    @Test
    void paymentOfBuyerCredit() {
        Shop shop = new Shop();
        InitialisationShop.initialisation(shop);
        Buyer buyer = new Buyer("Nick", 20, true);
        SportsEquipment dumbbell = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );

        buyer.addProductToBasket(dumbbell);

        int expectedBefore = 0;
        int actualBefore = buyer.getBankCredit();

        assertEquals(expectedBefore, actualBefore);

        shop.paymentOfBuyer(buyer);

        int expectedAfter = 80;
        int actualAfter = buyer.getBankCredit();

        assertEquals(expectedAfter, actualAfter);
    }

    @Test
    void paymentOfBuyerNoBuy() {
        Shop shop = new Shop();
        InitialisationShop.initialisation(shop);
        Buyer buyer = new Buyer("Nick", 20, false);
        Department department = shop.getSportEquipmentDepartment();

        shop.addBuyer(buyer);
        shop.takeAProduct(buyer, department, 0);
        int expectedBefore = 2;
        int actualBefore = department.getListOfProduct().size();

        assertEquals(expectedBefore, actualBefore);

        shop.paymentOfBuyer(buyer);

        int expectedAfter = 3;
        int actualAfter = department.getListOfProduct().size();

        assertEquals(expectedAfter, actualAfter);
    }

    @Test
    void consultation() {
        Shop shop = new Shop();
        InitialisationShop.initialisation(shop);
        Product product = shop.getSportEquipmentDepartment().getProduct(0);
        Department department = shop.getSportEquipmentDepartment();

        int expectedBefore = 1;
        int actualBefore = department.getListOfConsultant().size();

        assertEquals(expectedBefore, actualBefore);

        shop.consultation(department, product);
        shop.consultation(department, product);
        shop.consultation(department, product);

        int expected = 3;
        int actual = department.getListOfConsultant().size();

        assertEquals(expected, actual);
    }

    @Test
    void checkSecurity() {
        Shop shop = new Shop();
        InitialisationShop.initialisation(shop);
        Buyer buyer = new Buyer("Nick", 200, true);
        SecurityGuard securityGuard = new SecurityGuard("Mike");

        shop.addBuyer(buyer);
        shop.takeAProduct(buyer, shop.getSportEquipmentDepartment(), 0);
        shop.paymentOfBuyer(buyer);

        assertTrue(securityGuard.checkProduct(buyer));
    }

    @Test
    void checkSecurityFail() {
        Shop shop = new Shop();
        InitialisationShop.initialisation(shop);
        Buyer buyer = new Buyer("Nick", 200, true);
        SecurityGuard securityGuard = new SecurityGuard("Mike");

        shop.addBuyer(buyer);
        shop.takeAProduct(buyer, shop.getSportEquipmentDepartment(), 0);

        assertFalse(securityGuard.checkProduct(buyer));
    }
}