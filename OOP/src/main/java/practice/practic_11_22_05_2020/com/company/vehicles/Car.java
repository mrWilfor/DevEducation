package practice.practic_11_22_05_2020.com.company.vehicles;

import practice.practic_11_22_05_2020.com.company.details.Engine;
import practice.practic_11_22_05_2020.com.company.professions.Driver;

import java.util.Objects;

public class Car implements practice.practic_11_22_05_2020.com.company.Interface.Car {
    private String mark;
    private String classC;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String mark, String classC, int weight, Engine engine) {
        this.mark = mark;
        this.classC = classC;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public String getClassC() {
        return classC;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public Driver getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        return weight == car.weight &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(classC, car.classC) &&
                Objects.equals(driver, car.driver) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(mark, classC, weight, driver, engine);
    }

    @Override
    public String toString() {
        if (this.driver != null) {
            return "Car{" +
                    "mark='" + mark + '\'' +
                    ", class='" + classC + '\'' +
                    ", weight='" + weight + '\'' +
                    ", driver=" + driver.toString() +
                    ", engine=" + engine.toString() +
                    '}';
        } else {
            return "Car{" +
                    "mark='" + mark + '\'' +
                    ", class='" + classC + '\'' +
                    ", weight='" + weight + '\'' +
                    ", engine=" + engine.toString() +
                    '}';
        }
    }

    @Override
    public String start() {
        System.out.println("Lets go!");
        return "go";
    }

    @Override
    public String stop() {
        System.out.println("Stop");
        return "stop";
    }

    @Override
    public String turnLeft() {
        System.out.println("Turn left");
        return "left";
    }

    @Override
    public String turnRight() {
        System.out.println("Turn right");
        return "right";
    }

    @Override
    public String printInfo() {
        StringBuilder result = new StringBuilder("Car:");

        result.append("\n\tmark = ")
                .append(mark)
                .append("\n\tclass = ")
                .append(classC)
                .append("\n\tweight = ")
                .append(weight)
                .append("\n\tengine:")
                .append("\n\t\tpower = ")
                .append(engine.getPower())
                .append("\n\t\tmanufacturer = ")
                .append(engine.getManufacturer());

        if (this.driver != null) {
            result.append("\n\tdriver:")
                    .append("\n\t\tfull name = ")
                    .append(driver.getFullName())
                    .append("\n\t\texperience = ")
                    .append(driver.getExperience());

            return result.toString();
        } else {
            return result.toString();
        }
    }
}
