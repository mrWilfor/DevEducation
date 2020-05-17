package homeWork.hw_8_07_05_2020.object.train;

public interface IDaoTrain {

    long create(Train t);

    Train[] readAll();

    Train[] readByDestination(String destination);

    Train[] readByDestinationAfter(String destination, long departureTime);

    Train[] readByDestinationCommonPlaces(String destination, int numberOfPlaces);

    void remove(int numberOfTrain);

    void update(Train t);

    default void clear() {

    }
}
