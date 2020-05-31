package homeWork.hw_10_Shop_Extend.classes;

import homeWork.hw_10_Shop_Extend.classes.employee.ImplCashier;
import homeWork.hw_10_Shop_Extend.classes.employee.ImplConsultant;
import homeWork.hw_10_Shop_Extend.classes.enums.Brand;
import homeWork.hw_10_Shop_Extend.classes.initialisation.InitialisationStorage;
import homeWork.hw_10_Shop_Extend.classes.initialisation.InitialisationStore;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplStoreTest {
    @Test
    void takeGoodsToCart() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplCashier cashier = store.getCashier();
        ImplCustomer customer = new ImplCustomer("Winni", 200);

        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);

        int expectedQuantityOgGoodsBefore = 3;
        int actualQuantityOgGoodsBefore = store.getSportEquipmentsDepartment().getListOfGoods().size();
        int expectedQueueBefore = 0;
        int actualQueueBefore = cashier.getQueue().size();

        assertEquals(expectedQuantityOgGoodsBefore, actualQuantityOgGoodsBefore);
        assertEquals(expectedQueueBefore, actualQueueBefore);

        store.takeGoodsToCart(0, store.getSportEquipmentsDepartment(), customer);
        store.buyGoods(cashier, customer);

        int expectedQuantityOgGoodsAfter = 2;
        int actualQuantityOgGoodsAfter = store.getSportEquipmentsDepartment().getListOfGoods().size();
        int expectedQueueAfter = 1;
        int actualQueueAfter = cashier.getQueue().size();

        assertEquals(expectedQuantityOgGoodsAfter, actualQuantityOgGoodsAfter);
        assertEquals(expectedQueueAfter, actualQueueAfter);
    }

    @Test
    void paymentOfGoods() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplCashier cashier = store.getCashier();
        ImplCustomer customer = new ImplCustomer("Winni", 200);

        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);
        store.takeGoodsToCart(0, store.getSportEquipmentsDepartment(), customer);
        store.buyGoods(cashier, customer);

        int expectedQuantityOfGoodsBefore = 2;
        int actualQuantityOfGoodsBefore = store.getSportEquipmentsDepartment().getListOfGoods().size();
        int expectedQuantityOfGoodsInWarehouseBefore = 15;
        int actualQuantityOfGoodsInWarehouseBefore = store.getStoreKeeper().getQuantityOfGoodsByBrand(Brand.REYVEL);
        int expectedQueueBefore = 1;
        int actualQueueBefore = cashier.getQueue().size();

        assertEquals(expectedQuantityOfGoodsBefore, actualQuantityOfGoodsBefore);
        assertEquals(expectedQuantityOfGoodsInWarehouseBefore, actualQuantityOfGoodsInWarehouseBefore);
        assertEquals(expectedQueueBefore, actualQueueBefore);

        cashier.getFromTheBeginningOfTheQueue();
        cashier.paymentCustomer(customer, 200, store.getStoreKeeper());

        int expectedQuantityOgGoodsAfter = 3;
        int actualQuantityOgGoodsAfter = store.getSportEquipmentsDepartment().getListOfGoods().size();
        int expectedQuantityOfGoodsInWarehouseAfter = 14;
        int actualQuantityOfGoodsInWarehouseAfter = store.getStoreKeeper().getQuantityOfGoodsByBrand(Brand.REYVEL);
        int expectedQueueAfter = 0;
        int actualQueueAfter = cashier.getQueue().size();

        assertEquals(expectedQuantityOgGoodsAfter, actualQuantityOgGoodsAfter);
        assertEquals(expectedQuantityOfGoodsInWarehouseAfter, actualQuantityOfGoodsInWarehouseAfter);
        assertEquals(expectedQueueAfter, actualQueueAfter);
    }

    @Test
    void consultationMany() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplCustomer customer = new ImplCustomer("Winni", 200);
        ImplGoods goods1 = store.getGoods(0, store.getSportEquipmentsDepartment());

        store.addCustomer(customer);
        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);

        store.consultation(goods1);

        assertEquals(1, store.getSportEquipmentsDepartment().getListOfConsultants().size());

        store.consultation(goods1);

        assertEquals(2, store.getSportEquipmentsDepartment().getListOfConsultants().size());

        store.consultation(goods1);

        assertEquals(3, store.getSportEquipmentsDepartment().getListOfConsultants().size());
    }

    @Test
    void consultationTwo() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplConsultant consultant = new ImplConsultant("Puh");
        ImplCustomer customer = new ImplCustomer("Winni", 200);
        ImplGoods goods1 = store.getGoods(0, store.getSportEquipmentsDepartment());

        store.addCustomer(customer);
        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);

        store.consultation(goods1);

        assertEquals(1, store.getSportEquipmentsDepartment().getListOfConsultants().size());

        store.consultation(goods1);

        assertEquals(2, store.getSportEquipmentsDepartment().getListOfConsultants().size());

        store.consultation(goods1);
    }

    @Test
    void consultationOne() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplConsultant consultant = new ImplConsultant("Puh");
        ImplCustomer customer = new ImplCustomer("Winni", 200);
        ImplGoods goods1 = store.getGoods(0, store.getSportEquipmentsDepartment());

        store.addCustomer(customer);
        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);

        store.consultation(goods1);

        assertEquals(1, store.getSportEquipmentsDepartment().getListOfConsultants().size());

        store.consultation(goods1);
    }

    @Test
    void securityCheckListTrue() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplCashier cashier = store.getCashier();
        ImplCustomer customer = new ImplCustomer("Winni", 200);

        store.addCustomer(customer);
        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);
        store.takeGoodsToCart(0, store.getSportEquipmentsDepartment(), customer);
        store.buyGoods(cashier, customer);
        cashier.getFromTheBeginningOfTheQueue();
        cashier.paymentCustomer(customer, 200, store.getStoreKeeper());

        int expectedQuantityOfCustomerBefore = 1;
        int actualQuantityOfCustomerBefore = store.getListOfCustomer().size();

        assertEquals(expectedQuantityOfCustomerBefore, actualQuantityOfCustomerBefore);

        store.securityCheckList(customer);

        int expectedQuantityOfCustomerAfter = 0;
        int actualQuantityOfCustomerAfter = store.getListOfCustomer().size();

        assertEquals(expectedQuantityOfCustomerAfter, actualQuantityOfCustomerAfter);
    }

    @Test
    void securityCheckListFalse() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplCashier cashier = store.getCashier();
        ImplCustomer customer = new ImplCustomer("Winni", 200);

        store.addCustomer(customer);
        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);
        store.takeGoodsToCart(0, store.getSportEquipmentsDepartment(), customer);

        int expectedQuantityOfCustomerBefore = 1;
        int actualQuantityOfCustomerBefore = store.getListOfCustomer().size();

        assertEquals(expectedQuantityOfCustomerBefore, actualQuantityOfCustomerBefore);

        store.securityCheckList(customer);

        int expectedQuantityOfCustomerAfter = 1;
        int actualQuantityOfCustomerAfter = store.getListOfCustomer().size();

        assertEquals(expectedQuantityOfCustomerAfter, actualQuantityOfCustomerAfter);
    }

    @Test
    void customerOutFromStore() {
        ImplStore store = new ImplStore();

        InitialisationStore.initialisation(store);
        LinkedList<ImplGoods> goods = InitialisationStorage.getGoods(
                store.getSportEquipmentsDepartment(),
                store.getSportWearsDepartment(),
                store.getTourismDepartment()
        );

        ImplCustomer customer = new ImplCustomer("Winni", 200);

        store.addCustomer(customer);
        store.getStoreKeeper().takeTheGoodsToTheWarehouse(goods);

        int expectedQuantityOfCustomerBefore = 1;
        int actualQuantityOfCustomerBefore = store.getListOfCustomer().size();

        assertEquals(expectedQuantityOfCustomerBefore, actualQuantityOfCustomerBefore);

        store.customerOutFromStore(customer);

        int expectedQuantityOfCustomerAfter = 0;
        int actualQuantityOfCustomerAfter = store.getListOfCustomer().size();

        assertEquals(expectedQuantityOfCustomerAfter, actualQuantityOfCustomerAfter);
    }
}