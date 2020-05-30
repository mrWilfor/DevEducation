package homeWork.hw_9_OOP_21_05_2020.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplAnimalTest {

    @Test
    void get() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");
        String foodExpected = "food";
        String locationExpected = "location";
        boolean sleepStatusExpected = false;

        assertEquals(foodExpected, implAnimal.getFood());
        assertEquals(locationExpected, implAnimal.getLocation());
        assertEquals(sleepStatusExpected, implAnimal.getSleepStatus());
    }

    @Test
    void equalsTrue() {
        ImplAnimal implAnimal1 = new ImplAnimal("food", "location");
        ImplAnimal implAnimal2 = new ImplAnimal("food", "location");

        assertTrue(implAnimal1.equals(implAnimal2));
    }

    @Test
    void equalsFalse() {
        ImplAnimal implAnimal1 = new ImplAnimal("food", "location");
        ImplAnimal implAnimal2 = new ImplAnimal("food_1", "location");

        assertFalse(implAnimal1.equals(implAnimal2));
    }

    @Test
    void hashCodeTrue() {
        ImplAnimal implAnimal1 = new ImplAnimal("food", "location");
        ImplAnimal implAnimal2 = new ImplAnimal("food", "location");

        assertEquals(implAnimal1.hashCode(), implAnimal2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        ImplAnimal implAnimal1 = new ImplAnimal("food", "location");
        ImplAnimal implAnimal2 = new ImplAnimal("food_1", "location");

        assertNotEquals(implAnimal1.hashCode(), implAnimal2.hashCode());
    }

    @Test
    void toStringTrue() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");
        String expected = "Animal{food='food', location='location', sleepStatus='false'}";

        assertEquals(expected, implAnimal.toString());
    }

    @Test
    void toStringFalse() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");
        String expected = "Animal{food='water', location='location', sleepStatus='false'}";

        assertNotEquals(expected, implAnimal.toString());
    }

    @Test
    void makeNoise() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");

        assertTrue(implAnimal.makeNoise());
    }

    @Test
    void makeNoiseSleep() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");
        implAnimal.sleep();

        assertFalse(implAnimal.makeNoise());
    }

    @Test
    void eat() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");

        assertTrue(implAnimal.eat("food"));
    }

    @Test
    void eatFalse() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");

        assertFalse(implAnimal.eat("whater"));
    }

    @Test
    void eatSleep() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");
        implAnimal.sleep();

        assertFalse(implAnimal.eat("food"));
    }

    @Test
    void sleep() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");
        implAnimal.sleep();

        assertTrue(implAnimal.getSleepStatus());
    }

    @Test
    void sleepFalse() {
        ImplAnimal implAnimal = new ImplAnimal("food", "location");

        assertFalse(implAnimal.getSleepStatus());
    }
}