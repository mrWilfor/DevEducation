package practice.practic_15_02_06_2020_Hotel;

import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusRequest;
import practice.practic_15_02_06_2020_Hotel.interfaces.HotelRoomRequest;

import java.util.Calendar;

public class ImplHotelRoomRequest implements HotelRoomRequest {
    private ImplClient client;
    private ImplHotelRoom hotelRoom;
    private int numberOfPlaces;
    private ClassHotelRoom classHotelRoom;
    private int stayTime;
    private int bill;
    private StatusRequest status = StatusRequest.NOTREVIEWED;
    private Calendar dateOfBookRoom;

    public ImplHotelRoomRequest(ImplClient client, int numberOfPlaces, ClassHotelRoom classHotelRoom, int stayTime) {
        this.client = client;
        this.numberOfPlaces = numberOfPlaces;
        this.classHotelRoom = classHotelRoom;
        this.stayTime = stayTime;
    }

    @Override
    public ImplClient getClients() {
        return client;
    }

    @Override
    public ImplHotelRoom getHotelRoom() {
        return hotelRoom;
    }

    @Override
    public void setHotelRoom(ImplHotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    @Override
    public ClassHotelRoom getClassHotelRoom() {
        return classHotelRoom;
    }

    @Override
    public int getStayTime() {
        return stayTime;
    }

    @Override
    public int getBill() {
        return bill;
    }

    @Override
    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public StatusRequest getStatus() {
        return status;
    }

    @Override
    public void setStatus(StatusRequest status) {
        this.status = status;
    }

    @Override
    public Calendar getDateOfBookRoom() {
        return dateOfBookRoom;
    }

    @Override
    public void setDateOfBookRoom(Calendar dateOfBookRoom) {
        this.dateOfBookRoom = dateOfBookRoom;
    }


}
