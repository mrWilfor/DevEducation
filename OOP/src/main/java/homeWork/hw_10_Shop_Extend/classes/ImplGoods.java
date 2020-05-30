package homeWork.hw_10_Shop_Extend.classes;

import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;

import java.util.Objects;

public class ImplGoods implements homeWork.hw_10_Shop_Extend.interfaceOfShop.Goods {
    private long uid;
    private String name;
    private Brand brand;
    private int prise;
    private Group group;
    private ImplDepartment department;
    private String info;

    {
        uid = UIDGeneration.getUID();
    }

    public ImplGoods(String name, Brand brand, int prise, Group group, ImplDepartment department, String info) {
        this.name = name;
        this.brand = brand;
        this.prise = prise;
        this.group = group;
        this.department = department;
        this.info = info;
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
    public Brand getBrand() {
        return brand;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public Group getGroup() {
        return group;
    }

    @Override
    public ImplDepartment getDepartment() {
        return department;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplGoods implGoods = (ImplGoods) o;

        return uid == implGoods.uid &&
                prise == implGoods.prise &&
                Objects.equals(name, implGoods.name) &&
                brand == implGoods.brand &&
                group == implGoods.group &&
                Objects.equals(department, implGoods.department) &&
                Objects.equals(info, implGoods.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, brand, prise, group, department, info);
    }

    @Override
    public String toString() {
        return getName() + "{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", prise=" + prise +
                ", group=" + group +
                ", department=" + department.getName() +
                ", info='" + info + '\'' +
                "}";
    }
}
