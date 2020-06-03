package practice.practic_15_02_06_2020_Hotel;

import org.junit.jupiter.api.Test;
import practice.practic_15_02_06_2020_Hotel.enums.ClassHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplClientTest {

    @Test
    void leaveARequest() {
        ImplHotel hotel = new ImplHotel();

        hotel.registration("Nick", 2000, "12345");
        hotel.authorisation("Nick", "12345");

        ImplClient client = hotel.getListOfClients().get("Nick");

        client.leaveARequest(client, 3, ClassHotelRoom.FAMILYROOM, 2);

        int expectedQuantityRequests = 1;
        int actualQuantityRequests = hotel.getRequests().size();

        assertEquals(expectedQuantityRequests, actualQuantityRequests);
    }

    @Test
    void leaveARequestNotAuthorisation() {
        ImplHotel hotel = new ImplHotel();

        hotel.registration("Nick", 2000, "12345");

        ImplClient client = hotel.getListOfClients().get("Nick");

        client.leaveARequest(client, 3, ClassHotelRoom.FAMILYROOM, 2);

        int expectedQuantityRequests = 0;
        int actualQuantityRequests = hotel.getRequests().size();

        assertEquals(expectedQuantityRequests, actualQuantityRequests);
    }

    @Test
    void leaveARequestNotRegistration() {
        ImplHotel hotel = new ImplHotel();
        ImplClient client = new ImplClient("Nick", 2000, hotel);

        client.leaveARequest(client, 3, ClassHotelRoom.FAMILYROOM, 2);

        int expectedQuantityRequests = 0;
        int actualQuantityRequests = hotel.getRequests().size();

        assertEquals(expectedQuantityRequests, actualQuantityRequests);
    }

    @Test
    void confirmReservation() {
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
        client.confirmReservation();

        StatusRequest expectedStatusRequest = StatusRequest.ROOMRESERVED;
        StatusRequest actualStatusRequest = client.getRequest().getStatus();

        assertEquals(expectedStatusRequest, actualStatusRequest);
    }

    @Test
    void confirmReservationNotAuthorisation() {
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
        client.logOut();
        client.confirmReservation();

        StatusRequest expectedStatusRequest = StatusRequest.WAITINGFORCLIENTSCONFIMATION;
        StatusRequest actualStatusRequest = client.getRequest().getStatus();

        assertEquals(expectedStatusRequest, actualStatusRequest);
    }

    @Test
    void bookARoom() {
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

        client.bookARoom(room1, 3);

        StatusHotelRoom expected = StatusHotelRoom.RESERVED;
        StatusHotelRoom actual = room1.getStatus();

        assertEquals(expected, actual);
    }

    @Test
    void bookARoomNotAuthorisation() {
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

        ImplClient client = hotel.getListOfClients().get("Nick");

        client.bookARoom(room1, 3);

        ImplHotelRoomRequest expected = null;
        ImplHotelRoomRequest actual = client.getRequest();

        assertEquals(expected, actual);
    }

    @Test
    void bookARoomNotRegistration() {
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

        ImplClient client = new ImplClient("Nick", 2000, hotel);

        client.bookARoom(room1, 3);

        ImplHotelRoomRequest expected = null;
        ImplHotelRoomRequest actual = client.getRequest();

        assertEquals(expected, actual);
    }

    @Test
    void paid() {
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
        client.confirmReservation();
        client.paid();

        StatusRequest expectedStatusRequest = StatusRequest.PAID;
        StatusRequest actualStatusRequest = client.getRequest().getStatus();

        assertEquals(expectedStatusRequest, actualStatusRequest);
    }

    @Test
    void paidHaveNotMoney() {
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
        hotel.registration("Nick", 0, "12345");
        hotel.authorisation("Nick", "12345");

        ImplClient client = hotel.getListOfClients().get("Nick");

        client.leaveARequest(client, 3, ClassHotelRoom.FAMILYROOM, 2);
        hotel.getManager().reviewedRequest();
        client.confirmReservation();
        client.paid();

        StatusRequest expectedStatusRequest = StatusRequest.ROOMRESERVED;
        StatusRequest actualStatusRequest = client.getRequest().getStatus();

        assertEquals(expectedStatusRequest, actualStatusRequest);
    }

    @Test
    void paidHaveNotAuthorisation() {
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
        client.confirmReservation();
        client.logOut();
        client.paid();

        StatusRequest expectedStatusRequest = StatusRequest.ROOMRESERVED;
        StatusRequest actualStatusRequest = client.getRequest().getStatus();

        assertEquals(expectedStatusRequest, actualStatusRequest);
    }
}