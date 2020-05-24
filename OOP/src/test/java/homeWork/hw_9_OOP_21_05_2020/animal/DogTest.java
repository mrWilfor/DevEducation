package homeWork.hw_9_OOP_21_05_2020.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void get() {
        Dog dog = new Dog("food", "location", true);
        String foodExpected = "food";
        String locationExpected = "location";
        boolean sleepStatusExpected = false;
        boolean duckHuntingExpected = true;

        assertEquals(foodExpected, dog.getFood());
        assertEquals(locationExpected, dog.getLocation());
        assertEquals(sleepStatusExpected, dog.getSleepStatus());
        assertEquals(duckHuntingExpected, dog.getDuckHunting());
    }

    @Test
    void equalsTrue() {
        Dog dog1 = new Dog("food", "location", true);
        Dog dog2 = new Dog("food", "location", true);

        assertTrue(dog1.equals(dog2));
    }

    @Test
    void equalsFalse() {
        Dog dog1 = new Dog("food", "location", true);
        Dog dog2 = new Dog("food_1", "location", true);

        assertFalse(dog1.equals(dog2));
    }

    @Test
    void hashCodeTrue() {
        Dog dog1 = new Dog("food", "location", true);
        Dog dog2 = new Dog("food", "location", true);


        assertEquals(dog1.hashCode(), dog2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Dog dog1 = new Dog("food", "location", true);
        Dog dog2 = new Dog("food_1", "location", true);


        assertNotEquals(dog1.hashCode(), dog2.hashCode());
    }

    @Test
    void toStringTrue() {
        Dog dog = new Dog("food", "location", true);
        String expected = "Dog{food='food', location='location', sleepStatus='false', duckHunting='true'}";

        assertEquals(expected, dog.toString());
    }

    @Test
    void toStringFalse() {
        Dog dog = new Dog("food_1", "location", true);
        String expected = "Dog{food='food', location='location', sleepStatus='false', duckHunting='true'}";

        assertNotEquals(expected, dog.toString());
    }

    @Test
    void makeNoise() {
        Dog dog = new Dog("food", "location", true);

        assertTrue(dog.makeNoise());
    }

    @Test
    void makeNoiseSleep() {
        Dog dog = new Dog("food", "location", true);
        dog.sleep();

        assertFalse(dog.makeNoise());
    }

    @Test
    void eat() {
        Dog dog = new Dog("food", "location", true);

        assertTrue(dog.eat("food"));
    }

    @Test
    void eatFalse() {
        Dog dog = new Dog("food", "location", true);

        assertFalse(dog.eat("whater"));
    }

    @Test
    void eatSleep() {
        Dog dog = new Dog("food", "location", true);
        dog.sleep();

        assertFalse(dog.eat("food"));
    }

    @Test
    void sleep() {
        Dog dog = new Dog("food", "location", true);
        dog.sleep();

        assertTrue(dog.getSleepStatus());
    }

    @Test
    void sleepFalse() {
        Dog dog = new Dog("food", "location", true);

        assertFalse(dog.getSleepStatus());
    }
}