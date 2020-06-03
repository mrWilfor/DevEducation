package practice.practic_15_02_06_2020_Hotel.interfaces;

import practice.practic_15_02_06_2020_Hotel.ImplClient;
import practice.practic_15_02_06_2020_Hotel.ImplHotelRoom;
import practice.practic_15_02_06_2020_Hotel.ImplHotelRoomRequest;
import practice.practic_15_02_06_2020_Hotel.ImplManager;
import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;

public interface Hotel {
    boolean registration(String login, int money, String password);

    boolean authorisation(String login, String password);

    ImplHotelRoom searchRoomsByStatus(StatusHotelRoom statusHotelRoom);

    void verificationOfPaymentForBookedRooms();

    void addDayToCalendar(int day);

    void addRoom(ImplHotelRoom room);

    LinkedList<ImplHotelRoom> getRooms();

    LinkedList<ImplHotelRoomRequest> getRequests();

    HashMap<String, ImplClient> getListOfClients();

    ImplManager getManager();

    Calendar getCalendar();
}
