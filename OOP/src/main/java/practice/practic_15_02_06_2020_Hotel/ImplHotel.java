package practice.practic_15_02_06_2020_Hotel;

import practice.practic_15_02_06_2020_Hotel.interfaces.Hotel;

import java.util.HashMap;
import java.util.LinkedList;

public class ImplHotel implements Hotel {
    private LinkedList<ImplHotelRoom> freeRoom = new LinkedList<>();
    private HashMap<ImplClient, ImplHotelRoom> busyRoom = new HashMap<>();
    private HashMap<ImplClient, ImplHotelRoom> reservedRoom = new HashMap<>();
    private LinkedList<ImplHotelRoom> unavailableRoom = new LinkedList<>();
    private LinkedList<ImplHotelRoomRequest> requests = new LinkedList<>();
    private HashMap<String, ImplClient> listOfClients = new HashMap<>();
    private HashMap<String, String> listOfLoginAndPassword = new HashMap<>();
    private ImplManager manager = new ImplManager();

    @Override
    public boolean registration(String login, int money, String password) {
        if (listOfClients.containsKey(login)) {
            return false;
        }

        listOfClients.put(login, new ImplClient(login, money, this));
        listOfLoginAndPassword.put(login, password);
        return true;
    }

    @Override
    public boolean authorisation(String login, String password) {
        if (listOfClients.containsKey(login)) {
            if (password.equals(listOfLoginAndPassword.get(login))) {
                listOfClients.get(login).setStatus(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public LinkedList<ImplHotelRoom> getFreeRoom() {
        return freeRoom;
    }

    @Override
    public HashMap<ImplClient, ImplHotelRoom> getBusyRoom() {
        return busyRoom;
    }

    @Override
    public HashMap<ImplClient, ImplHotelRoom> getReservedRoom() {
        return reservedRoom;
    }

    @Override
    public LinkedList<ImplHotelRoom> getUnavailableRoom() {
        return unavailableRoom;
    }

    @Override
    public LinkedList<ImplHotelRoomRequest> getRequests() {
        return requests;
    }

    @Override
    public HashMap<String, ImplClient> getListOfClients() {
        return listOfClients;
    }

    @Override
    public HashMap<String, String> getListOfLoginAndPassword() {
        return listOfLoginAndPassword;
    }

    @Override
    public ImplManager getManager() {
        return manager;
    }
}
