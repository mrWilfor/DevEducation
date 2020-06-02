package practice.practic_15_02_06_2020_Hotel;

import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;
import practice.practic_15_02_06_2020_Hotel.interfaces.HotelNumber;

public class ImplHotelRoom implements HotelNumber {
    private int numberName;
    private int prise;
    private int numberOfPlaces;
    private ClassHotelRoom classHotelRoom;
    private StatusHotelRoom status = StatusHotelRoom.FREE;

    public ImplHotelRoom(int numberName, int prise, int numberOfPlaces, ClassHotelRoom classHotelRoom) {
        this.numberName = numberName;
        this.prise = prise;
        this.numberOfPlaces = numberOfPlaces;
        this.classHotelRoom = classHotelRoom;
    }

    @Override
    public int getNumberName() {
        return numberName;
    }

    @Override
    public int getPrise() {
        return prise;
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
    public StatusHotelRoom getStatus() {
        return status;
    }

    @Override
    public void setStatus(StatusHotelRoom status) {
        this.status = status;
    }
}
