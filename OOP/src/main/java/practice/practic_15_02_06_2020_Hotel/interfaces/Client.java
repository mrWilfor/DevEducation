package practice.practic_15_02_06_2020_Hotel.interfaces;

import practice.practic_15_02_06_2020_Hotel.ImplClient;
import practice.practic_15_02_06_2020_Hotel.ImplHotelRoom;
import practice.practic_15_02_06_2020_Hotel.ImplHotelRoomRequest;
import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;

public interface Client {
    void leaveARequest(ImplClient client, int numberOfPlaces, ClassHotelRoom classHotelRoom, int stayTime);

    void confirmReservation();

    void bookARoom(ImplHotelRoom hotelRoom, int stayTime);

    boolean paid();

    String getName();

    long getUID();

    Hotel getHotel();

    boolean getStatus();

    void setStatus(boolean isStatus);

    ImplHotelRoomRequest getRequest();

    void setRequest(ImplHotelRoomRequest request);

    void logOut();
}
