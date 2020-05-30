package homeWork.hw_9_OOP_21_05_2020.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplVetTest {

    @Test
    void treatAnimal() {
        Dog dog = new Dog("Meat", "Farm", true);
        ImplVet implVet = new ImplVet();
        String expected = "Dog:\n" +
                "\tfood = Meat" +
                "\n\tlocation = Farm";

        assertEquals(expected, implVet.treatAnimal(dog));
    }

    @Test
    void treatAnimalFalse() {
        Dog dog = new Dog("Fish", "Farm", true);
        ImplVet implVet = new ImplVet();
        String expected = "Dog:\n" +
                "\tfood = Meat" +
                "\n\tlocation = Farm";

        assertNotEquals(expected, implVet.treatAnimal(dog));
    }

    @Test
    void treatAnimalNull() {
        ImplVet implVet = new ImplVet();
        String expected = null;

        assertEquals(expected, implVet.treatAnimal(null));
    }
}