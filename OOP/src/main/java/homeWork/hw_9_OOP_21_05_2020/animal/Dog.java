package homeWork.hw_9_OOP_21_05_2020.animal;

public class Dog extends ImplAnimal {
    boolean duckHunting;

    public Dog(String food, String location, boolean duckHunting) {
        super(food, location);
        this.duckHunting = duckHunting;
    }


    @Override
    public boolean makeNoise() {
        if (super.getSleepStatus()) {
            System.out.println("snores...");
            return false;
        }

        System.out.println("WOOF WOOF WOOF!!!");
        return true;
    }

    @Override
    public boolean eat(String food) {
        if (super.getSleepStatus()) {
            System.out.println("snores...");
            return false;
        }

        if (super.getFood().equals(food)) {
            System.out.println("Champs");
            return true;
        }

        System.out.println("Does not eat");
        return false;
    }

    public boolean getDuckHunting() {
        return duckHunting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) return false;
        return super.equals(o) && this.duckHunting == (((Dog) o).duckHunting);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (duckHunting ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + super.getFood() + '\'' +
                ", location='" + super.getLocation() + '\'' +
                ", sleepStatus='" + super.getSleepStatus() + '\'' +
                ", duckHunting='" + duckHunting + '\'' +
                '}';
    }
}
