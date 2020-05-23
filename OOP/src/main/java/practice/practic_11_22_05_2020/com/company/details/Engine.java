package practice.practic_11_22_05_2020.com.company.details;

import java.util.Objects;

public class Engine implements practice.practic_11_22_05_2020.com.company.Interface.Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Engine engine = (Engine) o;

        return Objects.equals(power, engine.power) &&
                Objects.equals(manufacturer, engine.manufacturer);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(power, manufacturer);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
