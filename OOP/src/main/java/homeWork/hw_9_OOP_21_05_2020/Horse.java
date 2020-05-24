package homeWork.hw_9_OOP_21_05_2020;

import java.util.Objects;

public class Horse extends Animal {
    private boolean horsebackRiding;

    public Horse(String food, String location, boolean horsebackRiding) {
        super(food, location);
        this.horsebackRiding = horsebackRiding;
    }

    public boolean isHorsebackRiding() {
        return horsebackRiding;
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

        Horse horse = (Horse) o;

        return horsebackRiding == horse.horsebackRiding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horsebackRiding);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + super.getFood() + '\'' +
                ", location='" + super.getLocation() + '\'' +
                ", sleepStatus='" + super.getSleepStatus() + '\'' +
                ", horsebackRiding=" + horsebackRiding +
                '}';
    }

    @Override
    public boolean makeNoise() {
        if (super.getSleepStatus()) {
            System.out.println("sniffles...");
            return false;
        } else {
            System.out.println("Neigh!!!");
            return true;
        }
    }

    @Override
    public boolean eat(String food) {
        if (super.getSleepStatus()) {
            System.out.println("sniffles...");
            return false;
        } else {
            if (super.getFood().equals(food)) {
                System.out.println("Silently chews");
                return true;
            } else {
                System.out.println("Does not eat");
                return false;
            }
        }
    }
}
