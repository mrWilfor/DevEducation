package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;

import java.util.Objects;

public abstract class ImplEmployee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.Employee {
    private long uid;
    private String name;
    private Role role;

    {
        uid = UIDGeneration.getUID();
    }


    public ImplEmployee(String name, Role role) {
        this.name = name;
        this.role = role;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplEmployee employee = (ImplEmployee) o;

        return uid == employee.uid &&
                name.equals(employee.name) &&
                role == employee.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, role);
    }

    @Override
    public String toString() {
        return  "uid=" + uid +
                ", name='" + name + '\'' +
                ", role=" + role;
    }
}
