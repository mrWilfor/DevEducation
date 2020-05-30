package homeWork.hw_9_OOP_21_05_2020.animal;

public class ImplAnimal implements homeWork.hw_9_OOP_21_05_2020.animal.interfaceAnimal.Animal {
    private String food;
    private String location;
    private boolean sleepStatus = false;


    public ImplAnimal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    @Override
    public boolean makeNoise() {
        if (sleepStatus) {
            System.out.println("sleeping");
            return false;
        }
        System.out.println("Is noisy");
        return true;
    }

    @Override
    public boolean eat(String food) {
        if (sleepStatus) {
            System.out.println("sleeping");
            return false;
        }

        if (this.food.equals(food)) {
            System.out.println("Eating");
            return true;
        }

        System.out.println("Does not eat");
        return false;
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

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public boolean getSleepStatus() {
        return this.sleepStatus;
    }

    @Override
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

        return this.food.equals(((ImplAnimal) o).food) &&
                this.location.equals(((ImplAnimal) o).location) &&
                this.sleepStatus == ((ImplAnimal) o).sleepStatus;
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
                ", sleepStatus='" + sleepStatus + '\'' +
                '}';
    }
}
