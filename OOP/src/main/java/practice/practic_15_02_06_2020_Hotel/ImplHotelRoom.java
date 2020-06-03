package practice.practic_15_02_06_2020_Hotel;

import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;
import practice.practic_15_02_06_2020_Hotel.interfaces.HotelNumber;

import java.util.Comparator;

public class ImplHotelRoom implements HotelNumber, Comparable<ImplHotelRoom> {
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

    @Override
    public int compareTo(ImplHotelRoom o) {
        int comparePrise = ((ImplHotelRoom) o).getPrise();

        return this.prise - comparePrise;
    }

    public static Comparator<ImplHotelRoom> hotelRoomQuantityOfPlacesComparator = new Comparator<ImplHotelRoom>() {
        @Override
        public int compare(ImplHotelRoom o1, ImplHotelRoom o2) {
            Integer roomQuantityOfPlaces1 = o1.getNumberOfPlaces();
            Integer roomQuantityOfPlaces2 = o2.getNumberOfPlaces();
            return roomQuantityOfPlaces1.compareTo(roomQuantityOfPlaces2);
        }
    };

    public static Comparator<ImplHotelRoom> hotelRoomClassQualityComparator = new Comparator<ImplHotelRoom>() {
        @Override
        public int compare(ImplHotelRoom o1, ImplHotelRoom o2) {
            ClassHotelRoom roomClassQuality1 = o1.getClassHotelRoom();
            ClassHotelRoom roomClassQuality2 = o2.getClassHotelRoom();
            return roomClassQuality1.compareTo(roomClassQuality2);
        }
    };

    public static Comparator<ImplHotelRoom> hotelRoomStatusComparator = new Comparator<ImplHotelRoom>() {
        @Override
        public int compare(ImplHotelRoom o1, ImplHotelRoom o2) {
            StatusHotelRoom roomStatus1 = o1.getStatus();
            StatusHotelRoom roomStatus2 = o2.getStatus();
            return roomStatus1.compareTo(roomStatus2);
        }
    };
}
