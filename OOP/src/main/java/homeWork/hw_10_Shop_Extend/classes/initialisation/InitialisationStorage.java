package homeWork.hw_10_Shop_Extend.classes.initialisation;

import homeWork.hw_10_Shop_Extend.classes.ImplDepartment;
import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;

import java.util.LinkedList;

public class InitialisationStorage {
    public static LinkedList<ImplGoods> getGoods(ImplDepartment sportEquipments, ImplDepartment sportWear, ImplDepartment tourism) {
        LinkedList<ImplGoods> goods = new LinkedList<>();

        ImplGoods punchingBag1 = new ImplGoods("Punching bag", Brand.REYVEL, 200, Group.PUNCHINGBAG, sportEquipments, "impact training simulator");
        ImplGoods punchingBag2 = new ImplGoods("Punching bag", Brand.REYVEL, 200, Group.PUNCHINGBAG, sportEquipments, "impact training simulator");
        ImplGoods punchingBag3 = new ImplGoods("Punching bag", Brand.REYVEL, 200, Group.PUNCHINGBAG, sportEquipments, "impact training simulator");
        ImplGoods punchingBag4 = new ImplGoods("Punching bag", Brand.REYVEL, 200, Group.PUNCHINGBAG, sportEquipments, "impact training simulator");
        ImplGoods punchingBag5 = new ImplGoods("Punching bag", Brand.REYVEL, 200, Group.PUNCHINGBAG, sportEquipments, "impact training simulator");

        goods.add(punchingBag1);
        goods.add(punchingBag2);
        goods.add(punchingBag3);
        goods.add(punchingBag4);
        goods.add(punchingBag5);

        ImplGoods dumbbell1 = new ImplGoods("Dumbbell", Brand.REYVEL, 100, Group.DUMBBELL, sportEquipments, "dumbbell for power loads");
        ImplGoods dumbbell2 = new ImplGoods("Dumbbell", Brand.REYVEL, 100, Group.DUMBBELL, sportEquipments, "dumbbell for power loads");
        ImplGoods dumbbell3 = new ImplGoods("Dumbbell", Brand.REYVEL, 100, Group.DUMBBELL, sportEquipments, "dumbbell for power loads");
        ImplGoods dumbbell4 = new ImplGoods("Dumbbell", Brand.REYVEL, 100, Group.DUMBBELL, sportEquipments, "dumbbell for power loads");
        ImplGoods dumbbell5 = new ImplGoods("Dumbbell", Brand.REYVEL, 100, Group.DUMBBELL, sportEquipments, "dumbbell for power loads");


        goods.add(dumbbell1);
        goods.add(dumbbell2);
        goods.add(dumbbell3);
        goods.add(dumbbell4);
        goods.add(dumbbell5);

        ImplGoods expander1 = new ImplGoods("Expander", Brand.REYVEL, 50, Group.EXPANDER, sportEquipments, "carpal muscle development simulator");
        ImplGoods expander2 = new ImplGoods("Expander", Brand.REYVEL, 50, Group.EXPANDER, sportEquipments, "carpal muscle development simulator");
        ImplGoods expander3 = new ImplGoods("Expander", Brand.REYVEL, 50, Group.EXPANDER, sportEquipments, "carpal muscle development simulator");
        ImplGoods expander4 = new ImplGoods("Expander", Brand.REYVEL, 50, Group.EXPANDER, sportEquipments, "carpal muscle development simulator");
        ImplGoods expander5 = new ImplGoods("Expander", Brand.REYVEL, 50, Group.EXPANDER, sportEquipments, "carpal muscle development simulator");

        goods.add(expander1);
        goods.add(expander2);
        goods.add(expander3);
        goods.add(expander4);
        goods.add(expander5);

        ImplGoods trousers1 = new ImplGoods("Trousers", Brand.ADIDAS, 300, Group.TROUSERS, sportWear, "for sports and everyday wear");
        ImplGoods trousers2 = new ImplGoods("Trousers", Brand.ADIDAS, 300, Group.TROUSERS, sportWear, "for sports and everyday wear");
        ImplGoods trousers3 = new ImplGoods("Trousers", Brand.ADIDAS, 300, Group.TROUSERS, sportWear, "for sports and everyday wear");
        ImplGoods trousers4 = new ImplGoods("Trousers", Brand.ADIDAS, 300, Group.TROUSERS, sportWear, "for sports and everyday wear");
        ImplGoods trousers5 = new ImplGoods("Trousers", Brand.ADIDAS, 300, Group.TROUSERS, sportWear, "for sports and everyday wear");

        goods.add(trousers1);
        goods.add(trousers2);
        goods.add(trousers3);
        goods.add(trousers4);
        goods.add(trousers5);

        ImplGoods shirt1 = new ImplGoods("Shirt", Brand.ADIDAS, 400, Group.SHIRT, sportWear, "for sports and everyday wear");
        ImplGoods shirt2 = new ImplGoods("Shirt", Brand.ADIDAS, 400, Group.SHIRT, sportWear, "for sports and everyday wear");
        ImplGoods shirt3 = new ImplGoods("Shirt", Brand.ADIDAS, 400, Group.SHIRT, sportWear, "for sports and everyday wear");
        ImplGoods shirt4 = new ImplGoods("Shirt", Brand.ADIDAS, 400, Group.SHIRT, sportWear, "for sports and everyday wear");
        ImplGoods shirt5 = new ImplGoods("Shirt", Brand.ADIDAS, 400, Group.SHIRT, sportWear, "for sports and everyday wear");

        goods.add(shirt1);
        goods.add(shirt2);
        goods.add(shirt3);
        goods.add(shirt4);
        goods.add(shirt5);

        ImplGoods sneakers1 = new ImplGoods("Sneakers", Brand.ADIDAS, 500, Group.SNEAKERS, sportWear, "for running and any active sport");
        ImplGoods sneakers2 = new ImplGoods("Sneakers", Brand.ADIDAS, 500, Group.SNEAKERS, sportWear, "for running and any active sport");
        ImplGoods sneakers3 = new ImplGoods("Sneakers", Brand.ADIDAS, 500, Group.SNEAKERS, sportWear, "for running and any active sport");
        ImplGoods sneakers4 = new ImplGoods("Sneakers", Brand.ADIDAS, 500, Group.SNEAKERS, sportWear, "for running and any active sport");
        ImplGoods sneakers5 = new ImplGoods("Sneakers", Brand.ADIDAS, 500, Group.SNEAKERS, sportWear, "for running and any active sport");


        goods.add(sneakers1);
        goods.add(sneakers2);
        goods.add(sneakers3);
        goods.add(sneakers4);
        goods.add(sneakers5);

        ImplGoods tent1 = new ImplGoods("Tent", Brand.CAT, 800, Group.TENT, tourism, "for camping");
        ImplGoods tent2 = new ImplGoods("Tent", Brand.CAT, 800, Group.TENT, tourism, "for camping");
        ImplGoods tent3 = new ImplGoods("Tent", Brand.CAT, 800, Group.TENT, tourism, "for camping");
        ImplGoods tent4 = new ImplGoods("Tent", Brand.CAT, 800, Group.TENT, tourism, "for camping");
        ImplGoods tent5 = new ImplGoods("Tent", Brand.CAT, 800, Group.TENT, tourism, "for camping");

        goods.add(tent1);
        goods.add(tent2);
        goods.add(tent3);
        goods.add(tent4);
        goods.add(tent5);

        ImplGoods knife1 = new ImplGoods("Multi functional knife", Brand.CAT, 200, Group.KNIFE, tourism, "for different task");
        ImplGoods knife2 = new ImplGoods("Multi functional knife", Brand.CAT, 200, Group.KNIFE, tourism, "for different task");
        ImplGoods knife3 = new ImplGoods("Multi functional knife", Brand.CAT, 200, Group.KNIFE, tourism, "for different task");
        ImplGoods knife4 = new ImplGoods("Multi functional knife", Brand.CAT, 200, Group.KNIFE, tourism, "for different task");
        ImplGoods knife5 = new ImplGoods("Multi functional knife", Brand.CAT, 200, Group.KNIFE, tourism, "for different task");

        goods.add(knife1);
        goods.add(knife2);
        goods.add(knife3);
        goods.add(knife4);
        goods.add(knife5);

        ImplGoods backpack1 = new ImplGoods("Backpack", Brand.CAT, 900, Group.BACKPACK, tourism, "to carry a large volume of things");
        ImplGoods backpack2 = new ImplGoods("Backpack", Brand.CAT, 900, Group.BACKPACK, tourism, "to carry a large volume of things");
        ImplGoods backpack3 = new ImplGoods("Backpack", Brand.CAT, 900, Group.BACKPACK, tourism, "to carry a large volume of things");
        ImplGoods backpack4 = new ImplGoods("Backpack", Brand.CAT, 900, Group.BACKPACK, tourism, "to carry a large volume of things");
        ImplGoods backpack5 = new ImplGoods("Backpack", Brand.CAT, 900, Group.BACKPACK, tourism, "to carry a large volume of things");

        goods.add(backpack1);
        goods.add(backpack2);
        goods.add(backpack3);
        goods.add(backpack4);
        goods.add(backpack5);
        return goods;
    }

}
