package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void authorisationsTrue() {
        User user = new User("Ivan", "1234AB");

        user.authorisations("Ivan", "1234AB");

        assertTrue(user.getTrigger());
    }

    @Test
    void authorisationsFail() {
        User user = new User("Ivan", "1234AB");

        user.authorisations("Ivan", "5678CD");

        assertFalse(user.getTrigger());
    }

    @Test
    void outOfAccount() {
        User user = new User("Ivan", "1234AB");

        user.authorisations("Ivan", "5678CD");
        user.outOfAccount();

        assertFalse(user.getTrigger());
    }

    @Test
    void get() {
        User user = new User("Ivan", "1234");
        Product product1 = new Product("Phone1", 20, 50);
        Product product2 = new Product("Phone2", 25, 55);

        user.authorisations("Ivan", "1234");
        user.addProduct(product1);
        user.addProduct(product2);

        Basket expectedBasket = new Basket();

        expectedBasket.addProduct(product1);
        expectedBasket.addProduct(product2);

        assertTrue(expectedBasket.equals(user.getBasket()));
        assertTrue(user.getTrigger());
    }

    @Test
    void getWithoutAuthorisation() {
        User user = new User("Ivan", "1234");
        Product product1 = new Product("Phone1", 20, 50);
        Product product2 = new Product("Phone2", 25, 55);

        user.addProduct(product1);
        user.addProduct(product2);

        Basket expectedBasket = new Basket();

        expectedBasket.addProduct(product1);
        expectedBasket.addProduct(product2);

        assertFalse(expectedBasket.equals(user.getBasket()));
        assertFalse(user.getTrigger());
    }

    @Test
    void addProductMany() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.addProduct(phone2);
        user.addProduct(phone3);
        user.addProduct(phone4);
        user.addProduct(phone5);

        Product[] expected = {phone1, phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void addProductManyWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        user.addProduct(phone1);
        user.addProduct(phone2);
        user.addProduct(phone3);
        user.addProduct(phone4);
        user.addProduct(phone5);

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }

    @Test
    void addProductTwo() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.addProduct(phone2);

        Product[] expected = {phone1, phone2};

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void addProductTwoWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        user.addProduct(phone1);
        user.addProduct(phone2);

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }

    @Test
    void addProductOne() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);

        Product[] expected = {phone1};

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void addProductOneWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.addProduct(phone1);

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }

    @Test
    void addProductNull() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.authorisations("Ivan", "12345");

        Product[] expected = null;

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void addProductNullWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.addProduct(phone1);

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }

    @Test
    void deleteProductMany() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.addProduct(phone2);
        user.addProduct(phone3);
        user.addProduct(phone4);
        user.addProduct(phone5);
        user.deleteProduct(phone1);

        Product[] expected = {phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void deleteProductManyWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.addProduct(phone2);
        user.addProduct(phone3);
        user.addProduct(phone4);
        user.addProduct(phone5);
        user.outOfAccount();

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }

    @Test
    void deleteProductTwo() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.addProduct(phone2);
        user.deleteProduct(phone1);

        Product[] expected = {phone2};

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void deleteProductTwoWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.addProduct(phone2);
        user.outOfAccount();

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }

    @Test
    void deleteProductOne() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.deleteProduct(phone1);

        Product[] expected = new Product[0];

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void deleteProductOneWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.authorisations("Ivan", "12345");
        user.addProduct(phone1);
        user.outOfAccount();

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }

    @Test
    void deleteProductNull() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.authorisations("Ivan", "12345");
        user.deleteProduct(phone1);

        Product[] expected = null;

        assertArrayEquals(expected, user.getBasket().getListOfProduct());
    }
    @Test
    void deleteProductNullWithoutAuthorisation() {
        User user = new User("Ivan", "12345");
        Product phone1 = new Product("Nokia", 100, 70);

        user.deleteProduct(phone1);

        Basket expected = null;

        assertEquals(expected, user.getBasket());
    }
}