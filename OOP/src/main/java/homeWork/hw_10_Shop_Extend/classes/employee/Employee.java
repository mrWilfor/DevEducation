package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.enums.Role;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Department;

import java.util.Objects;

public abstract class Employee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Employee {
    private long uid;
    private String name;
    private Role role;
    private Department department;

    public Employee(long uid, String name, Role role, Department department) {
        this.uid = uid;
        this.name = name;
        this.role = role;
        this.department = department;
    }

    @Override
    public long getUID() {
        return uid;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role.role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
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

        Employee employee = (Employee) o;

        return uid == employee.uid &&
                name.equals(employee.name) &&
                role == employee.role &&
                department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, role, department);
    }

    @Override
    public String toString() {
        return  "uid=" + uid +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", department=" + department;
    }
}
