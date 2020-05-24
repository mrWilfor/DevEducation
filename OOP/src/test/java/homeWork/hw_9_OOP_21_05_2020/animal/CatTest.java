package homeWork.hw_9_OOP_21_05_2020.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void get() {
        Cat cat = new Cat("food", "location", true);
        String foodExpected = "food";
        String locationExpected = "location";
        boolean sleepStatusExpected = false;
        boolean mouseHuntingExpected = true;

        assertEquals(foodExpected, cat.getFood());
        assertEquals(locationExpected, cat.getLocation());
        assertEquals(sleepStatusExpected, cat.getSleepStatus());
        assertEquals(mouseHuntingExpected, cat.getMouseHunting());
    }

    @Test
    void equalsTrue() {
        Cat cat1 = new Cat("food", "location", true);
        Cat cat2 = new Cat("food", "location", true);

        assertTrue(cat1.equals(cat2));
    }

    @Test
    void equalsFalse() {
        Cat cat1 = new Cat("food", "location", true);
        Cat cat2 = new Cat("food_1", "location", true);

        assertFalse(cat1.equals(cat2));
    }

    @Test
    void hashCodeTrue() {
        Cat cat1 = new Cat("food", "location", true);
        Cat cat2 = new Cat("food", "location", true);


        assertEquals(cat1.hashCode(), cat2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Cat cat1 = new Cat("food", "location", true);
        Cat cat2 = new Cat("food_1", "location", true);


        assertNotEquals(cat1.hashCode(), cat2.hashCode());
    }

    @Test
    void toStringTrue() {
        Cat cat = new Cat("food", "location", true);
        String expected = "Cat{food='food', location='location', sleepStatus='false', mouseHunting='true'}";

        assertEquals(expected, cat.toString());
    }

    @Test
    void toStringFalse() {
        Cat cat = new Cat("food_1", "location", true);
        String expected = "Cat{food='food', location='location', sleepStatus='false', mouseHunting='true'}";

        assertNotEquals(expected, cat.toString());
    }

    @Test
    void makeNoise() {
        Cat cat = new Cat("food", "location", true);

        assertTrue(cat.makeNoise());
    }

    @Test
    void makeNoiseSleep() {
        Cat cat = new Cat("food", "location", true);
        cat.sleep();

        assertFalse(cat.makeNoise());
    }

    @Test
    void eat() {
        Cat cat = new Cat("food", "location", true);

        assertTrue(cat.eat("food"));
    }

    @Test
    void eatFalse() {
        Cat cat = new Cat("food", "location", true);

        assertFalse(cat.eat("whater"));
    }

    @Test
    void eatSleep() {
        Cat cat = new Cat("food", "location", true);
        cat.sleep();

        assertFalse(cat.eat("food"));
    }

    @Test
    void sleep() {
        Cat cat = new Cat("food", "location", true);
        cat.sleep();

        assertTrue(cat.getSleepStatus());
    }

    @Test
    void sleepFalse() {
        Cat cat = new Cat("food", "location", true);

        assertFalse(cat.getSleepStatus());
    }
}