package homeWork.hw_8_07_05_2020.object.airlines;

public class DaoAirlines implements IDaoAirlines {
    private static Airlines[] listOfAirlines = new Airlines[0];

    @Override
    public long create(Airlines a) {
        if (a == null) {
            return -1;
        }

        if (listOfAirlines.length == 0) {
            listOfAirlines = new Airlines[1];
            listOfAirlines[0] = a;
        } else {
            Airlines[] arrayOfAirlines = new Airlines[listOfAirlines.length + 1];

            for (int i = 0; i < listOfAirlines.length; i++) {
                arrayOfAirlines[i] = listOfAirlines[i];
            }
            arrayOfAirlines[arrayOfAirlines.length - 1] = a;
            listOfAirlines = arrayOfAirlines;
        }
        return a.getFlightNumber();
    }

    @Override
    public Airlines[] readAll() {
        return listOfAirlines;
    }

    @Override
    public Airlines[] readByDestination(String destination) {
        Airlines[] listOfAirlinesByDestination = new Airlines[0];


        if (destination == null || destination == "") {
            return new Airlines[0];
        }

        for (int i = 0; i < listOfAirlines.length; i++) {
            if (destination.equals(listOfAirlines[i].getDestination())) {
                if (listOfAirlinesByDestination.length == 0) {
                    listOfAirlinesByDestination = new Airlines[1];
                    listOfAirlinesByDestination[0] = listOfAirlines[i];
                } else {
                    Airlines[] newListOfAirlinesByDestination = new Airlines[listOfAirlinesByDestination.length + 1];

                    for (int j = 0; j < listOfAirlinesByDestination.length; j++) {
                        newListOfAirlinesByDestination[j] = listOfAirlinesByDestination[j];
                    }
                    newListOfAirlinesByDestination[newListOfAirlinesByDestination.length - 1] = listOfAirlines[i];
                    listOfAirlinesByDestination = newListOfAirlinesByDestination;
                }
            }
        }
        return listOfAirlinesByDestination;
    }

    @Override
    public Airlines[] readByDayOfTheWeek(String dayOfTheWeek) {
        Airlines[] listOfAirlinesByDayOfTheWeek = new Airlines[0];


        if (dayOfTheWeek == null || dayOfTheWeek == "") {
            return new Airlines[0];
        }

        for (int i = 0; i < listOfAirlines.length; i++) {
            if (dayOfTheWeek.equals(listOfAirlines[i].getDayOfTheWeek())) {
                if (listOfAirlinesByDayOfTheWeek.length == 0) {
                    listOfAirlinesByDayOfTheWeek = new Airlines[1];
                    listOfAirlinesByDayOfTheWeek[0] = listOfAirlines[i];
                } else {
                    Airlines[] newListOfAirlinesByDayOfTheWeek = new Airlines[listOfAirlinesByDayOfTheWeek.length + 1];

                    for (int j = 0; j < listOfAirlinesByDayOfTheWeek.length; j++) {
                        newListOfAirlinesByDayOfTheWeek[j] = listOfAirlinesByDayOfTheWeek[j];
                    }
                    newListOfAirlinesByDayOfTheWeek[newListOfAirlinesByDayOfTheWeek.length - 1] = listOfAirlines[i];
                    listOfAirlinesByDayOfTheWeek = newListOfAirlinesByDayOfTheWeek;
                }
            }
        }
        return listOfAirlinesByDayOfTheWeek;
    }

    @Override
    public Airlines[] readByDayOfTheWeekDepartureTime(String dayOfTheWeek, long departureTime) {
        if (dayOfTheWeek == null || dayOfTheWeek == "") {
            return new Airlines[0];
        }
        Airlines[] listOfAirlinesByDayWeekDepTime = new Airlines[0];

        for (int i = 0; i < listOfAirlines.length; i++) {
            if (dayOfTheWeek.equals(listOfAirlines[i].getDayOfTheWeek()) &&
                    departureTime < listOfAirlines[i].getDepartureTime()) {
                if (listOfAirlinesByDayWeekDepTime.length == 0) {
                    listOfAirlinesByDayWeekDepTime = new Airlines[1];
                    listOfAirlinesByDayWeekDepTime[0] = listOfAirlines[i];
                } else {
                    Airlines[] newListOfAirlinesByDayWeekDepTime =
                            new Airlines[listOfAirlinesByDayWeekDepTime.length + 1];

                    for (int j = 0; j < listOfAirlinesByDayWeekDepTime.length; j++) {
                        newListOfAirlinesByDayWeekDepTime[j] = listOfAirlinesByDayWeekDepTime[j];
                    }
                    newListOfAirlinesByDayWeekDepTime[newListOfAirlinesByDayWeekDepTime.length - 1] = listOfAirlines[i];
                    listOfAirlinesByDayWeekDepTime = newListOfAirlinesByDayWeekDepTime;
                }
            }
        }
        return listOfAirlinesByDayWeekDepTime;
    }

    @Override
    public void remove(int flightNumber) {
        int index = -1;

        for (int i = 0; i < listOfAirlines.length; i++) {
            if (flightNumber == listOfAirlines[i].getFlightNumber()) {
                index = i;
            }
        }

        if (index != -1) {
            Airlines[] newListOfAirlines = new Airlines[listOfAirlines.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfAirlines[j] = listOfAirlines[j];
            }

            for (int h = index + 1; h < listOfAirlines.length; h++) {
                newListOfAirlines[h - 1] = listOfAirlines[h];
            }
            listOfAirlines = newListOfAirlines;
        }
    }

    @Override
    public void update(Airlines a) {
        for (int i = 0; i < listOfAirlines.length; i++) {
            if (a.getFlightNumber() == listOfAirlines[i].getFlightNumber()) {
                listOfAirlines[i] = a;
            }
        }
    }

    @Override
    public void clear() {
        listOfAirlines = new Airlines[0];
    }
}
