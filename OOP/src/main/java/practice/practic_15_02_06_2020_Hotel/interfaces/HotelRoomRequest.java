package practice.practic_15_02_06_2020_Hotel.interfaces;

import practice.practic_15_02_06_2020_Hotel.ImplClient;
import practice.practic_15_02_06_2020_Hotel.ImplHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusRequest;

public interface HotelRoomRequest {
    ImplClient getClients();

    ImplHotelRoom getHotelRoom();

    void setHotelRoom(ImplHotelRoom hotelRoom);

    int getNumberOfPlaces();

    ClassHotelRoom getClassHotelRoom();

    int getStayTime();

    int getBill();

    void setBill(int bill);

    StatusRequest getStatus();

    void setStatus(StatusRequest status);
}
