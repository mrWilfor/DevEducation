package practice.practic_11_22_05_2020.com.company.professions;

import java.util.Objects;

public class Person implements practice.practic_11_22_05_2020.com.company.Interface.Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        return Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return 31 * fullName.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
