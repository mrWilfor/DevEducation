package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.House;

public class DaoHouse implements IDaoHouse {
    private static House[] listOfApartments = new House[0];

    @Override
    public long create(House house) {
        if (house == null) {
            return -1;
        }

        if (listOfApartments.length == 0) {
            listOfApartments = new House[1];
            listOfApartments[0] = house;
        } else {
            House[] arrayOfApartments = new House[listOfApartments.length + 1];

            for (int i = 0; i < listOfApartments.length; i++) {
                arrayOfApartments[i] = listOfApartments[i];
            }
            arrayOfApartments[arrayOfApartments.length - 1] = house;
            listOfApartments = arrayOfApartments;
        }
        return house.getId();
    }

    @Override
    public House[] readAll() {
        return listOfApartments;
    }

    @Override
    public House[] readByQuantityOfRooms(int quantityOfRooms) {
        if (quantityOfRooms == 0) {
            return new House[0];
        }
        House[] listOfApartmentsByRooms = new House[0];

        for (int i = 0; i < listOfApartments.length; i++) {
            if (quantityOfRooms == listOfApartments[i].getQuantityOfRooms()) {
                if (listOfApartmentsByRooms.length == 0) {
                    listOfApartmentsByRooms = new House[1];
                    listOfApartmentsByRooms[0] = listOfApartments[i];
                } else {
                    House[] newListOfApartmentsByRooms =
                            new House[listOfApartmentsByRooms.length + 1];

                    for (int j = 0; j < listOfApartmentsByRooms.length; j++) {
                        newListOfApartmentsByRooms[j] = listOfApartmentsByRooms[j];
                    }
                    newListOfApartmentsByRooms[newListOfApartmentsByRooms.length - 1] =
                            listOfApartments[i];
                    listOfApartmentsByRooms = newListOfApartmentsByRooms;
                }
            }
        }
        return listOfApartmentsByRooms;
    }

    @Override
    public House[] readByQuantityOfRoomsAndFloor(int quantityOfRooms, int firstFloorOfRange, int lastFloorOfRange) {
        if (quantityOfRooms == 0) {
            return new House[0];
        }
        House[] listOfApartmentsByQuantityOfRoomsAndFloor = new House[0];

        for (int i = 0; i < listOfApartments.length; i++) {
            if (quantityOfRooms == listOfApartments[i].getQuantityOfRooms() &&
                    listOfApartments[i].getFloor() >= firstFloorOfRange &&
                    listOfApartments[i].getFloor() <= lastFloorOfRange) {
                if (listOfApartmentsByQuantityOfRoomsAndFloor.length == 0) {
                    listOfApartmentsByQuantityOfRoomsAndFloor = new House[1];
                    listOfApartmentsByQuantityOfRoomsAndFloor[0] = listOfApartments[i];
                } else {
                    House[] newListOfApartmentsByQuantityOfRoomsAndFloor =
                            new House[listOfApartmentsByQuantityOfRoomsAndFloor.length + 1];

                    for (int j = 0; j < listOfApartmentsByQuantityOfRoomsAndFloor.length; j++) {
                        newListOfApartmentsByQuantityOfRoomsAndFloor[j] = listOfApartmentsByQuantityOfRoomsAndFloor[j];
                    }
                    newListOfApartmentsByQuantityOfRoomsAndFloor[newListOfApartmentsByQuantityOfRoomsAndFloor.length - 1] =
                            listOfApartments[i];
                    listOfApartmentsByQuantityOfRoomsAndFloor = newListOfApartmentsByQuantityOfRoomsAndFloor;
                }
            }
        }
        return listOfApartmentsByQuantityOfRoomsAndFloor;
    }

    @Override
    public House[] readByApartmentThatHaveAreaMoreThan(long area) {
        if (area == 0) {
            return new House[0];
        }
        House[] listOfApartmentsByArea = new House[0];

        for (int i = 0; i < listOfApartments.length; i++) {
            if (area < listOfApartments[i].getArea()) {
                if (listOfApartmentsByArea.length == 0) {
                    listOfApartmentsByArea = new House[1];
                    listOfApartmentsByArea[0] = listOfApartments[i];
                } else {
                    House[] newListOfApartmentsByArea = new House[listOfApartmentsByArea.length + 1];

                    for (int j = 0; j < listOfApartmentsByArea.length; j++) {
                        newListOfApartmentsByArea[j] = listOfApartmentsByArea[j];
                    }
                    newListOfApartmentsByArea[newListOfApartmentsByArea.length - 1] = listOfApartments[i];
                    listOfApartmentsByArea = newListOfApartmentsByArea;
                }
            }
        }
        return listOfApartmentsByArea;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfApartments.length; i++) {
            if (id == listOfApartments[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            House[] newListOfApartments = new House[listOfApartments.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfApartments[j] = listOfApartments[j];
            }

            for (int h = index + 1; h < listOfApartments.length; h++) {
                newListOfApartments[h - 1] = listOfApartments[h];
            }
            listOfApartments = newListOfApartments;
        }
    }

    @Override
    public void update(House house) {
        for (int i = 0; i < listOfApartments.length; i++) {
            if (house.getId() == listOfApartments[i].getId()) {
                listOfApartments[i] = house;
            }
        }
    }

    @Override
    public void clear() {
        listOfApartments = new House[0];
    }
}
