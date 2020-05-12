package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.House;

public interface IDaoHouse {

    long create(House h);

    House[] readAll();

    House[] readByQuantityOfRooms(int quantityOfRooms);

    House[] readByQuantityOfRoomsAndFloor(int quantityOfRooms, int firstNumberOfFloor,  int secondNumberOfFloor);

    House[] readByApartmentThatHaveAreaMoreThan(long area);

    void remove(long id);

    void update(House h);

    default void clear() {

    }
}
