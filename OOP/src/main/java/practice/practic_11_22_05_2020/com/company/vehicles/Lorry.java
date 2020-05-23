package practice.practic_11_22_05_2020.com.company.vehicles;

import practice.practic_11_22_05_2020.com.company.details.Engine;

import java.util.Objects;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(String mark, String classC, int weight, int carryingCapacity, Engine engine) {
        super(mark, classC, weight, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
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

        Lorry lorry = (Lorry) o;

        return carryingCapacity == lorry.carryingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carryingCapacity);
    }

    @Override
    public String toString() {
        if (super.getDriver() != null) {
            return "Lorry{" +
                    "mark='" + super.getMark() + '\'' +
                    ", class='" + super.getClassC() + '\'' +
                    ", weight='" + super.getWeight() + '\'' +
                    ", carryingCapacity='" + this.carryingCapacity + '\'' +
                    ", driver=" + super.getDriver().toString() +
                    ", engine=" + super.getEngine().toString() +
                    '}';
        } else {
            return "Lorry{" +
                    "mark='" + super.getMark() + '\'' +
                    ", class='" + super.getClassC() + '\'' +
                    ", weight='" + super.getWeight() + '\'' +
                    ", carryingCapacity='" + this.carryingCapacity + '\'' +
                    ", engine=" + super.getEngine().toString() +
                    '}';
        }
    }

    @Override
    public String printInfo() {
        StringBuilder result = new StringBuilder("Lorry:");

        result.append("\n\tmark = ")
                .append(super.getMark())
                .append("\n\tclass = ")
                .append(super.getClassC())
                .append("\n\tweight = ")
                .append(super.getWeight())
                .append("\n\tcarryingCapacity = ")
                .append(this.carryingCapacity)
                .append("\n\tengine:")
                .append("\n\t\tpower = ")
                .append(super.getEngine().getPower())
                .append("\n\t\tmanufacturer = ")
                .append(super.getEngine().getManufacturer());

        if (super.getDriver() != null) {
            result.append("\n\tdriver:")
                    .append("\n\t\tfull name = ")
                    .append(super.getDriver().getFullName())
                    .append("\n\t\texperience = ")
                    .append(super.getDriver().getExperience());

            return result.toString();
        } else {
            return result.toString();
        }
    }
}
