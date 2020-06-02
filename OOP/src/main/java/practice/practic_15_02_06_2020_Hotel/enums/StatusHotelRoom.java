package practice.practic_15_02_06_2020_Hotel.enums;

public enum StatusHotelRoom {
    FREE("Free"),
    RESERVED("Reserved"),
    BUSY("Busy"),
    UNAVAILABLE("Unavailable");

    final String status;

    StatusHotelRoom(String status) {
        this.status = status;
    }
}
