package practice.practic_15_02_06_2020_Hotel.enums;

public enum ClassHotelRoom {
    STANDART("Standart"),
    FAMILYROOM("Family room"),
    DELUXE("Deluxe"),
    BEACHVIEW("Beach view"),
    APARTMENT("Apartament");

    final String classHotelNumber;

    ClassHotelRoom(String classHotelNumber) {
        this.classHotelNumber = classHotelNumber;
    }
}
