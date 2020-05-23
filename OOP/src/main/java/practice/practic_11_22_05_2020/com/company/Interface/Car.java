package practice.practic_11_22_05_2020.com.company.Interface;

import practice.practic_11_22_05_2020.com.company.details.Engine;
import practice.practic_11_22_05_2020.com.company.professions.Driver;

public interface Car {
    String getMark();

    String getClassC();

    int getWeight();

    Driver getDriver();

    void setDriver(Driver driver);

    Engine getEngine();

    boolean equals(Object o);

    int hashCode();

    String toString();

    String start();

    String stop();

    String turnLeft();

    String turnRight();

    String printInfo();
}
