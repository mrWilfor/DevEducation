package practice.practic_15_02_06_2020_Hotel;

import org.junit.jupiter.api.Test;
import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplHotelTest {

    @Test
    void searchRoomsByStatus() {
        ImplHotel hotel = new ImplHotel();
        ImplHotelRoom room1 = new ImplHotelRoom(1, 300, 2, ClassHotelRoom.FAMILYROOM);
        ImplHotelRoom room2 = new ImplHotelRoom(3, 100, 6, ClassHotelRoom.STANDART);
        room2.setStatus(StatusHotelRoom.RESERVED);
        ImplHotelRoom room3 = new ImplHotelRoom(2, 200, 1, ClassHotelRoom.BEACHVIEW);
        ImplHotelRoom room4 = new ImplHotelRoom(5, 400, 1, ClassHotelRoom.DELUXE);
        ImplHotelRoom room5 = new ImplHotelRoom(4, 500, 3, ClassHotelRoom.APARTMENT);

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);

        ImplHotelRoom actualRoom = hotel.searchRoomsByStatus(StatusHotelRoom.RESERVED);

        assertEquals(room2, actualRoom);
    }

    @Test
    void verificationOfPaymentForBookedRooms() {
        ImplHotel hotel = new ImplHotel();
        ImplHotelRoom room1 = new ImplHotelRoom(1, 300, 2, ClassHotelRoom.FAMILYROOM);
        ImplHotelRoom room2 = new ImplHotelRoom(3, 100, 6, ClassHotelRoom.STANDART);
        ImplHotelRoom room3 = new ImplHotelRoom(2, 200, 1, ClassHotelRoom.BEACHVIEW);
        ImplHotelRoom room4 = new ImplHotelRoom(5, 400, 1, ClassHotelRoom.DELUXE);
        ImplHotelRoom room5 = new ImplHotelRoom(4, 500, 3, ClassHotelRoom.APARTMENT);

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);
        hotel.registration("Nick", 2000, "12345");
        hotel.authorisation("Nick", "12345");
        hotel.registration("Joanna", 2000, "12345");
        hotel.authorisation("Joanna", "12345");

        ImplClient client1 = hotel.getListOfClients().get("Nick");
        ImplClient client2 = hotel.getListOfClients().get("Joanna");

        client1.leaveARequest(client1, 5, ClassHotelRoom.STANDART, 2);
        hotel.getManager().reviewedRequest();
        client1.confirmReservation();
        client1.paid();

        client2.leaveARequest(client2, 3, ClassHotelRoom.FAMILYROOM, 2);
        hotel.getManager().reviewedRequest();
        client2.confirmReservation();

        int expectedQuantityRequestBefore = 2;
        int actualQuantityRequestBefore = hotel.getRequests().size();

        assertEquals(expectedQuantityRequestBefore, actualQuantityRequestBefore);

        hotel.addDayToCalendar(2);
        hotel.verificationOfPaymentForBookedRooms();

        int expectedQuantityRequestAfter = 1;
        int actualQuantityRequestAfter = hotel.getRequests().size();

        assertEquals(expectedQuantityRequestAfter, actualQuantityRequestAfter);
    }
}