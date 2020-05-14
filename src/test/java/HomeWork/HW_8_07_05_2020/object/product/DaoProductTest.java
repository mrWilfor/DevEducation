package homeWork.hw_8_07_05_2020.object.product;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoProductTest {
    private DaoProduct daoProduct;

    @BeforeEach
    public void before() {
        this.daoProduct = new DaoProduct();
    }

    @AfterEach
    public void after() {
        this.daoProduct.clear();
    }

    @Test
    void createMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "bread", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "fruits", 1242324,
                "Paris", 20, 2, 1000);

        long actualId1 = this.daoProduct.create(p1);
        long actualId2 = this.daoProduct.create(p2);
        long actualId3 = this.daoProduct.create(p3);
        long actualId4 = this.daoProduct.create(p4);
        long actualId5 = this.daoProduct.create(p5);

        long expectedId1 = 21;
        long expectedId2 = 22;
        long expectedId3 = 23;
        long expectedId4 = 24;
        long expectedId5 = 25;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
        assertEquals(expectedId3, actualId3);
        assertEquals(expectedId4, actualId4);
        assertEquals(expectedId5, actualId5);
    }

    @Test
    void createTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);

        long actualId1 = this.daoProduct.create(p1);
        long actualId2 = this.daoProduct.create(p2);

        long expectedId1 = 21;
        long expectedId2 = 22;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);

        long actualId1 = this.daoProduct.create(p1);
        long expectedId1 = 21;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        Product p1 = new Product();

        long actualId1 = this.daoProduct.create(p1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "bread", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "fruits", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.create(p3);
        this.daoProduct.create(p4);
        this.daoProduct.create(p5);

        Product[] expected = {p1, p2, p3, p4, p5};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);

        Product[] expected = {p1, p2};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);

        this.daoProduct.create(p1);

        Product[] expected = {p1};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "bread", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "fruits", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.create(p3);
        this.daoProduct.create(p4);
        this.daoProduct.create(p5);

        Product[] expected = {p2};
        Product[] actual = this.daoProduct.readByName("water");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);

        Product[] expected = {p2};
        Product[] actual = this.daoProduct.readByName("water");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);

        this.daoProduct.create(p1);

        Product[] expected = {p1};
        Product[] actual = this.daoProduct.readByName("milk");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameZero() {
        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readByName("milk");

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameAndPriseFewGivenMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "milk", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.create(p3);
        this.daoProduct.create(p4);
        this.daoProduct.create(p5);

        Product[] expected = {p1, p3, p5};
        Product[] actual = this.daoProduct.readByNameAndPriseFewGiven("milk", 20);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameAndPriseFewGivenTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);

        Product[] expected = {p2};
        Product[] actual = this.daoProduct.readByNameAndPriseFewGiven("water", 10);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameAndPriseFewGivenOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);

        this.daoProduct.create(p1);

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readByNameAndPriseFewGiven("water", 10);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByNameAndPriseFewGivenZero() {
        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readByNameAndPriseFewGiven("water", 10);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByShelfLifeMoreGivenMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "milk", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.create(p3);
        this.daoProduct.create(p4);
        this.daoProduct.create(p5);

        Product[] expected = {p2, p3};
        Product[] actual = this.daoProduct.readByShelfLifeMoreGiven(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByShelfLifeMoreGivenTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);

        Product[] expected = {p2};
        Product[] actual = this.daoProduct.readByShelfLifeMoreGiven(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByShelfLifeMoreGivenOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);

        this.daoProduct.create(p1);

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readByShelfLifeMoreGiven(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByShelfLifeMoreGivenZero() {
        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readByShelfLifeMoreGiven(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "milk", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.create(p3);
        this.daoProduct.create(p4);
        this.daoProduct.create(p5);
        this.daoProduct.remove(21);

        Product[] expected = {p2, p3, p4, p5};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.remove(21);

        Product[] expected = {p2};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.remove(21);

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoProduct.remove(21);

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "milk", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "milk", 1242324,
                "Paris", 20, 2, 1000);
        Product p6 = new Product(22, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.create(p3);
        this.daoProduct.create(p4);
        this.daoProduct.create(p5);
        this.daoProduct.update(p6);

        Product[] expected = {p1, p6, p3, p4, p5};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p6 = new Product(22, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.update(p6);

        Product[] expected = {p1, p6};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p6 = new Product(22, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.update(p6);

        Product[] expected = {p1};
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        Product p6 = new Product(22, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.update(p6);

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);
        Product p3 = new Product(23, "milk", 1242324,
                "Tokyo", 8, 3, 1000);
        Product p4 = new Product(24, "butter", 1242324,
                "Kiev", 12, 1, 1000);
        Product p5 = new Product(25, "milk", 1242324,
                "Paris", 20, 2, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.create(p3);
        this.daoProduct.create(p4);
        this.daoProduct.create(p5);
        this.daoProduct.clear();

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);
        Product p2 = new Product(22, "water", 1242324,
                "London", 10, 5, 1000);


        this.daoProduct.create(p1);
        this.daoProduct.create(p2);
        this.daoProduct.clear();

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        Product p1 = new Product(21, "milk", 1242324,
                "Virginia", 5, 1, 1000);

        this.daoProduct.create(p1);
        this.daoProduct.clear();

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoProduct.clear();

        Product[] expected = new Product[0];
        Product[] actual = this.daoProduct.readAll();

        assertArrayEquals(expected, actual);
    }
}