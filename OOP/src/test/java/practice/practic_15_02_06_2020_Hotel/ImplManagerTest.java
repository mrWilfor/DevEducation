package practice.practic_15_02_06_2020_Hotel;

import org.junit.jupiter.api.Test;
import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplManagerTest {

    @Test
    void reviewedRequest() {
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

        ImplClient client = hotel.getListOfClients().get("Nick");

        client.leaveARequest(client, 3, ClassHotelRoom.FAMILYROOM, 2);
        hotel.getManager().reviewedRequest();

        StatusRequest expectedStatusRequest = StatusRequest.WAITINGFORCLIENTSCONFIMATION;
        StatusRequest actualStatusRequest = client.getRequest().getStatus();

        assertEquals(expectedStatusRequest, actualStatusRequest);
    }

    @Test
    void reviewedRequestHaveNotRoom() {
        ImplHotel hotel = new ImplHotel();
        ImplHotelRoom room2 = new ImplHotelRoom(3, 100, 6, ClassHotelRoom.STANDART);
        ImplHotelRoom room3 = new ImplHotelRoom(2, 200, 1, ClassHotelRoom.BEACHVIEW);
        ImplHotelRoom room4 = new ImplHotelRoom(5, 400, 1, ClassHotelRoom.DELUXE);
        ImplHotelRoom room5 = new ImplHotelRoom(4, 500, 3, ClassHotelRoom.APARTMENT);

        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);
        hotel.registration("Nick", 2000, "12345");
        hotel.authorisation("Nick", "12345");

        ImplClient client = hotel.getListOfClients().get("Nick");

        client.leaveARequest(client, 3, ClassHotelRoom.FAMILYROOM, 2);
        hotel.getManager().reviewedRequest();

        ImplHotelRoomRequest expectedRequest = null;
        ImplHotelRoomRequest actualRequest = client.getRequest();

        assertEquals(expectedRequest, actualRequest);
    }
}