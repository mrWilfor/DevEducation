package homeWork.hw_9_OOP_21_05_2020.animal;

import homeWork.hw_9_OOP_21_05_2020.animal.interfaceAnimal.Animal;

public class Vet implements homeWork.hw_9_OOP_21_05_2020.animal.interfaceAnimal.Vet {

    public static void main(String[] args) {
        Dog dog = new Dog("Meat", "Farm", true);
        Cat cat = new Cat("Fish", "House", true);
        Horse horse = new Horse("hay", "Ranch", true);
        Vet vet = new Vet();
        homeWork.hw_9_OOP_21_05_2020.animal.interfaceAnimal.Animal[] animals = {dog, cat, horse};

        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
            System.out.println();
        }

    }

    @Override
    public String treatAnimal(homeWork.hw_9_OOP_21_05_2020.animal.interfaceAnimal.Animal animal) {
        if (animal != null) {
            StringBuilder result = new StringBuilder(animal.getClass().getSimpleName());
            result.append(":\n")
                    .append("\tfood = ")
                    .append(animal.getFood())
                    .append("\n\tlocation = ")
                    .append(animal.getLocation());
            System.out.println(result.toString());

            return result.toString();
        }
        return null;
    }
}
