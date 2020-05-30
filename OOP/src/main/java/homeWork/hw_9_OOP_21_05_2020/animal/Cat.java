package homeWork.hw_9_OOP_21_05_2020.animal;

import java.util.Objects;

public class Cat extends ImplAnimal {
    boolean mouseHunting;

    public Cat(String food, String location, boolean mouseHunting) {
        super(food, location);
        this.mouseHunting = mouseHunting;
    }

    @Override
    public boolean makeNoise() {
        if (super.getSleepStatus()) {
            System.out.println("purrs...");
            return false;
        }

        System.out.println("Meow meow meow))");
        return true;
    }

    @Override
    public boolean eat(String food) {
        if (super.getSleepStatus()) {
            System.out.println("purrs...");
            return false;
        }

        if (super.getFood().equals(food)) {
            System.out.println("eats lazily");
            return true;
        }

        System.out.println("Does not eat");
        return false;
    }

    public boolean getMouseHunting() {
        return mouseHunting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        Cat cat = (Cat) o;

        return mouseHunting == cat.mouseHunting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mouseHunting);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + super.getFood() + '\'' +
                ", location='" + super.getLocation() + '\'' +
                ", sleepStatus='" + super.getSleepStatus() + '\'' +
                ", mouseHunting='" + mouseHunting + '\'' +
                '}';
    }
}
