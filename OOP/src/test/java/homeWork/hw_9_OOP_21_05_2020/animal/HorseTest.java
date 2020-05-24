package homeWork.hw_9_OOP_21_05_2020.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    @Test
    void get() {
        Horse horse = new Horse("food", "location", true);
        String foodExpected = "food";
        String locationExpected = "location";
        boolean sleepStatusExpected = false;
        boolean horseBackRiding = true;

        assertEquals(foodExpected, horse.getFood());
        assertEquals(locationExpected, horse.getLocation());
        assertEquals(sleepStatusExpected, horse.getSleepStatus());
        assertEquals(horseBackRiding, horse.getHorsebackRiding());
    }

    @Test
    void equalsTrue() {
        Horse horse1 = new Horse("food", "location", true);
        Horse horse2 = new Horse("food", "location", true);

        assertTrue(horse1.equals(horse2));
    }

    @Test
    void equalsFalse() {
        Horse horse1 = new Horse("food", "location", true);
        Horse horse2 = new Horse("food_1", "location", true);

        assertFalse(horse1.equals(horse2));
    }

    @Test
    void hashCodeTrue() {
        Horse horse1 = new Horse("food", "location", true);
        Horse horse2 = new Horse("food", "location", true);


        assertEquals(horse1.hashCode(), horse2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Horse horse1 = new Horse("food", "location", true);
        Horse horse2 = new Horse("food_1", "location", true);


        assertNotEquals(horse1.hashCode(), horse2.hashCode());
    }

    @Test
    void toStringTrue() {
        Horse horse = new Horse("food", "location", true);
        String expected = "Horse{food='food', location='location', sleepStatus='false', horsebackRiding='true'}";

        assertEquals(expected, horse.toString());
    }

    @Test
    void toStringFalse() {
        Horse horse = new Horse("food_1", "location", true);
        String expected = "Horse{food='food', location='location', sleepStatus='false', horsebackRiding='true'}";

        assertNotEquals(expected, horse.toString());
    }

    @Test
    void makeNoise() {
        Horse horse = new Horse("food", "location", true);

        assertTrue(horse.makeNoise());
    }

    @Test
    void makeNoiseSleep() {
        Horse horse = new Horse("food", "location", true);
        horse.sleep();

        assertFalse(horse.makeNoise());
    }

    @Test
    void eat() {
        Horse horse = new Horse("food", "location", true);

        assertTrue(horse.eat("food"));
    }

    @Test
    void eatFalse() {
        Horse horse = new Horse("food", "location", true);

        assertFalse(horse.eat("whater"));
    }

    @Test
    void eatSleep() {
        Horse horse = new Horse("food", "location", true);
        horse.sleep();

        assertFalse(horse.eat("food"));
    }

    @Test
    void sleep() {
        Horse horse = new Horse("food", "location", true);
        horse.sleep();

        assertTrue(horse.getSleepStatus());
    }

    @Test
    void sleepFalse() {
        Horse horse = new Horse("food", "location", true);

        assertFalse(horse.getSleepStatus());
    }
}