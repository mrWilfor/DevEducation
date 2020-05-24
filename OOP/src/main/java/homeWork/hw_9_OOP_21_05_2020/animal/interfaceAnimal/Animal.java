package homeWork.hw_9_OOP_21_05_2020.animal.interfaceAnimal;

public interface Animal {
    String getFood();

    boolean getSleepStatus();

    String getLocation();

    boolean equals(Object o);

    int hashCode();

    String toString();

    boolean makeNoise();

    boolean eat(String food);

    void sleep();
}
