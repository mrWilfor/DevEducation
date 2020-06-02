package practice.practic_15_02_06_2020_Hotel.interfaces;

import practice.practic_15_02_06_2020_Hotel.ImplClient;
import practice.practic_15_02_06_2020_Hotel.ImplHotelRoom;
import practice.practic_15_02_06_2020_Hotel.ImplHotelRoomRequest;
import practice.practic_15_02_06_2020_Hotel.ImplManager;

import java.util.HashMap;
import java.util.LinkedList;

public interface Hotel {
    boolean registration(String login, int money, String password);

    boolean authorisation(String login, String password);

    LinkedList<ImplHotelRoom> getFreeRoom();

    HashMap<ImplClient, ImplHotelRoom> getBusyRoom();

    HashMap<ImplClient, ImplHotelRoom> getReservedRoom();

    LinkedList<ImplHotelRoom> getUnavailableRoom();

    LinkedList<ImplHotelRoomRequest> getRequests();

    HashMap<String, ImplClient> getListOfClients();

    HashMap<String, String> getListOfLoginAndPassword();

    ImplManager getManager();
}
