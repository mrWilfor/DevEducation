package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Airlines {
    private String destination;
    private int flightNumber;
    private String typeOfAircraft;
    private long departureTime;
    private String dayOfTheWeek;

    public Airlines() {

    }

    public Airlines(String destination, int flightNumber, String typeOfAircraft, long departureTime, String dayOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        this.departureTime = departureTime;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public Airlines(Builder b) {
        this.destination = b.destination;
        this.flightNumber = b.flightNumber;
        this.typeOfAircraft = b.typeOfAircraft;
        this.departureTime = b.departureTime;
        this.dayOfTheWeek = b.dayOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        else if (o == null) {
            return false;
        }
        else if (o instanceof Airlines) {
            return this.destination.equals(((Airlines) o).destination) && this.flightNumber == ((Airlines) o).flightNumber &&
                    this.typeOfAircraft.equals(((Airlines) o).typeOfAircraft) && this.departureTime == ((Airlines) o).departureTime &&
                    this.dayOfTheWeek.equals(((Airlines) o).dayOfTheWeek);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * (destination != null ? destination.hashCode() : 0) + flightNumber +
                (typeOfAircraft != null ? typeOfAircraft.hashCode() : 0) + departureTime +
                (dayOfTheWeek != null ? dayOfTheWeek.hashCode() : 0));
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("destination=".concat(destination))
                .add("flightNumber=".concat(Integer.toString(flightNumber)))
                .add("typeOfAircraft=".concat(typeOfAircraft))
                .add("departureTime=".concat(Long.toString(departureTime)))
                .add("dayOfTheWeek=".concat(dayOfTheWeek));
        String result = "HomeWork.HW_8_07_05_2020.object.Airlines@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());

        return result;
    }

    public static class Builder {
        private String destination;
        private int flightNumber;
        private String typeOfAircraft;
        private long departureTime;
        private String dayOfTheWeek;

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder flightNumber(int flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder typeOfAircraft(String typeOfAircraft) {
            this.typeOfAircraft = typeOfAircraft;
            return this;
        }

        public Builder departureTime(long departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public Builder dayOfTheWeek(String dayOfTheWeek) {
            this.dayOfTheWeek = dayOfTheWeek;
            return this;
        }

        public Airlines build() {
            return new Airlines(this);
        }
    }
}
