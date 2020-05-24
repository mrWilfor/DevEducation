package homeWork.hw_9_OOP_21_05_2020;

import java.util.Objects;

public class Animal implements IAnimal {
    private String food;
    private String location;
    private boolean sleepStatus;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
        this.sleepStatus = false;
    }

    public String getFood() {
        return food;
    }

    public boolean getSleepStatus() {
        return this.sleepStatus;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return this.food.equals(((Animal) o).food) &&
                this.location.equals(((Animal) o).location) &&
                this.sleepStatus == ((Animal) o).sleepStatus;
    }

    @Override
    public int hashCode() {
        return 31 * (food != null ? food.hashCode() : 0) + (location != null ? location.hashCode() : 0) +
                (this.sleepStatus ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", sleepStatus=" + sleepStatus +
                '}';
    }

    @Override
    public boolean makeNoise() {
        if (sleepStatus) {
            System.out.println("sleeping");
            return false;
        } else {
            System.out.println("Is noisy");
            return true;
        }
    }

    @Override
    public boolean eat(String food) {
        if (sleepStatus) {
            System.out.println("sleeping");
            return false;
        } else {
            if (this.food.equals(food)) {
                System.out.println("Eating");
                return true;
            } else {
                System.out.println("Does not eat");
                return false;
            }
        }
    }

    @Override
    public void sleep() {
        if (sleepStatus) {
            sleepStatus = false;
            System.out.println("Awoke");
        } else {
            sleepStatus = true;
            System.out.println("ZZZZZZ");
        }

    }
}
