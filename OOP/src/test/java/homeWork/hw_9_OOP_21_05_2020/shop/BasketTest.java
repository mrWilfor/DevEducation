package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void get() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        basket.addProduct(phone1);
        basket.addProduct(phone2);

        Product[] expectedListOfProducts = {phone1, phone2};

        assertArrayEquals(expectedListOfProducts, basket.getListOfProduct());
    }

    @Test
    void addProductMany() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        basket.addProduct(phone1);
        basket.addProduct(phone2);
        basket.addProduct(phone3);
        basket.addProduct(phone4);
        basket.addProduct(phone5);

        Product[] expected = {phone1, phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void addProductTwo() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        basket.addProduct(phone1);
        basket.addProduct(phone2);

        Product[] expected = {phone1, phone2};

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void addProductOne() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);

        basket.addProduct(phone1);

        Product[] expected = {phone1};

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void addProductNull() {
        Basket basket = new Basket();

        basket.addProduct(null);

        Product[] expected = null;

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void deleteProductMany() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        basket.addProduct(phone1);
        basket.addProduct(phone2);
        basket.addProduct(phone3);
        basket.addProduct(phone4);
        basket.addProduct(phone5);
        basket.deleteProduct(phone1);

        Product[] expected = {phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void deleteProductTwo() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        basket.addProduct(phone1);
        basket.addProduct(phone2);

        basket.deleteProduct(phone1);

        Product[] expected = {phone2};

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void deleteProductOne() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);

        basket.addProduct(phone1);

        basket.deleteProduct(phone1);

        Product[] expected = new Product[0];

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void deleteProductZero() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        basket.addProduct(phone1);
        basket.deleteProduct(phone2);

        Product[] expected = {phone1};

        assertArrayEquals(expected, basket.getListOfProduct());
    }

    @Test
    void deleteProductNull() {
        Basket basket = new Basket();
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        basket.addProduct(phone1);
        basket.deleteProduct(null);

        Product[] expected = {phone1};

        assertArrayEquals(expected, basket.getListOfProduct());
    }
}