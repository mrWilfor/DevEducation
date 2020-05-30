package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplUserTest {

    @Test
    void authorisationsTrue() {
        ImplUser implUser = new ImplUser("Ivan", "1234AB");

        implUser.authorisations("Ivan", "1234AB");

        assertTrue(implUser.getTrigger());
    }

    @Test
    void authorisationsFail() {
        ImplUser implUser = new ImplUser("Ivan", "1234AB");

        implUser.authorisations("Ivan", "5678CD");

        assertFalse(implUser.getTrigger());
    }

    @Test
    void outOfAccount() {
        ImplUser implUser = new ImplUser("Ivan", "1234AB");

        implUser.authorisations("Ivan", "5678CD");
        implUser.outOfAccount();

        assertFalse(implUser.getTrigger());
    }

    @Test
    void get() {
        ImplUser implUser = new ImplUser("Ivan", "1234");
        ImplProduct implProduct1 = new ImplProduct("Phone1", 20, 50);
        ImplProduct implProduct2 = new ImplProduct("Phone2", 25, 55);

        implUser.authorisations("Ivan", "1234");
        implUser.addProduct(implProduct1);
        implUser.addProduct(implProduct2);

        ImplBasket expectedImplBasket = new ImplBasket();

        expectedImplBasket.addProduct(implProduct1);
        expectedImplBasket.addProduct(implProduct2);

        assertTrue(expectedImplBasket.equals(implUser.getImplBasket()));
        assertTrue(implUser.getTrigger());
    }

    @Test
    void getWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "1234");
        ImplProduct implProduct1 = new ImplProduct("Phone1", 20, 50);
        ImplProduct implProduct2 = new ImplProduct("Phone2", 25, 55);

        implUser.addProduct(implProduct1);
        implUser.addProduct(implProduct2);

        ImplBasket expectedImplBasket = new ImplBasket();

        expectedImplBasket.addProduct(implProduct1);
        expectedImplBasket.addProduct(implProduct2);

        assertFalse(expectedImplBasket.equals(implUser.getImplBasket()));
        assertFalse(implUser.getTrigger());
    }

    @Test
    void addProductMany() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.addProduct(phone2);
        implUser.addProduct(phone3);
        implUser.addProduct(phone4);
        implUser.addProduct(phone5);

        ImplProduct[] expected = {phone1, phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void addProductManyWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implUser.addProduct(phone1);
        implUser.addProduct(phone2);
        implUser.addProduct(phone3);
        implUser.addProduct(phone4);
        implUser.addProduct(phone5);

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }

    @Test
    void addProductTwo() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.addProduct(phone2);

        ImplProduct[] expected = {phone1, phone2};

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void addProductTwoWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implUser.addProduct(phone1);
        implUser.addProduct(phone2);

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }

    @Test
    void addProductOne() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);

        ImplProduct[] expected = {phone1};

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void addProductOneWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.addProduct(phone1);

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }

    @Test
    void addProductNull() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.authorisations("Ivan", "12345");

        ImplProduct[] expected = null;

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void addProductNullWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.addProduct(phone1);

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }

    @Test
    void deleteProductMany() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.addProduct(phone2);
        implUser.addProduct(phone3);
        implUser.addProduct(phone4);
        implUser.addProduct(phone5);
        implUser.deleteProduct(phone1);

        ImplProduct[] expected = {phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void deleteProductManyWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.addProduct(phone2);
        implUser.addProduct(phone3);
        implUser.addProduct(phone4);
        implUser.addProduct(phone5);
        implUser.outOfAccount();

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }

    @Test
    void deleteProductTwo() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.addProduct(phone2);
        implUser.deleteProduct(phone1);

        ImplProduct[] expected = {phone2};

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void deleteProductTwoWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.addProduct(phone2);
        implUser.outOfAccount();

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }

    @Test
    void deleteProductOne() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.deleteProduct(phone1);

        ImplProduct[] expected = new ImplProduct[0];

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void deleteProductOneWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.authorisations("Ivan", "12345");
        implUser.addProduct(phone1);
        implUser.outOfAccount();

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }

    @Test
    void deleteProductNull() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.authorisations("Ivan", "12345");
        implUser.deleteProduct(phone1);

        ImplProduct[] expected = null;

        assertArrayEquals(expected, implUser.getImplBasket().getListOfProduct());
    }
    @Test
    void deleteProductNullWithoutAuthorisation() {
        ImplUser implUser = new ImplUser("Ivan", "12345");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implUser.deleteProduct(phone1);

        ImplBasket expected = null;

        assertEquals(expected, implUser.getImplBasket());
    }
}