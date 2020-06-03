package practice.practic_15_02_06_2020_Hotel;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusRequest;
import practice.practic_15_02_06_2020_Hotel.interfaces.Client;
import practice.practic_15_02_06_2020_Hotel.interfaces.Hotel;

import java.util.GregorianCalendar;

public class ImplClient implements Client {
    private String name;
    private long uid = UIDGeneration.getUID();
    private int money;
    private ImplHotel hotel;
    private boolean isStatus = false;
    private ImplHotelRoomRequest request;

    public ImplClient(String name, int money, ImplHotel hotel) {
        this.name = name;
        this.money = money;
        this.hotel = hotel;
    }

    @Override
    public void leaveARequest(ImplClient client, int numberOfPlaces, ClassHotelRoom classHotelRoom, int stayTime) {
        if (hotel.getListOfClients().containsValue(this) && isStatus) {
            request = new ImplHotelRoomRequest(client, numberOfPlaces, classHotelRoom, stayTime);

            hotel.getRequests().add(request);
        }
    }

    @Override
    public void confirmReservation() {
        if (isStatus && request.getStatus().equals(StatusRequest.WAITINGFORCLIENTSCONFIMATION)) {
            int bill = request.getHotelRoom().getPrise() * request.getStayTime();

            request.setBill(bill);
            request.setStatus(StatusRequest.ROOMRESERVED);
            request.getHotelRoom().setStatus(StatusHotelRoom.RESERVED);
            request.setDateOfBookRoom(new GregorianCalendar());
        }
    }

    @Override
    public void bookARoom(ImplHotelRoom hotelRoom, int stayTime) {
        if (hotel.getListOfClients().containsValue(this) && isStatus) {
            request = new ImplHotelRoomRequest(
                    this, hotelRoom.getNumberOfPlaces(),
                    hotelRoom.getClassHotelRoom(),
                    stayTime
            );
            int bill = hotelRoom.getPrise() * stayTime;

            request.setHotelRoom(hotelRoom);
            request.setBill(bill);
            request.setStatus(StatusRequest.ROOMRESERVED);
            request.getHotelRoom().setStatus(StatusHotelRoom.RESERVED);
            request.setDateOfBookRoom(new GregorianCalendar());
        }
    }

    @Override
    public boolean paid() {
        if (isStatus && money >= request.getBill()) {
            money -= request.getBill();
            request.setBill(0);
            request.setStatus(StatusRequest.PAID);
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getUID() {
        return uid;
    }

    @Override
    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public boolean getStatus() {
        return isStatus;
    }

    @Override
    public void setStatus(boolean status) {
        isStatus = status;
    }

    @Override
    public ImplHotelRoomRequest getRequest() {
        return request;
    }

    @Override
    public void setRequest(ImplHotelRoomRequest request) {
        this.request = request;
    }

    @Override
    public void logOut() {
        isStatus = false;
    }
}
