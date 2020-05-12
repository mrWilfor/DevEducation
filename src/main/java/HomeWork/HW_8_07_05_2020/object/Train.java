package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Train {
    private String destination;
    private int numberOfTrain;
    private long departureTime;
    private int numberOfPlaces;

    public Train() {

    }

    public Train(String destination, int numberOfTrain, long departureTime, int numberOfPlaces) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
        this.numberOfPlaces = numberOfPlaces;
    }

    public Train(Builder b) {
        this.destination = b.destination;
        this.numberOfTrain = b.numberOfTrain;
        this.departureTime = b.departureTime;
        this.numberOfPlaces = b.numberOfPlaces;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o == null) {
            return false;
        } else if (o instanceof Train) {
            return this.destination.equals(((Train) o).destination) && this.numberOfTrain == ((Train) o).numberOfTrain &&
                    this.departureTime == ((Train) o).departureTime && this.numberOfPlaces == ((Train) o).numberOfPlaces;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * (destination != null ? destination.hashCode() : 0) + numberOfTrain + departureTime +
                numberOfPlaces);
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("destination=".concat(destination))
                .add("numberOfTrain=".concat(Integer.toString(numberOfTrain)))
                .add("departureTime=".concat(Long.toString(departureTime)))
                .add("numberOfPlaces=".concat(Integer.toString(numberOfPlaces)));
        String result = "HomeWork.HW_8_07_05_2020.object.Train@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private String destination;
        private int numberOfTrain;
        private long departureTime;
        private int numberOfPlaces;

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder numberOfTrain(int numberOfTrain) {
            this.numberOfTrain = numberOfTrain;
            return this;
        }

        public Builder departureTime(long departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public Builder numberOfPlaces(int numberOfPlaces) {
            this.numberOfPlaces = numberOfPlaces;
            return this;
        }

        public Train build() {
            return new Train(this);
        }
    }
}
