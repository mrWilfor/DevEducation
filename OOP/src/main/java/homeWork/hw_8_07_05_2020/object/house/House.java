package homeWork.hw_8_07_05_2020.object.house;

import java.util.StringJoiner;

public class House {
    private long id;
    private int numberOfApartment;
    private long area;
    private int floor;
    private int quantityOfRooms;
    private String street;
    private String typeOfBuilding;
    private int lifeTime;

    public House() {

    }

    public House(long id, int numberOfApartment, long area, int floor, int quantityOfRooms, String street, String typeOfBuilding, int lifeTime) {
        this.id = id;
        this.numberOfApartment = numberOfApartment;
        this.area = area;
        this.floor = floor;
        this.quantityOfRooms = quantityOfRooms;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.lifeTime = lifeTime;
    }

    public House(Builder b) {
        this.id = b.id;
        this.numberOfApartment = b.numberOfApartment;
        this.area = b.area;
        this.floor = b.floor;
        this.quantityOfRooms = b.quantityOfRooms;
        this.street = b.street;
        this.typeOfBuilding = b.typeOfBuilding;
        this.lifeTime = b.lifeTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getQuantityOfRooms() {
        return quantityOfRooms;
    }

    public void setQuantityOfRooms(int quantityOfRooms) {
        this.quantityOfRooms = quantityOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        else if (o == null) {
            return false;
        }
        else if (o instanceof House) {
            return this.id == ((House) o).id && this.numberOfApartment == ((House) o).numberOfApartment &&
                    this.area == ((House) o).area && this.floor == ((House) o).floor &&
                    this.quantityOfRooms == ((House) o).quantityOfRooms && this.street.equals(((House) o).street) &&
                    this.typeOfBuilding.equals(((House) o).typeOfBuilding) && this.lifeTime == ((House) o).lifeTime;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + numberOfApartment + area + floor + quantityOfRooms + (street != null ? street.hashCode() : 0) +
                (typeOfBuilding != null ? typeOfBuilding.hashCode() : 0) + lifeTime);
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("id=".concat(Long.toString(id)))
                .add("numberOfApartment=".concat(Integer.toString(numberOfApartment)))
                .add("area=".concat(Long.toString(area)))
                .add("floor=".concat(Integer.toString(floor)))
                .add("quantityOfRooms=".concat(Integer.toString(quantityOfRooms)))
                .add("street=".concat(street))
                .add("typeOfBuilding=".concat(typeOfBuilding))
                .add("lifeTime=".concat(Integer.toString(lifeTime)));
        String result = "HomeWork.HW_8_07_05_2020.object.House@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private long id;
        private int numberOfApartment;
        private long area;
        private int floor;
        private int quantityOfRooms;
        private String street;
        private String typeOfBuilding;
        private int lifeTime;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder numberOfApartment(int numberOfApartment) {
            this.numberOfApartment = numberOfApartment;
            return this;
        }

        public Builder area(long area) {
            this.area = area;
            return this;
        }

        public Builder floor(int floor) {
            this.floor = floor;
            return this;
        }

        public Builder quantityOfRooms(int quantityOfRooms) {
            this.quantityOfRooms = quantityOfRooms;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder typeOfBuilding(String typeOfBuilding) {
            this.typeOfBuilding = typeOfBuilding;
            return this;
        }

        public Builder lifeTime(int lifeTime) {
            this.lifeTime = lifeTime;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
