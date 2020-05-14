package homeWork.hw_8_07_05_2020.object.airlines;

public interface IDaoAirlines {

    long create(Airlines a);

    Airlines[] readAll();

    Airlines[] readByDestination(String destination);

    Airlines[] readByDayOfTheWeek(String dayOfTheWeek);

    Airlines[] readByDayOfTheWeekDepartureTime(String dayOfTheWeek, long departureTime);

    void remove(int flightNumber);

    void update(Airlines a);

    default void clear() {

    }
}
