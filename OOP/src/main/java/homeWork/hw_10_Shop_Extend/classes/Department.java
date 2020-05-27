package homeWork.hw_10_Shop_Extend.classes;

import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.employee.Consultant;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Good;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Department implements homeWork.hw_10_Shop_Extend.interfaceOfShop.Department {
    private String name;
    private Brand brand;
    private LinkedList<Good> listOfGoods = new LinkedList<>();
    private ArrayList<Consultant> listOfConsultant = new ArrayList<>();

    public Department(String name, Brand brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBrand() {
        return brand.brand;
    }

    @Override
    public void addGoods(Good good) {
        if (good.getBrand().equals(this.brand.brand)) {
            listOfGoods.add(good);
        }
    }

    @Override
    public void deleteGoods(Good good) {
        listOfGoods.remove(good);
    }

    @Override
    public LinkedList<Good> getListOfGoods() {
        return listOfGoods;
    }

    @Override
    public void addConsultant(Consultant consultant) {
        consultant.setDepartment(this);
    }

    @Override
    public void deleteConsultant(Consultant consultant) {
        listOfConsultant.remove(consultant);
    }

    @Override
    public ArrayList<Consultant> getListOfConsultants() {
        return listOfConsultant;
    }
}
