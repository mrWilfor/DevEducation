package practice.practic_11_22_05_2020.com.company.vehicles;

import practice.practic_11_22_05_2020.com.company.details.Engine;

import java.util.Objects;

public class SportCar extends Car {
    private int topSpeed;

    public SportCar(String mark, String classC, int weight, int topSpeed, Engine engine) {
        super(mark, classC, weight, engine);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
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

        SportCar sportCar = (SportCar) o;

        return topSpeed == sportCar.topSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), topSpeed);
    }

    @Override
    public String toString() {
        if (super.getDriver() != null) {
            return "SportCar{" +
                    "mark='" + super.getMark() + '\'' +
                    ", class='" + super.getClassC() + '\'' +
                    ", weight='" + super.getWeight() + '\'' +
                    ", topSpeed='" + this.topSpeed + '\'' +
                    ", driver=" + super.getDriver().toString() +
                    ", engine=" + super.getEngine().toString() +
                    '}';
        } else {
            return "SportCar{" +
                    "mark='" + super.getMark() + '\'' +
                    ", class='" + super.getClassC() + '\'' +
                    ", weight='" + super.getWeight() + '\'' +
                    ", topSpeed='" + this.topSpeed + '\'' +
                    ", engine=" + super.getEngine().toString() +
                    '}';
        }
    }


    @Override
    public String printInfo() {
        StringBuilder result = new StringBuilder("SportCar:");

        result.append("\n\tmark = ")
                .append(super.getMark())
                .append("\n\tclass = ")
                .append(super.getClassC())
                .append("\n\tweight = ")
                .append(super.getWeight())
                .append("\n\ttopSpeed = ")
                .append(this.topSpeed)
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
