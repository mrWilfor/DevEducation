package homeWork.hw_9_OOP_21_05_2020.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplCategoriesTest {

    @Test
    void get() {
      ImplCategories implCategories = new ImplCategories("Phones");
      ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
      ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

      implCategories.addProduct(phone1);
      implCategories.addProduct(phone2);

      String expectedName = "Phones";
      ImplProduct[] expectedListOfImplProducts = {phone1, phone2};

      assertEquals(expectedName, implCategories.getName());
      assertArrayEquals(expectedListOfImplProducts, implCategories.getListOfProduct());
    }

    @Test
    void addProductMany() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.addProduct(phone2);
        implCategories.addProduct(phone3);
        implCategories.addProduct(phone4);
        implCategories.addProduct(phone5);

        ImplProduct[] expected = {phone1, phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void addProductTwo() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.addProduct(phone2);

        ImplProduct[] expected = {phone1, phone2};

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void addProductOne() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implCategories.addProduct(phone1);

        ImplProduct[] expected = {phone1};

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void addProductNull() {
        ImplCategories implCategories = new ImplCategories("Phones");

        implCategories.addProduct(null);

        ImplProduct[] expected = null;

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void deleteProductMany() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.addProduct(phone2);
        implCategories.addProduct(phone3);
        implCategories.addProduct(phone4);
        implCategories.addProduct(phone5);
        implCategories.deleteProduct(phone1);

        ImplProduct[] expected = {phone2, phone3, phone4, phone5};

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void deleteProductTwo() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.addProduct(phone2);

        implCategories.deleteProduct(phone1);

        ImplProduct[] expected = {phone2};

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void deleteProductOne() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);

        implCategories.addProduct(phone1);

        implCategories.deleteProduct(phone1);

        ImplProduct[] expected = new ImplProduct[0];

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void deleteProductZero() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.deleteProduct(phone2);

        ImplProduct[] expected = {phone1};

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void deleteProductNull() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.deleteProduct(null);

        ImplProduct[] expected = {phone1};

        assertArrayEquals(expected, implCategories.getListOfProduct());
    }

    @Test
    void getProduct() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.addProduct(phone2);
        implCategories.addProduct(phone3);
        implCategories.addProduct(phone4);
        implCategories.addProduct(phone5);

        ImplProduct expected = phone2;

        assertEquals(expected, implCategories.getProduct(1));
    }

    @Test
    void getProductMiss() {
        ImplCategories implCategories = new ImplCategories("Phones");
        ImplProduct phone1 = new ImplProduct("Nokia", 100, 70);
        ImplProduct phone2 = new ImplProduct("Samsung", 75, 90);
        ImplProduct phone3 = new ImplProduct("Siemens", 150, 95);
        ImplProduct phone4 = new ImplProduct("Motorolla", 75, 90);
        ImplProduct phone5 = new ImplProduct("Xiaomi", 75, 90);

        implCategories.addProduct(phone1);
        implCategories.addProduct(phone2);
        implCategories.addProduct(phone3);
        implCategories.addProduct(phone4);
        implCategories.addProduct(phone5);

        ImplProduct expected = null;

        assertEquals(expected, implCategories.getProduct(-1));
    }
}