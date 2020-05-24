package homeWork.hw_9_OOP_21_05_2020.animal;

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
    void equalsTrue() {
        Animal animal1 = new Animal("food", "location");
        Animal animal2 = new Animal("food", "location");

        assertTrue(animal1.equals(animal2));
    }

    @Test
    void equalsFalse() {
        Animal animal1 = new Animal("food", "location");
        Animal animal2 = new Animal("food_1", "location");

        assertFalse(animal1.equals(animal2));
    }

    @Test
    void hashCodeTrue() {
        Animal animal1 = new Animal("food", "location");
        Animal animal2 = new Animal("food", "location");

        assertEquals(animal1.hashCode(), animal2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Animal animal1 = new Animal("food", "location");
        Animal animal2 = new Animal("food_1", "location");

        assertNotEquals(animal1.hashCode(), animal2.hashCode());
    }

    @Test
    void toStringTrue() {
        Animal animal = new Animal("food", "location");
        String expected = "Animal{food='food', location='location', sleepStatus='false'}";

        assertEquals(expected, animal.toString());
    }

    @Test
    void toStringFalse() {
        Animal animal = new Animal("food", "location");
        String expected = "Animal{food='water', location='location', sleepStatus='false'}";

        assertNotEquals(expected, animal.toString());
    }

    @Test
    void makeNoise() {
        Animal animal = new Animal("food", "location");

        assertTrue(animal.makeNoise());
    }

    @Test
    void makeNoiseSleep() {
        Animal animal = new Animal("food", "location");
        animal.sleep();

        assertFalse(animal.makeNoise());
    }

    @Test
    void eat() {
        Animal animal = new Animal("food", "location");

        assertTrue(animal.eat("food"));
    }

    @Test
    void eatFalse() {
        Animal animal = new Animal("food", "location");

        assertFalse(animal.eat("whater"));
    }

    @Test
    void eatSleep() {
        Animal animal = new Animal("food", "location");
        animal.sleep();

        assertFalse(animal.eat("food"));
    }

    @Test
    void sleep() {
        Animal animal = new Animal("food", "location");
        animal.sleep();

        assertTrue(animal.getSleepStatus());
    }

    @Test
    void sleepFalse() {
        Animal animal = new Animal("food", "location");

        assertFalse(animal.getSleepStatus());
    }
}