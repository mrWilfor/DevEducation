package homeWork.hw_9_OOP_21_05_2020.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void treatAnimal() {
        Dog dog = new Dog("Meat", "Farm", true);
        Vet vet = new Vet();
        String expected = "Dog:\n" +
                "\tfood = Meat" +
                "\n\tlocation = Farm";

        assertEquals(expected, vet.treatAnimal(dog));
    }

    @Test
    void treatAnimalFalse() {
        Dog dog = new Dog("Fish", "Farm", true);
        Vet vet = new Vet();
        String expected = "Dog:\n" +
                "\tfood = Meat" +
                "\n\tlocation = Farm";

        assertNotEquals(expected, vet.treatAnimal(dog));
    }

    @Test
    void treatAnimalNull() {
        Vet vet = new Vet();
        String expected = null;

        assertEquals(expected, vet.treatAnimal(null));
    }
}