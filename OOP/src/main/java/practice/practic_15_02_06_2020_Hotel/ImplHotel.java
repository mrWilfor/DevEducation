package practice.practic_15_02_06_2020_Hotel;

import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusRequest;
import practice.practic_15_02_06_2020_Hotel.interfaces.Hotel;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;

public class ImplHotel implements Hotel {
    private Calendar calendar = new GregorianCalendar();
    private LinkedList<ImplHotelRoom> rooms = new LinkedList<>();
    private LinkedList<ImplHotelRoomRequest> requests = new LinkedList<>();
    private HashMap<String, ImplClient> listOfClients = new HashMap<>();
    private HashMap<String, String> listOfLoginAndPassword = new HashMap<>();
    private ImplManager manager = new ImplManager(this);

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
    public ImplHotelRoom searchRoomsByStatus(StatusHotelRoom statusHotelRoom) {
        int firstIndex = 0;
        int lastIndex = rooms.size() - 1;
        boolean isTrigger = false;

        do {
            rooms.sort(ImplHotelRoom.hotelRoomStatusComparator);

            isTrigger = false;

            if (statusHotelRoom.compareTo(rooms.get((lastIndex + firstIndex) / 2).getStatus()) == 0) {
                return rooms.get((lastIndex + firstIndex) / 2);
            } else if (firstIndex == lastIndex && statusHotelRoom.compareTo(rooms.get(firstIndex).getStatus()) != 0) {
                break;
            } else if (lastIndex - firstIndex == 1 && statusHotelRoom.compareTo(rooms.get(firstIndex).getStatus()) != 0) {
                firstIndex = lastIndex;
                isTrigger = true;
            } else if (statusHotelRoom.compareTo(rooms.get((lastIndex + firstIndex) / 2).getStatus()) < 0) {
                lastIndex = ((lastIndex + firstIndex) / 2) - 1;
                isTrigger = true;
            } else if (statusHotelRoom.compareTo(rooms.get((lastIndex + firstIndex) / 2).getStatus()) > 0) {
                firstIndex = ((lastIndex + firstIndex) / 2) + 1;
                isTrigger = true;
            }
        } while (isTrigger);
        return null;
    }

    @Override
    public void verificationOfPaymentForBookedRooms() {
        for (ImplHotelRoomRequest request : requests) {
            if (
                    request.getStatus().equals(StatusRequest.ROOMRESERVED) &&
                            calendar.get(Calendar.DAY_OF_MONTH) - request.getDateOfBookRoom().get(Calendar.DAY_OF_MONTH) >= 2
            ) {
                request.getClients().setRequest(null);
                request.getHotelRoom().setStatus(StatusHotelRoom.FREE);
                requests.remove(request);
            }
        }
    }

    @Override
    public void addDayToCalendar(int day) {
        calendar.add(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void addRoom(ImplHotelRoom room) {
        rooms.add(room);
    }

    @Override
    public LinkedList<ImplHotelRoom> getRooms() {
        return rooms;
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
    public ImplManager getManager() {
        return manager;
    }

    @Override
    public Calendar getCalendar() {
        return calendar;
    }
}
