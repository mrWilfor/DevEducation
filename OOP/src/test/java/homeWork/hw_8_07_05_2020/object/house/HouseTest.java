package homeWork.hw_8_07_05_2020.object.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void createTest() {
        long expId = 235;
        int expNumberOfApartment = 32;
        long expArea = 50;
        int expFloor = 10;
        int expQuantityOfRooms = 3;
        String expStreet = "WallStreet";
        String expTypeOfBuilding = "multi storey";
        int expLifeTime = 12;

        House h1 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);

        assertEquals(h1, h2);
        assertEquals(expId, h1.getId());
        assertEquals(expNumberOfApartment, h1.getNumberOfApartment());
        assertEquals(expArea, h1.getArea());
        assertEquals(expFloor, h1.getFloor());
        assertEquals(expQuantityOfRooms, h1.getQuantityOfRooms());
        assertEquals(expStreet, h1.getStreet());
        assertEquals(expTypeOfBuilding, h1.getTypeOfBuilding());
        assertEquals(expLifeTime, h1.getLifeTime());
    }

    @Test
    void setGetTest() {
        House h = new House();
        long expId = 235;
        int expNumberOfApartment = 32;
        long expArea = 50;
        int expFloor = 10;
        int expQuantityOfRooms = 3;
        String expStreet = "WallStreet";
        String expTypeOfBuilding = "multi storey";
        int expLifeTime = 12;

        h.setId(235);
        h.setNumberOfApartment(32);
        h.setArea(50);
        h.setFloor(10);
        h.setQuantityOfRooms(3);
        h.setStreet("WallStreet");
        h.setTypeOfBuilding("multi storey");
        h.setLifeTime(12);

        assertEquals(expId, h.getId());
        assertEquals(expNumberOfApartment, h.getNumberOfApartment());
        assertEquals(expArea, h.getArea());
        assertEquals(expFloor, h.getFloor());
        assertEquals(expQuantityOfRooms, h.getQuantityOfRooms());
        assertEquals(expStreet, h.getStreet());
        assertEquals(expTypeOfBuilding, h.getTypeOfBuilding());
        assertEquals(expLifeTime, h.getLifeTime());
    }

    @Test
    void builderTest() {
        House h1 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House.Builder()
                .id(235)
                .numberOfApartment(32)
                .area(50)
                .floor(10)
                .quantityOfRooms(3)
                .street("WallStreet")
                .typeOfBuilding("multi storey")
                .lifeTime(12)
                .build();

        assertEquals(h1, h2);
    }

    @Test
    void testEqualsTest() {
        House h1 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);

        assertEquals(h1, h2);
    }

    @Test
    void testEqualsTestFail() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);

        assertFalse(h1.equals(h2));
    }

    @Test
    void testHashCodeTest() {
        House h1 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);

        assertTrue(h1.hashCode() == h2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        House h1 = new House(1, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        House h2 = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);

        System.out.println(h2.hashCode());
        assertFalse(h1.hashCode() == h2.hashCode());
    }

    @Test
    void testToString() {
        House h = new House(235, 32, 50, 10, 3, "WallStreet",
                "multi storey", 12);
        String expected = "HomeWork.HW_8_07_05_2020.object.House@2136726508[id=235, numberOfApartment=32, area=50, " +
                "floor=10, quantityOfRooms=3, street=WallStreet, typeOfBuilding=multi storey, lifeTime=12]";

        assertEquals(expected, h.toString());
    }
}