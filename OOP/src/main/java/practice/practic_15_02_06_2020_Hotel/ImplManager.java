package practice.practic_15_02_06_2020_Hotel;

import practice.practic_15_02_06_2020_Hotel.enums.StatusHotelRoom;
import practice.practic_15_02_06_2020_Hotel.enums.StatusRequest;
import practice.practic_15_02_06_2020_Hotel.interfaces.Manager;

public class ImplManager implements Manager {
    private ImplHotel hotel;

    public ImplManager(ImplHotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void reviewedRequest() {
        ImplHotelRoomRequest request = null;

        for (ImplHotelRoomRequest req : hotel.getRequests()) {
            if (req.getStatus().equals(StatusRequest.NOTREVIEWED)) {
                request = req;
            }
        }

        if (request != null) {
            hotel.getRooms().sort(ImplHotelRoom.hotelRoomStatusComparator);

            ImplHotelRoom roomResult = null;

            for (ImplHotelRoom room : hotel.getRooms()) {
                if (room.getStatus().equals(StatusHotelRoom.FREE) && room.getClassHotelRoom().equals(request.getClassHotelRoom())) {
                    if (roomResult == null || Math.abs(room.getNumberOfPlaces() - request.getHotelRoom().getNumberOfPlaces()) < roomResult.getNumberOfPlaces()) {
                        roomResult = room;
                    }
                } else if (!room.getStatus().equals(StatusHotelRoom.FREE)) {
                    break;
                }
            }

            if (roomResult == null) {
                request.getClients().setRequest(null);
            } else {
                request.setHotelRoom(roomResult);
                request.setStatus(StatusRequest.WAITINGFORCLIENTSCONFIMATION);
                request.setBill(request.getStayTime() * roomResult.getPrise());
            }
        }
    }
}
