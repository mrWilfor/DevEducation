package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriesTest {

    @Test
    void get() {
      Categories categories = new Categories("Phones");
      Product phone1 = new Product("Nokia", 100, 70);
      Product phone2 = new Product("Samsung", 75, 90);

      categories.addProduct(phone1);
      categories.addProduct(phone2);

      String expectedName = "Phones";
      Product[] expectedListOfProducts = {phone1, phone2};

      assertEquals(expectedName, categories.getName());
      assertArrayEquals(expectedListOfProducts, categories.getListOfProduct());
    }

    @Test
    void addProductMany() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        categories.addProduct(phone1);
        categories.addProduct(phone2);
        categories.addProduct(phone3);
        categories.addProduct(phone4);
        categories.addProduct(phone5);

        Product[] expected = {phone1, phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void addProductTwo() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        categories.addProduct(phone1);
        categories.addProduct(phone2);

        Product[] expected = {phone1, phone2};

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void addProductOne() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);

        categories.addProduct(phone1);

        Product[] expected = {phone1};

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void addProductNull() {
        Categories categories = new Categories("Phones");

        categories.addProduct(null);

        Product[] expected = null;

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void deleteProductMany() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        categories.addProduct(phone1);
        categories.addProduct(phone2);
        categories.addProduct(phone3);
        categories.addProduct(phone4);
        categories.addProduct(phone5);
        categories.deleteProduct(phone1);

        Product[] expected = {phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void deleteProductTwo() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        categories.addProduct(phone1);
        categories.addProduct(phone2);

        categories.deleteProduct(phone1);

        Product[] expected = {phone2};

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void deleteProductOne() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);

        categories.addProduct(phone1);

        categories.deleteProduct(phone1);

        Product[] expected = new Product[0];

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void deleteProductZero() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        categories.addProduct(phone1);
        categories.deleteProduct(phone2);

        Product[] expected = {phone1};

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void deleteProductNull() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);

        categories.addProduct(phone1);
        categories.deleteProduct(null);

        Product[] expected = {phone1};

        assertArrayEquals(expected, categories.getListOfProduct());
    }

    @Test
    void getProduct() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        categories.addProduct(phone1);
        categories.addProduct(phone2);
        categories.addProduct(phone3);
        categories.addProduct(phone4);
        categories.addProduct(phone5);

        Product expected = phone2;

        assertEquals(expected, categories.getProduct(1));
    }

    @Test
    void getProductMiss() {
        Categories categories = new Categories("Phones");
        Product phone1 = new Product("Nokia", 100, 70);
        Product phone2 = new Product("Samsung", 75, 90);
        Product phone3 = new Product("Siemens", 150, 95);
        Product phone4 = new Product("Motorolla", 75, 90);
        Product phone5 = new Product("Xiaomi", 75, 90);

        categories.addProduct(phone1);
        categories.addProduct(phone2);
        categories.addProduct(phone3);
        categories.addProduct(phone4);
        categories.addProduct(phone5);

        Product expected = null;

        assertEquals(expected, categories.getProduct(-1));
    }
}