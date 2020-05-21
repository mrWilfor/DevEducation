package homeWork.hw_9_19_05_2020.storeStaff;

import java.util.Objects;

public abstract class Staff {
    private String name;
    private String position;
    private String department;

    public Staff(String name, String position, String department) {
        this.name = name;
        this.position = position;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return this.name.equals(((Staff) o).name) &&
                this.position.equals(((Staff) o).position) &&
                this.department.equals(((Staff) o).department);
    }

    @Override
    public int hashCode() {
        return 31 * (name != null ? name.hashCode() : 0) +
                (position != null ? position.hashCode() : 0) +
                (department != null ? department.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "name='" + name + "\'" +
                ", position='" + position + "\'" +
                ", department='" + department + "\'";
    }
}
