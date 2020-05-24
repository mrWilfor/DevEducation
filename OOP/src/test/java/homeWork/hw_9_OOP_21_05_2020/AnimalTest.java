package homeWork.hw_9_OOP_21_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void get() {
        Animal animal = new Animal("food", "location");
        String foodExpected = "food";
        String locationExpected = "location";
        boolean sleepStatusExpected = false;

        assertEquals(foodExpected, animal.getFood());
        assertEquals(locationExpected, animal.getLocation());
        assertEquals(sleepStatusExpected, animal.getSleepStatus());
    }

    @Test
    void equals() {
        Animal animal1 = new Animal("food", "location");
        Animal animal2 = new Animal("food", "location");

        assertTrue(animal1.equals(animal2));
    }
}