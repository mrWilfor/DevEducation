package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Bus {
    private String surNameDriver;
    private int numberBus;
    private int routeNumber;
    private String mark;
    private int yearOfOperation;
    private long mileage;

    public Bus() {

    }
    public Bus(String surNameDriver, int numberBus, int routeNumber, String mark, int yearOfOperation, long mileage) {
        this.surNameDriver = surNameDriver;
        this.numberBus = numberBus;
        this.routeNumber = routeNumber;
        this.mark = mark;
        this.yearOfOperation = yearOfOperation;
        this.mileage = mileage;
    }

    public Bus(Builder b) {
        this.surNameDriver = b.surNameDriver;
        this.numberBus = b.numberBus;
        this.routeNumber = b.routeNumber;
        this.mark = b.mark;
        this.yearOfOperation = b.yearOfOperation;
        this.mileage = b.mileage;
    }

    public String getSurNameDriver() {
        return surNameDriver;
    }

    public void setSurNameDriver(String surNameDriver) {
        this.surNameDriver = surNameDriver;
    }

    public int getNumberBus() {
        return numberBus;
    }

    public void setNumberBus(int numberBus) {
        this.numberBus = numberBus;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYearOfOperation() {
        return yearOfOperation;
    }

    public void setYearOfOperation(int yearOfOperation) {
        this.yearOfOperation = yearOfOperation;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        else if (o == null) {
            return false;
        }
        else if (o instanceof Bus) {
            return this.surNameDriver.equals(((Bus) o).surNameDriver) && this.numberBus == ((Bus) o).numberBus &&
                    this.routeNumber == ((Bus) o).routeNumber && this.mark.equals(((Bus) o).mark) &&
                    this.yearOfOperation == ((Bus) o).yearOfOperation && this.mileage == ((Bus) o).mileage;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * numberBus + (surNameDriver != null ? surNameDriver.hashCode() : 0) + routeNumber +
                (mark != null ? mark.hashCode() : 0) + yearOfOperation + mileage);
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("surNameDriver=".concat(surNameDriver))
                .add("numberBus=".concat(Integer.toString(numberBus)))
                .add("routeNumber=".concat(Integer.toString(routeNumber)))
                .add("mark=".concat(mark))
                .add("yearOfOperation=".concat(Integer.toString(yearOfOperation)))
                .add("mileage=".concat(Long.toString(mileage)));
        String result = "HomeWork.HW_8_07_05_2020.object.Bus@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private String surNameDriver;
        private int numberBus;
        private int routeNumber;
        private String mark;
        private int yearOfOperation;
        private long mileage;

        public Builder surNameDriver(String surNameDriver) {
            this.surNameDriver = surNameDriver;
            return this;
        }

        public Builder numberBus(int numberBus) {
            this.numberBus = numberBus;
            return this;
        }

        public Builder routeNumber(int routeNumber) {
            this.routeNumber = routeNumber;
            return this;
        }

        public Builder mark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder yearOfOperation(int yearOfOperation) {
            this.yearOfOperation = yearOfOperation;
            return this;
        }

        public Builder mileage(long mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }
}
