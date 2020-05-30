package homeWork.hw_10_Shop_Extend.classes;

import homeWork.hw_10_Shop_Extend.classes.employee.ImplConsultant;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Goods;

import java.util.LinkedList;
import java.util.Objects;

public class ImplDepartment implements homeWork.hw_10_Shop_Extend.interfaceOfShop.Department {
    private String name;
    private Brand brand;
    private LinkedList<ImplGoods> listOfGoods;
    private LinkedList<ImplConsultant> listOfImplConsultant;

    {
        listOfGoods = new LinkedList<>();
        listOfImplConsultant = new LinkedList<>();
    }

    public ImplDepartment(String name, Brand brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public void addGoods(ImplGoods good) {
        if (good.getBrand().equals(this.brand)) {
            listOfGoods.add(good);
        }
    }

    @Override
    public void deleteGoods(ImplGoods good) {
        listOfGoods.remove(good);
    }

    @Override
    public LinkedList<ImplGoods> getListOfGoods() {
        return listOfGoods;
    }

    @Override
    public ImplConsultant getConsultant(int index) {
        return listOfImplConsultant.get(index);
    }

    @Override
    public void addConsultant(ImplConsultant consultant) {
        consultant.setDepartment(this);
        listOfImplConsultant.add(consultant);
    }

    @Override
    public void deleteConsultant(ImplConsultant consultant) {
        listOfImplConsultant.remove(consultant);
    }

    @Override
    public ImplConsultant getConsultant(boolean status) {
        for (ImplConsultant implConsultant : listOfImplConsultant) {
            if (implConsultant.getStatus() == status) {
                return implConsultant;
            }
        }
        return null;
    }

    @Override
    public LinkedList<ImplConsultant> getListOfConsultants() {
        return listOfImplConsultant;
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
    public ImplGoods getGoods(int index) {
        return listOfGoods.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplDepartment that = (ImplDepartment) o;

        return Objects.equals(name, that.name) &&
                brand == that.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand);
    }
}
