package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Car {
    private long id;
    private String carMake;
    private String model;
    private int yearOfIssue;
    private String color;
    private long prise;
    private long registrationNumber;

    public Car() {

    }

    public Car(long id, String carMake, String model, int yearOfIssue, String color, long prise, long registrationNumber) {
        this.id = id;
        this.carMake = carMake;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.prise = prise;
        this.registrationNumber = registrationNumber;
    }

    public Car(Builder b) {
        this.id = b.id;
        this.carMake = b.carMake;
        this.model = b.model;
        this.yearOfIssue = b.yearOfIssue;
        this.color = b.color;
        this.prise = b.prise;
        this.registrationNumber = b.registrationNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrise() {
        return prise;
    }

    public void setPrise(long prise) {
        this.prise = prise;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        else if (o == null) {
            return false;
        }
        else if (o instanceof Car) {
            return this.id == ((Car) o).id && this.carMake.equals(((Car) o).carMake) && this.model.equals(((Car) o).model) &&
                    this.yearOfIssue == ((Car) o).yearOfIssue && this.color.equals(((Car) o).color) &&
                    this.prise == ((Car) o).prise && this.registrationNumber == ((Car) o).registrationNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (carMake != null ? carMake.hashCode() : 0) + (model != null ? model.hashCode() : 0) +
                yearOfIssue + (color != null ? color.hashCode() : 0) + prise + registrationNumber);
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("id=".concat(Long.toString(id)))
                .add("carMake=".concat(carMake))
                .add("model=".concat(model))
                .add("yearOfIssue=".concat(Integer.toString(yearOfIssue)))
                .add("color=".concat(color))
                .add("prise=".concat(Long.toString(prise)))
                .add("registrationNumber=".concat(Long.toString(registrationNumber)));
        String result = "HomeWork.HW_8_07_05_2020.object.Car@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private long id;
        private String carMake;
        private String model;
        private int yearOfIssue;
        private String color;
        private long prise;
        private long registrationNumber;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder carMake(String carMake) {
            this.carMake = carMake;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder yearOfIssue(int yearOfIssue) {
            this.yearOfIssue = yearOfIssue;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder prise(long prise) {
            this.prise = prise;
            return this;
        }

        public Builder registrationNumber(long registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
