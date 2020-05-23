package practice.practic_11_22_05_2020.com.company.professions;

import java.util.Objects;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, int experience) {
        super(fullName);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
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

        Driver driver = (Driver) o;

        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + super.getFullName() + '\'' +
                "experience=" + experience +
                '}';
    }
}
