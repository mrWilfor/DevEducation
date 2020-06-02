package practice.practic_15_02_06_2020_Hotel.interfaces;

import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;

public interface HotelNumber {
    int getNumberName();

    int getPrise();

    int getNumberOfPlaces();

    ClassHotelRoom getClassHotelRoom();

    StatusHotelRoom getStatus();

    void setStatus(StatusHotelRoom status);
}
