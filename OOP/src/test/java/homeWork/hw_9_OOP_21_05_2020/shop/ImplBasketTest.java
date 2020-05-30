package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplBasketTest {

    @Test
    void get() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implBasket.addProduct(phone1);
        implBasket.addProduct(phone2);

        ImplProduct[] expectedListOfImplProducts = {phone1, phone2};

        assertArrayEquals(expectedListOfImplProducts, implBasket.getListOfProduct());
    }

    @Test
    void addProductMany() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implBasket.addProduct(phone1);
        implBasket.addProduct(phone2);
        implBasket.addProduct(phone3);
        implBasket.addProduct(phone4);
        implBasket.addProduct(phone5);

        ImplProduct[] expected = {phone1, phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void addProductTwo() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implBasket.addProduct(phone1);
        implBasket.addProduct(phone2);

        ImplProduct[] expected = {phone1, phone2};

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void addProductOne() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implBasket.addProduct(phone1);

        ImplProduct[] expected = {phone1};

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void addProductNull() {
        ImplBasket implBasket = new ImplBasket();

        implBasket.addProduct(null);

        ImplProduct[] expected = null;

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void deleteProductMany() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implBasket.addProduct(phone1);
        implBasket.addProduct(phone2);
        implBasket.addProduct(phone3);
        implBasket.addProduct(phone4);
        implBasket.addProduct(phone5);
        implBasket.deleteProduct(phone1);

        ImplProduct[] expected = {phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void deleteProductTwo() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implBasket.addProduct(phone1);
        implBasket.addProduct(phone2);

        implBasket.deleteProduct(phone1);

        ImplProduct[] expected = {phone2};

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void deleteProductOne() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implBasket.addProduct(phone1);

        implBasket.deleteProduct(phone1);

        ImplProduct[] expected = new ImplProduct[0];

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void deleteProductZero() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implBasket.addProduct(phone1);
        implBasket.deleteProduct(phone2);

        ImplProduct[] expected = {phone1};

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }

    @Test
    void deleteProductNull() {
        ImplBasket implBasket = new ImplBasket();
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implBasket.addProduct(phone1);
        implBasket.deleteProduct(null);

        ImplProduct[] expected = {phone1};

        assertArrayEquals(expected, implBasket.getListOfProduct());
    }
}