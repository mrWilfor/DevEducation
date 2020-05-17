package homeWork.hw_8_07_05_2020.object.train;

public class DaoTrain implements IDaoTrain {
    private static Train[] listOfTrains = new Train[0];

    @Override
    public long create(Train train) {
        if (train == null) {
            return -1;
        }

        if (listOfTrains.length == 0) {
            listOfTrains = new Train[1];
            listOfTrains[0] = train;
        } else {
            Train[] arrayOfTrains = new Train[listOfTrains.length + 1];

            for (int i = 0; i < listOfTrains.length; i++) {
                arrayOfTrains[i] = listOfTrains[i];
            }
            arrayOfTrains[arrayOfTrains.length - 1] = train;
            listOfTrains = arrayOfTrains;
        }
        return train.getNumberOfTrain();
    }

    @Override
    public Train[] readAll() {
        return listOfTrains;
    }

    @Override
    public Train[] readByDestination(String destination) {
        Train[] listOfTrainsByDestination = new Train[0];

        if (destination == null || destination.equals("")) {
            return new Train[0];
        }

        for (int i = 0; i < listOfTrains.length; i++) {
            if (destination.equals(listOfTrains[i].getDestination())) {
                if (listOfTrainsByDestination.length == 0) {
                    listOfTrainsByDestination = new Train[1];
                    listOfTrainsByDestination[0] = listOfTrains[i];
                } else {
                    Train[] newListOfTrainsByDestination = new Train[listOfTrainsByDestination.length + 1];

                    for (int j = 0; j < listOfTrainsByDestination.length; j++) {
                        newListOfTrainsByDestination[j] = listOfTrainsByDestination[j];
                    }
                    newListOfTrainsByDestination[newListOfTrainsByDestination.length - 1] = listOfTrains[i];
                    listOfTrainsByDestination = newListOfTrainsByDestination;
                }
            }
        }
        return listOfTrainsByDestination;
    }

    ;

    @Override
    public Train[] readByDestinationAfter(String destination, long departureTime) {
        if (destination == null || destination.equals("")) {
            return new Train[0];
        }
        Train[] listOfTrainsByDestinationAfter = new Train[0];

        for (int i = 0; i < listOfTrains.length; i++) {
            if (destination.equals(listOfTrains[i].getDestination()) &&
                    departureTime < listOfTrains[i].getDepartureTime()) {
                if (listOfTrainsByDestinationAfter.length == 0) {
                    listOfTrainsByDestinationAfter = new Train[1];
                    listOfTrainsByDestinationAfter[0] = listOfTrains[i];
                } else {
                    Train[] newListOfTrainsByDestinationAfter = new Train[listOfTrainsByDestinationAfter.length + 1];

                    for (int j = 0; j < listOfTrainsByDestinationAfter.length; j++) {
                        newListOfTrainsByDestinationAfter[j] = listOfTrainsByDestinationAfter[j];
                    }
                    newListOfTrainsByDestinationAfter[newListOfTrainsByDestinationAfter.length - 1] = listOfTrains[i];
                    listOfTrainsByDestinationAfter = newListOfTrainsByDestinationAfter;
                }
            }
        }
        return listOfTrainsByDestinationAfter;
    }

    ;

    @Override
    public Train[] readByDestinationCommonPlaces(String destination, int numberOfPlaces) {
        Train[] listOfTrainsByDestinationCommonPlaces = new Train[0];

        if (destination == null || destination.equals("")) {
            return new Train[0];
        }

        for (int i = 0; i < listOfTrains.length; i++) {
            if (destination.equals(listOfTrains[i].getDestination()) &&
                    numberOfPlaces == listOfTrains[i].getNumberOfPlaces()) {
                if (listOfTrainsByDestinationCommonPlaces.length == 0) {
                    listOfTrainsByDestinationCommonPlaces = new Train[1];
                    listOfTrainsByDestinationCommonPlaces[0] = listOfTrains[i];
                } else {
                    Train[] newListOfTrainsByDestinationCommonPlaces =
                            new Train[listOfTrainsByDestinationCommonPlaces.length + 1];

                    for (int j = 0; j < listOfTrainsByDestinationCommonPlaces.length; j++) {
                        newListOfTrainsByDestinationCommonPlaces[j] = listOfTrainsByDestinationCommonPlaces[j];
                    }
                    newListOfTrainsByDestinationCommonPlaces[newListOfTrainsByDestinationCommonPlaces.length - 1] =
                            listOfTrains[i];
                    listOfTrainsByDestinationCommonPlaces = newListOfTrainsByDestinationCommonPlaces;
                }
            }
        }
        return listOfTrainsByDestinationCommonPlaces;
    }

    @Override
    public void remove(int numberOfTrain) {
        int index = -1;

        for (int i = 0; i < listOfTrains.length; i++) {
            if (numberOfTrain == listOfTrains[i].getNumberOfTrain()) {
                index = i;
            }
        }

        if (index != -1) {
            Train[] newListOfTrains = new Train[listOfTrains.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfTrains[j] = listOfTrains[j];
            }

            for (int h = index + 1; h < listOfTrains.length; h++) {
                newListOfTrains[h - 1] = listOfTrains[h];
            }
            listOfTrains = newListOfTrains;
        }
    }

    @Override
    public void update(Train train) {
        for (int i = 0; i < listOfTrains.length; i++) {
            if (train.getNumberOfTrain() == listOfTrains[i].getNumberOfTrain()) {
                listOfTrains[i] = train;
            }
        }
    }

    @Override
    public void clear() {
        listOfTrains = new Train[0];
    }
}
