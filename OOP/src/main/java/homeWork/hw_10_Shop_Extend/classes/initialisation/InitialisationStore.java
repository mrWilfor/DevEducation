package homeWork.hw_10_Shop_Extend.classes.initialisation;

import homeWork.hw_10_Shop_Extend.classes.ImplGoods;
import homeWork.hw_10_Shop_Extend.classes.ImplStore;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplCashier;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplConsultant;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplSecurity;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.enums.Group;

public class InitialisationStore {
    public static void initialisation(ImplStore store) {
        ImplCashier cashier1 = new ImplCashier("Nick");
        ImplCashier cashier2 = new ImplCashier("Mick");
        ImplCashier cashier3 = new ImplCashier("Zick");
        ImplSecurity security1 = new ImplSecurity("Dima");
        ImplSecurity security2 = new ImplSecurity("Artyom");
        ImplSecurity security3 = new ImplSecurity("Andrey");
        ImplConsultant consultant1 = new ImplConsultant("Yulya");
        ImplConsultant consultant2 = new ImplConsultant("Daria");
        ImplConsultant consultant3 = new ImplConsultant("Anna");

        store.addCashier(cashier1);
        store.addCashier(cashier2);
        store.addCashier(cashier3);
        store.addSecurity(security1);
        store.addSecurity(security2);
        store.addSecurity(security3);
        store.getSportEquipmentsDepartment().addConsultant(consultant1);
        store.getSportWearsDepartment().addConsultant(consultant2);
        store.getTourismDepartment().addConsultant(consultant3);

        ImplGoods punchingBag = new ImplGoods(
                "Punching bag",
                Brand.REYVEL,
                200,
                Group.PUNCHINGBAG,
                store.getSportEquipmentsDepartment(),
                "impact training simulator"
        );
        ImplGoods dumbbell = new ImplGoods(
                "Dumbbell",
                Brand.REYVEL,
                100, Group.DUMBBELL,
                store.getSportEquipmentsDepartment(),
                "dumbbell for power loads"
        );
        ImplGoods expander = new ImplGoods(
                "Expander",
                Brand.REYVEL,
                50, Group.EXPANDER,
                store.getSportEquipmentsDepartment(),
                "carpal muscle development simulator"
        );

        store.getSportEquipmentsDepartment().addGoods(punchingBag);
        store.getSportEquipmentsDepartment().addGoods(dumbbell);
        store.getSportEquipmentsDepartment().addGoods(expander);

        ImplGoods trousers = new ImplGoods(
                "Trousers",
                Brand.ADIDAS,
                300,
                Group.TROUSERS,
                store.getSportWearsDepartment(),
                "for sports and everyday wear"
        );
        ImplGoods shirt = new ImplGoods(
                "Shirt",
                Brand.ADIDAS,
                400,
                Group.SHIRT,
                store.getSportWearsDepartment(),
                "for sports and everyday wear"
        );
        ImplGoods sneakers = new ImplGoods(
                "Sneakers",
                Brand.ADIDAS,
                500,
                Group.SNEAKERS,
                store.getSportWearsDepartment(),
                "for running and any active sport"
        );

        store.getSportWearsDepartment().addGoods(trousers);
        store.getSportWearsDepartment().addGoods(shirt);
        store.getSportWearsDepartment().addGoods(sneakers);

        ImplGoods tent = new ImplGoods(
                "Tent",
                Brand.CAT,
                800,
                Group.TENT,
                store.getTourismDepartment(),
                "for camping"
        );
        ImplGoods knife = new ImplGoods(
                "Multi functional knife",
                Brand.CAT,
                200,
                Group.KNIFE,
                store.getTourismDepartment(),
                "for different task"
        );
        ImplGoods backpack = new ImplGoods(
                "Backpack",
                Brand.CAT,
                900,
                Group.BACKPACK,
                store.getTourismDepartment(),
                "to carry a large volume of things"
        );

        store.getTourismDepartment().addGoods(tent);
        store.getTourismDepartment().addGoods(knife);
        store.getTourismDepartment().addGoods(backpack);
    }
}
