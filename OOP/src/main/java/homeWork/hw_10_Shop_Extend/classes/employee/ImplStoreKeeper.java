package homeWork.hw_10_Shop_Extend.classes.employee;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplStorage;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.enums.Role;

import java.util.HashMap;
import java.util.LinkedList;

public class ImplStoreKeeper extends ImplEmployee implements homeWork.hw_10_Shop_Extend.interfaceOfShop.employee.StoreKeeper {
    private ImplStorage storage;
    private HashMap<Brand, Integer> quantityOfGoodsByBrand;
    private HashMap<Group, Integer> quantityOfGoodsByGroup;
    private HashMap<ImplDepartment, Integer> quantityOfGoodsByDepartment;

    {
        quantityOfGoodsByBrand = new HashMap<>();
        quantityOfGoodsByGroup = new HashMap<>();
        quantityOfGoodsByDepartment =  new HashMap<>();
    }

    public ImplStoreKeeper(String name) {
        super(name, Role.STOREKEEPER);
    }

    @Override
    public void takeTheGoodsToTheWarehouse(LinkedList<ImplGoods> listOfGoods) {
        if (listOfGoods != null && listOfGoods.size() != 0) {
            for (ImplGoods goods : listOfGoods) {
                storage.addGoods(goods);
                productCountingPlus(goods);
            }
        }
    }

    @Override
    public void productCountingPlus(ImplGoods goods) {
        if (quantityOfGoodsByBrand.get(goods.getBrand()) == null) {
            quantityOfGoodsByBrand.put(goods.getBrand(), 1);
        } else {
            int valueByBrand = quantityOfGoodsByBrand.get(goods.getBrand()) + 1;
            quantityOfGoodsByBrand.replace(goods.getBrand(), valueByBrand);
        }

        if (quantityOfGoodsByGroup.get(goods.getGroup()) == null) {
            quantityOfGoodsByGroup.put(goods.getGroup(), 1);
        } else {
            int valueByGroup = quantityOfGoodsByGroup.get(goods.getGroup()) + 1;
            quantityOfGoodsByGroup.replace(goods.getGroup(), valueByGroup);
        }

        if (quantityOfGoodsByDepartment.get(goods.getDepartment()) == null) {
            quantityOfGoodsByDepartment.put(goods.getDepartment(), 1);
        } else {
            int valueByDepartment = quantityOfGoodsByDepartment.get(goods.getDepartment()) + 1;
            quantityOfGoodsByDepartment.replace(goods.getDepartment(), valueByDepartment);
        }
    }

    @Override
    public void productCountingMinus(ImplGoods goods) {
        int valueByBrand = quantityOfGoodsByBrand.get(goods.getBrand()) - 1;
        int valueByGroup = quantityOfGoodsByGroup.get(goods.getGroup()) - 1;
        int valueByDepartment = quantityOfGoodsByDepartment.get(goods.getDepartment()) - 1;

        quantityOfGoodsByBrand.replace(goods.getBrand(), valueByBrand);
        quantityOfGoodsByGroup.replace(goods.getGroup(), valueByGroup);
        quantityOfGoodsByDepartment.replace(goods.getDepartment(), valueByDepartment);
    }

    @Override
    public void moveGoodsToTheStore(ImplGoods goods) {
        ImplDepartment department = storage.getDepartment(goods.getDepartment().getName());
        department.addGoods(goods);
    }

    @Override
    public void setImplStorage(ImplStorage storage) {
        this.storage = storage;
    }

    @Override
    public ImplGoods getGoods(Brand brand, Group group, ImplDepartment department) {
        return storage.getGoods(brand, group, department);
    }

    @Override
    public int getQuantityOfGoodsByBrand(Brand brand) {
        return quantityOfGoodsByBrand.get(brand);
    }

    @Override
    public int getQuantityOfGoodsByGroup(Group group) {
        return quantityOfGoodsByGroup.get(group);
    }

    @Override
    public int getQuantityOfGoodsByDepartment(ImplDepartment department) {
        return quantityOfGoodsByDepartment.get(department);
    }

    @Override
    public ImplStorage getStorage() {
        return storage;
    }
}
