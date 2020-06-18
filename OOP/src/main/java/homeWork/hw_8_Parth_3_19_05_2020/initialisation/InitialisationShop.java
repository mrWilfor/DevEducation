package homeWork.hw_8_Parth_3_19_05_2020.initialisation;

import homeWork.hw_8_Parth_3_19_05_2020.interfaceShop.Shop;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsEquipment;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsWear;
import homeWork.hw_8_Parth_3_19_05_2020.product.Tourism;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;

public class InitialisationShop {
    public static void initialisation(Shop shop) {
        Cashier cashier1 = new Cashier("Dima");
        Cashier cashier2 = new Cashier("Artem");
        Cashier cashier3 = new Cashier("Masha");
        SecurityGuard securityGuard1 = new SecurityGuard("Andrey");
        SecurityGuard securityGuard2 = new SecurityGuard("Ilya");
        SecurityGuard securityGuard3 = new SecurityGuard("Mike");

        shop.addCashier(cashier1);
        shop.addCashier(cashier2);
        shop.addCashier(cashier3);
        shop.addSecurityGuard(securityGuard1);
        shop.addSecurityGuard(securityGuard2);
        shop.addSecurityGuard(securityGuard3);

        Consultant consultant1 = new Consultant("Denny", "Sport equipment department");
        SportsEquipment dumbbell = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        SportsEquipment punchingBag = new SportsEquipment(
                "punchingBag",
                "red",
                "impact training simulator",
                150
        );
        SportsEquipment expander = new SportsEquipment(
                "expander",
                "green",
                "carpal muscle development simulator",
                50
        );

        shop.getSportEquipmentDepartment().addProduct(dumbbell);
        shop.getSportEquipmentDepartment().addProduct(punchingBag);
        shop.getSportEquipmentDepartment().addProduct(expander);
        shop.getSportEquipmentDepartment().addConsultant(consultant1);

        Consultant consultant2 = new Consultant("Denny", "Sport wear department");
        SportsWear trousers = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        SportsWear shirt = new SportsWear(
                "active sport shirt",
                "red",
                "for sports and everyday wear",
                150,
                "M",
                "shirt"
        );
        SportsWear sneakers = new SportsWear(
                "sneakers for running",
                "silver",
                "for running and any active sport",
                150,
                "M",
                "sneakers"
        );

        shop.getSportsWearDepartment().addProduct(trousers);
        shop.getSportsWearDepartment().addProduct(shirt);
        shop.getSportsWearDepartment().addProduct(sneakers);
        shop.getSportsWearDepartment().addConsultant(consultant2);

        Consultant consultant3 = new Consultant("Denny", "Tourism department");
        Tourism tent = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        Tourism knife = new Tourism(
                "multi functional knife",
                "orange",
                "for different task",
                120,
                "use careful, sharp knife"
        );
        Tourism backpack = new Tourism(
                "backpack",
                "green",
                "to carry a large volume of things",
                400,
                "put things tight and tighten the belts, in order to unpack, unfasten the tightening belts"
        );

        shop.getTourismDepartment().addProduct(tent);
        shop.getTourismDepartment().addProduct(knife);
        shop.getTourismDepartment().addProduct(backpack);
        shop.getTourismDepartment().addConsultant(consultant3);
    }
}
