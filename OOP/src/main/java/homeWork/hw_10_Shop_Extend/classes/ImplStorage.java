package homeWork.hw_10_Shop_Extend.classes;

import homeWork.hw_10_Shop_Extend.classes.employee.ImplStoreKeeper;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;
import homeWork.hw_10_Shop_Extend.interfaceOfShop.Storage;

import java.util.HashMap;
import java.util.LinkedList;

public class ImplStorage implements Storage {
    private LinkedList<ImplGoods> listOfTrousers;
    private LinkedList<ImplGoods> listOfShirts;
    private LinkedList<ImplGoods> listOfSneakers;
    private LinkedList<ImplGoods> listOfTent;
    private LinkedList<ImplGoods> listOfKnife;
    private LinkedList<ImplGoods> lstOfBackpacks;
    private LinkedList<ImplGoods> listOfDumbbells;
    private LinkedList<ImplGoods> listOfPunchingBags;
    private LinkedList<ImplGoods> listOfExpander;
    private HashMap<String, ImplDepartment> listOfDepartments;
    private ImplStoreKeeper storeKeeper;

    {
        listOfTrousers = new LinkedList<>();
        listOfShirts = new LinkedList<>();
        listOfSneakers = new LinkedList<>();
        listOfTent = new LinkedList<>();
        listOfKnife = new LinkedList<>();
        lstOfBackpacks = new LinkedList<>();
        listOfDumbbells = new LinkedList<>();
        listOfPunchingBags = new LinkedList<>();
        listOfExpander = new LinkedList<>();
        listOfDepartments = new HashMap<>();

    }

    public ImplStorage(ImplStoreKeeper storeKeeper) {
        this.storeKeeper = storeKeeper;
    }

    @Override
    public void addDepartment(ImplDepartment department) {
        listOfDepartments.put(department.getName(), department);
    }

    @Override
    public void deleteDepartment(ImplDepartment department) {
        listOfDepartments.remove(department.getName());
    }

    @Override
    public void addGoods(ImplGoods goods) {
        if (goods != null) {
            LinkedList<ImplGoods> listOfGoods = getListOfGoodsByBrandAndGroup(goods.getBrand(), goods.getGroup());

            listOfGoods.add(goods);
        }
    }

    @Override
    public ImplGoods getGoods(Brand brand, Group group, ImplDepartment department) {
        ImplGoods goodExpected = null;

        if (brand != null && group != null) {
            LinkedList<ImplGoods> listOfGoods = getListOfGoodsByBrandAndGroup(brand, group);

            if (listOfGoods.size() != 0) {
                for (int i = 0; i < listOfGoods.size(); i++) {
                    if (listOfGoods.get(i).getDepartment().equals(department)) {
                        goodExpected = listOfGoods.pollFirst();
                    }
                }
            }
        }
        return goodExpected;
    }

    @Override
    public LinkedList<ImplGoods> getListOfGoodsByBrandAndGroup(Brand brand, Group group) {
        if (group != null && brand != null) {
            LinkedList<ImplGoods> expectedList = null;

            switch (brand) {
                case ADIDAS:
                    switch (group) {
                        case SHIRT:
                            expectedList = listOfShirts;
                            break;
                        case TROUSERS:
                            expectedList = listOfTrousers;
                            break;
                        case SNEAKERS:
                            expectedList = listOfSneakers;
                            break;
                    }
                case REYVEL:
                    switch (group) {
                        case DUMBBELL:
                            expectedList = listOfDumbbells;
                            break;
                        case PUNCHINGBAG:
                            expectedList = listOfPunchingBags;
                            break;
                        case EXPANDER:
                            expectedList = listOfExpander;
                            break;
                    }
                case CAT:
                    switch (group) {
                        case TENT:
                            expectedList = listOfTent;
                            break;
                        case KNIFE:
                            expectedList = listOfKnife;
                            break;
                        case BACKPACK:
                            expectedList = lstOfBackpacks;
                            break;
                    }
            }
            return expectedList;
        }
        return null;
    }

    @Override
    public ImplDepartment getDepartment(String name) {
        return listOfDepartments.get(name);
    }

    @Override
    public ImplStoreKeeper getStoreKeeper() {
        return storeKeeper;
    }
}

