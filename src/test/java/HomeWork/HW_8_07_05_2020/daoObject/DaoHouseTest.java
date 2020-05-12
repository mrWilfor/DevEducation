package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.House;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaoHouseTest {
    private DaoHouse daoHouse;

    @BeforeEach
    public void before() {
        this.daoHouse = new DaoHouse();
    }

    @AfterEach
    public void after() {
        this.daoHouse.clear();
    }

    @Test
    void createMany() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 1, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 4, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 5, "WallStreet",
                "multi storey", 12);

        long actualId1 = this.daoHouse.create(h1);
        long actualId2 = this.daoHouse.create(h2);
        long actualId3 = this.daoHouse.create(h3);
        long actualId4 = this.daoHouse.create(h4);
        long actualId5 = this.daoHouse.create(h5);

        long expectedId1 = 1;
        long expectedId2 = 2;
        long expectedId3 = 3;
        long expectedId4 = 4;
        long expectedId5 = 5;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
        assertEquals(expectedId3, actualId3);
        assertEquals(expectedId4, actualId4);
        assertEquals(expectedId5, actualId5);
    }

    @Test
    void createTwo() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 1, "WallStreet",
                "multi storey", 12);

        long actualId1 = this.daoHouse.create(h1);
        long actualId2 = this.daoHouse.create(h2);

        long expectedId1 = 1;
        long expectedId2 = 2;

        assertEquals(expectedId1, actualId1);
        assertEquals(expectedId2, actualId2);
    }

    @Test
    void createOne() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        long actualId1 = this.daoHouse.create(h1);
        long expectedId1 = 1;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void createZero() {
        House h1 = new House();
        long actualId1 = this.daoHouse.create(h1);
        long expectedId1 = 0;

        assertEquals(expectedId1, actualId1);
    }

    @Test
    void readAllMany() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 1, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 4, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 5, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.create(h3);
        this.daoHouse.create(h4);
        this.daoHouse.create(h5);

        House[] expected = {h1, h2, h3, h4, h5};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllTwo() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 1, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);

        House[] expected = {h1, h2};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllOne() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);

        House[] expected = {h1};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readAllZero() {
        House[] expected = new House[0];
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsMany() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 3, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 4, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.create(h3);
        this.daoHouse.create(h4);
        this.daoHouse.create(h5);

        House[] expected = {h1, h2, h3};
        House[] actual = this.daoHouse.readByQuantityOfRooms(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsTwo() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);

        House[] expected = {h1, h2};
        House[] actual = this.daoHouse.readByQuantityOfRooms(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsOne() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);

        House[] expected = {h1};
        House[] actual = this.daoHouse.readByQuantityOfRooms(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsZero() {
        House[] expected = new House[0];
        House[] actual = this.daoHouse.readByQuantityOfRooms(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsAndFloorMany() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 3, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 4, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.create(h3);
        this.daoHouse.create(h4);
        this.daoHouse.create(h5);

        House[] expected = {h1, h3};
        House[] actual = this.daoHouse.readByQuantityOfRoomsAndFloor(2, 7, 10);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsAndFloorTwo() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);

        House[] expected = {h1};
        House[] actual = this.daoHouse.readByQuantityOfRoomsAndFloor(2, 7, 10);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsAndFloorOne() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);

        House[] expected = {h1};
        House[] actual = this.daoHouse.readByQuantityOfRoomsAndFloor(2, 7, 10);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByQuantityOfRoomsAndFloorZero() {
        House[] expected = new House[0];
        House[] actual = this.daoHouse.readByQuantityOfRoomsAndFloor(2, 7, 10);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByApartmentThatHaveAreaMoreThanMany() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 3, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 4, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.create(h3);
        this.daoHouse.create(h4);
        this.daoHouse.create(h5);

        House[] expected = {h1, h4, h5};
        House[] actual = this.daoHouse.readByApartmentThatHaveAreaMoreThan(40);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByApartmentThatHaveAreaMoreThanTwo() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);

        House[] expected = {h1};
        House[] actual = this.daoHouse.readByApartmentThatHaveAreaMoreThan(40);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByApartmentThatHaveAreaMoreThanOne() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);

        House[] expected = {h1};
        House[] actual = this.daoHouse.readByApartmentThatHaveAreaMoreThan(40);

        assertArrayEquals(expected, actual);
    }

    @Test
    void readByApartmentThatHaveAreaMoreThanZero() {
        House[] expected = new House[0];
        House[] actual = this.daoHouse.readByApartmentThatHaveAreaMoreThan(40);

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeMany() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 3, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 4, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.create(h3);
        this.daoHouse.create(h4);
        this.daoHouse.create(h5);
        this.daoHouse.remove(3);

        House[] expected = {h1, h2, h4, h5};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeTwo() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.remove(3);

        House[] expected = {h1, h2};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeOne() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.remove(3);

        House[] expected = {h1};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeZero() {
        this.daoHouse.remove(3);

        House[] expected = new House[0];
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMany() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 3, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 4, "WallStreet",
                "multi storey", 12);
        House h6 = new House(3, 36, 70, 3, 1, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.create(h3);
        this.daoHouse.create(h4);
        this.daoHouse.create(h5);
        this.daoHouse.update(h6);

        House[] expected = {h1, h2, h6, h4, h5};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateTwo() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);
        House h6 = new House(1, 36, 70, 3, 1, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.update(h6);

        House[] expected = {h6, h2};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateOne() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h6 = new House(1, 36, 70, 3, 1, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.update(h6);

        House[] expected = {h6};
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void updateZero() {
        House h6 = new House(1, 36, 70, 3, 1, "WallStreet",
                "multi storey", 12);

        this.daoHouse.update(h6);

        House[] expected = new House[0];
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearMany() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);
        House h3 = new House(3, 34, 40, 7, 2, "WallStreet",
                "multi storey", 12);
        House h4 = new House(4, 35, 65, 9, 3, "WallStreet",
                "multi storey", 12);
        House h5 = new House(5, 36, 70, 3, 4, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.create(h3);
        this.daoHouse.create(h4);
        this.daoHouse.create(h5);
        this.daoHouse.clear();

        House[] expected = new House[0];
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearTwo() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);
        House h2 = new House(2, 33, 35, 5, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.create(h2);
        this.daoHouse.clear();

        House[] expected = new House[0];
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearOne() {
        House h1 = new House(1, 32, 50, 10, 2, "WallStreet",
                "multi storey", 12);

        this.daoHouse.create(h1);
        this.daoHouse.clear();

        House[] expected = new House[0];
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void clearZero() {
        this.daoHouse.clear();

        House[] expected = new House[0];
        House[] actual = this.daoHouse.readAll();

        assertArrayEquals(expected, actual);
    }
}
